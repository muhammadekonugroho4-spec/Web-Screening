package com.appmattus.certificatetransparency.internal.utils;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class d extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f32250a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32251b;

    /* renamed from: c, reason: collision with root package name */
    public long f32252c;

    public d(InputStream r2, long r3) {
        p.l(r2, "original");
        this.f32250a = r2;
        this.f32251b = r3;
    }

    public final void c(int r5) {
        long r02 = this.f32252c + r5;
        this.f32252c = r02;
        if (r02 > this.f32251b) goto L6;
        return;
    L6:
        throw new IOException("InputStream exceeded maximum size " + this.f32251b + " bytes");
    }

    @Override // java.io.InputStream
    public int read() {
        int r02 = this.f32250a.read();
        if (r02 < 0) goto L5;
        c(1);
    L5:
        return r02;
    }

    @Override // java.io.InputStream
    public int read(byte[] r3) {
        p.l(r3, "b");
        return read(r3, 0, r3.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] r2, int r3, int r4) {
        p.l(r2, "b");
        int r22 = this.f32250a.read(r2, r3, r4);
        if (r22 < 0) goto L5;
        c(r22);
    L5:
        return r22;
    }
}
