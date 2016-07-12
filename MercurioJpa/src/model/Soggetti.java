package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the soggetti database table.
 * 
 */
@Entity
@Table(name="soggetti")
@NamedQuery(name="Soggetti.findAll", query="SELECT s FROM Soggetti s")
public class Soggetti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_soggetto")
	private long idSoggetto;

	@Column(name="cell_1")
	private String cell1;

	@Column(name="cell_2")
	private String cell2;

	private String cf;

	private String cognome;

	private String email;

	@Column(name="id_sistema_owner")
	private int idSistemaOwner;

	@Column(name="id_soggetto_sistema_esterno")
	private long idSoggettoSistemaEsterno;

	@Column(name="id_tipologia_soggetto")
	private int idTipologiaSoggetto;

	@Column(name="last_update")
	private Timestamp lastUpdate;

	private String nome;

	@Column(name="p_iva")
	private String pIva;

	@Column(name="ragione_sociale")
	private String ragioneSociale;

	private String tel;

	@Column(name="user_update")
	private String userUpdate;

	public Soggetti() {
	}

	public long getIdSoggetto() {
		return this.idSoggetto;
	}

	public void setIdSoggetto(long idSoggetto) {
		this.idSoggetto = idSoggetto;
	}

	public String getCell1() {
		return this.cell1;
	}

	public void setCell1(String cell1) {
		this.cell1 = cell1;
	}

	public String getCell2() {
		return this.cell2;
	}

	public void setCell2(String cell2) {
		this.cell2 = cell2;
	}

	public String getCf() {
		return this.cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdSistemaOwner() {
		return this.idSistemaOwner;
	}

	public void setIdSistemaOwner(int idSistemaOwner) {
		this.idSistemaOwner = idSistemaOwner;
	}

	public long getIdSoggettoSistemaEsterno() {
		return this.idSoggettoSistemaEsterno;
	}

	public void setIdSoggettoSistemaEsterno(long idSoggettoSistemaEsterno) {
		this.idSoggettoSistemaEsterno = idSoggettoSistemaEsterno;
	}

	public int getIdTipologiaSoggetto() {
		return this.idTipologiaSoggetto;
	}

	public void setIdTipologiaSoggetto(int idTipologiaSoggetto) {
		this.idTipologiaSoggetto = idTipologiaSoggetto;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPIva() {
		return this.pIva;
	}

	public void setPIva(String pIva) {
		this.pIva = pIva;
	}

	public String getRagioneSociale() {
		return this.ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getUserUpdate() {
		return this.userUpdate;
	}

	public void setUserUpdate(String userUpdate) {
		this.userUpdate = userUpdate;
	}

}