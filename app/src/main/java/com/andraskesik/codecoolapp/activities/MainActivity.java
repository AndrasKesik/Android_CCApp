package com.andraskesik.codecoolapp.activities;

import android.os.Bundle;
import android.widget.TextView;

import com.andraskesik.codecoolapp.R;
import com.andraskesik.codecoolapp.callbacks.LoginHandler;
import com.andraskesik.codecoolapp.callbacks.SurveyHandler;
import com.andraskesik.codecoolapp.model.Question;
import com.andraskesik.codecoolapp.model.Questions;
import com.andraskesik.codecoolapp.util.CodecoolApi;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.textview);

        CodecoolApi.getInstance().getSurvey("acceptance").enqueue(new SurveyHandler(this));

        CodecoolApi.getInstance().login("asdsad").enqueue(new LoginHandler(this));

    }


}
