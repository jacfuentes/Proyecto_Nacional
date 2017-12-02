package Datos;

public class PersonaDeCabina extends Persona {
	protected String persApellido;
	protected String persNacionalidad;
	protected Integer persEdad;
	/**
	 * 
	 */
	public PersonaDeCabina() {
		super();
	}
	/**
	 * @param perNombre
	 * @param persApellido
	 * @param persNacionalidad
	 * @param persEdad
	 */
	public PersonaDeCabina(String perNombre, String persApellido, String persNacionalidad, Integer persEdad) {
		super(perNombre);
		this.persApellido = persApellido;
		this.persNacionalidad = persNacionalidad;
		this.persEdad = persEdad;
	}
	/**
	 * @param perNombre
	 * @param perRut
	 * @param persApellido
	 * @param persNacionalidad
	 * @param persEdad
	 */
	public PersonaDeCabina(String perNombre, String perRut, String persApellido, String persNacionalidad,
			Integer persEdad) {
		super(perNombre, perRut);
		this.persApellido = persApellido;
		this.persNacionalidad = persNacionalidad;
		this.persEdad = persEdad;
	}
	/**
	 * @return the persApellido
	 */
	public String getPersApellido() {
		return persApellido;
	}
	/**
	 * @param persApellido the persApellido to set
	 */
	public void setPersApellido(String persApellido) {
		this.persApellido = persApellido;
	}
	/**
	 * @return the persNacionalidad
	 */
	public String getPersNacionalidad() {
		return persNacionalidad;
	}
	/**
	 * @param persNacionalidad the persNacionalidad to set
	 */
	public void setPersNacionalidad(String persNacionalidad) {
		this.persNacionalidad = persNacionalidad;
	}
	/**
	 * @return the persEdad
	 */
	public Integer getPersEdad() {
		return persEdad;
	}
	/**
	 * @param persEdad the persEdad to set
	 */
	public void setPersEdad(Integer persEdad) {
		this.persEdad = persEdad;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PersonaDeCabina [persApellido=" + persApellido + ", persNacionalidad=" + persNacionalidad
				+ ", persEdad=" + persEdad + ", perNombre=" + perNombre + ", perRut=" + perRut + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((persApellido == null) ? 0 : persApellido.hashCode());
		result = prime * result + ((persEdad == null) ? 0 : persEdad.hashCode());
		result = prime * result + ((persNacionalidad == null) ? 0 : persNacionalidad.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonaDeCabina other = (PersonaDeCabina) obj;
		if (persApellido == null) {
			if (other.persApellido != null)
				return false;
		} else if (!persApellido.equals(other.persApellido))
			return false;
		if (persEdad == null) {
			if (other.persEdad != null)
				return false;
		} else if (!persEdad.equals(other.persEdad))
			return false;
		if (persNacionalidad == null) {
			if (other.persNacionalidad != null)
				return false;
		} else if (!persNacionalidad.equals(other.persNacionalidad))
			return false;
		return true;
	}
	

	
}
