package com.stockbit.watchlist.ui.mainv2.state;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: f, reason: collision with root package name */
    public static final a f170987f = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f170988a;

    /* renamed from: b, reason: collision with root package name */
    public final String f170989b;

    /* renamed from: c, reason: collision with root package name */
    public final String f170990c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f170991e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f170987f = new a(null);
    }

    public k(String r2, String r3, String r4, String r5, String r6) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, Constants.KEY_TITLE);
        kotlin.jvm.internal.p.l(r4, "body");
        kotlin.jvm.internal.p.l(r5, "iconUrl");
        kotlin.jvm.internal.p.l(r6, "viewType");
        this.f170988a = r2;
        this.f170989b = r3;
        this.f170990c = r4;
        this.d = r5;
        this.f170991e = r6;
    }

    public final String a() {
        return this.f170990c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f170988a;
    }

    public final String d() {
        return this.f170989b;
    }

    public final String e() {
        return this.f170991e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (kotlin.jvm.internal.p.g(this.f170988a, r52.f170988a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f170989b, r52.f170989b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f170990c, r52.f170990c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f170991e, r52.f170991e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f170988a.hashCode() * 31) + this.f170989b.hashCode()) * 31) + this.f170990c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f170991e.hashCode();
    }

    public String toString() {
        return "WatchlistMainInAppNotifUIState(id=" + this.f170988a + ", title=" + this.f170989b + ", body=" + this.f170990c + ", iconUrl=" + this.d + ", viewType=" + this.f170991e + ')';
    }

    public /* synthetic */ k(String r7, String r8, String r9, String r10, String r11, int r12, kotlin.jvm.internal.i r13) {
        if ((r12 & 16) == 0) goto L5;
        r11 = "";
    L5:
        this(r7, r8, r9, r10, r11);
    }
}
