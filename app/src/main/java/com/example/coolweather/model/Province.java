package com.example.coolweather.model;

/**
 * Created by 家辉 on 2016/11/10.
 * 每张表对应的实体类，便于后面开发
 */

public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }
    public String getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(String provinceCode){
        this.provinceCode=provinceCode;
    }
}
