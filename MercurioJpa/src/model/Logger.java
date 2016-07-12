package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the logger database table.
 * 
 */
@Entity
@Table(name="logger")
@NamedQuery(name="Logger.findAll", query="SELECT l FROM Logger l")
public class Logger implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Lob
	private String response;

	private int status;

	private String url;

	private String userName;

	public Logger() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getResponse() {
		return this.response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}