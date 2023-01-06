package com.masai.work;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsuranceController {
	
	@Autowired
	private InsuranceService is;
	@Autowired
	private InsuranceRepo ir;

	
	@PostMapping("/Insurance")
	public ResponseEntity<InsurancePolicy> saveInsurance(@Valid @RequestBody InsurancePolicy InsurnacePolicy){
		
	is.saveInsurance(InsurnacePolicy);
	return new ResponseEntity<>(InsurnacePolicy,HttpStatus.CREATED);
	}
	@GetMapping("/getInsurance/{InsuranceId}")
	public ResponseEntity<InsurancePolicy> getInsurance(@PathVariable("InsuranceId") Long id){
		InsurancePolicy ips=is.getInsurance(id);
		return new ResponseEntity<>(ips,HttpStatus.OK);
	}
	@GetMapping("/getInsurance")
	public ResponseEntity<List<InsurancePolicy>> getAllInsurance(){
		List<InsurancePolicy> ips=is.getAllInsurance();
		return new ResponseEntity<>(ips,HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<InsurancePolicy> updateInsurance(@RequestBody InsurancePolicy InsurnacePolicy){
		is.uodateInsurance(InsurnacePolicy);
		return new ResponseEntity<>(InsurnacePolicy,HttpStatus.CREATED);
		}
	@DeleteMapping("/delete/{ID}")
	public ResponseEntity<InsurancePolicy> deleteInsurance(@PathVariable("ID") Long id){
		Optional<InsurancePolicy> h=ir.findById(id);
		InsurancePolicy j=h.get();
		InsurancePolicy ips=is.deleteInsurance(j);
		return new ResponseEntity<>(ips,HttpStatus.OK);
	}
	
	
}
