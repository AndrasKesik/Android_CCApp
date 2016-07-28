package com.andraskesik.codecoolapp.util;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CodecoolApi {

    public static CcApiUtil service;
    public static CcApiUtil getInstance(){
        if(service == null) {
            Retrofit retrofit = new Retrofit.Builder().
                    addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(CcApiUtil.BASE_URL)
                    .build();
            service = retrofit.create(CcApiUtil.class);
            return service;
        } else {
            return service;
        }

    }
}
