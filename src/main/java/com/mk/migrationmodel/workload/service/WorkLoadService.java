/**
 * 
 */
package com.mk.migrationmodel.workload.service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.mk.migrationmodel.constants.CommonConstants;
import com.mk.migrationmodel.dao.entity.Credentials;
import com.mk.migrationmodel.dao.entity.Source;
import com.mk.migrationmodel.dao.entity.Volume;
import com.mk.migrationmodel.dao.repository.SourceRepository;
import com.mk.migrationmodel.model.Messages;
import com.mk.migrationmodel.model.Response;
import com.mk.migrationmodel.model.Workload;
import com.mk.migrationmodel.util.CommonUtil;


/**
 * @author muffa
 *
 */
@Service
public class WorkLoadService {
	private static final Logger LOGGER = LoggerFactory.getLogger(WorkLoadService.class);
	private SourceRepository sourceRespository;
	private CommonUtil commonUtil;

	/**
	 * @param sourceRespository
	 * @param commonUtil
	 */
	@Autowired
	public WorkLoadService(SourceRepository sourceRespository, CommonUtil commonUtil) {
		super();
		this.sourceRespository = sourceRespository;
		this.commonUtil = commonUtil;
	}

	public Response addWorkLoad(Workload workload, BindingResult bindingResult){
		try{
			if (bindingResult.hasErrors()) {
				Messages messages = new Messages();
				commonUtil.processErrors(bindingResult.getAllErrors(), messages.getMessages());
				workload.setMessages(messages);
				workload.setSuccess(false);
			}else{
				Source source = new Source();
				source.setIpAddress(workload.getIpAddress());
				Credentials credentials = new Credentials();
				credentials.setDomain(workload.getCredentials().getDomain());
				credentials.setUserName(workload.getCredentials().getUserName());
				credentials.setPassword(String.valueOf(workload.getCredentials().getPassword()));
				source.setCredentials(credentials);
				if(workload.getStorage()!=null){
					source.setVolumes(new HashSet<>());
					workload.getStorage().forEach(s->{Volume volume = new Volume();volume.setMountPoint(s.getMountPoint());volume.setVolumeSize(s.getVolumeSize());source.getVolumes().add(volume);});
				}
				sourceRespository.save(source);
				workload.setSuccess(true);
			}
			return workload;
		}catch(Exception ex){
			LOGGER.error(ex.getMessage(),ex);
			workload.setSuccess(false);
			workload.setMessages(commonUtil.getDefaultErrorMessages());
		}
		return workload;
	}

	public Response deleteWorkLoad(String ipAddress) {
		Response response = new Response();
		try {
			Boolean result = sourceRespository.existsById(InetAddress.getByName(ipAddress));
			response.setSuccess(result);
			sourceRespository.deleteById(InetAddress.getByName(ipAddress));
		} catch (UnknownHostException ex) {
			LOGGER.error(ex.getMessage(),ex);
			response.setSuccess(false);
			response.setMessages(commonUtil.getErrorMessages(CommonConstants.INVALID_ID));
		}catch (Exception ex){
			LOGGER.error(ex.getMessage(),ex);
			response.setSuccess(false);
			response.setMessages(commonUtil.getDefaultErrorMessages());
		}
		return response;
	}

