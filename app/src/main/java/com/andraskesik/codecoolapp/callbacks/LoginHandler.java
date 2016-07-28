package com.andraskesik.codecoolapp.callbacks;

import android.content.Context;
import android.content.pm.LauncherApps;

import com.andraskesik.codecoolapp.model.Question;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginHandler<User> implements Callback<User> {
    Context mContext;

    public LoginHandler(Context context) {
        mContext = context;
    }

    @Override
    public void onResponse(Call<User> call, Response<User> response) {

    }

    @Override
    public void onFailure(Call<User> call, Throwable t) {

    }
}
