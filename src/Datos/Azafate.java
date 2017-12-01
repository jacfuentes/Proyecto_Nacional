package Datos;

public final class Azafate extends PersonaDeCabina{
	private String azaIdioma;

	public Azafate() {
	}

	public Azafate(String perNombre, String perRut, String persApellido, String persNacionalidad, int persEdad,
			String azaIdioma) {
		super(perNombre, perRut, persApellido, persNacionalidad, persEdad);
		this.azaIdioma = azaIdioma;
	}

	public String getAzaIdioma() {
		return azaIdioma;
	}

	public void setAzaIdioma(String azaIdioma) {
		this.azaIdioma = azaIdioma;
	}

	@Override
	public String toString() {
		return "Azafate [azaIdioma=" + azaIdioma + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((azaIdioma == null) ? 0 : azaIdioma.hashCode());
		return result;
	}

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
