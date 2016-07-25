
package com.andraskesik.codecoolapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Questions {

    @SerializedName("questions")
    @Expose
    private List<Question> questions = new ArrayList<Question>();

    /**
     *
     * @return
     *     The questions
     */
    public List<Question> getQuestions() {
        return questions;
    }

    /**
     *
     * @param questions
     *     The questions
     */
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

}
