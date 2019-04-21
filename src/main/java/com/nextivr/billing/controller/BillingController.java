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

package com.nextivr.billing.controller;

import java.net.URI;
import java.util.List;

import com.nextivr.billing.model.Hours;
import com.nextivr.billing.service.HoursServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class BillingController {

    @Autowired
    private HoursServices hoursServices;

    @GetMapping("/hours")
    public List<Hours> getAllHours() {
        return this.hoursServices.getAllHours();
    }

    @GetMapping("/hours/{id}")
    public Hours retrieveHours(@PathVariable Integer id) {
        Hours h = this.hoursServices.getHours(id);
        return h;
    }
    @PutMapping("/hours/{id}")
    public Hours updateHours(@PathVariable Integer id, @RequestBody Hours entity) {
        Hours h = this.hoursServices.getHours(id);
        h.setDescription(entity.getDescription());
        h.setEnds(entity.getEnds());
        h.setEstimatedPayDate(entity.getEstimatedPayDate());
        h.setHours(entity.getHours());
        h.setPaymentId(entity.getPaymentId());
        h.setProject(entity.getProject());
        h.setStarts(entity.getStarts());
        this.hoursServices.insert(h);
        return h;
    }

    @PostMapping("/hours")
    public ResponseEntity<Void> create(@RequestBody Hours entity) {
        this.hoursServices.insert(entity);
        if (entity == null) {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(entity.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
