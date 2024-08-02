package org.choongang.file.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.multipart;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
public class FileControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private MockMultipartFile file1;
    private MockMultipartFile file2;

    @BeforeEach
    void init() {
        file1 = new MockMultipartFile("file", "test1.png", "images/png", "ABC".getBytes());
        file2 = new MockMultipartFile("file", "test2.png", "images/png", "DEF".getBytes());

    }

    @Test
    void uploadTest() throws Exception {
        mockMvc.perform(multipart("/file/upload")
                .file(file1)
                .file(file2)
                .param("gid", "testgid")
                .param("location", "testlocation")
                .with(csrf().asHeader())
        ).andDo(print()).andExpect(status().isCreated());
    }
}
