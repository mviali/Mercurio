package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the storico_assegnazioni_intestazioni database table.
 * 
 */
@Entity
@Table(name="storico_assegnazioni_intestazioni")
@NamedQuery(name="StoricoAssegnazioniIntestazioni.findAll", query="SELECT s FROM StoricoAssegnazioniIntestazioni s")
public class StoricoAssegnazioniIntestazioni implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_storico_assegnazione")
	private long idStoricoAssegnazione;

	@Column(name="data_inizio")
	private Timestamp dataInizio;

	@Column(name="id_assegnazione")
	private long idAssegnazione;

	@Column(name="id_soggetto")
	private long idSoggetto;

	@Column(name="id_spedizione")
	private long idSpedizione;

	@Column(name="last_update")
	private Timestamp lastUpdate;

	private String matricola;

	private int tipo;

	@Column(name="user_update")
	private String userUpdate;

	public StoricoAssegnazioniIntestazioni() {
	}

	public long getIdStoricoAssegnazione() {
		return this.idStoricoAssegnazione;
	}

	public void setIdStoricoAssegnazione(long idStoricoAssegnazione) {
		this.idStoricoAssegnazione = idStoricoAssegnazione;
	}

	public Timestamp getDataInizio() {
		return this.dataInizio;
	}

	public void setDataInizio(Timestamp dataInizio) {
		this.dataInizio = dataInizio;
	}

	public long getIdAssegnazione() {
		return this.idAssegnazione;
	}

	public void setIdAssegnazione(long idAssegnazione) {
		this.idAssegnazione = idAssegnazione;
	}

	public long getIdSoggetto() {
		return this.idSoggetto;
	}

	public void setIdSoggetto(long idSoggetto) {
		this.idSoggetto = idSoggetto;
	}

	public long getIdSpedizione() {
		return this.idSpedizione;
	}

	public void setIdSpedizione(long idSpedizione) {
		this.idSpedizione = idSpedizione;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getMatricola() {
		return this.matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getUserUpdate() {
		return this.userUpdate;
	}

	public void setUserUpdate(String userUpdate) {
		this.userUpdate = userUpdate;
	}

}