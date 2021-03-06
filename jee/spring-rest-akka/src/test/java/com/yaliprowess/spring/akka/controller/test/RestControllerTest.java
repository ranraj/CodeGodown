package com.yaliprowess.spring.akka.controller.test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.yaliprowess.spring.akka.config.AppConfiguration;
import com.yaliprowess.spring.akka.config.AppInitializer;

 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfiguration.class)
@WebAppConfiguration
public class RestControllerTest {
	
	@Autowired WebApplicationContext wac;      
	
    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }
   
    @Test
    public void retrieve() throws Exception{    
    	mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();     	 
    	mockMvc.perform(get("/post")).andExpect(status().isOk()).andExpect(jsonPath("$.id").value(1));   	   		    		               
    }	
}