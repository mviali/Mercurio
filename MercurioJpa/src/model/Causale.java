package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the causale database table.
 * 
 */
@Entity
@Table(name="causale")
@NamedQuery(name="Causale.findAll", query="SELECT c FROM Causale c")
public class Causale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_causale")
	private long idCausale;

	private String descrizione;

	public Causale() {
	}

	public long getIdCausale() {
		return this.idCausale;
	}

	public void setIdCausale(long idCausale) {
		this.idCausale = idCausale;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}