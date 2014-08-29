package com.fit2cloud.sdk;

public enum CloudTypes {

	aliyun("aliyun"), aws("aws"), qingyun("qingyun"), ucloud("ucloud");

	private String name;

	private CloudTypes(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
