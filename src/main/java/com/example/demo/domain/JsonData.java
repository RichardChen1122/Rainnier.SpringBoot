package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.Serializable;

public class JsonData implements Serializable {
    private static final long serialVersionUID = 1L;

    //状态码,0表示成功，-1表示失败
    private int code;

    //结果
    private Object data;

    //错误描述
    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public JsonData(int code, Object data) {
        super();
        this.code = code;
        this.data = data;
    }

    public JsonData(int code, String msg,Object data) {
        super();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    @Component
    //@ConfigurationProperties(prefix="test")
    @ConfigurationProperties
    @PropertySource(value="classpath:application.properties")
    public static class ServerSettings {
        @Value("${test.name}")
        private String name;
        @Value("${test.domain}")
        private String domain;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }
    }
}
