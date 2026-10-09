package com.google.firebase.encoders;

import java.io.IOException;

/* loaded from: classes6.dex */
public interface ObjectEncoderContext {
    ObjectEncoderContext add(FieldDescriptor r1, double r2) throws IOException;

    ObjectEncoderContext add(FieldDescriptor r1, float r2) throws IOException;

    ObjectEncoderContext add(FieldDescriptor r1, int r2) throws IOException;

    ObjectEncoderContext add(FieldDescriptor r1, long r2) throws IOException;

    ObjectEncoderContext add(FieldDescriptor r1, Object r2) throws IOException;

    ObjectEncoderContext add(FieldDescriptor r1, boolean r2) throws IOException;

    @Deprecated
    ObjectEncoderContext add(String r1, double r2) throws IOException;

    @Deprecated
    ObjectEncoderContext add(String r1, int r2) throws IOException;

    @Deprecated
    ObjectEncoderContext add(String r1, long r2) throws IOException;

    @Deprecated
    ObjectEncoderContext add(String r1, Object r2) throws IOException;

    @Deprecated
    ObjectEncoderContext add(String r1, boolean r2) throws IOException;

    ObjectEncoderContext inline(Object r1) throws IOException;

    ObjectEncoderContext nested(FieldDescriptor r1) throws IOException;

    ObjectEncoderContext nested(String r1) throws IOException;
}
