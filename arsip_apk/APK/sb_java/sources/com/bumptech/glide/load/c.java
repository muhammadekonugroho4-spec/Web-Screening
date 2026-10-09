package com.bumptech.glide.load;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f32567a = null;

    static {
        f32567a = Charset.forName("UTF-8");
    }

    void b(MessageDigest r1);

    boolean equals(Object r1);

    int hashCode();
}
