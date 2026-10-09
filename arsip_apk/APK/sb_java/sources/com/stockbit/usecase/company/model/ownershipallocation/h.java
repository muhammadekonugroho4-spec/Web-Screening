package com.stockbit.usecase.company.model.ownershipallocation;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f156421a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156422b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156423c;
    public final List d;

    public h(String r2, String r3, String r4, List r5) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "ticker");
        p.l(r4, "logoUrl");
        p.l(r5, "investors");
        this.f156421a = r2;
        this.f156422b = r3;
        this.f156423c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f156421a;
    }

    public final List b() {
        return this.d;
    }

    public final String c() {
        return this.f156423c;
    }

    public final String d() {
        return this.f156422b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f156421a, r52.f156421a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156422b, r52.f156422b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156423c, r52.f156423c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f156421a.hashCode() * 31) + this.f156422b.hashCode()) * 31) + this.f156423c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MainEmittenNodeUIState(id=" + this.f156421a + ", ticker=" + this.f156422b + ", logoUrl=" + this.f156423c + ", investors=" + this.d + ")";
    }
}
