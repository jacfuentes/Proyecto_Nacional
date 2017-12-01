package Datos;

public class Cliente extends Persona {
	private int cliNdeVuelo;
	private String cliFechayHora;
	private String cliDestino;
	private int cliNdeAsiento;
	private String cliClase;
	private String cliValor;
	
	public Cliente() { super();
	}

	public Cliente(String perNombre, String perRut, int cliNdeVuelo, String cliFechayHora, String cliDestino,
			int cliNdeAsiento, String cliClase, String cliValor) {
		super(perNombre, perRut);
		this.cliNdeVuelo = cliNdeVuelo;
		this.cliFechayHora = cliFechayHora;
		this.cliDestino = cliDestino;
		this.cliNdeAsiento = cliNdeAsiento;
		this.cliClase = cliClase;
		this.cliValor = cliValor;
	}

	public int getCliNdeVuelo() {
		return cliNdeVuelo;
	}

	public void setCliNdeVuelo(int cliNdeVuelo) {
		this.cliNdeVuelo = cliNdeVuelo;
	}

	public String getCliFechayHora() {
		return cliFechayHora;
	}

	public void setCliFechayHora(String cliFechayHora) {
		this.cliFechayHora = cliFechayHora;
	}

	public String getCliDestino() {
		return cliDestino;
	}

	public void setCliDestino(String cliDestino) {
		this.cliDestino = cliDestino;
	}

	public int getCliNdeAsiento() {
		return cliNdeAsiento;
	}

	public void setCliNdeAsiento(int cliNdeAsiento) {
		this.cliNdeAsiento = cliNdeAsiento;
	}

	public String getCliClase() {
		return cliClase;
	}

	public void setCliClase(String cliClase) {
		this.cliClase = cliClase;
	}

	public String getCliValor() {
		return cliValor;
	}

	public void setCliValor(String cliValor) {
		this.cliValor = cliValor;
	}

	@Override
	public String toString() {
		return "Cliente [cliNdeVuelo=" + cliNdeVuelo + ", cliFechayHora=" + cliFechayHora + ", cliDestino=" + cliDestino
				+ ", cliNdeAsiento=" + cliNdeAsiento + ", cliClase=" + cliClase + ", cliValor=" + cliValor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cliClase == null) ? 0 : cliClase.hashCode());
		result = prime * result + ((cliDestino == null) ? 0 : cliDestino.hashCode());
		result = prime * result + ((cliFechayHora == null) ? 0 : cliFechayHora.hashCode());
		result = prime * result + cliNdeAsiento;
		result = prime * result + cliNdeVuelo;
		result = prime * result + ((cliValor == null) ? 0 : cliValor.hashCode());
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
		Cliente other = (Cliente) obj;
		if (cliClase == null) {
			if (other.cliClase != null)
				return false;
		} else if (!cliClase.equals(other.cliClase))
			return false;
		if (cliDestino == null) {
			if (other.cliDestino != null)
				return false;
		} else if (!cliDestino.equals(other.cliDestino))
			return false;
		if (cliFechayHora == null) {
			if (other.cliFechayHora != null)
				return false;
		} else if (!cliFechayHora.equals(other.cliFechayHora))
			return false;
		if (cliNdeAsiento != other.cliNdeAsiento)
			return false;
		if (cliNdeVuelo != other.cliNdeVuelo)
			return false;
		if (cliValor == null) {
			if (other.cliValor != null)
				return false;
		} else if (!cliValor.equals(other.cliValor))
			return false;
		return true;
	}
	
	

}
