package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: classes3.dex */
public class p extends h {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f182871c;
    public transient String d;

    public p(byte[] r1) {
        this.f182871c = r1;
    }

    public static p i(DataInputStream r02, int r1) {
        byte[] r12 = new byte[r1];
        r02.readFully(r12);
        return new p(r12);
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream r2) {
        r2.write(this.f182871c);
    }

    public String h() {
        if (this.d != null) goto L6;
        this.d = org.minidns.util.b.a(this.f182871c);
    L6:
        return this.d;
    }

    public String toString() {
        return h();
    }
}
