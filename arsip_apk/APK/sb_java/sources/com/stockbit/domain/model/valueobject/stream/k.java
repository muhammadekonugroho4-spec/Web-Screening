package com.stockbit.domain.model.valueobject.stream;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f87171a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87172b;

    /* renamed from: c, reason: collision with root package name */
    public final List f87173c;
    public final int d;

    public k(String r2, String r3, List r4, int r5) {
        p.l(r2, Constants.KEY_TITLE);
        p.l(r3, "value");
        this.f87171a = r2;
        this.f87172b = r3;
        this.f87173c = r4;
        this.d = r5;
    }

    public final List a() {
        return this.f87173c;
    }

    public final String b() {
        return this.f87171a;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return this.f87172b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (p.g(this.f87171a, r52.f87171a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87172b, r52.f87172b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87173c, r52.f87173c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f87171a.hashCode() * 31) + this.f87172b.hashCode()) * 31;
        List r1 = this.f87173c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + Integer.hashCode(this.d);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "StreamSection(title=" + this.f87171a + ", value=" + this.f87172b + ", subSection=" + this.f87173c + ", titleResource=" + this.d + ')';
    }
}
