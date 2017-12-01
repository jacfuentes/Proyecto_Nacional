package Datos;

public class Persona {
	private String perNombre;
	private String perRut;
	
	public Persona() {
	}

	public Persona(String perNombre, String perRut) {
		this.perNombre = perNombre;
		this.perRut = perRut;
	}

	public String getPerNombre() {
		return perNombre;
	}

	public void setPerNombre(String perNombre) {
		this.perNombre = perNombre;
	}

	public String getPerRut() {
		return perRut;
	}

	public void setPerRut(String perRut) {
		this.perRut = perRut;
	}

	@Override
	public String toString() {
		return "Persona [perNombre=" + perNombre + ", perRut=" + perRut + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((perNombre == null) ? 0 : perNombre.hashCode());
		result = prime * result + ((perRut == null) ? 0 : perRut.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (perNombre == null) {
			if (other.perNombre != null)
				return false;
		} else if (!perNombre.equals(other.perNombre))
			return false;
		if (perRut == null) {
			if (other.perRut != null)
				return false;
		} else if (!perRut.equals(other.perRut))
			return false;
		return true;
	}
	
	
}
