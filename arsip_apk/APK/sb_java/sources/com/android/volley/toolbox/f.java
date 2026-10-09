package com.android.volley.toolbox;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f32059a;

    /* renamed from: b, reason: collision with root package name */
    public final List f32060b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32061c;
    public final InputStream d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f32062e;

    public f(int r3, List r4) {
        this(r3, r4, -1, null);
    }

    public final InputStream a() {
        InputStream r02 = this.d;
        if (r02 == null) goto L6;
        return r02;
    L6:
        if (this.f32062e != null) goto L8;
        return null;
    L8:
        return new ByteArrayInputStream(this.f32062e);
    }

    public final int b() {
        return this.f32061c;
    }

    public final List c() {
        return Collections.unmodifiableList(this.f32060b);
    }

    public final int d() {
        return this.f32059a;
    }

    public f(int r1, List r2, int r3, InputStream r4) {
        this.f32059a = r1;
        this.f32060b = r2;
        this.f32061c = r3;
        this.d = r4;
        this.f32062e = null;
    }
}
