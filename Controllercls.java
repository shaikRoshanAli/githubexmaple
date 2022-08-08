package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Devices;
import com.example.demo.service.Servicecls;

@RestController
public class Controllercls {
@Autowired Servicecls sc;
@GetMapping("/user")
private List<Devices> getMethod(){
	
	return sc.getMethod();
}

}
