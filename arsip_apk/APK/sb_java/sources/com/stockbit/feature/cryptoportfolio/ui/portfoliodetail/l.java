package com.stockbit.feature.cryptoportfolio.ui.portfoliodetail;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes9.dex */
public final class l implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f94730a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94731b;

    /* renamed from: c, reason: collision with root package name */
    public final String f94732c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final l a(Bundle r6) {
            kotlin.jvm.internal.p.l(r6, "bundle");
            r6.setClassLoader(l.class.getClassLoader());
            if (r6.containsKey("coinSymbol") == false) goto L26;
            String r02 = r6.getString("coinSymbol");
            if (r02 == null) goto L24;
            String r3 = "";
            if (r6.containsKey("coinName") == false) goto L13;
            String r1 = r6.getString("coinName");
            if (r1 != null) goto L15;
            throw new IllegalArgumentException("Argument \"coinName\" is marked as non-null but was passed a null value.");
        L15:
            if (r6.containsKey("coinLogo") == false) goto L22;
            r3 = r6.getString("coinLogo");
            if (r3 != null) goto L22;
            throw new IllegalArgumentException("Argument \"coinLogo\" is marked as non-null but was passed a null value.");
        L22:
            return new l(r02, r1, r3);
        L13:
            r1 = "";
            goto L15
        L24:
            throw new IllegalArgumentException("Argument \"coinSymbol\" is marked as non-null but was passed a null value.");
        L26:
            throw new IllegalArgumentException("Required argument \"coinSymbol\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public l(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "coinSymbol");
        kotlin.jvm.internal.p.l(r3, "coinName");
        kotlin.jvm.internal.p.l(r4, "coinLogo");
        this.f94730a = r2;
        this.f94731b = r3;
        this.f94732c = r4;
    }

    public static final l fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final Bundle a() {
        Bundle r02 = new Bundle();
        r02.putString("coinSymbol", this.f94730a);
        r02.putString("coinName", this.f94731b);
        r02.putString("coinLogo", this.f94732c);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (kotlin.jvm.internal.p.g(this.f94730a, r52.f94730a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f94731b, r52.f94731b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f94732c, r52.f94732c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f94730a.hashCode() * 31) + this.f94731b.hashCode()) * 31) + this.f94732c.hashCode();
    }

    public String toString() {
        return "CryptoPortfolioDetailFragmentArgs(coinSymbol=" + this.f94730a + ", coinName=" + this.f94731b + ", coinLogo=" + this.f94732c + ')';
    }
}
