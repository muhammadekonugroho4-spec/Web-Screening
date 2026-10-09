package org.minidns.record;

import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes3.dex */
public abstract class k extends h {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f182861c;
    public transient InetAddress d;

    public k(byte[] r1) {
        this.f182861c = r1;
    }

    @Override // org.minidns.record.h
    public final void c(DataOutputStream r2) {
        r2.write(this.f182861c);
    }

    public final InetAddress h() {
        if (this.d != null) goto L10;
        this.d = InetAddress.getByAddress(this.f182861c);     // Catch: UnknownHostException -> L6
    L6:
        e = move-exception;
        throw new IllegalStateException(e);
    L10:
        return this.d;
    }

    public final byte[] i() {
        return (byte[]) this.f182861c.clone();
    }
}
