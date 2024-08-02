package org.choongang.file.controllers;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@RestController
@RequestMapping("/file")
public class FileController {

    @PostMapping("/upload")
    public void upload(@RequestPart("file") MultipartFile[] files,
                       @RequestParam(name="gid", required = false) String gid,
                       @RequestParam(name="location", required = false) String location) {




    }


}
