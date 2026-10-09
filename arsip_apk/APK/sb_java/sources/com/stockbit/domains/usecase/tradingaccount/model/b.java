package com.stockbit.domains.usecase.tradingaccount.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f88499a;

    /* renamed from: b, reason: collision with root package name */
    public final List f88500b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88501c;

    public b(String r1, List r2, String r3) {
        this.f88499a = r1;
        this.f88500b = r2;
        this.f88501c = r3;
    }

    public final String a() {
        return this.f88499a;
    }

    public final List b() {
        return this.f88500b;
    }

    public final String c() {
        return this.f88501c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f88499a, r52.f88499a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88500b, r52.f88500b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f88501c, r52.f88501c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f88499a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        List r2 = this.f88500b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f88501c;
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
        return "UiParamProfileUploadToken(fileUrl=" + this.f88499a + ", headers=" + this.f88500b + ", url=" + this.f88501c + ")";
    }
}
