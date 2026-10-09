package com.stockbit.usecase.securities.resource;

import com.clevertap.android.sdk.Constants;

/* renamed from: com.stockbit.usecase.securities.resource.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10939d implements InterfaceC10938c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f162138a;

    /* renamed from: b, reason: collision with root package name */
    public final String f162139b;

    /* renamed from: c, reason: collision with root package name */
    public final String f162140c;

    public C10939d(boolean r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r3, "reason");
        kotlin.jvm.internal.p.l(r4, Constants.KEY_DATE);
        this.f162138a = r2;
        this.f162139b = r3;
        this.f162140c = r4;
    }

    public final boolean a() {
        return this.f162138a;
    }

    public final String b() {
        return this.f162140c;
    }

    public final String c() {
        return this.f162139b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10939d) == true) goto L8;
        return false;
    L8:
        C10939d r52 = (C10939d) r5;
        if (this.f162138a == r52.f162138a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f162139b, r52.f162139b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f162140c, r52.f162140c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f162138a) * 31) + this.f162139b.hashCode()) * 31) + this.f162140c.hashCode();
    }

    public String toString() {
        return "NotTradable(canOpenBuyPage=" + this.f162138a + ", reason=" + this.f162139b + ", date=" + this.f162140c + ")";
    }

    public /* synthetic */ C10939d(boolean r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
