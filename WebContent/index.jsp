<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>My JSP 'index.jsp' starting page</title>
    <script type="text/javascript">
    	function  ws_init(){
			 var target="ws://localhost:8080/WebSocket/echo";
    		  if ('WebSocket' in window) {
                  ws = new WebSocket(target);
              } else if ('MozWebSocket' in window) {
                  ws = new MozWebSocket(target);
              } else {
                  alert('WebSocket is not supported by this browser.');
                  return;
              }
    		  ws.onopen=function(){
	    				console.info("webSocket通道建立成功！！！");  
    		  };
    			
    	}
    
    </script>
  </head>
  <body>
  
  		<button  onclick="ws_init();"  >open</button>
  			
  
  </body>
</html>
