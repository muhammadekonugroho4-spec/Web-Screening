package com.stockbit.stream.ui.filter.data;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f143032a;

    /* renamed from: b, reason: collision with root package name */
    public final String f143033b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f143034c;
    public final boolean d;

    static {
    }

    public a(String r2, String r3, boolean r4, boolean r5) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "displayName");
        this.f143032a = r2;
        this.f143033b = r3;
        this.f143034c = r4;
        this.d = r5;
    }

    public static /* synthetic */ a b(a r02, String r1, String r2, boolean r3, boolean r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.f143032a;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.f143033b;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.f143034c;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        return r02.a(r1, r2, r3, r4);
    }

    public final a a(String r2, String r3, boolean r4, boolean r5) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "displayName");
        return new a(r2, r3, r4, r5);
    }

    public final String c() {
        return this.f143033b;
    }

    public final String d() {
        return this.f143032a;
    }

    public final boolean e() {
        return this.f143034c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f143032a, r52.f143032a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f143033b, r52.f143033b) == true) goto L15;
        return false;
    L15:
        if (this.f143034c == r52.f143034c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public final boolean f() {
        return this.d;
    }

    public int hashCode() {
        return (((((this.f143032a.hashCode() * 31) + this.f143033b.hashCode()) * 31) + Boolean.hashCode(this.f143034c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "DynamicFilterItem(id=" + this.f143032a + ", displayName=" + this.f143033b + ", selected=" + this.f143034c + ", isMutuallyExclusive=" + this.d + ')';
    }
}
