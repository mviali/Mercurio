package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the storico_spedizione database table.
 * 
 */
@Entity
@Table(name="storico_spedizione")
@NamedQuery(name="StoricoSpedizione.findAll", query="SELECT s FROM StoricoSpedizione s")
public class StoricoSpedizione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_storico_spedizione")
	private long idStoricoSpedizione;

	private String assegnato;

	private int colli;

	@Column(name="data_richiesta_consegna")
	private Timestamp dataRichiestaConsegna;

	@Column(name="data_spedizione")
	private Timestamp dataSpedizione;

	@Column(name="data_ultima_modifica")
	private Timestamp dataUltimaModifica;

	@Column(name="id_fornitore")
	private int idFornitore;

	@Column(name="id_recapito")
	private long idRecapito;

	@Column(name="id_recapito_mitt")
	private long idRecapitoMitt;

	@Column(name="id_soggetto")
	private long idSoggetto;

	@Column(name="id_soggetto_mitt")
	private long idSoggettoMitt;

	@Column(name="id_spedizione")
	private long idSpedizione;

	@Column(name="id_spedizione_padre")
	private long idSpedizionePadre;

	@Column(name="id_tipo_spedizione")
	private long idTipoSpedizione;

	@Column(name="importo_assicurato")
	private BigDecimal importoAssicurato;

	@Column(name="last_update")
	private Timestamp lastUpdate;

	private String note;

	private double peso;

	@Column(name="user_update")
	private String userUpdate;

	public StoricoSpedizione() {
	}

	public long getIdStoricoSpedizione() {
		return this.idStoricoSpedizione;
	}

	public void setIdStoricoSpedizione(long idStoricoSpedizione) {
		this.idStoricoSpedizione = idStoricoSpedizione;
	}

	public String getAssegnato() {
		return this.assegnato;
	}

	public void setAssegnato(String assegnato) {
		this.assegnato = assegnato;
	}

	public int getColli() {
		return this.colli;
	}

	public void setColli(int colli) {
		this.colli = colli;
	}

	public Timestamp getDataRichiestaConsegna() {
		return this.dataRichiestaConsegna;
	}

	public void setDataRichiestaConsegna(Timestamp dataRichiestaConsegna) {
		this.dataRichiestaConsegna = dataRichiestaConsegna;
	}

	public Timestamp getDataSpedizione() {
		return this.dataSpedizione;
	}

	public void setDataSpedizione(Timestamp dataSpedizione) {
		this.dataSpedizione = dataSpedizione;
	}

	public Timestamp getDataUltimaModifica() {
		return this.dataUltimaModifica;
	}

	public void setDataUltimaModifica(Timestamp dataUltimaModifica) {
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public int getIdFornitore() {
		return this.idFornitore;
	}

	public void setIdFornitore(int idFornitore) {
		this.idFornitore = idFornitore;
	}

	public long getIdRecapito() {
		return this.idRecapito;
	}

	public void setIdRecapito(long idRecapito) {
		this.idRecapito = idRecapito;
	}

	public long getIdRecapitoMitt() {
		return this.idRecapitoMitt;
	}

	public void setIdRecapitoMitt(long idRecapitoMitt) {
		this.idRecapitoMitt = idRecapitoMitt;
	}

	public long getIdSoggetto() {
		return this.idSoggetto;
	}

	public void setIdSoggetto(long idSoggetto) {
		this.idSoggetto = idSoggetto;
	}

	public long getIdSoggettoMitt() {
		return this.idSoggettoMitt;
	}

	public void setIdSoggettoMitt(long idSoggettoMitt) {
		this.idSoggettoMitt = idSoggettoMitt;
	}

	public long getIdSpedizione() {
		return this.idSpedizione;
	}

	public void setIdSpedizione(long idSpedizione) {
		this.idSpedizione = idSpedizione;
	}

	public long getIdSpedizionePadre() {
		return this.idSpedizionePadre;
	}

	public void setIdSpedizionePadre(long idSpedizionePadre) {
		this.idSpedizionePadre = idSpedizionePadre;
	}

	public long getIdTipoSpedizione() {
		return this.idTipoSpedizione;
	}

	public void setIdTipoSpedizione(long idTipoSpedizione) {
		this.idTipoSpedizione = idTipoSpedizione;
	}

	public BigDecimal getImportoAssicurato() {
		return this.importoAssicurato;
	}

	public void setImportoAssicurato(BigDecimal importoAssicurato) {
		this.importoAssicurato = importoAssicurato;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getUserUpdate() {
		return this.userUpdate;
	}

	public void setUserUpdate(String userUpdate) {
		this.userUpdate = userUpdate;
	}

}