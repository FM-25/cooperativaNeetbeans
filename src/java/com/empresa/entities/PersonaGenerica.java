package com.empresa.entities;

public class PersonaGenerica {
	
	private String nombre;
	private String apellido;
	private String numeroDocumento;
	private Integer tiempoconocerse;
	private Integer edad;
	private String parentesco;
	private float porcentaje;
	
	
	public PersonaGenerica() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public Integer getTiempoconocerse() {
		return tiempoconocerse;
	}
	public void setTiempoconocerse(Integer tiempoconocerse) {
		this.tiempoconocerse = tiempoconocerse;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

         public float getPorcentaje() {
        return porcentaje;
         }

        public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
         }


	
	

}
