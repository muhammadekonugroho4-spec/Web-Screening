package com.stockbit.domain.model.valueobject.otp;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f86914a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86915b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86916c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f86917e;

    /* renamed from: f, reason: collision with root package name */
    public final String f86918f;

    /* renamed from: g, reason: collision with root package name */
    public final String f86919g;

    public a(Object r2, String r3, String r4, String r5, boolean r6, String r7, String r8) {
        p.l(r4, "token");
        p.l(r5, "message");
        this.f86914a = r2;
        this.f86915b = r3;
        this.f86916c = r4;
        this.d = r5;
        this.f86917e = r6;
        this.f86918f = r7;
        this.f86919g = r8;
    }

    public final Object a() {
        return this.f86914a;
    }

    public final String b() {
        return this.f86919g;
    }

    public final String c() {
        return this.f86918f;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f86916c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f86914a, r52.f86914a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86915b, r52.f86915b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86916c, r52.f86916c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f86917e == r52.f86917e) goto L24;
        return false;
    L24:
        if (p.g(this.f86918f, r52.f86918f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f86919g, r52.f86919g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final boolean f() {
        return this.f86917e;
    }

    public int hashCode() {
        Object r02 = this.f86914a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f86915b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (((((((r04 + r22) * 31) + this.f86916c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f86917e)) * 31;
        String r23 = this.f86918f;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.f86919g;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "AuthResult(dataModel=" + this.f86914a + ", email=" + this.f86915b + ", token=" + this.f86916c + ", message=" + this.d + ", isShowBottomSheetOnError=" + this.f86917e + ", dialogMessageTitle=" + this.f86918f + ", dialogMessageDesc=" + this.f86919g + ')';
    }

    public /* synthetic */ a(Object r2, String r3, String r4, String r5, boolean r6, String r7, String r8, int r9, i r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r9 & 16) == 0) goto L12;
        r6 = false;
    L12:
        if ((r9 & 32) == 0) goto L15;
        r7 = null;
    L15:
        if ((r9 & 64) == 0) goto L18;
        String r92 = null;
    L19:
        this(r2, r3, r4, r5, r6, r7, r92);
        return;
    L18:
        r92 = r8;
        goto L19
    }
}
