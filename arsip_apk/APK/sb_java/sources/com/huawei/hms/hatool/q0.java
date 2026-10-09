package com.huawei.hms.hatool;

/* loaded from: classes6.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f39416a;

    /* renamed from: b, reason: collision with root package name */
    private int f39417b;

    public q0(int r2) {
        this.f39416a = null;
        this.f39417b = 0;
        this.f39416a = new byte[r2];
    }

    public void a(byte[] r5, int r6) {
        if (r6 > 0) goto L4;
        return;
    L4:
        byte[] r02 = this.f39416a;
        int r1 = r02.length;
        int r2 = this.f39417b;
        if ((r1 - r2) < r6) goto L7;
        System.arraycopy(r5, 0, r02, r2, r6);
    L8:
        this.f39417b += r6;
        return;
    L7:
        byte[] r12 = new byte[(r02.length + r6) << 1];
        System.arraycopy(r02, 0, r12, 0, r2);
        System.arraycopy(r5, 0, r12, this.f39417b, r6);
        this.f39416a = r12;
        goto L8
    }

    public int b() {
        return this.f39417b;
    }

    public byte[] a() {
        int r02 = this.f39417b;
        if (r02 <= 0) goto L5;
        byte[] r2 = new byte[r02];
        System.arraycopy(this.f39416a, 0, r2, 0, r02);
        return r2;
    L5:
        return new byte[0];
    }
}
