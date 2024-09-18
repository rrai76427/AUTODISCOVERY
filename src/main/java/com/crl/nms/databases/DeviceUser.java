//package com.crl.nms.databases;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
////@Entity
////@Table(name = "device_user")
//public class DeviceUser {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long Sno;
//
//	@Column(name = "host_group")
//	private String host_group;
//
//
//    @Column(name = "device_type")
//    private String device_type;
//
//    @Column(name = "device_name")
//    private String device_name;
//
//    @Column(name = "user_id")
//    private String user_id;
//
//    @Column(name = "password")
//    private String password;
//
//    @Column(name = "confirm_password")
//    private String confirm_password;
//
//    @Column(name = "device_ip")
//    private String device_ip;
//
//    @Column(name = "device_description")
//    private String device_description;
//
//
//    public Long getId() {
//		return Sno;
//	}
//
//	public void setId(Long id) {
//		this.Sno = id;
//	}
//
//    public String getHost_group() {
//        return host_group;
//    }
//
//    public void setHost_group(String host_group) {
//        this.host_group = host_group;
//    }
//
//    public String getDevice_type() {
//        return device_type;
//    }
//
//    public void setDevice_type(String device_type) {
//        this.device_type = device_type;
//    }
//
//    public String getDevice_name() {
//        return device_name;
//    }
//
//    public void setDevice_name(String device_name) {
//        this.device_name = device_name;
//    }
//
//    public String getUser_id() {
//        return user_id;
//    }
//
//    public void setUser_id(String user_id) {
//        this.user_id = user_id;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getConfirm_password() {
//        return confirm_password;
//    }
//
//    public void setConfirm_password(String confirm_password) {
//        this.confirm_password = confirm_password;
//    }
//
//	public String getDevice_ip() {
//		return device_ip;
//	}
//
//	public void setDevice_ip(String device_ip) {
//		this.device_ip = device_ip;
//	}
//
//	public String getDevice_description() {
//		return device_description;
//	}
//
//	public void setDevice_description(String device_description) {
//		this.device_description = device_description;
//	}
//
//
//}
