package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId(){
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    public String getProvinceName(){
        return this.provinceName;
    }
    public int  getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int  provinceCode){
        this.provinceCode = provinceCode;
    }


}
