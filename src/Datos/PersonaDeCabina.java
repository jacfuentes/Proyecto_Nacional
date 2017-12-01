package Datos;

public class PersonaDeCabina extends Persona {
	private String persApellido;
	private String persNacionalidad;
	private int persEdad;
	
	public PersonaDeCabina() { super();
	}

	public PersonaDeCabina(String perNombre, String perRut, String persApellido, String persNacionalidad, int persEdad) {
		super(perNombre, perRut);
		this.persApellido = persApellido;
		this.persNacionalidad = persNacionalidad;
		this.persEdad = persEdad;
	}

	public String getPersApellido() {
		return persApellido;
	}

	public void setPersApellido(String persApellido) {
		this.persApellido = persApellido;
	}

	public String getPersNacionalidad() {
		return persNacionalidad;
	}

	public void setPersNacionalidad(String persNacionalidad) {
		this.persNacionalidad = persNacionalidad;
	}

	public int getPersEdad() {
		return persEdad;
	}

	public void setPersEdad(int persEdad) {
		this.persEdad = persEdad;
	}

	@Override
	public String toString() {
		return "PersonaDeCabina [persApellido=" + persApellido + ", persNacionalidad=" + persNacionalidad
				+ ", persEdad=" + persEdad + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((persApellido == null) ? 0 : persApellido.hashCode());
		result = prime * result + persEdad;
		result = prime * result + ((persNacionalidad == null) ? 0 : persNacionalidad.hashCode());
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
		PersonaDeCabina other = (PersonaDeCabina) obj;
		if (persApellido == null) {
			if (other.persApellido != null)
				return false;
		} else if (!persApellido.equals(other.persApellido))
			return false;
		if (persEdad != other.persEdad)
			return false;
		if (persNacionalidad == null) {
			if (other.persNacionalidad != null)
				return false;
		} else if (!persNacionalidad.equals(other.persNacionalidad))
			return false;
		return true;
	}
	
	
	
	
}
