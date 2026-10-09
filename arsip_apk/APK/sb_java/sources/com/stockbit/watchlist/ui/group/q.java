package com.stockbit.watchlist.ui.group;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class q implements InterfaceC4094y {

    /* renamed from: h, reason: collision with root package name */
    public static final a f169159h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final int f169160i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f169161a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f169162b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f169163c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f169164e;

    /* renamed from: f, reason: collision with root package name */
    public final String f169165f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f169166g;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final q a(Bundle r12) {
            kotlin.jvm.internal.p.l(r12, "bundle");
            r12.setClassLoader(q.class.getClassLoader());
            boolean r2 = false;
            if (r12.containsKey("isFromScreener") == false) goto L5;
            boolean r5 = r12.getBoolean("isFromScreener");
        L7:
            if (r12.containsKey("isFromCompany") == false) goto L9;
            r2 = r12.getBoolean("isFromCompany");
        L9:
            boolean r6 = r2;
            if (r12.containsKey("isFromWatchlist") == false) goto L13;
            boolean r02 = r12.getBoolean("isFromWatchlist");
        L12:
            boolean r7 = r02;
            int[] r22 = null;
            if (r12.containsKey("companySymbol") == false) goto L17;
            String r8 = r12.getString("companySymbol");
        L19:
            if (r12.containsKey("companyId") == false) goto L21;
            String r9 = r12.getString("companyId");
        L23:
            if (r12.containsKey("companyIds") == false) goto L25;
            r22 = r12.getIntArray("companyIds");
        L25:
            int[] r10 = r22;
            if (r12.containsKey("selectedWatchlistId") == false) goto L34;
            String r4 = r12.getString("selectedWatchlistId");
            if (r4 == null) goto L32;
            return new q(r4, r5, r6, r7, r8, r9, r10);
        L32:
            throw new IllegalArgumentException("Argument \"selectedWatchlistId\" is marked as non-null but was passed a null value.");
        L34:
            throw new IllegalArgumentException("Required argument \"selectedWatchlistId\" is missing and does not have an android:defaultValue");
        L21:
            r9 = null;
            goto L23
        L17:
            r8 = null;
            goto L19
        L13:
            r02 = true;
            goto L12
        L5:
            r5 = false;
            goto L7
        }

        public a() {
        }
    }

    static {
        f169159h = new a(null);
        f169160i = 8;
    }

    public q(String r2, boolean r3, boolean r4, boolean r5, String r6, String r7, int[] r8) {
        kotlin.jvm.internal.p.l(r2, "selectedWatchlistId");
        this.f169161a = r2;
        this.f169162b = r3;
        this.f169163c = r4;
        this.d = r5;
        this.f169164e = r6;
        this.f169165f = r7;
        this.f169166g = r8;
    }

    public static final q fromBundle(Bundle r1) {
        return f169159h.a(r1);
    }

    public final String a() {
        return this.f169165f;
    }

    public final int[] b() {
        return this.f169166g;
    }

    public final String c() {
        return this.f169164e;
    }

    public final String d() {
        return this.f169161a;
    }

    public final boolean e() {
        return this.f169163c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof q) == true) goto L8;
        return false;
    L8:
        q r52 = (q) r5;
        if (kotlin.jvm.internal.p.g(this.f169161a, r52.f169161a) == true) goto L12;
        return false;
    L12:
        if (this.f169162b == r52.f169162b) goto L15;
        return false;
    L15:
        if (this.f169163c == r52.f169163c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f169164e, r52.f169164e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f169165f, r52.f169165f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f169166g, r52.f169166g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final boolean f() {
        return this.f169162b;
    }

    public final boolean g() {
        return this.d;
    }

    public final Bundle h() {
        Bundle r02 = new Bundle();
        r02.putBoolean("isFromScreener", this.f169162b);
        r02.putBoolean("isFromCompany", this.f169163c);
        r02.putBoolean("isFromWatchlist", this.d);
        r02.putString("companySymbol", this.f169164e);
        r02.putString("companyId", this.f169165f);
        r02.putIntArray("companyIds", this.f169166g);
        r02.putString("selectedWatchlistId", this.f169161a);
        return r02;
    }

    public int hashCode() {
        int r02 = ((((((this.f169161a.hashCode() * 31) + Boolean.hashCode(this.f169162b)) * 31) + Boolean.hashCode(this.f169163c)) * 31) + Boolean.hashCode(this.d)) * 31;
        String r1 = this.f169164e;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f169165f;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        int[] r15 = this.f169166g;
        if (r15 == null) goto L15;
        r2 = Arrays.hashCode(r15);
    L15:
        return r04 + r2;
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "WatchlistGroupDialogFragmentArgs(selectedWatchlistId=" + this.f169161a + ", isFromScreener=" + this.f169162b + ", isFromCompany=" + this.f169163c + ", isFromWatchlist=" + this.d + ", companySymbol=" + this.f169164e + ", companyId=" + this.f169165f + ", companyIds=" + Arrays.toString(this.f169166g) + ')';
    }
}
