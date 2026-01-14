package com.Team1_Back.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFaceAuth is a Querydsl query type for FaceAuth
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFaceAuth extends EntityPathBase<FaceAuth> {

    private static final long serialVersionUID = 2103521120L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFaceAuth faceAuth = new QFaceAuth("faceAuth");

    public final StringPath faceDescriptor = createString("faceDescriptor");

    public final NumberPath<Long> fno = createNumber("fno", Long.class);

    public final QUser user;

    public QFaceAuth(String variable) {
        this(FaceAuth.class, forVariable(variable), INITS);
    }

    public QFaceAuth(Path<? extends FaceAuth> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFaceAuth(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFaceAuth(PathMetadata metadata, PathInits inits) {
        this(FaceAuth.class, metadata, inits);
    }

    public QFaceAuth(Class<? extends FaceAuth> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

