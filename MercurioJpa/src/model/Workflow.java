package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the workflow database table.
 * 
 */
@Entity
@Table(name="workflow")
@NamedQuery(name="Workflow.findAll", query="SELECT w FROM Workflow w")
public class Workflow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_wf")
	private int idWf;

	@Column(name="id_causale")
	private long idCausale;

	@Column(name="last_update")
	private Timestamp lastUpdate;

	@Column(name="stato_finale")
	private int statoFinale;

	@Column(name="stato_iniziale")
	private int statoIniziale;

	@Column(name="user_update")
	private String userUpdate;

	public Workflow() {
	}

	public int getIdWf() {
		return this.idWf;
	}

	public void setIdWf(int idWf) {
		this.idWf = idWf;
	}

	public long getIdCausale() {
		return this.idCausale;
	}

	public void setIdCausale(long idCausale) {
		this.idCausale = idCausale;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int getStatoFinale() {
		return this.statoFinale;
	}

	public void setStatoFinale(int statoFinale) {
		this.statoFinale = statoFinale;
	}

	public int getStatoIniziale() {
		return this.statoIniziale;
	}

	public void setStatoIniziale(int statoIniziale) {
		this.statoIniziale = statoIniziale;
	}

	public String getUserUpdate() {
		return this.userUpdate;
	}

	public void setUserUpdate(String userUpdate) {
		this.userUpdate = userUpdate;
	}

}