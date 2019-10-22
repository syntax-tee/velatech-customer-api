package com.velatech.customerapi.response.customer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Payload   implements Serializable {

    @SerializedName("scheme")
    @Expose
    private String scheme;
    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("bank_name")
    @Expose
    private String bank;


    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
}
