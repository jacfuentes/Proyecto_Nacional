package Datos;

public class Pasaje extends Cliente{
	private int pasNdeVuelo;
	private String pasFechayHora;
	private String pasDestino;
	private int pasNdeAsiento;
	private String pasClase;
	private String pasValor;
	private Cliente Cli;
	
	public Pasaje() { super ();
	}

	/**
	 * @param perRut
	 * @param pasNdeVuelo
	 * @param pasFechayHora
	 * @param pasDestino
	 * @param pasNdeAsiento
	 * @param pasClase
	 * @param pasValor
	 * @param cli
	 */
	public Pasaje(String perRut, int pasNdeVuelo, String pasFechayHora, String pasDestino, int pasNdeAsiento,
			String pasClase, String pasValor, Cliente cli) {
		super(perRut);
		this.pasNdeVuelo = pasNdeVuelo;
		this.pasFechayHora = pasFechayHora;
		this.pasDestino = pasDestino;
		this.pasNdeAsiento = pasNdeAsiento;
		this.pasClase = pasClase;
		this.pasValor = pasValor;
		Cli = cli;
	}

	/**
	 * @param perNombre
	 * @param perRut
	 * @param pasNdeVuelo
	 * @param pasFechayHora
	 * @param pasDestino
	 * @param pasNdeAsiento
	 * @param pasClase
	 * @param pasValor
	 * @param cli
	 */
	public Pasaje(String perNombre, String perRut, int pasNdeVuelo, String pasFechayHora, String pasDestino,
			int pasNdeAsiento, String pasClase, String pasValor, Cliente cli) {
		super(perNombre, perRut);
		this.pasNdeVuelo = pasNdeVuelo;
		this.pasFechayHora = pasFechayHora;
		this.pasDestino = pasDestino;
		this.pasNdeAsiento = pasNdeAsiento;
		this.pasClase = pasClase;
		this.pasValor = pasValor;
		Cli = cli;
	}

	/**
	 * @return the pasNdeVuelo
	 */
	public int getPasNdeVuelo() {
		return pasNdeVuelo;
	}

	/**
	 * @param pasNdeVuelo the pasNdeVuelo to set
	 */
	public void setPasNdeVuelo(int pasNdeVuelo) {
		this.pasNdeVuelo = pasNdeVuelo;
	}

	/**
	 * @return the pasFechayHora
	 */
	public String getPasFechayHora() {
		return pasFechayHora;
	}

	/**
	 * @param pasFechayHora the pasFechayHora to set
	 */
	public void setPasFechayHora(String pasFechayHora) {
		this.pasFechayHora = pasFechayHora;
	}

	/**
	 * @return the pasDestino
	 */
	public String getPasDestino() {
		return pasDestino;
	}

	/**
	 * @param pasDestino the pasDestino to set
	 */
	public void setPasDestino(String pasDestino) {
		this.pasDestino = pasDestino;
	}

	/**
	 * @return the pasNdeAsiento
	 */
	public int getPasNdeAsiento() {
		return pasNdeAsiento;
	}

	/**
	 * @param pasNdeAsiento the pasNdeAsiento to set
	 */
	public void setPasNdeAsiento(int pasNdeAsiento) {
		this.pasNdeAsiento = pasNdeAsiento;
	}

	/**
	 * @return the pasClase
	 */
	public String getPasClase() {
		return pasClase;
	}

	/**
	 * @param pasClase the pasClase to set
	 */
	public void setPasClase(String pasClase) {
		this.pasClase = pasClase;
	}

	/**
	 * @return the pasValor
	 */
	public String getPasValor() {
		return pasValor;
	}

	/**
	 * @param pasValor the pasValor to set
	 */
	public void setPasValor(String pasValor) {
		this.pasValor = pasValor;
	}

	/**
	 * @return the cli
	 */
	public Cliente getCli() {
		return Cli;
	}

	/**
	 * @param cli the cli to set
	 */
	public void setCli(Cliente cli) {
		Cli = cli;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pasaje [pasNdeVuelo=" + pasNdeVuelo + ", pasFechayHora=" + pasFechayHora + ", pasDestino=" + pasDestino
				+ ", pasNdeAsiento=" + pasNdeAsiento + ", pasClase=" + pasClase + ", pasValor=" + pasValor + ", Cli="
				+ Cli + ", perNombre=" + perNombre + ", perRut=" + perRut + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Cli == null) ? 0 : Cli.hashCode());
		result = prime * result + ((pasClase == null) ? 0 : pasClase.hashCode());
		result = prime * result + ((pasDestino == null) ? 0 : pasDestino.hashCode());
		result = prime * result + ((pasFechayHora == null) ? 0 : pasFechayHora.hashCode());
		result = prime * result + pasNdeAsiento;
		result = prime * result + pasNdeVuelo;
		result = prime * result + ((pasValor == null) ? 0 : pasValor.hashCode());
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
		Pasaje other = (Pasaje) obj;
		if (Cli == null) {
			if (other.Cli != null)
				return false;
		} else if (!Cli.equals(other.Cli))
			return false;
		if (pasClase == null) {
			if (other.pasClase != null)
				return false;
		} else if (!pasClase.equals(other.pasClase))
			return false;
		if (pasDestino == null) {
			if (other.pasDestino != null)
				return false;
		} else if (!pasDestino.equals(other.pasDestino))
			return false;
		if (pasFechayHora == null) {
			if (other.pasFechayHora != null)
				return false;
		} else if (!pasFechayHora.equals(other.pasFechayHora))
			return false;
		if (pasNdeAsiento != other.pasNdeAsiento)
			return false;
		if (pasNdeVuelo != other.pasNdeVuelo)
			return false;
		if (pasValor == null) {
			if (other.pasValor != null)
				return false;
		} else if (!pasValor.equals(other.pasValor))
			return false;
		return true;
	}


}