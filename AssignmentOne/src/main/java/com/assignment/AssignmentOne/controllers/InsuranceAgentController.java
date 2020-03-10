/**
 * 
 */
package com.assignment.AssignmentOne.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Streams;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 *
 */
@RestController
@RequestMapping("/insurance")
public class InsuranceAgentController {
	
	private  String[] insuranceTypes = {"Health Insurance", "Home Insurance", "Vehicle Insurance"};
	
		
	@RequestMapping("/insuranceTypes")
	public ResponseEntity<String[]> getInsuranceTypes() {
		return new ResponseEntity<String[]>(insuranceTypes,HttpStatus.OK);
		
	}
	
	@RequestMapping("/insuranceAgents")
	public ResponseEntity<ArrayList<String>> getInsuranceAgents() {
		ArrayList<String> insuranceAgents = new ArrayList<String>();
		insuranceAgents.add("Captive Agents");
		insuranceAgents.add("Independent Insurance Agents");
		return new ResponseEntity<ArrayList<String>>(insuranceAgents,HttpStatus.OK);
		
	}
	
}
