package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the locked_objects database table.
 * 
 */
@Entity
@Table(name="locked_objects")
@NamedQuery(name="LockedObject.findAll", query="SELECT l FROM LockedObject l")
public class LockedObject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private long created;

	@Column(name="object_id")
	private long objectId;

	@Column(name="object_type")
	private String objectType;

	private String username;

	public LockedObject() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCreated() {
		return this.created;
	}

	public void setCreated(long created) {
		this.created = created;
	}

	public long getObjectId() {
		return this.objectId;
	}

	public void setObjectId(long objectId) {
		this.objectId = objectId;
	}

	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}