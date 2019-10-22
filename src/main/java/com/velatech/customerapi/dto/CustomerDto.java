package com.velatech.customerapi.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.velatech.customerapi.response.customer.Payload;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto  {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @SerializedName("success")
    @Expose
    private boolean success;

    @SerializedName("payload")
    @Expose
    Payload payload;

}
