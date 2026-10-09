package org.minidns.record;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.minidns.record.Record;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f182849a;

    /* renamed from: b, reason: collision with root package name */
    public transient Integer f182850b;

    public h() {
    }

    public abstract Record.TYPE a();

    public final int b() {
        d();
        return this.f182849a.length;
    }

    public abstract void c(DataOutputStream r1);

    public final void d() {
        if (this.f182849a == null) goto L5;
        return;
    L5:
        ByteArrayOutputStream r02 = new ByteArrayOutputStream();
        c(new DataOutputStream(r02));     // Catch: IOException -> L9
        this.f182849a = r02.toByteArray();
        return;
    L9:
        e = move-exception;
        throw new AssertionError(e);
    }

    public final byte[] e() {
        d();
        return (byte[]) this.f182849a.clone();
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof h) == true) goto L6;
        return false;
    L6:
        if (r2 != this) goto L9;
        return true;
    L9:
        h r22 = (h) r2;
        r22.d();
        d();
        return Arrays.equals(this.f182849a, r22.f182849a);
    }

    public final void g(DataOutputStream r2) {
        d();
        r2.write(this.f182849a);
    }

    public final int hashCode() {
        if (this.f182850b != null) goto L6;
        d();
        this.f182850b = Integer.valueOf(Arrays.hashCode(this.f182849a));
    L6:
        return this.f182850b.intValue();
    }
}
