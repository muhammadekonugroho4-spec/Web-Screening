package com.google.firebase.encoders;

import java.io.IOException;

/* loaded from: classes6.dex */
public interface ValueEncoderContext {
    ValueEncoderContext add(double r1) throws IOException;

    ValueEncoderContext add(float r1) throws IOException;

    ValueEncoderContext add(int r1) throws IOException;

    ValueEncoderContext add(long r1) throws IOException;

    ValueEncoderContext add(String r1) throws IOException;

    ValueEncoderContext add(boolean r1) throws IOException;

    ValueEncoderContext add(byte[] r1) throws IOException;
}
