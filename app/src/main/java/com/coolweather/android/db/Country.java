package com.coolweather.android.db;

public class Country {
    private int ID;
    private String countryName;
    private int cityId;
    public String weatherId;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getID() {
        return ID;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getCityId() {
        return cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }
}
