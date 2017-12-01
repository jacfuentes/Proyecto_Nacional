package Datos;

public final class Piloto extends PersonaDeCabina{
	private int pilHorasDeVuelo;

	public Piloto() { super();
	}

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
		return "Piloto [pilHorasDeVuelo=" + pilHorasDeVuelo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + pilHorasDeVuelo;
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
		Piloto other = (Piloto) obj;
		if (pilHorasDeVuelo != other.pilHorasDeVuelo)
			return false;
		return true;
	}
	
	

}
