package org.choongang.member.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.choongang.global.entities.BaseEntity;

@Data
@Entity
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Member extends BaseEntity {
    private Long seq;
    private String email;
    private String password;
    private String userName;
    private String mobile;
}
