package com.stockbit.domain.model.livestream;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f84260a;

    /* renamed from: b, reason: collision with root package name */
    public final b f84261b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84262c;

    public c(String r2, b r3, String r4) {
        p.l(r2, "tag");
        p.l(r4, Constants.KEY_TEXT);
        this.f84260a = r2;
        this.f84261b = r3;
        this.f84262c = r4;
    }

    public final String a() {
        return this.f84260a;
    }

    public final b b() {
        return this.f84261b;
    }

    public final String c() {
        return this.f84262c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f84260a, r52.f84260a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84261b, r52.f84261b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84262c, r52.f84262c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = this.f84260a.hashCode() * 31;
        b r1 = this.f84261b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + this.f84262c.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "LivestreamHtmlMetaDataEntity(tag=" + this.f84260a + ", attr=" + this.f84261b + ", text=" + this.f84262c + ")";
    }
}
