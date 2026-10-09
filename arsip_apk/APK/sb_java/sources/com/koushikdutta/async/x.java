package com.koushikdutta.async;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public class x implements com.koushikdutta.async.callback.c {

    /* renamed from: a, reason: collision with root package name */
    public Charset f41677a;

    /* renamed from: b, reason: collision with root package name */
    public o f41678b;

    /* renamed from: c, reason: collision with root package name */
    public a f41679c;

    public interface a {
        void a(String r1);
    }

    public x() {
        this(null);
    }

    public void a(a r1) {
        this.f41679c = r1;
    }

    @Override // com.koushikdutta.async.callback.c
    public void q(q r3, o r4) {
        ByteBuffer r32 = ByteBuffer.allocate(r4.z());
    L4:
        if (r4.z() <= 0) goto L10;
        byte r02 = r4.e();
        if (r02 == 10) goto L7;
        r32.put(r02);
        goto L4
    L7:
        r32.flip();
        this.f41678b.a(r32);
        this.f41679c.a(this.f41678b.w(this.f41677a));
        this.f41678b = new o();
        return;
    L10:
        r32.flip();
        this.f41678b.a(r32);
    }

    public x(Charset r2) {
        this.f41678b = new o();
        this.f41677a = r2;
    }
}
