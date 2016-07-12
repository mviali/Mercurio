package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the errori database table.
 * 
 */
@Entity
@Table(name="errori")
@NamedQuery(name="Errori.findAll", query="SELECT e FROM Errori e")
public class Errori implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_errori")
	private long idErrori;

	@Column(name="codice_errore")
	private int codiceErrore;

	@Column(name="data_errore")
	private Timestamp dataErrore;

	@Column(name="descrizione_errore")
	private String descrizioneErrore;

	@Column(name="dettaglio_richiesta")
	private String dettaglioRichiesta;

	@Column(name="file_container")
	private String fileContainer;

	@Column(name="id_spedizione")
	private long idSpedizione;

	private boolean lavorato;

	private boolean letto;

	@Column(name="sistema_richiedente")
	private String sistemaRichiedente;

	private boolean solved;

	@Column(name="tipo_richiesta")
	private int tipoRichiesta;

	public Errori() {
	}

	public long getIdErrori() {
		return this.idErrori;
	}

	public void setIdErrori(long idErrori) {
		this.idErrori = idErrori;
	}

	public int getCodiceErrore() {
		return this.codiceErrore;
	}

	public void setCodiceErrore(int codiceErrore) {
		this.codiceErrore = codiceErrore;
	}

	public Timestamp getDataErrore() {
		return this.dataErrore;
	}

	public void setDataErrore(Timestamp dataErrore) {
		this.dataErrore = dataErrore;
	}

	public String getDescrizioneErrore() {
		return this.descrizioneErrore;
	}

	public void setDescrizioneErrore(String descrizioneErrore) {
		this.descrizioneErrore = descrizioneErrore;
	}

	public String getDettaglioRichiesta() {
		return this.dettaglioRichiesta;
	}

	public void setDettaglioRichiesta(String dettaglioRichiesta) {
		this.dettaglioRichiesta = dettaglioRichiesta;
	}

	public String getFileContainer() {
		return this.fileContainer;
	}

	public void setFileContainer(String fileContainer) {
		this.fileContainer = fileContainer;
	}

	public long getIdSpedizione() {
		return this.idSpedizione;
	}

	public void setIdSpedizione(long idSpedizione) {
		this.idSpedizione = idSpedizione;
	}

	public boolean getLavorato() {
		return this.lavorato;
	}

	public void setLavorato(boolean lavorato) {
		this.lavorato = lavorato;
	}

	public boolean getLetto() {
		return this.letto;
	}

	public void setLetto(boolean letto) {
		this.letto = letto;
	}

	public String getSistemaRichiedente() {
		return this.sistemaRichiedente;
	}

	public void setSistemaRichiedente(String sistemaRichiedente) {
		this.sistemaRichiedente = sistemaRichiedente;
	}

	public boolean getSolved() {
		return this.solved;
	}

	public void setSolved(boolean solved) {
		this.solved = solved;
	}

	public int getTipoRichiesta() {
		return this.tipoRichiesta;
	}

	public void setTipoRichiesta(int tipoRichiesta) {
		this.tipoRichiesta = tipoRichiesta;
	}

}