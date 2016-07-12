package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the taglia_articolo database table.
 * 
 */
@Entity
@Table(name="taglia_articolo")
@NamedQuery(name="TagliaArticolo.findAll", query="SELECT t FROM TagliaArticolo t")
public class TagliaArticolo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column(name="id_anagrafica_articolo")
	private long idAnagraficaArticolo;

	@Column(name="id_anagrafica_taglia")
	private long idAnagraficaTaglia;

	public TagliaArticolo() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdAnagraficaArticolo() {
		return this.idAnagraficaArticolo;
	}

	public void setIdAnagraficaArticolo(long idAnagraficaArticolo) {
		this.idAnagraficaArticolo = idAnagraficaArticolo;
	}

	public long getIdAnagraficaTaglia() {
		return this.idAnagraficaTaglia;
	}

	public void setIdAnagraficaTaglia(long idAnagraficaTaglia) {
		this.idAnagraficaTaglia = idAnagraficaTaglia;
	}

}