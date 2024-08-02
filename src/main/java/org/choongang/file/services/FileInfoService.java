package org.choongang.file.services;

import lombok.RequiredArgsConstructor;
import org.choongang.file.constants.FileStatus;
import org.choongang.file.entities.FileInfo;
import org.choongang.file.repositories.FileInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FileInfoService {

    private final FileInfoRepository infoRepository;

    /**
     * 파일 1개 조회
     *
     * @param seq : 파일 등록번호
     * @return
     */
    public FileInfo get(Long seq) {

        return null;
    }

    /**
     * 파일 목록 조회
     *
     * @param gid
     * @param location
     * @param status - ALL: 완료 + 미완료, DONE - 완료, UNDONE - 미완료
     * @return
     */
    public List<FileInfo> getList(String gid, String location, FileStatus status) {

        return null;
    }
}
