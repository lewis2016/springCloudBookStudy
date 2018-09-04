package com.lewis.web;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@EnableAutoConfiguration
public class HelloController {
	
	
	private final Logger logger=Logger.getLogger(HelloController.class);
	
	@Autowired
	private DiscoveryClient client;
	
	 @RequestMapping("/hello")
	 @ResponseBody
	public String index(){
		 ServiceInstance instance=client.getLocalServiceInstance();
		 this.logger.info("/hello,host:"+instance.getHost()+",port:"+instance.getPort());
		return "helloworld";
	}
	 
	 public static void main(String[] args) throws Exception {
	        SpringApplication.run(HelloController.class, args);
	       // SpringApplication.run(BookController.class, args);
	        //运行之后在浏览器中访问：http://localhost:8080/hello
	    }
}
