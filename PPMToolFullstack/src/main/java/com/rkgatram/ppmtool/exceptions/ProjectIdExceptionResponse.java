package com.rkgatram.ppmtool.exceptions;

/**
 * Created by ravikumar.g
 * Date 2021-07-22
 */
public class ProjectIdExceptionResponse {

    private String projectIdentifier;

    public ProjectIdExceptionResponse(String projectIdentifier){
        this.projectIdentifier = projectIdentifier;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }
}
