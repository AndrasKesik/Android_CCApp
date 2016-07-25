package com.andraskesik.codecoolapp.activities;

import android.os.Bundle;
import android.widget.TextView;

import com.andraskesik.codecoolapp.R;
import com.andraskesik.codecoolapp.model.Question;
import com.andraskesik.codecoolapp.model.Questions;
import com.andraskesik.codecoolapp.util.CodecoolAPI;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity  {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.textview);

        CodecoolAPI.Factory.getInstance()                    // Lekeri a APIkezelot
                .getSurvey("acceptance")                    // Az interfaceben defeinialt fuggveny ami a parameterben kapott cimre kuld GET-et
                .enqueue(new Callback<Questions>() {        // kirakja hatso szalra a lekerest, responce kezeles ezalatt
            @Override
            public void onResponse(Call<Questions> call, Response<Questions> response) {
                ArrayList<Question> questionList = (ArrayList<Question>) response.body().getQuestions();
                for (Question q: questionList) {
                    mTextView.append(q.toString());
                }
            }

            @Override
            public void onFailure(Call<Questions> call, Throwable t) {

            }
        });



    }



}
