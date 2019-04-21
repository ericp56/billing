package com.nextivr.billing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.nextivr.billing.model.Hours;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class BillingTest extends AbstractTest {
    @Override
    @Before
    public void setup() {
        super.setup();
    }

    @Test
    public void getAllHoursTest() throws Exception{
              String uri = "/api/hours";
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
      
      int status = mvcResult.getResponse().getStatus();
      assertEquals(200, status);
      String content = mvcResult.getResponse().getContentAsString();
      Hours[] hours = super.mapFromJson(content, Hours[].class);
      assertTrue(hours.length > 0);
    }
}