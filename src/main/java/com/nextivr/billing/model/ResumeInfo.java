/*
 * Created on Mon Apr 08 2019
 *
 * The MIT License (MIT)
 * Copyright (c) 2019 Eric Phetteplace
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.nextivr.billing.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ResumeInfo {
    @Id
    @Column
    String project;
    @Column
    String title;
    @Column
    Date started;
    @Column
    Date ended;
    @Column
    String description;
    @Column
    String skills;

    public ResumeInfo() {
    }

    public ResumeInfo(String project, String title, Date started, Date ended, String description, String skills) {
        this.project = project;
        this.title = title;
        this.started = started;
        this.ended = ended;
        this.description = description;
        this.skills = skills;
    }

    public String getProject() {
        return this.project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStarted() {
        return this.started;
    }

    public void setStarted(Date started) {
        this.started = started;
    }

    public Date getEnded() {
        return this.ended;
    }

    public void setEnded(Date ended) {
        this.ended = ended;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSkills() {
        return this.skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "{" + " project='" + getProject() + "'" + ", title='" + getTitle() + "'" + ", started='" + getStarted()
                + "'" + ", ended='" + getEnded() + "'" + ", description='" + getDescription() + "'" + ", skills='"
                + getSkills() + "'" + "}";
    }

};
