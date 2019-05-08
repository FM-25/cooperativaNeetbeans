/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author fernando.gonzalezusa
 */
@Entity
@Table(name = "cuentatipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuentatipo.findAll", query = "SELECT c FROM Cuentatipo c")
    , @NamedQuery(name = "Cuentatipo.findByIdCuentatipo", query = "SELECT c FROM Cuentatipo c WHERE c.idCuentatipo = :idCuentatipo")
    , @NamedQuery(name = "Cuentatipo.findByNombre", query = "SELECT c FROM Cuentatipo c WHERE c.nombre = :nombre")})
public class Cuentatipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cuentatipo")
    private Integer idCuentatipo;
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "idCuentatipo",cascade = CascadeType.PERSIST)
    private List<Cuenta> cuentaList;

    public Cuentatipo() {
    }

    public Cuentatipo(Integer idCuentatipo) {
        this.idCuentatipo = idCuentatipo;
    }

    public Integer getIdCuentatipo() {
        return idCuentatipo;
    }

    public void setIdCuentatipo(Integer idCuentatipo) {
        this.idCuentatipo = idCuentatipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Cuenta> getCuentaList() {
        return cuentaList;
    }

    public void setCuentaList(List<Cuenta> cuentaList) {
        this.cuentaList = cuentaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCuentatipo != null ? idCuentatipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuentatipo)) {
            return false;
        }
        Cuentatipo other = (Cuentatipo) object;
        if ((this.idCuentatipo == null && other.idCuentatipo != null) || (this.idCuentatipo != null && !this.idCuentatipo.equals(other.idCuentatipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.empresa.entities.Cuentatipo[ idCuentatipo=" + idCuentatipo + " ]";
    }
    
}
