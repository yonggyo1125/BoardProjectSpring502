package org.choongang.file.services;

import org.choongang.file.entities.FileInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@SpringBootTest
@ActiveProfiles("test")
public class FileUploadServiceTest {

    @Autowired
    private FileUploadService uploadService;

    @Test
    void uploadTest() {
        MockMultipartFile file1 = new MockMultipartFile("file", "test1.png", "images/png", "ABC".getBytes());
        MockMultipartFile file2 = new MockMultipartFile("file", "test2.png", "images/png", "DEF".getBytes());

        List<FileInfo> items = uploadService.upload(new MultipartFile[] { file1, file2 }, "testgid", "testlocation");

        items.forEach(System.out::println);
    }
}
