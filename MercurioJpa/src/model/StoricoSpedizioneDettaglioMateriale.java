package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the storico_spedizione_dettaglio_materiale database table.
 * 
 */
@Entity
@Table(name="storico_spedizione_dettaglio_materiale")
@NamedQuery(name="StoricoSpedizioneDettaglioMateriale.findAll", query="SELECT s FROM StoricoSpedizioneDettaglioMateriale s")
public class StoricoSpedizioneDettaglioMateriale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_storico_dettaglio_materiale")
	private long idStoricoDettaglioMateriale;

	private String causale;

	@Column(name="data_consegna")
	private Timestamp dataConsegna;

	@Column(name="data_modifica")
	private Timestamp dataModifica;

	@Column(name="data_modifica_stato")
	private Timestamp dataModificaStato;

	@Column(name="data_prevista_consegna")
	private Timestamp dataPrevistaConsegna;

	@Column(name="id_spedizione")
	private long idSpedizione;

	@Column(name="id_stato")
	private int idStato;

	@Column(name="last_update")
	private Timestamp lastUpdate;

	private String magazzino;

	@Column(name="magazzino_entrata")
	private String magazzinoEntrata;

	private String matricola;

	private long progressivo;

	private String rif_DDT_fornitore;

	@Column(name="rif_esterno_tipo")
	private int rifEsternoTipo;

	@Column(name="rif_esterno_valore")
	private String rifEsternoValore;

	@Column(name="rif_ordine_fornitore")
	private String rifOrdineFornitore;

	@Column(name="rif_sap_anno")
	private String rifSapAnno;

	private String rif_SAP_numero;

	@Column(name="rif_sap_serie")
	private String rifSapSerie;

	@Column(name="rif_sap_tipo_documento")
	private String rifSapTipoDocumento;

	@Column(name="tracking_nr")
	private String trackingNr;

	@Column(name="user_update")
	private String userUpdate;

	public StoricoSpedizioneDettaglioMateriale() {
	}

	public long getIdStoricoDettaglioMateriale() {
		return this.idStoricoDettaglioMateriale;
	}

	public void setIdStoricoDettaglioMateriale(long idStoricoDettaglioMateriale) {
		this.idStoricoDettaglioMateriale = idStoricoDettaglioMateriale;
	}

	public String getCausale() {
		return this.causale;
	}

	public void setCausale(String causale) {
		this.causale = causale;
	}

	public Timestamp getDataConsegna() {
		return this.dataConsegna;
	}

	public void setDataConsegna(Timestamp dataConsegna) {
		this.dataConsegna = dataConsegna;
	}

	public Timestamp getDataModifica() {
		return this.dataModifica;
	}

	public void setDataModifica(Timestamp dataModifica) {
		this.dataModifica = dataModifica;
	}

	public Timestamp getDataModificaStato() {
		return this.dataModificaStato;
	}

	public void setDataModificaStato(Timestamp dataModificaStato) {
		this.dataModificaStato = dataModificaStato;
	}

	public Timestamp getDataPrevistaConsegna() {
		return this.dataPrevistaConsegna;
	}

	public void setDataPrevistaConsegna(Timestamp dataPrevistaConsegna) {
		this.dataPrevistaConsegna = dataPrevistaConsegna;
	}

	public long getIdSpedizione() {
		return this.idSpedizione;
	}

	public void setIdSpedizione(long idSpedizione) {
		this.idSpedizione = idSpedizione;
	}

	public int getIdStato() {
		return this.idStato;
	}

	public void setIdStato(int idStato) {
		this.idStato = idStato;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getMagazzino() {
		return this.magazzino;
	}

	public void setMagazzino(String magazzino) {
		this.magazzino = magazzino;
	}

	public String getMagazzinoEntrata() {
		return this.magazzinoEntrata;
	}

	public void setMagazzinoEntrata(String magazzinoEntrata) {
		this.magazzinoEntrata = magazzinoEntrata;
	}

	public String getMatricola() {
		return this.matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public long getProgressivo() {
		return this.progressivo;
	}

	public void setProgressivo(long progressivo) {
		this.progressivo = progressivo;
	}

	public String getRif_DDT_fornitore() {
		return this.rif_DDT_fornitore;
	}

	public void setRif_DDT_fornitore(String rif_DDT_fornitore) {
		this.rif_DDT_fornitore = rif_DDT_fornitore;
	}

	public int getRifEsternoTipo() {
		return this.rifEsternoTipo;
	}

	public void setRifEsternoTipo(int rifEsternoTipo) {
		this.rifEsternoTipo = rifEsternoTipo;
	}

	public String getRifEsternoValore() {
		return this.rifEsternoValore;
	}

	public void setRifEsternoValore(String rifEsternoValore) {
		this.rifEsternoValore = rifEsternoValore;
	}

	public String getRifOrdineFornitore() {
		return this.rifOrdineFornitore;
	}

	public void setRifOrdineFornitore(String rifOrdineFornitore) {
		this.rifOrdineFornitore = rifOrdineFornitore;
	}

	public String getRifSapAnno() {
		return this.rifSapAnno;
	}

	public void setRifSapAnno(String rifSapAnno) {
		this.rifSapAnno = rifSapAnno;
	}

	public String getRif_SAP_numero() {
		return this.rif_SAP_numero;
	}

	public void setRif_SAP_numero(String rif_SAP_numero) {
		this.rif_SAP_numero = rif_SAP_numero;
	}

	public String getRifSapSerie() {
		return this.rifSapSerie;
	}

	public void setRifSapSerie(String rifSapSerie) {
		this.rifSapSerie = rifSapSerie;
	}

	public String getRifSapTipoDocumento() {
		return this.rifSapTipoDocumento;
	}

	public void setRifSapTipoDocumento(String rifSapTipoDocumento) {
		this.rifSapTipoDocumento = rifSapTipoDocumento;
	}

	public String getTrackingNr() {
		return this.trackingNr;
	}

	public void setTrackingNr(String trackingNr) {
		this.trackingNr = trackingNr;
	}

	public String getUserUpdate() {
		return this.userUpdate;
	}

	public void setUserUpdate(String userUpdate) {
		this.userUpdate = userUpdate;
	}

}