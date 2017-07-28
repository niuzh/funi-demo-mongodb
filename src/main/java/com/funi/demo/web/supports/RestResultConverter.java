package com.funi.demo.web.supports;

import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * @author zhihuan.niu on 7/26/17.
 */

public class RestResultConverter extends MappingJackson2HttpMessageConverter {
    @Override
    protected void writeInternal(Object object, Type type, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {

    }
}
