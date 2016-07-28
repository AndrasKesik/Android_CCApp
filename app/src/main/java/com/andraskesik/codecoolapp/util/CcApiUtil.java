package com.andraskesik.codecoolapp.util;

import com.andraskesik.codecoolapp.model.Questions;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by andra on 2016-07-25.
 */
public interface CcApiUtil {

    final String BASE_URL = "https://codecool-application.appspot.com";

    @GET("/{testType}")
    Call<Questions> getSurvey(@Path("testType") String surveyType);

    @GET("/{login}")
    Call<Questions> login(@Path("login") String surveyType);

    CodecoolApi factory = null;
}
