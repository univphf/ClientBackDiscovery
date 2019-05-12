package com.dev.ht.clientbackdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient

public class ClientbackdiscoveryApplication {
    
    @RequestMapping({"/info","/"}) 
    String info(){
         String retour="Je suis la pages d'infos du back service";
         return retour;
   }
    
   @RequestMapping({"/bonjour"})
   @ResponseBody
   String bonjour(){
      return "Bonjour tout le monde!";
   }
   
    	public static void main(String[] args) {
		SpringApplication.run(ClientbackdiscoveryApplication.class, args);
	} 
}
