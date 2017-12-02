package Datos;

public final class Piloto extends PersonaDeCabina{
	private Integer pilHorasDeVuelo;

	/**
	 * 
	 */
	public Piloto() {
		super();
	}

	/**
	 * @param perNombre
	 * @param persApellido
	 * @param persNacionalidad
	 * @param persEdad
	 * @param pilHorasDeVuelo
	 */
	public Piloto(String perNombre, String persApellido, String persNacionalidad, Integer persEdad,
			Integer pilHorasDeVuelo) {
		super(perNombre, persApellido, persNacionalidad, persEdad);
		this.pilHorasDeVuelo = pilHorasDeVuelo;
	}

	/**
	 * @param perNombre
	 * @param perRut
	 * @param persApellido
	 * @param persNacionalidad
	 * @param persEdad
	 * @param pilHorasDeVuelo
	 */
	public Piloto(String perNombre, String perRut, String persApellido, String persNacionalidad, Integer persEdad,
			Integer pilHorasDeVuelo) {
		super(perNombre, perRut, persApellido, persNacionalidad, persEdad);
		this.pilHorasDeVuelo = pilHorasDeVuelo;
	}

	/**
	 * @return the pilHorasDeVuelo
	 */
	public Integer getPilHorasDeVuelo() {
		return pilHorasDeVuelo;
	}

	/**
	 * @param pilHorasDeVuelo the pilHorasDeVuelo to set
	 */
	public void setPilHorasDeVuelo(Integer pilHorasDeVuelo) {
		this.pilHorasDeVuelo = pilHorasDeVuelo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Piloto [pilHorasDeVuelo=" + pilHorasDeVuelo + ", persApellido=" + persApellido + ", persNacionalidad="
				+ persNacionalidad + ", persEdad=" + persEdad + ", perNombre=" + perNombre + ", perRut=" + perRut + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((pilHorasDeVuelo == null) ? 0 : pilHorasDeVuelo.hashCode());
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
		Piloto other = (Piloto) obj;
		if (pilHorasDeVuelo == null) {
			if (other.pilHorasDeVuelo != null)
				return false;
		} else if (!pilHorasDeVuelo.equals(other.pilHorasDeVuelo))
			return false;
		return true;
	}


	
}