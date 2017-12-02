package Datos;

public final class Piloto extends PersonaDeCabina{
	private int pilHorasDeVuelo;

	/**
	 * 
	 */
	public Piloto() {
		super();
	}

	/**
	 * @param perNombre
	 * @param persApellido
	 * @param pilHorasDeVuelo
	 */
	public Piloto(String perNombre, String persApellido, int pilHorasDeVuelo) {
		super(perNombre, persApellido);
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
	public Piloto(String perNombre, String perRut, String persApellido, String persNacionalidad, int persEdad,
			int pilHorasDeVuelo) {
		super(perNombre, perRut, persApellido, persNacionalidad, persEdad);
		this.pilHorasDeVuelo = pilHorasDeVuelo;
	}

	public int getPilHorasDeVuelo() {
		return pilHorasDeVuelo;
	}

	public void setPilHorasDeVuelo(int pilHorasDeVuelo) {
		this.pilHorasDeVuelo = pilHorasDeVuelo;
	}

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
		result = prime * result + pilHorasDeVuelo;
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
		if (pilHorasDeVuelo != other.pilHorasDeVuelo)
			return false;
		return true;
	}

	
	
}