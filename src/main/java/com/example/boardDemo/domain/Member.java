package com.example.boardDemo.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data //getter, setter
@Builder //DTO -> Entity화
@AllArgsConstructor //모든 컬럼 생성사 생성
@NoArgsConstructor //기본 생성자
@Table(name = "member")

public class Member {
    @Id //Pk설정
    @GeneratedValue(strategy = GenerationType.IDENTITY)//자동 id 생성
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column
    private String username;

    @Column(nullable = false)
    private String password;
}
