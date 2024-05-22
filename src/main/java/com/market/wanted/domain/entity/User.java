package com.market.wanted.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseEntity {

    @Id
    @Column(columnDefinition = "unsigned")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Comment("이름")
    @Column(nullable = false)
    private String name;

    @Comment("이메일 주소")
    @Column(nullable = false)
    private String email;

    @Comment("연락처")
    @Column(nullable = false)
    private String contact;

}
