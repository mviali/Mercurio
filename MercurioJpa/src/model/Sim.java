package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sim database table.
 * 
 */
@Entity
@Table(name="sim")
@NamedQuery(name="Sim.findAll", query="SELECT s FROM Sim s")
public class Sim implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_sim")
	private long idSim;

	@Column(name="data_fine")
	private Timestamp dataFine;

	@Column(name="data_inizio")
	private Timestamp dataInizio;

	private String matricola;

	private String msisdn;

	@Column(name="offerta_commerciale")
	private String offertaCommerciale;

	public Sim() {
	}

	public long getIdSim() {
		return this.idSim;
	}

	public void setIdSim(long idSim) {
		this.idSim = idSim;
	}

	public Timestamp getDataFine() {
		return this.dataFine;
	}

	public void setDataFine(Timestamp dataFine) {
		this.dataFine = dataFine;
	}

	public Timestamp getDataInizio() {
		return this.dataInizio;
	}

	public void setDataInizio(Timestamp dataInizio) {
		this.dataInizio = dataInizio;
	}

	public String getMatricola() {
		return this.matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getMsisdn() {
		return this.msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getOffertaCommerciale() {
		return this.offertaCommerciale;
	}

	public void setOffertaCommerciale(String offertaCommerciale) {
		this.offertaCommerciale = offertaCommerciale;
	}

}