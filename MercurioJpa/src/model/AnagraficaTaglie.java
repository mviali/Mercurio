package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the anagrafica_taglie database table.
 * 
 */
@Entity
@Table(name="anagrafica_taglie")
@NamedQuery(name="AnagraficaTaglie.findAll", query="SELECT a FROM AnagraficaTaglie a")
public class AnagraficaTaglie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column(name="codice_taglia")
	private String codiceTaglia;

	@Column(name="descrizione_taglia")
	private String descrizioneTaglia;

	@Column(name="id_fornitore")
	private long idFornitore;

	private int size;

	public AnagraficaTaglie() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodiceTaglia() {
		return this.codiceTaglia;
	}

	public void setCodiceTaglia(String codiceTaglia) {
		this.codiceTaglia = codiceTaglia;
	}

	public String getDescrizioneTaglia() {
		return this.descrizioneTaglia;
	}

	public void setDescrizioneTaglia(String descrizioneTaglia) {
		this.descrizioneTaglia = descrizioneTaglia;
	}

	public long getIdFornitore() {
		return this.idFornitore;
	}

	public void setIdFornitore(long idFornitore) {
		this.idFornitore = idFornitore;
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}