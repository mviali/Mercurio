package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the magazzini database table.
 * 
 */
@Entity
@Table(name="magazzini")
@NamedQuery(name="Magazzini.findAll", query="SELECT m FROM Magazzini m")
public class Magazzini implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_magazzino")
	private long idMagazzino;

	private String descrizione;

	@Column(name="id_mag_sap")
	private String idMagSap;

	@Column(name="last_update")
	private Timestamp lastUpdate;

	@Column(name="user_update")
	private String userUpdate;

	public Magazzini() {
	}

	public long getIdMagazzino() {
		return this.idMagazzino;
	}

	public void setIdMagazzino(long idMagazzino) {
		this.idMagazzino = idMagazzino;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getIdMagSap() {
		return this.idMagSap;
	}

	public void setIdMagSap(String idMagSap) {
		this.idMagSap = idMagSap;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getUserUpdate() {
		return this.userUpdate;
	}

	public void setUserUpdate(String userUpdate) {
		this.userUpdate = userUpdate;
	}

}