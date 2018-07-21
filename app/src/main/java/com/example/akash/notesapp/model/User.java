package com.example.akash.notesapp.model;

import com.example.akash.notesapp.network.BaseResponse;
import com.google.gson.annotations.SerializedName;

public class User extends BaseResponse {

    @SerializedName("api_key")
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }
}
