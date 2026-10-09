package com.stockbit.watchlist.ui.mainv2.state;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f170992a;

    /* renamed from: b, reason: collision with root package name */
    public final String f170993b;

    /* renamed from: c, reason: collision with root package name */
    public final String f170994c;
    public final String d;

    static {
    }

    public l(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_TITLE);
        kotlin.jvm.internal.p.l(r3, "message");
        kotlin.jvm.internal.p.l(r4, "primaryActionLabel");
        kotlin.jvm.internal.p.l(r5, "secondaryActionLabel");
        this.f170992a = r2;
        this.f170993b = r3;
        this.f170994c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f170993b;
    }

    public final String b() {
        return this.f170994c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f170992a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (kotlin.jvm.internal.p.g(this.f170992a, r52.f170992a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f170993b, r52.f170993b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f170994c, r52.f170994c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f170992a.hashCode() * 31) + this.f170993b.hashCode()) * 31) + this.f170994c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "WatchlistMainLinkagePromptUIData(title=" + this.f170992a + ", message=" + this.f170993b + ", primaryActionLabel=" + this.f170994c + ", secondaryActionLabel=" + this.d + ')';
    }
}
