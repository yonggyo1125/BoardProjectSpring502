package org.choongang.file.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FileUploadService {

    public void upload(MultipartFile[] files, String gid, String location) {
        /**
         * 1. 파일 정보 저장
         * 2. 파일을 서버로 이동
         * 3. 이미지이면 썸네일 생성
         * 4. 업로드한 파일목록 반환
         */

        gid = StringUtils.hasText(gid) ? gid : UUID.randomUUID().toString();

        // 1. 파일 정보 저장
        for (MultipartFile file : files) {
            String fileName = file.getOriginalFilename(); // 업로드 파일 원래 이름
            String contentType = file.getContentType(); // 파일 형식
        }
    }
}
