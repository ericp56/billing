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
public class Hours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Integer id;
    @Column
    String project;
    @Column
    Date starts;
    @Column
    Date ends;
    @Column
    BigDecimal hours;
    @Column
    String description;
    @Column(name="est_paydate")
    Date estimatedPayDate;
    @Column(name = "payment_id")
    Integer paymentId;

    public Hours() {
    }

    public Hours(Integer id, String project, Date starts, Date ends, BigDecimal hours, String description, Date estimatedPayDate, Integer paymentId) {
        this.id = id;
        this.project = project;
        this.starts = starts;
        this.ends = ends;
        this.hours = hours;
        this.description = description;
        this.estimatedPayDate = estimatedPayDate;
        this.paymentId = paymentId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProject() {
        return this.project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Date getStarts() {
        return this.starts;
    }

    public void setStarts(Date starts) {
        this.starts = starts;
    }

    public Date getEnds() {
        return this.ends;
    }

    public void setEnds(Date ends) {
        this.ends = ends;
    }

    public BigDecimal getHours() {
        return this.hours;
    }

    public void setHours(BigDecimal hours) {
        this.hours = hours;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEstimatedPayDate() {
        return this.estimatedPayDate;
    }

    public void setEstimatedPayDate(Date estimatedPayDate) {
        this.estimatedPayDate = estimatedPayDate;
    }

    public Integer getPaymentId() {
        return this.paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", project='" + getProject() + "'" +
            ", starts='" + getStarts() + "'" +
            ", ends='" + getEnds() + "'" +
            ", hours='" + getHours() + "'" +
            ", description='" + getDescription() + "'" +
            ", estimatedPayDate='" + getEstimatedPayDate() + "'" +
            ", paymentId='" + getPaymentId() + "'" +
            "}";
    }

};