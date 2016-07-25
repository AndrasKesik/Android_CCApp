
package com.andraskesik.codecoolapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Question {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("mandatory")
    @Expose
    private String mandatory;
    @SerializedName("option")
    @Expose
    private List<Option> option = new ArrayList<Option>();

    /**
     *
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     *     The mandatory
     */
    public String getMandatory() {
        return mandatory;
    }

    /**
     *
     * @param mandatory
     *     The mandatory
     */
    public void setMandatory(String mandatory) {
        this.mandatory = mandatory;
    }

    /**
     *
     * @return
     *     The option
     */
    public List<Option> getOption() {
        return option;
    }

    /**
     *
     * @param option
     *     The option
     */
    public void setOption(List<Option> option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", mandatory='" + mandatory + '\'' +
                '}';
    }
}
