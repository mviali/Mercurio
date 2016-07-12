package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipo_soggetti database table.
 * 
 */
@Entity
@Table(name="tipo_soggetti")
@NamedQuery(name="TipoSoggetti.findAll", query="SELECT t FROM TipoSoggetti t")
public class TipoSoggetti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tipo_soggetto")
	private int idTipoSoggetto;

	private String descripzione;

	public TipoSoggetti() {
	}

	public int getIdTipoSoggetto() {
		return this.idTipoSoggetto;
	}

	public void setIdTipoSoggetto(int idTipoSoggetto) {
		this.idTipoSoggetto = idTipoSoggetto;
	}

	public String getDescripzione() {
		return this.descripzione;
	}

	public void setDescripzione(String descripzione) {
		this.descripzione = descripzione;
	}

}