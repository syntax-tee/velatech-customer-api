package com.velatech.customerapi.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
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




}
