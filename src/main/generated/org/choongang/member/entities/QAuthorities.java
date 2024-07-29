package org.choongang.member.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuthorities is a Querydsl query type for Authorities
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAuthorities extends EntityPathBase<Authorities> {

    private static final long serialVersionUID = -2025522100L;

    public static final QAuthorities authorities = new QAuthorities("authorities");

    public QAuthorities(String variable) {
        super(Authorities.class, forVariable(variable));
    }

    public QAuthorities(Path<? extends Authorities> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuthorities(PathMetadata metadata) {
        super(Authorities.class, metadata);
    }

}

