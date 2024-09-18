//package  com.crl.nms.databases;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
////@Entity
////@Table(name = "firewall_rule")
//public class FirewallRule {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long Sno;
//
//
//    @Column(name = "chain")
//    private String chain;
//
//    @Column(name = "interface_name")
//    private String interfaceName;
//
//    @Column(name = "source_dest")
//    private String sourceOrDest;
//
//    @Column(name = "ip_address")
//    private String ipAddress;
//
//    @Column(name = "protocol")
//    private String protocol;
//
//    @Column(name = "port")
//    private String port;
//
//    @Column(name = "port_number")
//    private int portNumber;
//
//    @Column(name = "workstation_ip")
//    private String workstation_ip;
//
//    @Column(name = "workstation_name")
//    private String workstation_name;
//
//    // Default constructor
//    public FirewallRule() {
//    }
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
//    // Getters and setters
//    public String getChain() {
//        return chain;
//    }
//
//    public void setChain(String chain) {
//        this.chain = chain;
//    }
//
//    public String getInterfaceName() {
//        return interfaceName;
//    }
//
//    public void setInterfaceName(String interfaceName) {
//        this.interfaceName = interfaceName;
//    }
//
//    public String getSourceOrDest() {
//        return sourceOrDest;
//    }
//
//    public void setSourceOrDest(String sourceOrDest) {
//        this.sourceOrDest = sourceOrDest;
//    }
//
//    public String getIpAddress() {
//        return ipAddress;
//    }
//
//    public void setIpAddress(String ipAddress) {
//        this.ipAddress = ipAddress;
//    }
//
//    public String getProtocol() {
//        return protocol;
//    }
//
//    public void setProtocol(String protocol) {
//        this.protocol = protocol;
//    }
//
//    public String getPort() {
//        return port;
//    }
//
//    public void setPort(String port) {
//        this.port = port;
//    }
//
//    public int getPortNumber() {
//        return portNumber;
//    }
//
//    public void setPortNumber(int portNumber) {
//        this.portNumber = portNumber;
//    }
//
//    public String getWorkstation_ip() {
//        return workstation_ip;
//    }
//
//    public void setWorkstation_ip(String workstation_ip) {
//        this.workstation_ip = workstation_ip;
//    }
//
//    public String getWorkstation_name() {
//        return workstation_name;
//    }
//
//    public void setWorkstation_name(String workstation_name) {
//        this.workstation_name = workstation_name;
//    }
//}
