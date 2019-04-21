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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bill_code_ref")
public class BillCodeRef {
    @Id
    @Column
    String project;
    @Column(name="bill_code")
    String billCode;

    /**
     * @return the project
     */
    public String getProject() {
        return project;
    }

    /**
     * @param project the project to set
     */
    public void setProject(String project) {
        this.project = project;
    }

    /**
     * @return the bill_code
     */
    public String getBill_code() {
        return billCode;
    }

    /**
     * @param billCode the bill_code to set
     */
    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public BillCodeRef() {

    }

    public BillCodeRef(String project, String bill_code) {
        this.project = project;
        this.billCode = bill_code;
    }

    @Override
    public String toString() {
        return "{" + " project='" + getProject() + "'" + ", bill_code='" + getBill_code() + "'" + "}";
    }

};