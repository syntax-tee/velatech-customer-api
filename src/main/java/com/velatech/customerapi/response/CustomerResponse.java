package com.velatech.customerapi.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CustomerResponse {

    @SerializedName("number")
    @Expose
    private Number number;
    @SerializedName("scheme")
    @Expose
    private String scheme;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("prepaid")
    @Expose
    private Boolean prepaid;
    @SerializedName("country")
    @Expose
    private Country country;
    @SerializedName("bank")
    @Expose
    private Bank bank;


    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Boolean getPrepaid() {
        return prepaid;
    }

    public void setPrepaid(Boolean prepaid) {
        this.prepaid = prepaid;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }


}
