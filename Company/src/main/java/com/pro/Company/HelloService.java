package com.pro.Company;

import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloService {
	
private String name="Satya";

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public  String sayHello(){
	return name;
}



}