	public Response updateWorkLoad(Workload workload, String ipAddress, BindingResult bindingResult) {
		try {
			if (bindingResult.hasErrors()) {
				Messages messages = new Messages();
				commonUtil.processErrors(bindingResult.getAllErrors(), messages.getMessages());
				workload.setMessages(messages);
				return workload;
			}else{
				Optional<Source> optionalWorkload = sourceRespository.findById(InetAddress.getByName(ipAddress));
				if(optionalWorkload.isPresent()){
					Source sourceToUpdate = optionalWorkload.get();
					if(workload.getStorage()!=null){
						sourceToUpdate.setVolumes(new HashSet<>());
						workload.getStorage().forEach(s->{Volume volume = new Volume();volume.setMountPoint(s.getMountPoint());volume.setVolumeSize(s.getVolumeSize());sourceToUpdate.getVolumes().add(volume);});
					}else{
						sourceToUpdate.setVolumes(null);
					}
					Credentials credentials = sourceToUpdate.getCredentials();
					if(credentials==null){
						credentials = new Credentials();
						sourceToUpdate.setCredentials(credentials);
						credentials.setDomain(workload.getCredentials().getDomain());
						credentials.setUserName(workload.getCredentials().getUserName());
						credentials.setPassword(String.valueOf(workload.getCredentials().getPassword()));
					}
					sourceRespository.save(sourceToUpdate);
					workload.setSuccess(true);
				}else{
					workload.setSuccess(false);
					workload.setMessages(commonUtil.getErrorMessages(CommonConstants.RECORD_NOT_FOUND));
				}
			}
		} catch (UnknownHostException ex) {
			LOGGER.error(ex.getMessage(),ex);
			workload.setSuccess(false);
			workload.setMessages(commonUtil.getErrorMessages(CommonConstants.INVALID_ID));
		}catch (Exception ex){
			LOGGER.error(ex.getMessage(),ex);
			workload.setSuccess(false);
			workload.setMessages(commonUtil.getDefaultErrorMessages());
		}
		return workload;
	}

	public List<Workload> getWorkloads() {
		List<Workload> workloads = new ArrayList<Workload>();
		try{
			Iterable<Source> result = sourceRespository.findAll();
			for(Source source:result){
				Workload workload = new Workload();
				workload.setIpAddress(source.getIpAddress());
				workload.setCredentials(new com.mk.migrationmodel.model.Credentials());
				workload.getCredentials().setDomain(source.getCredentials().getDomain());
				workload.getCredentials().setUserName(source.getCredentials().getUserName());
				workload.getCredentials().setPassword(source.getCredentials().getPassword());
				if(source.getVolumes()!=null){
					workload.setStorage(new ArrayList<>());
					source.getVolumes().forEach(s->{com.mk.migrationmodel.model.Volume volume = new com.mk.migrationmodel.model.Volume();volume.setMountPoint(s.getMountPoint());volume.setVolumeSize(s.getVolumeSize());workload.getStorage().add(volume);});	
				}
				workloads.add(workload);
			}
		}
		catch (Exception ex){
			LOGGER.error(ex.getMessage(),ex);
			Workload workload = new Workload();
			workload.setSuccess(false);
			workload.setMessages(commonUtil.getDefaultErrorMessages());
			workloads.add(workload);
		}
		return workloads;
	}

	public Workload getWorkload(String ipAddress) {
		Workload workload = new Workload();
		try{
			Optional<Source> optionalWorkload = sourceRespository.findById(InetAddress.getByName(ipAddress));
			if(optionalWorkload.isPresent()){
				Source source=optionalWorkload.get();
				workload.setIpAddress(source.getIpAddress());
				workload.setCredentials(new com.mk.migrationmodel.model.Credentials());
				workload.getCredentials().setDomain(source.getCredentials().getDomain());
				workload.getCredentials().setUserName(source.getCredentials().getUserName());
				workload.getCredentials().setPassword(source.getCredentials().getPassword());
				if(source.getVolumes()!=null){
					workload.setStorage(new ArrayList<>());
					source.getVolumes().forEach(s->{com.mk.migrationmodel.model.Volume volume = new com.mk.migrationmodel.model.Volume();volume.setMountPoint(s.getMountPoint());volume.setVolumeSize(s.getVolumeSize());workload.getStorage().add(volume);});	
				}
			}
		} catch (UnknownHostException ex) {
			LOGGER.error(ex.getMessage(),ex);
			workload.setSuccess(false);
			workload.setMessages(commonUtil.getErrorMessages(CommonConstants.INVALID_ID));
		}catch (Exception ex){
			LOGGER.error(ex.getMessage(),ex);
			workload.setSuccess(false);
			workload.setMessages(commonUtil.getDefaultErrorMessages());
		}
		return workload;
	}
}
