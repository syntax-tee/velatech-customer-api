package com.velatech.customerapi.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Country {

    @SerializedName("numeric")
    @Expose
    private String numeric;
    @SerializedName("alpha2")
    @Expose
    private String alpha2;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("emoji")
    @Expose
    private String emoji;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("latitude")
    @Expose
    private Integer latitude;
    @SerializedName("longitude")
    @Expose
    private Integer longitude;




}
