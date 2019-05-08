package com.empresa.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.empresa.entities.Cliente;
import com.empresa.entities.Cuenta;
import com.empresa.entities.Persona;
import com.empresa.entities.Transaccion;
import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;

@Stateless
public class CuentaDao {
	
    @PersistenceContext(unitName="cooperativaPU")
    EntityManager em;
    
	private Persona afiliadoSeleccionado;
	private List<Persona> afiliados;
	private Cuenta cuentaSeleccionada;
	private List<Cuenta> cuentas;
	private List<Transaccion> transacciones;
	
	public List<Persona> getClientes() {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cooperativa");
//		EntityManager em = emf.createEntityManager();
		try {
			afiliados = new ArrayList<Persona>();
			afiliados = em.createNamedQuery("find.clientes").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return afiliados;
	}
	
	public List<Cuenta> getCuentas(Cliente cli){
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cooperativa");
//		EntityManager em = emf.createEntityManager();
		try {
			cuentas = new ArrayList<Cuenta>();
			cuentas = em.createNamedQuery("cuentas.byCliente").setParameter("idCliente",cli).getResultList();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

		return cuentas; 
		
	}
	
	public List<Transaccion> getTransacciones(Cuenta cuen){
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cooperativa");
//		EntityManager em = emf.createEntityManager();
		try {
			transacciones = new ArrayList<Transaccion>();
			transacciones = em.createNamedQuery("transacciones.byCuenta").setParameter("idCuenta",cuen).getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return transacciones;
	}
	

}
