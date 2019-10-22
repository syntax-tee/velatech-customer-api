package com.velatech.customerapi.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Number {

    @SerializedName("length")
    @Expose
    private Integer length;
    @SerializedName("luhn")
    @Expose
    private Boolean luhn;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Boolean getLuhn() {
        return luhn;
    }

    public void setLuhn(Boolean luhn) {
        this.luhn = luhn;
    }

}