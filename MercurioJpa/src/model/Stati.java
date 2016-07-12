package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stati database table.
 * 
 */
@Entity
@Table(name="stati")
@NamedQuery(name="Stati.findAll", query="SELECT s FROM Stati s")
public class Stati implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_stato")
	private int idStato;

	private String descrizione;

	private int sla;

	@Column(name="sla_misura")
	private String slaMisura;

	@Column(name="stato_finale")
	private Boolean statoFinale;

	@Column(name="stato_sistema")
	private boolean statoSistema;

	@Column(name="version")
	private Integer version;

	public Stati() {
	}

	public int getIdStato() {
		return this.idStato;
	}

	public void setIdStato(int idStato) {
		this.idStato = idStato;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getSla() {
		return this.sla;
	}

	public void setSla(int sla) {
		this.sla = sla;
	}

	public String getSlaMisura() {
		return this.slaMisura;
	}

	public void setSlaMisura(String slaMisura) {
		this.slaMisura = slaMisura;
	}

	public boolean getStatoFinale() {
		return this.statoFinale;
	}

	public void setStatoFinale(boolean statoFinale) {
		this.statoFinale = statoFinale;
	}

	public boolean getStatoSistema() {
		return this.statoSistema;
	}

	public void setStatoSistema(boolean statoSistema) {
		this.statoSistema = statoSistema;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}