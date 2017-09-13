package com.xzh.webSocket;

import java.util.Set;

import javax.websocket.Endpoint;
import javax.websocket.server.ServerApplicationConfig;
import javax.websocket.server.ServerEndpointConfig;

public class WebSocketConfig implements ServerApplicationConfig{

	@Override
	public Set<Class<?>> getAnnotatedEndpointClasses(Set<Class<?>> arg0) {
		System.out.println("Hello WebSocket!"+arg0.size());
		return null;
	}

	@Override
	public Set<ServerEndpointConfig> getEndpointConfigs(Set<Class<? extends Endpoint>> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
   
} 
