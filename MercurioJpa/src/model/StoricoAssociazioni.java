package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the storico_associazioni database table.
 * 
 */
@Entity
@Table(name="storico_associazioni")
@NamedQuery(name="StoricoAssociazioni.findAll", query="SELECT s FROM StoricoAssociazioni s")
public class StoricoAssociazioni implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_storico_associazione")
	private long idStoricoAssociazione;

	@Column(name="data_fine_associazione")
	private Timestamp dataFineAssociazione;

	@Column(name="data_inizio_associazione")
	private Timestamp dataInizioAssociazione;

	@Column(name="id_associazione")
	private long idAssociazione;

	@Column(name="last_update")
	private Timestamp lastUpdate;

	private String matricola_A;

	private String matricola_B;

	private int tipo_A;

	private int tipo_B;

	@Column(name="user_update")
	private String userUpdate;

	public StoricoAssociazioni() {
	}

	public long getIdStoricoAssociazione() {
		return this.idStoricoAssociazione;
	}

	public void setIdStoricoAssociazione(long idStoricoAssociazione) {
		this.idStoricoAssociazione = idStoricoAssociazione;
	}

	public Timestamp getDataFineAssociazione() {
		return this.dataFineAssociazione;
	}

	public void setDataFineAssociazione(Timestamp dataFineAssociazione) {
		this.dataFineAssociazione = dataFineAssociazione;
	}

	public Timestamp getDataInizioAssociazione() {
		return this.dataInizioAssociazione;
	}

	public void setDataInizioAssociazione(Timestamp dataInizioAssociazione) {
		this.dataInizioAssociazione = dataInizioAssociazione;
	}

	public long getIdAssociazione() {
		return this.idAssociazione;
	}

	public void setIdAssociazione(long idAssociazione) {
		this.idAssociazione = idAssociazione;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getMatricola_A() {
		return this.matricola_A;
	}

	public void setMatricola_A(String matricola_A) {
		this.matricola_A = matricola_A;
	}

	public String getMatricola_B() {
		return this.matricola_B;
	}

	public void setMatricola_B(String matricola_B) {
		this.matricola_B = matricola_B;
	}

	public int getTipo_A() {
		return this.tipo_A;
	}

	public void setTipo_A(int tipo_A) {
		this.tipo_A = tipo_A;
	}

	public int getTipo_B() {
		return this.tipo_B;
	}

	public void setTipo_B(int tipo_B) {
		this.tipo_B = tipo_B;
	}

	public String getUserUpdate() {
		return this.userUpdate;
	}

	public void setUserUpdate(String userUpdate) {
		this.userUpdate = userUpdate;
	}

}