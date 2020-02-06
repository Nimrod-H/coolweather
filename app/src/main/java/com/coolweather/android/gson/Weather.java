package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    /**
     * 实例化所有gosn实体类
     */

    public String status;
 //   @SerializedName("basic")
    public Basic basic;
  //  @SerializedName("aqi")
    public AQI aqi;
  //  @SerializedName("now")
    public Now now;
  //  @SerializedName("suggestion")
    public Suggestion suggestion;
   //  @SerializedName("update")
     public update update;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
