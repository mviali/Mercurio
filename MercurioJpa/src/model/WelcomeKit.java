package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the welcome_kit database table.
 * 
 */
@Entity
@Table(name="welcome_kit")
@NamedQuery(name="WelcomeKit.findAll", query="SELECT w FROM WelcomeKit w")
public class WelcomeKit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_spedizione")
	private long idSpedizione;

	private Timestamp data_attivazione_servizio_EE;

	private Timestamp data_attivazione_servizio_GAS;

	@Column(name="data_sottoscrizione_contratto")
	private Timestamp dataSottoscrizioneContratto;

	@Column(name="id_campagna")
	private long idCampagna;

	@Column(name="id_istanza_campagna")
	private long idIstanzaCampagna;

	@Column(name="tipo_bundle")
	private int tipoBundle;

	@Column(name="tipologia_contratto")
	private int tipologiaContratto;

	public WelcomeKit() {
	}

	public long getIdSpedizione() {
		return this.idSpedizione;
	}

	public void setIdSpedizione(long idSpedizione) {
		this.idSpedizione = idSpedizione;
	}

	public Timestamp getData_attivazione_servizio_EE() {
		return this.data_attivazione_servizio_EE;
	}

	public void setData_attivazione_servizio_EE(Timestamp data_attivazione_servizio_EE) {
		this.data_attivazione_servizio_EE = data_attivazione_servizio_EE;
	}

	public Timestamp getData_attivazione_servizio_GAS() {
		return this.data_attivazione_servizio_GAS;
	}

	public void setData_attivazione_servizio_GAS(Timestamp data_attivazione_servizio_GAS) {
		this.data_attivazione_servizio_GAS = data_attivazione_servizio_GAS;
	}

	public Timestamp getDataSottoscrizioneContratto() {
		return this.dataSottoscrizioneContratto;
	}

	public void setDataSottoscrizioneContratto(Timestamp dataSottoscrizioneContratto) {
		this.dataSottoscrizioneContratto = dataSottoscrizioneContratto;
	}

	public long getIdCampagna() {
		return this.idCampagna;
	}

	public void setIdCampagna(long idCampagna) {
		this.idCampagna = idCampagna;
	}

	public long getIdIstanzaCampagna() {
		return this.idIstanzaCampagna;
	}

	public void setIdIstanzaCampagna(long idIstanzaCampagna) {
		this.idIstanzaCampagna = idIstanzaCampagna;
	}

	public int getTipoBundle() {
		return this.tipoBundle;
	}

	public void setTipoBundle(int tipoBundle) {
		this.tipoBundle = tipoBundle;
	}

	public int getTipologiaContratto() {
		return this.tipologiaContratto;
	}

	public void setTipologiaContratto(int tipologiaContratto) {
		this.tipologiaContratto = tipologiaContratto;
	}

}