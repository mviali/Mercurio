package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fornitori_servizio database table.
 * 
 */
@Entity
@Table(name="fornitori_servizio")
@NamedQuery(name="FornitoriServizio.findAll", query="SELECT f FROM FornitoriServizio f")
public class FornitoriServizio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_fornitori_servizio")
	private long idFornitoriServizio;

	@Column(name="id_fornitore")
	private long idFornitore;

	@Column(name="id_servizio")
	private long idServizio;

	public FornitoriServizio() {
	}

	public long getIdFornitoriServizio() {
		return this.idFornitoriServizio;
	}

	public void setIdFornitoriServizio(long idFornitoriServizio) {
		this.idFornitoriServizio = idFornitoriServizio;
	}

	public long getIdFornitore() {
		return this.idFornitore;
	}

	public void setIdFornitore(long idFornitore) {
		this.idFornitore = idFornitore;
	}

	public long getIdServizio() {
		return this.idServizio;
	}

	public void setIdServizio(long idServizio) {
		this.idServizio = idServizio;
	}

}