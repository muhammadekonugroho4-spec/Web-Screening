package com.stockbit.domain.model.entity;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes8.dex */
public final class C {

    /* renamed from: h, reason: collision with root package name */
    public static final a f82266h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final C f82267i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final C f82268j = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f82269a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82270b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f82271c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f82272e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f82273f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f82274g;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C a() {
            return C.a();
        }

        public a() {
        }
    }

    static {
        f82266h = new a(null);
        String r3 = "";
        String r4 = "All Watchlist";
        boolean r5 = true;
        boolean r6 = true;
        boolean r7 = true;
        boolean r8 = false;
        boolean r9 = false;
        f82267i = new C(r3, r4, r5, r6, r7, r8, r9, 64, null);
        String r42 = "";
        String r52 = "Portfolio";
        boolean r62 = false;
        boolean r92 = true;
        boolean r10 = false;
        f82268j = new C(r42, r52, r62, r7, r8, r92, r10, 64, null);
    }

    public C(String r2, String r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f82269a = r2;
        this.f82270b = r3;
        this.f82271c = r4;
        this.d = r5;
        this.f82272e = r6;
        this.f82273f = r7;
        this.f82274g = r8;
    }

    public static final /* synthetic */ C a() {
        return f82267i;
    }

    public static /* synthetic */ C c(C r02, String r1, String r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r02.f82269a;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r02.f82270b;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r02.f82271c;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r02.f82272e;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r02.f82273f;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r02.f82274g;
    L23:
        boolean r82 = r6;
        boolean r92 = r7;
        boolean r62 = r4;
        boolean r72 = r5;
        boolean r52 = r3;
        String r32 = r1;
        return r02.b(r32, r2, r52, r62, r72, r82, r92);
    }

    public final C b(String r10, String r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16) {
        kotlin.jvm.internal.p.l(r10, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r11, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return new C(r10, r11, r12, r13, r14, r15, r16);
    }

    public final boolean d() {
        return this.f82272e;
    }

    public final boolean e() {
        return this.f82273f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C) == true) goto L8;
        return false;
    L8:
        C r52 = (C) r5;
        if (kotlin.jvm.internal.p.g(this.f82269a, r52.f82269a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82270b, r52.f82270b) == true) goto L15;
        return false;
    L15:
        if (this.f82271c == r52.f82271c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f82272e == r52.f82272e) goto L24;
        return false;
    L24:
        if (this.f82273f == r52.f82273f) goto L27;
        return false;
    L27:
        if (this.f82274g == r52.f82274g) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f82269a;
    }

    public final String g() {
        return this.f82270b;
    }

    public final boolean h() {
        return this.f82271c;
    }

    public int hashCode() {
        return (((((((((((this.f82269a.hashCode() * 31) + this.f82270b.hashCode()) * 31) + Boolean.hashCode(this.f82271c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f82272e)) * 31) + Boolean.hashCode(this.f82273f)) * 31) + Boolean.hashCode(this.f82274g);
    }

    public final boolean i() {
        return this.d;
    }

    public final boolean j() {
        return this.f82274g;
    }

    public String toString() {
        return "WatchlistFavoriteItem(id=" + this.f82269a + ", name=" + this.f82270b + ", isDefault=" + this.f82271c + ", isFavorite=" + this.d + ", hasDownIcon=" + this.f82272e + ", hasPortfolioIcon=" + this.f82273f + ", isSelected=" + this.f82274g + ')';
    }

    public /* synthetic */ C(String r2, String r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.i r10) {
        if ((r9 & 16) == 0) goto L6;
        r6 = false;
    L6:
        if ((r9 & 32) == 0) goto L9;
        r7 = false;
    L9:
        if ((r9 & 64) == 0) goto L12;
        boolean r92 = false;
    L13:
        this(r2, r3, r4, r5, r6, r7, r92);
        return;
    L12:
        r92 = r8;
        goto L13
    }
}
