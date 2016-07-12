package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the confFornitori database table.
 * 
 */
@Entity
@Table(name="confFornitori")
@NamedQuery(name="ConfFornitori.findAll", query="SELECT c FROM ConfFornitori c")
public class ConfFornitori implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private String descKey;

	private String descValue;

	@Column(name="id_fornitore")
	private long idFornitore;

	public ConfFornitori() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescKey() {
		return this.descKey;
	}

	public void setDescKey(String descKey) {
		this.descKey = descKey;
	}

	public String getDescValue() {
		return this.descValue;
	}

	public void setDescValue(String descValue) {
		this.descValue = descValue;
	}

	public long getIdFornitore() {
		return this.idFornitore;
	}

	public void setIdFornitore(long idFornitore) {
		this.idFornitore = idFornitore;
	}

}