
package com.andraskesik.codecoolapp.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Survey {

    @SerializedName("testtype")
    @Expose
    private String testtype;
    @SerializedName("testStatus")
    @Expose
    private String testStatus;
    @SerializedName("completionPercentage")
    @Expose
    private String completionPercentage;

    /**
     *
     * @return
     *     The testtype
     */
    public String getTesttype() {
        return testtype;
    }

    /**
     *
     * @param testtype
     *     The testtype
     */
    public void setTesttype(String testtype) {
        this.testtype = testtype;
    }

    /**
     *
     * @return
     *     The testStatus
     */
    public String getTestStatus() {
        return testStatus;
    }

    /**
     *
     * @param testStatus
     *     The testStatus
     */
    public void setTestStatus(String testStatus) {
        this.testStatus = testStatus;
    }

    /**
     *
     * @return
     *     The completionPercentage
     */
    public String getCompletionPercentage() {
        return completionPercentage;
    }

    /**
     *
     * @param completionPercentage
     *     The completionPercentage
     */
    public void setCompletionPercentage(String completionPercentage) {
        this.completionPercentage = completionPercentage;
    }

}
