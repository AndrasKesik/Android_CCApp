package com.andraskesik.codecoolapp.callbacks;

import android.content.Context;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Handler implements Callback{

    Context mContext;

    public Handler(Context context) {
        mContext = context;
    }

    @Override
    public void onResponse(Call call, Response response) {

    }

    @Override
    public void onFailure(Call call, Throwable t) {

    }
}
