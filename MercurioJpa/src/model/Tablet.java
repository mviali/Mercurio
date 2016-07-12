package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tablet database table.
 * 
 */
@Entity
@Table(name="tablet")
@NamedQuery(name="Tablet.findAll", query="SELECT t FROM Tablet t")
public class Tablet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tablet")
	private long idTablet;

	@Column(name="contratto_leasing")
	private String contrattoLeasing;

	@Column(name="data_fine_leasing")
	private Timestamp dataFineLeasing;

	@Column(name="data_inizio_leasing")
	private Timestamp dataInizioLeasing;

	private String matricola;

	private String modello;

	public Tablet() {
	}

	public long getIdTablet() {
		return this.idTablet;
	}

	public void setIdTablet(long idTablet) {
		this.idTablet = idTablet;
	}

	public String getContrattoLeasing() {
		return this.contrattoLeasing;
	}

	public void setContrattoLeasing(String contrattoLeasing) {
		this.contrattoLeasing = contrattoLeasing;
	}

	public Timestamp getDataFineLeasing() {
		return this.dataFineLeasing;
	}

	public void setDataFineLeasing(Timestamp dataFineLeasing) {
		this.dataFineLeasing = dataFineLeasing;
	}

	public Timestamp getDataInizioLeasing() {
		return this.dataInizioLeasing;
	}

	public void setDataInizioLeasing(Timestamp dataInizioLeasing) {
		this.dataInizioLeasing = dataInizioLeasing;
	}

	public String getMatricola() {
		return this.matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getModello() {
		return this.modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

}