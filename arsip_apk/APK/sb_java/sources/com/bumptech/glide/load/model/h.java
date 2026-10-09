package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes4.dex */
public class h implements com.bumptech.glide.load.c {

    /* renamed from: b, reason: collision with root package name */
    public final i f32930b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f32931c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public String f32932e;

    /* renamed from: f, reason: collision with root package name */
    public URL f32933f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f32934g;

    /* renamed from: h, reason: collision with root package name */
    public int f32935h;

    public h(URL r2) {
        this(r2, i.f32937b);
    }

    @Override // com.bumptech.glide.load.c
    public void b(MessageDigest r2) {
        r2.update(d());
    }

    public String c() {
        String r02 = this.d;
        if (r02 == null) goto L6;
        return r02;
    L6:
        return ((URL) com.bumptech.glide.util.k.d(this.f32931c)).toString();
    }

    public final byte[] d() {
        if (this.f32934g != null) goto L6;
        this.f32934g = c().getBytes(com.bumptech.glide.load.c.f32567a);
    L6:
        return this.f32934g;
    }

    public Map e() {
        return this.f32930b.a();
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object r4) {
        if ((r4 instanceof h) == false) goto L10;
        h r42 = (h) r4;
        if (c().equals(r42.c()) == false) goto L10;
        if (this.f32930b.equals(r42.f32930b) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final String f() {
        if (TextUtils.isEmpty(this.f32932e) == false) goto L9;
        String r02 = this.d;
        if (TextUtils.isEmpty(r02) == false) goto L7;
        r02 = ((URL) com.bumptech.glide.util.k.d(this.f32931c)).toString();
    L7:
        this.f32932e = Uri.encode(r02, "@#&=*+-_.,:!?()/~'%;$");
    L9:
        return this.f32932e;
    }

    public final URL g() {
        if (this.f32933f != null) goto L6;
        this.f32933f = new URL(f());
    L6:
        return this.f32933f;
    }

    public String h() {
        return f();
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        if (this.f32935h != 0) goto L6;
        int r02 = c().hashCode();
        this.f32935h = r02;
        this.f32935h = (r02 * 31) + this.f32930b.hashCode();
    L6:
        return this.f32935h;
    }

    public URL i() {
        return g();
    }

    public String toString() {
        return c();
    }

    public h(String r2) {
        this(r2, i.f32937b);
    }

    public h(URL r1, i r2) {
        this.f32931c = (URL) com.bumptech.glide.util.k.d(r1);
        this.d = null;
        this.f32930b = (i) com.bumptech.glide.util.k.d(r2);
    }

    public h(String r2, i r3) {
        this.f32931c = null;
        this.d = com.bumptech.glide.util.k.b(r2);
        this.f32930b = (i) com.bumptech.glide.util.k.d(r3);
    }
}
