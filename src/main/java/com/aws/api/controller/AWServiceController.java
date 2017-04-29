package com.aws.api.controller;


import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AWServiceController {
	
	@RequestMapping(value="order/list",method=RequestMethod.GET)
	@ResponseBody
	public List<String>  getOrders(){
        return Lists.newArrayList("order","product");
	}

}
