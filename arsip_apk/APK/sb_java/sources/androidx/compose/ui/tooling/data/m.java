package androidx.compose.ui.tooling.data;

import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f20567a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20568b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20569c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20570e;

    static {
    }

    public m(int r1, int r2, int r3, String r4, int r5) {
        this.f20567a = r1;
        this.f20568b = r2;
        this.f20569c = r3;
        this.d = r4;
        this.f20570e = r5;
    }

    public final int a() {
        return this.f20569c;
    }

    public final int b() {
        return this.f20567a;
    }

    public final int c() {
        return this.f20568b;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (this.f20567a == r52.f20567a) goto L12;
        return false;
    L12:
        if (this.f20568b == r52.f20568b) goto L15;
        return false;
    L15:
        if (this.f20569c == r52.f20569c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f20570e == r52.f20570e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r02 = ((((Integer.hashCode(this.f20567a) * 31) + Integer.hashCode(this.f20568b)) * 31) + Integer.hashCode(this.f20569c)) * 31;
        String r1 = this.d;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + Integer.hashCode(this.f20570e);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "SourceLocation(lineNumber=" + this.f20567a + ", offset=" + this.f20568b + ", length=" + this.f20569c + ", sourceFile=" + this.d + ", packageHash=" + this.f20570e + ')';
    }
}
