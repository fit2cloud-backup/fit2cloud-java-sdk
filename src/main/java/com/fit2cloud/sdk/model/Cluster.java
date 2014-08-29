package com.fit2cloud.sdk.model;

@SuppressWarnings("restriction")
@javax.xml.bind.annotation.XmlRootElement
public class Cluster {
	
	private Long id;
	private Long cloudId;
	private String cloudName;
	private String clusterType;
	private String envType;
	private String name;
	private String status;
	private String description;
	private long launched;
	private long created;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getClusterType() {
		return clusterType;
	}
	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
	}
	public String getEnvType() {
		return envType;
	}
	public void setEnvType(String envType) {
		this.envType = envType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getLaunched() {
		return launched;
	}
	public void setLaunched(long launched) {
		this.launched = launched;
	}
	public long getCreated() {
		return created;
	}
	public void setCreated(long created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Cluster [id=" + id + ", cloudId=" + cloudId + ", cloudName="
				+ cloudName + ", clusterType=" + clusterType + ", envType="
				+ envType + ", name=" + name + ", status=" + status
				+ ", description=" + description + ", launched=" + launched
				+ ", created=" + created + "]";
	}
	
	
}