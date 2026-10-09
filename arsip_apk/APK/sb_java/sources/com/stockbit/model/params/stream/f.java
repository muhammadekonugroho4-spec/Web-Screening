package com.stockbit.model.params.stream;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public String f122151a;

    /* renamed from: b, reason: collision with root package name */
    public String f122152b;

    /* renamed from: c, reason: collision with root package name */
    public String f122153c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f122154e;

    public f(String r2, String r3, String r4, int r5, String r6) {
        p.l(r3, "lastPost");
        this.f122151a = r2;
        this.f122152b = r3;
        this.f122153c = r4;
        this.d = r5;
        this.f122154e = r6;
    }

    public final String a() {
        return this.f122154e;
    }

    public final String b() {
        return this.f122152b;
    }

    public final int c() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f122151a, r52.f122151a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f122152b, r52.f122152b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f122153c, r52.f122153c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f122154e, r52.f122154e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        String r02 = this.f122151a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = ((r03 * 31) + this.f122152b.hashCode()) * 31;
        String r2 = this.f122153c;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (((r04 + r22) * 31) + Integer.hashCode(this.d)) * 31;
        String r23 = this.f122154e;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "StreamListParams(beforeLastPost=" + this.f122151a + ", lastPost=" + this.f122152b + ", beforetimestamp=" + this.f122153c + ", trendingPage=" + this.d + ", companyNotesNextCursor=" + this.f122154e + ')';
    }

    public /* synthetic */ f(String r2, String r3, String r4, int r5, String r6, int r7, i r8) {
        if ((r7 & 4) == 0) goto L6;
        r4 = null;
    L6:
        if ((r7 & 16) == 0) goto L9;
        String r72 = null;
    L10:
        this(r2, r3, r4, r5, r72);
        return;
    L9:
        r72 = r6;
        goto L10
    }
}
