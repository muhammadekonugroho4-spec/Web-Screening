package com.bumptech.glide.load.resource;

import android.content.Context;
import com.bumptech.glide.load.engine.s;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class j implements com.bumptech.glide.load.i {

    /* renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.i f33186b = null;

    static {
        f33186b = new j();
    }

    public j() {
    }

    public static j c() {
        return (j) f33186b;
    }

    @Override // com.bumptech.glide.load.i
    public s a(Context r1, s r2, int r3, int r4) {
        return r2;
    }

    @Override // com.bumptech.glide.load.c
    public void b(MessageDigest r1) {
    }
}
