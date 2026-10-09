package com.stockbit.domain.model.uploadtoken;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f86615a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86616b;

    public d(List r1, String r2) {
        this.f86615a = r1;
        this.f86616b = r2;
    }

    public final List a() {
        return this.f86615a;
    }

    public final String b() {
        return this.f86616b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f86615a, r52.f86615a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86616b, r52.f86616b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        List r02 = this.f86615a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f86616b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "UploadTokenEntity(headers=" + this.f86615a + ", url=" + this.f86616b + ")";
    }
}
