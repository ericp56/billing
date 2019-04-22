package com.nextivr.billing;

import com.nextivr.billing.controller.BillingController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(value = BillingController.class, secure = false)
public class BillingTests {

	@Autowired
	private MockMvc mockMvc;

	//@Test
	public void testSayHelloWorld() throws Exception {
		this.mockMvc.perform(get("/api/hours").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
				.andExpect(status().isOk()).andExpect(content().contentType("application/json"));

	}
	@Test
    public void dummyTest() {
        
    }


}
