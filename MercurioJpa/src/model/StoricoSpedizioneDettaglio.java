package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the storico_spedizione_dettaglio database table.
 * 
 */
@Entity
@Table(name="storico_spedizione_dettaglio")
@NamedQuery(name="StoricoSpedizioneDettaglio.findAll", query="SELECT s FROM StoricoSpedizioneDettaglio s")
public class StoricoSpedizioneDettaglio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_storico_dettaglio")
	private long idStoricoDettaglio;

	@Column(name="data_modifica")
	private Timestamp dataModifica;

	@Column(name="id_anagrafica_articolo")
	private long idAnagraficaArticolo;

	@Column(name="id_spedizione")
	private long idSpedizione;

	@Column(name="last_update")
	private Timestamp lastUpdate;

	private long progressivo;

	private int quantita;

	@Column(name="tipo_articolo")
	private String tipoArticolo;

	@Column(name="user_update")
	private String userUpdate;

	public StoricoSpedizioneDettaglio() {
	}

	public long getIdStoricoDettaglio() {
		return this.idStoricoDettaglio;
	}

	public void setIdStoricoDettaglio(long idStoricoDettaglio) {
		this.idStoricoDettaglio = idStoricoDettaglio;
	}

	public Timestamp getDataModifica() {
		return this.dataModifica;
	}

	public void setDataModifica(Timestamp dataModifica) {
		this.dataModifica = dataModifica;
	}

	public long getIdAnagraficaArticolo() {
		return this.idAnagraficaArticolo;
	}

	public void setIdAnagraficaArticolo(long idAnagraficaArticolo) {
		this.idAnagraficaArticolo = idAnagraficaArticolo;
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

	public long getProgressivo() {
		return this.progressivo;
	}

	public void setProgressivo(long progressivo) {
		this.progressivo = progressivo;
	}

	public int getQuantita() {
		return this.quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public String getTipoArticolo() {
		return this.tipoArticolo;
	}

	public void setTipoArticolo(String tipoArticolo) {
		this.tipoArticolo = tipoArticolo;
	}

	public String getUserUpdate() {
		return this.userUpdate;
	}

	public void setUserUpdate(String userUpdate) {
		this.userUpdate = userUpdate;
	}

}