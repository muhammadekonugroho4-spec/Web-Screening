package com.google.firebase.encoders.config;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.EncoderConfig;

/* loaded from: classes6.dex */
public interface EncoderConfig<T extends EncoderConfig<T>> {
    <U> T registerEncoder(Class<U> r1, ObjectEncoder<? super U> r2);

    <U> T registerEncoder(Class<U> r1, ValueEncoder<? super U> r2);
}
