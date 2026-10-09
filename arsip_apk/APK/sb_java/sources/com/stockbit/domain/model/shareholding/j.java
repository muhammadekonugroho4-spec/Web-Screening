package com.stockbit.domain.model.shareholding;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f85785a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85786b;

    /* renamed from: c, reason: collision with root package name */
    public final k f85787c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f85788e;

    public j(String r2, String r3, k r4, int r5, boolean r6) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "nodeType");
        p.l(r4, "metadata");
        this.f85785a = r2;
        this.f85786b = r3;
        this.f85787c = r4;
        this.d = r5;
        this.f85788e = r6;
    }

    public final String a() {
        return this.f85785a;
    }

    public final k b() {
        return this.f85787c;
    }

    public final boolean c() {
        return this.f85788e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f85785a, r52.f85785a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85786b, r52.f85786b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85787c, r52.f85787c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f85788e == r52.f85788e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f85785a.hashCode() * 31) + this.f85786b.hashCode()) * 31) + this.f85787c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + Boolean.hashCode(this.f85788e);
    }

    public String toString() {
        return "ShareholdingNetworkNodeEntity(id=" + this.f85785a + ", nodeType=" + this.f85786b + ", metadata=" + this.f85787c + ", minDepth=" + this.d + ", isRendered=" + this.f85788e + ")";
    }
}
