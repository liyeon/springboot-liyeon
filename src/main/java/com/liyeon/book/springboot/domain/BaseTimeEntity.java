package com.liyeon.book.springboot.domain;


import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass //JPA Entity 클래스들이 BaseTimeEntity를 상속할 경우 필드들 createdDate, modifiedDate도 칼럼으로 인식하도록 함
@EntityListeners(AuditingEntityListener.class) //BaseTimeEntity 클래스에 Auditing 기능을 포함시킵니다.
public abstract class BaseTimeEntity {

    @CreatedDate //Entity 가 생성되어 저장 될 때 시간이 자동 저장됨.
    private LocalDateTime createdDate;

    @LastModifiedDate //조회한 Entity 값을 변경 할 때 시간이 자동 저장됨
    private LocalDateTime modifiedDate;
}