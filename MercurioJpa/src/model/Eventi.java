package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the eventi database table.
 * 
 */
@Entity
@Table(name="eventi")
@NamedQuery(name="Eventi.findAll", query="SELECT e FROM Eventi e")
public class Eventi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_evento")
	private int idEvento;

	private String descrizione;

	public Eventi() {
	}

	public int getIdEvento() {
		return this.idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}