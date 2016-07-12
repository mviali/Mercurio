package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mappa_associazioni database table.
 * 
 */
@Entity
@Table(name="mappa_associazioni")
@NamedQuery(name="MappaAssociazioni.findAll", query="SELECT m FROM MappaAssociazioni m")
public class MappaAssociazioni implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_mappa_associazioni")
	private long idMappaAssociazioni;

	private long id_tipo_articolo_A;

	private long id_tipo_articolo_B;

	public MappaAssociazioni() {
	}

	public long getIdMappaAssociazioni() {
		return this.idMappaAssociazioni;
	}

	public void setIdMappaAssociazioni(long idMappaAssociazioni) {
		this.idMappaAssociazioni = idMappaAssociazioni;
	}

	public long getId_tipo_articolo_A() {
		return this.id_tipo_articolo_A;
	}

	public void setId_tipo_articolo_A(long id_tipo_articolo_A) {
		this.id_tipo_articolo_A = id_tipo_articolo_A;
	}

	public long getId_tipo_articolo_B() {
		return this.id_tipo_articolo_B;
	}

	public void setId_tipo_articolo_B(long id_tipo_articolo_B) {
		this.id_tipo_articolo_B = id_tipo_articolo_B;
	}

}