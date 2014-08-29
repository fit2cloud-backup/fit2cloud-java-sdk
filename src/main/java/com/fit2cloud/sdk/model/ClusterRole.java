package com.fit2cloud.sdk.model;

@SuppressWarnings("restriction")
@javax.xml.bind.annotation.XmlRootElement
public class ClusterRole{
	
	private Long id;
	private Long clusterId;
	private String clusterName;
	private Long serverRoleId;
	private String serverRoleName;
	private int vmNumber;
	private Long image;
	private String imageId;
	private String imageName;
	private String region;
	private String instanceType;
	private String internetType;
	private int internetBandwidth;
	private String name;
	private int launchDelay;
	private int launchInterval;
	private long created;
	private String description;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getClusterId() {
		return clusterId;
	}
	public void setClusterId(Long clusterId) {
		this.clusterId = clusterId;
	}
	public String getClusterName() {
		return clusterName;
	}
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}
	public Long getServerRoleId() {
		return serverRoleId;
	}
	public void setServerRoleId(Long serverRoleId) {
		this.serverRoleId = serverRoleId;
	}
	public String getServerRoleName() {
		return serverRoleName;
	}
	public void setServerRoleName(String serverRoleName) {
		this.serverRoleName = serverRoleName;
	}
	public int getVmNumber() {
		return vmNumber;
	}
	public void setVmNumber(int vmNumber) {
		this.vmNumber = vmNumber;
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
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getInstanceType() {
		return instanceType;
	}
	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLaunchDelay() {
		return launchDelay;
	}
	public void setLaunchDelay(int launchDelay) {
		this.launchDelay = launchDelay;
	}
	public int getLaunchInterval() {
		return launchInterval;
	}
	public void setLaunchInterval(int launchInterval) {
		this.launchInterval = launchInterval;
	}
	public long getCreated() {
		return created;
	}
	public void setCreated(long created) {
		this.created = created;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "ClusterRole [id=" + id + ", clusterId=" + clusterId
				+ ", clusterName=" + clusterName + ", serverRoleId="
				+ serverRoleId + ", serverRoleName=" + serverRoleName
				+ ", vmNumber=" + vmNumber + ", image=" + image + ", imageId="
				+ imageId + ", imageName=" + imageName + ", region=" + region
				+ ", instanceType=" + instanceType + ", internetType="
				+ internetType + ", internetBandwidth=" + internetBandwidth
				+ ", name=" + name + ", launchDelay=" + launchDelay
				+ ", launchInterval=" + launchInterval + ", created=" + created
				+ ", description=" + description + "]";
	}
}
