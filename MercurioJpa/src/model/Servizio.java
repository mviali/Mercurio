package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the servizio database table.
 * 
 */
@Entity
@Table(name="servizio")
@NamedQuery(name="Servizio.findAll", query="SELECT s FROM Servizio s")
public class Servizio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_servizio")
	private long idServizio;

	private String descrizione;

	public Servizio() {
	}

	public long getIdServizio() {
		return this.idServizio;
	}

	public void setIdServizio(long idServizio) {
		this.idServizio = idServizio;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}