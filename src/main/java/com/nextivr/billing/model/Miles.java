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

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Miles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Integer id;
    @Column
    Date date;
    @Column
    BigDecimal mileage;
    @Column(name = "end_odometer")
    BigDecimal endOdometer;
    @Column
    String description;

    public Miles() {
    }

    public Miles(Integer id, Date date, BigDecimal mileage, BigDecimal endOdometer, String description) {
        this.id = id;
        this.date = date;
        this.mileage = mileage;
        this.endOdometer = endOdometer;
        this.description = description;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getMileage() {
        return this.mileage;
    }

    public void setMileage(BigDecimal mileage) {
        this.mileage = mileage;
    }

    public BigDecimal getEndOdometer() {
        return this.endOdometer;
    }

    public void setEndOdometer(BigDecimal endOdometer) {
        this.endOdometer = endOdometer;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", date='" + getDate() + "'" + ", mileage='" + getMileage() + "'"
                + ", endOdometer='" + getEndOdometer() + "'" + ", description='" + getDescription() + "'" + "}";
    }

};