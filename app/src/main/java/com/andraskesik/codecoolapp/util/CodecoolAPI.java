package com.andraskesik.codecoolapp.util;

import com.andraskesik.codecoolapp.model.Questions;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by andra on 2016-07-25.
 */
public interface CodecoolAPI {

    final String BASE_URL = "https://codecool-application.appspot.com";

    @GET("/{testType}")
    Call<Questions> getSurvey(@Path("testType") String surveyType);



    class Factory {
        public static CodecoolAPI service;
        public static CodecoolAPI getInstance(){
            if(service == null) {
                Retrofit retrofit = new Retrofit.Builder().
                        addConverterFactory(GsonConverterFactory.create())
                        .baseUrl(BASE_URL)
                        .build();
                service = retrofit.create(CodecoolAPI.class);
                return service;
            } else {
                return service;
            }

        }
    }
}
