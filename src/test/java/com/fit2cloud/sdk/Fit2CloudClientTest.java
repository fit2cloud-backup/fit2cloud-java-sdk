package com.fit2cloud.sdk;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fit2cloud.sdk.Fit2CloudClient;
import com.fit2cloud.sdk.model.Cluster;
import com.fit2cloud.sdk.model.ClusterRole;
import com.fit2cloud.sdk.model.Logging;
import com.fit2cloud.sdk.model.Server;

public class Fit2CloudClientTest {
	
	private String apiKey;
	private String apiSecret;
	private Fit2CloudClient client;

	@Before
	public void setUp() throws Exception {
		this.apiKey = "Your Consumer Key";
		this.apiSecret = "Your Secrey Key";
		this.client = new Fit2CloudClient(apiKey, apiSecret, CloudTypes.aws);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetClusters() throws Exception {
		System.out.println("List clusters...");
		List<Cluster> clusters = this.client.getClusters();
		assert clusters!=null && clusters.size()>0;
		System.out.println(clusters);
	}
	
	@Test
	public void testGetClusterRoles() throws Exception {
		System.out.println("List roles for cluster...");
		List<Cluster> clusters = this.client.getClusters();
		assert clusters!=null && clusters.size()>0;		
		
		List<ClusterRole> clusterRoles = client.getClusterRoles(clusters.get(0).getId());
		assert clusterRoles!=null && clusterRoles.size()>0;
		System.out.println(clusterRoles);
	}
	
	@Test
	public void testGetClusterServers() throws Exception {
		System.out.println("List servers for cluster 105...");
		List<Cluster> clusters = this.client.getClusters();
		assert clusters!=null && clusters.size()>0;
		List<Server> servers = client.getClusterServers(105);
		assert servers!=null;
		System.out.println(servers);
	}
	
	@Test
	public void testExecuteScriptInServer() throws Exception {
		long serverId = 157l;
		StringBuilder sb = new StringBuilder();
		sb.append("#!/bin/bash").append("\n");
		sb.append("pwd").append("\n");
		sb.append("ls -l").append("\n");
		sb.append("date").append("\n");
		String scriptContent = sb.toString();
		long eventId = client.executeScript(serverId, scriptContent);
		System.out.println(eventId);
	}
	
	@Test
	public void testGetEventLogging() throws Exception {
		long eventId = 306;
		List<Logging> loggings = client.getLoggingsByEventId(eventId);
		System.out.println(loggings);
	}

}
