package androidx.compose.ui.tooling.data;

import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f20550a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20551b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20552c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20553e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20554f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20555g;

    static {
    }

    public i(String r1, Object r2, boolean r3, boolean r4, boolean r5, String r6, boolean r7) {
        this.f20550a = r1;
        this.f20551b = r2;
        this.f20552c = r3;
        this.d = r4;
        this.f20553e = r5;
        this.f20554f = r6;
        this.f20555g = r7;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f20550a, r52.f20550a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f20551b, r52.f20551b) == true) goto L15;
        return false;
    L15:
        if (this.f20552c == r52.f20552c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f20553e == r52.f20553e) goto L24;
        return false;
    L24:
        if (p.g(this.f20554f, r52.f20554f) == true) goto L27;
        return false;
    L27:
        if (this.f20555g == r52.f20555g) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        int r02 = this.f20550a.hashCode() * 31;
        Object r1 = this.f20551b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (((((((r02 + r12) * 31) + Boolean.hashCode(this.f20552c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f20553e)) * 31;
        String r13 = this.f20554f;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return ((r03 + r2) * 31) + Boolean.hashCode(this.f20555g);
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "ParameterInformation(name=" + this.f20550a + ", value=" + this.f20551b + ", fromDefault=" + this.f20552c + ", static=" + this.d + ", compared=" + this.f20553e + ", inlineClass=" + this.f20554f + ", stable=" + this.f20555g + ')';
    }
}
