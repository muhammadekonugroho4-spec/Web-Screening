package com.stockbit.domain.model.uploadtoken;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f86612a;

    /* renamed from: b, reason: collision with root package name */
    public final List f86613b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86614c;

    public c(String r1, List r2, String r3) {
        this.f86612a = r1;
        this.f86613b = r2;
        this.f86614c = r3;
    }

    public final String a() {
        return this.f86612a;
    }

    public final List b() {
        return this.f86613b;
    }

    public final String c() {
        return this.f86614c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f86612a, r52.f86612a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86613b, r52.f86613b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86614c, r52.f86614c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f86612a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        List r2 = this.f86613b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f86614c;
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
        return "UploadTokenDomainParam(fileUrl=" + this.f86612a + ", headers=" + this.f86613b + ", url=" + this.f86614c + ")";
    }
}
