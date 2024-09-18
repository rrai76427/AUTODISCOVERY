

package  com.crl.nms.databases;

import jakarta.persistence.*;

//@Entity
//@Table(name = "group_details")
public class GroupDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Sno;

	@Column(name = "group_type")
	public String group_type = "";

	@Column(name = "group_level")
	public String group_level = "";

	@Column(name = "group_Id")
	public int group_Id = 0;

	@Column(name = "group_name")
	public String group_name = "";

	@Column(name = "group_icon_path")
	public String group_icon_path = "";

	@Column(name = "latitude")
	public String latitude = "";

	@Column(name = "longitude")
	public String longitude = "";

	@Column(name = "location_name")
	public String location_name = "";

	public Long getId() {
		return Sno;
	}

	public void setId(Long id) {
		this.Sno = id;
	}

	public String getGroup_type() {
		return group_type;
	}

	public void setGroup_type(String group_type) {
		this.group_type = group_type;
	}

	public String getGroup_level() {
		return group_level;
	}

	public void setGroup_level(String group_level) {
		this.group_level = group_level;
	}

	public int getGroup_Id() {
		return group_Id;
	}

	public void setGroup_Id(int group_Id) {
		this.group_Id = group_Id;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public String getGroup_icon_path() {
		return group_icon_path;
	}

	public void setGroup_icon_path(String group_icon_path) {
		this.group_icon_path = group_icon_path;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLocation_name() {
		return location_name;
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}

}
