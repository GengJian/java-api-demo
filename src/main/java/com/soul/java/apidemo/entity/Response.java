package com.soul.java.apidemo.entity;

public class Response {
    String msg;
    int code;
    Boolean isSuc = true;

    public Response(){}
    public Response(Boolean isSuccess,String msg ,int code){
        this.isSuc = isSuccess;
        this.code = code;
        this.msg = msg;
    }

    public Boolean getIsSuc() {
        return isSuc;
    }
    public void setIsSuc(Boolean isSuc) {
        this.isSuc = isSuc;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
