package org.choongang.file.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.choongang.global.entities.BaseMemberEntity;

@Data
@Entity
@Builder
@NoArgsConstructor @AllArgsConstructor
public class FileInfo extends BaseMemberEntity {
    @Id @GeneratedValue
    private Long seq; // 서버에 업로드될 파일 이름  - seq.확장자

    private String gid; // 그룹 ID
    private String location; // 그룹 안에 세부 위치

    private String fileName;
    private String contentType;

    private boolean done; // 그룹 작업 완료 여부
}