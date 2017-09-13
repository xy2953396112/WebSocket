package com.xzh.webSocket;

import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/echo")
public class WebSocket {
    
	@OnOpen
	public void open(Session session){
		System.out.println("session:"+session.getId());
	}
}
