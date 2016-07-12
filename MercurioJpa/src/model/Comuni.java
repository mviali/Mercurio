package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the comuni database table.
 * 
 */
@Entity
@Table(name="comuni")
@NamedQuery(name="Comuni.findAll", query="SELECT c FROM Comuni c")
public class Comuni implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long cm_ID;

	private String cm_Cap;

	private String cm_CodIstat;

	private String cm_Denom;

	private String cm_PrefTel;

	public Comuni() {
	}

	public long getCm_ID() {
		return this.cm_ID;
	}

	public void setCm_ID(long cm_ID) {
		this.cm_ID = cm_ID;
	}

	public String getCm_Cap() {
		return this.cm_Cap;
	}

	public void setCm_Cap(String cm_Cap) {
		this.cm_Cap = cm_Cap;
	}

	public String getCm_CodIstat() {
		return this.cm_CodIstat;
	}

	public void setCm_CodIstat(String cm_CodIstat) {
		this.cm_CodIstat = cm_CodIstat;
	}

	public String getCm_Denom() {
		return this.cm_Denom;
	}

	public void setCm_Denom(String cm_Denom) {
		this.cm_Denom = cm_Denom;
	}

	public String getCm_PrefTel() {
		return this.cm_PrefTel;
	}

	public void setCm_PrefTel(String cm_PrefTel) {
		this.cm_PrefTel = cm_PrefTel;
	}

}