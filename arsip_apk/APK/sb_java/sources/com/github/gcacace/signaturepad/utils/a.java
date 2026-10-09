package com.github.gcacace.signaturepad.utils;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public f f37603a;

    /* renamed from: b, reason: collision with root package name */
    public f f37604b;

    /* renamed from: c, reason: collision with root package name */
    public f f37605c;
    public f d;

    public a() {
    }

    public float a() {
        float r02 = 0.0f;
        double r1 = 0.0d;
        int r5 = 0;
        double r3 = 0.0d;
    L4:
        if (r5 > 10) goto L9;
        float r9 = r5 / 10;
        double r6 = b(r9, this.f37603a.f37617a, this.f37604b.f37617a, this.f37605c.f37617a, this.d.f37617a);
        double r92 = b(r9, this.f37603a.f37618b, this.f37604b.f37618b, this.f37605c.f37618b, this.d.f37618b);
        if (r5 <= 0) goto L8;
        double r12 = r6 - r1;
        double r32 = r92 - r3;
        r02 = (float) (r02 + Math.sqrt((r12 * r12) + (r32 * r32)));
    L8:
        r5 = r5 + 1;
        r1 = r6;
        r3 = r92;
        goto L4
    L9:
        return r02;
    }

    public double b(float r9, float r10, float r11, float r12, float r13) {
        double r2 = r9;
        double r4 = 1.0d - r2;
        return (((((r10 * r4) * r4) * r4) + ((((r11 * 3.0d) * r4) * r4) * r2)) + ((((r12 * 3.0d) * r4) * r2) * r2)) + (((r13 * r9) * r9) * r9);
    }

    public a c(f r1, f r2, f r3, f r4) {
        this.f37603a = r1;
        this.f37604b = r2;
        this.f37605c = r3;
        this.d = r4;
        return this;
    }
}
