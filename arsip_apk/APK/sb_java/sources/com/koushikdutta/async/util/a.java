package com.koushikdutta.async.util;

import com.koushikdutta.async.o;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f41644a;

    /* renamed from: b, reason: collision with root package name */
    public int f41645b;

    /* renamed from: c, reason: collision with root package name */
    public int f41646c;

    public a() {
        this.f41645b = 0;
        this.f41646c = 4096;
        this.f41644a = o.f41594f;
    }

    public ByteBuffer a() {
        return b(this.f41645b);
    }

    public ByteBuffer b(int r2) {
        return o.s(Math.min(Math.max(r2, this.f41646c), this.f41644a));
    }

    public int c() {
        return this.f41646c;
    }

    public void d(int r1) {
        this.f41645b = r1;
    }

    public a e(int r2) {
        this.f41646c = Math.max(0, r2);
        return this;
    }

    public void f(long r1) {
        this.f41645b = ((int) r1) * 2;
    }
}
