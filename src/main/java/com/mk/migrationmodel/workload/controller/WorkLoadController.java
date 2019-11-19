/**
 * 
 */
package com.mk.migrationmodel.workload.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mk.migrationmodel.model.Response;
import com.mk.migrationmodel.model.Workload;
import com.mk.migrationmodel.workload.service.WorkLoadService;

/**
 * @author muffa
 *
 */
@RestController
public class WorkLoadController {
	private WorkLoadService workLoadService;

	/**
	 * @param workLoadService
	 */
	@Autowired
	public WorkLoadController(WorkLoadService workLoadService) {
		super();
		this.workLoadService = workLoadService;
	}

	@PostMapping(value="/workload",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Response addWorkLoad(@Valid @RequestBody Workload workload, BindingResult bindingResult){
		return workLoadService.addWorkLoad(workload, bindingResult);
	}

	@PutMapping(value="/workload/{ipAddress}",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Response updateWorkLoad(@Valid @RequestBody Workload workload, @PathVariable("ipAddress") String ipAddress,BindingResult bindingResult){
		return workLoadService.updateWorkLoad(workload,ipAddress, bindingResult);
	}

	@DeleteMapping(value="/workload/{ipAddress}",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Response deleteWorkLoad(@PathVariable("ipAddress") String ipAddress) {
		return workLoadService.deleteWorkLoad(ipAddress);
	}

	@GetMapping("/workload")
	public List<Workload> getWorkloads(){
		return workLoadService.getWorkloads();
	}
	
	@GetMapping("/workload/{ipAddress}")
	public Workload getWorkload(@PathVariable("ipAddress") String ipAddress){
		return workLoadService.getWorkload(ipAddress);
	}
}
