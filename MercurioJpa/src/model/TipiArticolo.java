package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipi_articolo database table.
 * 
 */
@Entity
@Table(name="tipi_articolo")
@NamedQuery(name="TipiArticolo.findAll", query="SELECT t FROM TipiArticolo t")
public class TipiArticolo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tipo_articolo")
	private long idTipoArticolo;

	@Column(name="codice_tipo")
	private String codiceTipo;

	private String descrizione;

	public TipiArticolo() {
	}

	public long getIdTipoArticolo() {
		return this.idTipoArticolo;
	}

	public void setIdTipoArticolo(long idTipoArticolo) {
		this.idTipoArticolo = idTipoArticolo;
	}

	public String getCodiceTipo() {
		return this.codiceTipo;
	}

	public void setCodiceTipo(String codiceTipo) {
		this.codiceTipo = codiceTipo;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}