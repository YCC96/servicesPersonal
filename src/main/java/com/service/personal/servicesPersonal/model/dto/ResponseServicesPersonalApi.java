package com.service.personal.servicesPersonal.model.dto;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

@SuppressWarnings("serial")
public class ResponseServicesPersonalApi {
    
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ResponseServicesPersonalApi.class);

    private String code;
    private String message;
    private Object response;

    @Autowired
    private MessageSource messageSource;

    public ResponseServicesPersonalApi(String code) {

        String msg = "Ha ocurrido un error inesperado.";
        try {
            msg = messageSource.getMessage("response.error." + code, null,
                    LocaleContextHolder.getLocale());
        } catch (NullPointerException e) {
            LOGGER.error("Error al consultar mensaje de error: {} - {} " , code, e);
        }
        this.code = code;
        this.message = msg;
        this.response = null;
    }

    public ResponseServicesPersonalApi(String code, String message, Object response) {
        this.code = code;
        this.message = message;
        this.response = response;
    }

    public ResponseServicesPersonalApi() {}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }
}
