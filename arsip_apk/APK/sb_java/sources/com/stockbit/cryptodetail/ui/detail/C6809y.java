package com.stockbit.cryptodetail.ui.detail;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* renamed from: com.stockbit.cryptodetail.ui.detail.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6809y implements InterfaceC4094y {

    /* renamed from: f, reason: collision with root package name */
    public static final a f79766f = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f79767a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79768b;

    /* renamed from: c, reason: collision with root package name */
    public final String f79769c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f79770e;

    /* renamed from: com.stockbit.cryptodetail.ui.detail.y$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C6809y a(Bundle r9) {
            kotlin.jvm.internal.p.l(r9, "bundle");
            r9.setClassLoader(C6809y.class.getClassLoader());
            if (r9.containsKey("cryptoSymbol") == false) goto L26;
            String r3 = r9.getString("cryptoSymbol");
            if (r3 == null) goto L24;
            String r2 = "";
            if (r9.containsKey("cryptoName") == false) goto L9;
            String r4 = r9.getString("cryptoName");
        L11:
            if (r9.containsKey("cryptoLogo") == false) goto L13;
            String r5 = r9.getString("cryptoLogo");
        L15:
            if (r9.containsKey("cryptoLastPrice") == false) goto L17;
            String r6 = r9.getString("cryptoLastPrice");
        L19:
            if (r9.containsKey("cryptoChartFilterTime") == false) goto L22;
            r2 = r9.getString("cryptoChartFilterTime");
        L22:
            return new C6809y(r3, r4, r5, r6, r2);
        L17:
            r6 = "";
            goto L19
        L13:
            r5 = "";
            goto L15
        L9:
            r4 = "";
            goto L11
        L24:
            throw new IllegalArgumentException("Argument \"cryptoSymbol\" is marked as non-null but was passed a null value.");
        L26:
            throw new IllegalArgumentException("Required argument \"cryptoSymbol\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f79766f = new a(null);
    }

    public C6809y(String r2, String r3, String r4, String r5, String r6) {
        kotlin.jvm.internal.p.l(r2, "cryptoSymbol");
        this.f79767a = r2;
        this.f79768b = r3;
        this.f79769c = r4;
        this.d = r5;
        this.f79770e = r6;
    }

    public static final C6809y fromBundle(Bundle r1) {
        return f79766f.a(r1);
    }

    public final String a() {
        return this.f79770e;
    }

    public final String b() {
        return this.f79769c;
    }

    public final String c() {
        return this.f79768b;
    }

    public final String d() {
        return this.f79767a;
    }

    public final Bundle e() {
        Bundle r02 = new Bundle();
        r02.putString("cryptoSymbol", this.f79767a);
        r02.putString("cryptoName", this.f79768b);
        r02.putString("cryptoLogo", this.f79769c);
        r02.putString("cryptoLastPrice", this.d);
        r02.putString("cryptoChartFilterTime", this.f79770e);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C6809y) == true) goto L8;
        return false;
    L8:
        C6809y r52 = (C6809y) r5;
        if (kotlin.jvm.internal.p.g(this.f79767a, r52.f79767a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f79768b, r52.f79768b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f79769c, r52.f79769c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f79770e, r52.f79770e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r02 = this.f79767a.hashCode() * 31;
        String r1 = this.f79768b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f79769c;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.d;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.f79770e;
        if (r17 == null) goto L19;
        r2 = r17.hashCode();
    L19:
        return r05 + r2;
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "CryptoDetailFragmentArgs(cryptoSymbol=" + this.f79767a + ", cryptoName=" + this.f79768b + ", cryptoLogo=" + this.f79769c + ", cryptoLastPrice=" + this.d + ", cryptoChartFilterTime=" + this.f79770e + ')';
    }
}
