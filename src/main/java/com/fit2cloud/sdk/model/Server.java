package com.fit2cloud.sdk.model;

@SuppressWarnings("restriction")
@javax.xml.bind.annotation.XmlRootElement
public class Server {
	
	private Long id;
	private String name;
	private String description;
	private Long cloudId;
	private String cloudName;	
	private Long clusterId;
	private String clusterType;
	private String clusterName;
	private Long clusterRoleId;
	private String clusterRoleName;
	private Long serverRoleId;
	private Long image;
	private String imageId;
	private String imageName;
	private String vmId;
	private String password;
	private String vmStatus;
	private String vmType;
	private String region;
	private String remoteIP;
	private String localIP;
	private long created;
	private long deleted;
	private String heartbeatStatus;
	private String internetType;
	private int internetBandwidth;
	private double price;
	private String failedCause;
	private boolean terminateFlag;
	private String runningTime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getCloudId() {
		return cloudId;
	}
	public void setCloudId(Long cloudId) {
		this.cloudId = cloudId;
	}
	public String getCloudName() {
		return cloudName;
	}
	public void setCloudName(String cloudName) {
		this.cloudName = cloudName;
	}
	public Long getClusterId() {
		return clusterId;
	}
	public void setClusterId(Long clusterId) {
		this.clusterId = clusterId;
	}
	public String getClusterType() {
		return clusterType;
	}
	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
	}
	public String getClusterName() {
		return clusterName;
	}
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}
	public Long getClusterRoleId() {
		return clusterRoleId;
	}
	public void setClusterRoleId(Long clusterRoleId) {
		this.clusterRoleId = clusterRoleId;
	}
	public String getClusterRoleName() {
		return clusterRoleName;
	}
	public void setClusterRoleName(String clusterRoleName) {
		this.clusterRoleName = clusterRoleName;
	}
	public Long getServerRoleId() {
		return serverRoleId;
	}
	public void setServerRoleId(Long serverRoleId) {
		this.serverRoleId = serverRoleId;
	}
	public Long getImage() {
		return image;
	}
	public void setImage(Long image) {
		this.image = image;
	}
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getVmId() {
		return vmId;
	}
	public void setVmId(String vmId) {
		this.vmId = vmId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getVmStatus() {
		return vmStatus;
	}
	public void setVmStatus(String vmStatus) {
		this.vmStatus = vmStatus;
	}
	public String getVmType() {
		return vmType;
	}
	public void setVmType(String vmType) {
		this.vmType = vmType;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getRemoteIP() {
		return remoteIP;
	}
	public void setRemoteIP(String remoteIP) {
		this.remoteIP = remoteIP;
	}
	public String getLocalIP() {
		return localIP;
	}
	public void setLocalIP(String localIP) {
		this.localIP = localIP;
	}
	public long getCreated() {
		return created;
	}
	public void setCreated(long created) {
		this.created = created;
	}
	public long getDeleted() {
		return deleted;
	}
	public void setDeleted(long deleted) {
		this.deleted = deleted;
	}
	public String getHeartbeatStatus() {
		return heartbeatStatus;
	}
	public void setHeartbeatStatus(String heartbeatStatus) {
		this.heartbeatStatus = heartbeatStatus;
	}
	public String getInternetType() {
		return internetType;
	}
	public void setInternetType(String internetType) {
		this.internetType = internetType;
	}
	public int getInternetBandwidth() {
		return internetBandwidth;
	}
	public void setInternetBandwidth(int internetBandwidth) {
		this.internetBandwidth = internetBandwidth;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getFailedCause() {
		return failedCause;
	}
	public void setFailedCause(String failedCause) {
		this.failedCause = failedCause;
	}
	public boolean isTerminateFlag() {
		return terminateFlag;
	}
	public void setTerminateFlag(boolean terminateFlag) {
		this.terminateFlag = terminateFlag;
	}
	public String getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(String runningTime) {
		this.runningTime = runningTime;
	}
	@Override
	public String toString() {
		return "Server [id=" + id + ", name=" + name + ", description="
				+ description + ", cloudId=" + cloudId + ", cloudName="
				+ cloudName + ", clusterId=" + clusterId + ", clusterType="
				+ clusterType + ", clusterName=" + clusterName
				+ ", clusterRoleId=" + clusterRoleId + ", clusterRoleName="
				+ clusterRoleName + ", serverRoleId=" + serverRoleId
				+ ", image=" + image + ", imageId=" + imageId + ", imageName="
				+ imageName + ", vmId=" + vmId + ", password=" + password
				+ ", vmStatus=" + vmStatus + ", vmType=" + vmType + ", region="
				+ region + ", remoteIP=" + remoteIP + ", localIP=" + localIP
				+ ", created=" + created + ", deleted=" + deleted
				+ ", heartbeatStatus=" + heartbeatStatus + ", internetType="
				+ internetType + ", internetBandwidth=" + internetBandwidth
				+ ", price=" + price + ", failedCause=" + failedCause
				+ ", terminateFlag=" + terminateFlag + "]";
	}
}
