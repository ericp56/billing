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
@Table
public class Projects {
    @Id
    @Column
    String id;
    @Column
    String description;
    @Column(name = "bill_to")
    String billTo;
    @Column(name = "bill_code")
    String billCode;
    @Column
    Integer rate;
    @Column(name = "max_hours")
    Integer maxHours;

    public Projects() {
    }

    public Projects(String id, String description, String billTo, String billCode, Integer rate, Integer maxHours) {
        this.id = id;
        this.description = description;
        this.billTo = billTo;
        this.billCode = billCode;
        this.rate = rate;
        this.maxHours = maxHours;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillTo() {
        return this.billTo;
    }

    public void setBillTo(String billTo) {
        this.billTo = billTo;
    }

    public String getBillCode() {
        return this.billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public Integer getRate() {
        return this.rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getMaxHours() {
        return this.maxHours;
    }

    public void setMaxHours(Integer maxHours) {
        this.maxHours = maxHours;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", description='" + getDescription() + "'" + ", billTo='" + getBillTo()
                + "'" + ", billCode='" + getBillCode() + "'" + ", rate='" + getRate() + "'" + ", maxHours='"
                + getMaxHours() + "'" + "}";
    }

};