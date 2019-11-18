package com.river.meadow.migrationmodel.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;
import org.springframework.validation.ObjectError;

import com.river.meadow.migrationmodel.constants.CommonConstants;
import com.river.meadow.migrationmodel.model.Message;
import com.river.meadow.migrationmodel.model.Messages;

@Component
public class CommonUtil implements MessageSourceAware {

	private static final Logger LOGGER = LoggerFactory.getLogger(CommonUtil.class);

	@Autowired
	MessageSource messageSource;

	public static Locale getLocale() {
		return Locale.getDefault();
	}

	public List<Message> processErrors(List<ObjectError> objectErrors, List<Message> messages) throws Exception {
		Message message;
		for (ObjectError fieldError : objectErrors) {
			message = new Message(fieldError.getDefaultMessage(), CommonConstants.ERROR,
					fieldError.getDefaultMessage());
			messages.add(message);
		}
		return messages;
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public static boolean checkErrorMessages(Messages messages) {
		if (messages.getMessages().size() > 0) {
			return true;
		}
		return false;
	}

	public List<Message> getDefaultErrorMessage() {
		List<Message> messages = new ArrayList<Message>();
		messages.add(new Message(CommonConstants.SYSTEM_ERROR,CommonConstants.ERROR, messageSource.getMessage(CommonConstants.SYSTEM_ERROR, null, getLocale())));
		return messages;
	}

	public Messages getDefaultErrorMessages() {
		Messages messages = new Messages();
		messages.setMessages(getDefaultErrorMessage());
		return messages;
	}
	
	public List<Message> getErrorMessage(String messageCode) {
		List<Message> messages = new ArrayList<Message>();
		messages.add(new Message(messageCode,CommonConstants.ERROR, messageSource.getMessage(messageCode, null, getLocale())));
		return messages;
	}

	public Messages getErrorMessages(String messageCode) {
		Messages messages = new Messages();
		messages.setMessages(getErrorMessage(messageCode));
		return messages;
	}
}
