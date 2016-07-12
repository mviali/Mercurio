package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipo_spedizione database table.
 * 
 */
@Entity
@Table(name="tipo_spedizione")
@NamedQuery(name="TipoSpedizione.findAll", query="SELECT t FROM TipoSpedizione t")
public class TipoSpedizione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tipo_spedizione")
	private int idTipoSpedizione;

	private String descrizione;

	public TipoSpedizione() {
	}

	public int getIdTipoSpedizione() {
		return this.idTipoSpedizione;
	}

	public void setIdTipoSpedizione(int idTipoSpedizione) {
		this.idTipoSpedizione = idTipoSpedizione;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}