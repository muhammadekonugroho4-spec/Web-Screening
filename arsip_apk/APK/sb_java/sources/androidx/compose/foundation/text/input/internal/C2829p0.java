package androidx.compose.foundation.text.input.internal;

import kotlin.collections.AbstractC11772p;

/* renamed from: androidx.compose.foundation.text.input.internal.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2829p0 {

    /* renamed from: a, reason: collision with root package name */
    public int f10331a;

    /* renamed from: b, reason: collision with root package name */
    public char[] f10332b;

    /* renamed from: c, reason: collision with root package name */
    public int f10333c;
    public int d;

    public C2829p0(char[] r2, int r3, int r4) {
        this.f10331a = r2.length;
        this.f10332b = r2;
        this.f10333c = r3;
        this.d = r4;
    }

    public final void a(StringBuilder r5) {
        r5.append(this.f10332b, 0, this.f10333c);
        kotlin.jvm.internal.p.k(r5, "append(...)");
        char[] r1 = this.f10332b;
        int r2 = this.d;
        r5.append(r1, r2, this.f10331a - r2);
        kotlin.jvm.internal.p.k(r5, "append(...)");
    }

    public final void b(int r5, int r6) {
        int r02 = this.f10333c;
        if (r5 >= r02) goto L7;
        if (r6 > r02) goto L7;
        int r1 = r02 - r6;
        char[] r2 = this.f10332b;
        AbstractC11772p.k(r2, r2, this.d - r1, r6, r02);
        this.f10333c = r5;
        this.d -= r1;
        return;
    L7:
        if (r5 >= r02) goto L11;
        if (r6 < r02) goto L11;
        this.d = r6 + c();
        this.f10333c = r5;
        return;
    L11:
        int r52 = r5 + c();
        int r62 = r6 + c();
        int r03 = this.d;
        char[] r22 = this.f10332b;
        AbstractC11772p.k(r22, r22, this.f10333c, r03, r52);
        this.f10333c += r52 - r03;
        this.d = r62;
    }

    public final int c() {
        return this.d - this.f10333c;
    }

    public final char d(int r3) {
        int r02 = this.f10333c;
        if (r3 >= r02) goto L7;
        return this.f10332b[r3];
    L7:
        return this.f10332b[(r3 - r02) + this.d];
    }

    public final int e() {
        return this.f10331a - c();
    }

    public final void f(int r6) {
        if (r6 > c()) goto L5;
        return;
    L5:
        int r62 = r6 - c();
        int r02 = this.f10331a;
    L6:
        r02 = r02 * 2;
        if ((r02 - this.f10331a) < r62) goto L6;
        char[] r63 = new char[r02];
        AbstractC11772p.k(this.f10332b, r63, 0, 0, this.f10333c);
        int r1 = this.f10331a;
        int r2 = this.d;
        int r12 = r1 - r2;
        int r3 = r02 - r12;
        AbstractC11772p.k(this.f10332b, r63, r3, r2, r12 + r2);
        this.f10332b = r63;
        this.f10331a = r02;
        this.d = r3;
    }

    public final void g(int r3, int r4, CharSequence r5, int r6, int r7) {
        int r02 = r7 - r6;
        f(r02 - (r4 - r3));
        b(r3, r4);
        M2.a(r5, this.f10332b, this.f10333c, r6, r7);
        this.f10333c += r02;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append(r02);
        return r02.toString();
    }
}
