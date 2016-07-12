package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the router database table.
 * 
 */
@Entity
@Table(name="router")
@NamedQuery(name="Router.findAll", query="SELECT r FROM Router r")
public class Router implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_router")
	private long idRouter;

	@Column(name="data_fine_garanzia")
	private Timestamp dataFineGaranzia;

	@Column(name="mac_address")
	private String macAddress;

	private String matricola;

	public Router() {
	}

	public long getIdRouter() {
		return this.idRouter;
	}

	public void setIdRouter(long idRouter) {
		this.idRouter = idRouter;
	}

	public Timestamp getDataFineGaranzia() {
		return this.dataFineGaranzia;
	}

	public void setDataFineGaranzia(Timestamp dataFineGaranzia) {
		this.dataFineGaranzia = dataFineGaranzia;
	}

	public String getMacAddress() {
		return this.macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getMatricola() {
		return this.matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

}