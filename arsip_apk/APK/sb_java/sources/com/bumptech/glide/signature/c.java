package com.bumptech.glide.signature;

import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class c implements com.bumptech.glide.load.c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f33372b = null;

    static {
        f33372b = new c();
    }

    public c() {
    }

    public static c c() {
        return f33372b;
    }

    @Override // com.bumptech.glide.load.c
    public void b(MessageDigest r1) {
    }

    public String toString() {
        return "EmptySignature";
    }
}
