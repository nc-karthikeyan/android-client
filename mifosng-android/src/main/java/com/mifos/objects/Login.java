package com.mifos.objects;

import com.google.gson.annotations.SerializedName;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Login {

    @SerializedName("username")
    String username;
    @SerializedName("password")
    String password;
}
