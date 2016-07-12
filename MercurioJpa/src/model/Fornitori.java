package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the fornitori database table.
 * 
 */
@Entity
@Table(name="fornitori")
@NamedQuery(name="Fornitori.findAll", query="SELECT f FROM Fornitori f")
public class Fornitori implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_fornitore")
	private long idFornitore;

	private String descrizione;

	@Column(name="id_fornitore_sap")
	private String idFornitoreSap;

	@Column(name="last_update")
	private Timestamp lastUpdate;

	private int tipo;

	@Column(name="user_update")
	private String userUpdate;

	public Fornitori() {
	}

	public long getIdFornitore() {
		return this.idFornitore;
	}

	public void setIdFornitore(long idFornitore) {
		this.idFornitore = idFornitore;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getIdFornitoreSap() {
		return this.idFornitoreSap;
	}

	public void setIdFornitoreSap(String idFornitoreSap) {
		this.idFornitoreSap = idFornitoreSap;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getUserUpdate() {
		return this.userUpdate;
	}

	public void setUserUpdate(String userUpdate) {
		this.userUpdate = userUpdate;
	}

}