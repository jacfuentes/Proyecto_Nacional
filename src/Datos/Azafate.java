package Datos;

public final class Azafate extends PersonaDeCabina{
	private String azaIdioma;

	/**
	 * 
	 */
	public Azafate() {
		super();
	}

	/**
	 * @param perNombre
	 * @param persApellido
	 * @param persNacionalidad
	 * @param persEdad
	 * @param azaIdioma
	 */
	public Azafate(String perNombre, String persApellido, String persNacionalidad, Integer persEdad, String azaIdioma) {
		super(perNombre, persApellido, persNacionalidad, persEdad);
		this.azaIdioma = azaIdioma;
	}

	/**
	 * @param perNombre
	 * @param perRut
	 * @param persApellido
	 * @param persNacionalidad
	 * @param persEdad
	 * @param azaIdioma
	 */
	public Azafate(String perNombre, String perRut, String persApellido, String persNacionalidad, Integer persEdad,
			String azaIdioma) {
		super(perNombre, perRut, persApellido, persNacionalidad, persEdad);
		this.azaIdioma = azaIdioma;
	}

	/**
	 * @return the azaIdioma
	 */
	public String getAzaIdioma() {
		return azaIdioma;
	}

	/**
	 * @param azaIdioma the azaIdioma to set
	 */
	public void setAzaIdioma(String azaIdioma) {
		this.azaIdioma = azaIdioma;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Azafate [azaIdioma=" + azaIdioma + ", persApellido=" + persApellido + ", persNacionalidad="
				+ persNacionalidad + ", persEdad=" + persEdad + ", perNombre=" + perNombre + ", perRut=" + perRut + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((azaIdioma == null) ? 0 : azaIdioma.hashCode());
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
		Azafate other = (Azafate) obj;
		if (azaIdioma == null) {
			if (other.azaIdioma != null)
				return false;
		} else if (!azaIdioma.equals(other.azaIdioma))
			return false;
		return true;
	}

	
}
