package com.Solera_1_forunittesting;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.Solera_1_forunittesting.Service.UserService;
import com.Solera_1_forunittesting.controller.TestController;

@SpringBootTest
@AutoConfigureMockMvc
class Solera1ForunittestingApplicationTests {
	
    @Autowired 
    private MockMvc mockMvc;

    @MockBean
    private UserService us;  // Mocking the service layer

    @Test
    void testEvenOrNot_validInput() throws Exception {
        // Mocking the service method
        Mockito.when(us.isEvenOrNot(2)).thenReturn(true);
        
        // Performing the request directly using mockMvc
        mockMvc.perform(get("/even/2"))
           //    .andExpect(status().isOk())
               .andExpect(content().string("true"));
    }
}
