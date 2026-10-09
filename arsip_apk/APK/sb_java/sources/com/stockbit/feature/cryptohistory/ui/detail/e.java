package com.stockbit.feature.cryptohistory.ui.detail;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: f, reason: collision with root package name */
    public static final a f93708f = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f93709a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93710b;

    /* renamed from: c, reason: collision with root package name */
    public final String f93711c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f93712e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a(Bundle r8) {
            p.l(r8, "bundle");
            r8.setClassLoader(e.class.getClassLoader());
            String r2 = "";
            if (r8.containsKey("txnType") == false) goto L9;
            String r02 = r8.getString("txnType");
            if (r02 != null) goto L11;
            throw new IllegalArgumentException("Argument \"txnType\" is marked as non-null but was passed a null value.");
        L11:
            if (r8.containsKey("transactionId") == false) goto L17;
            String r1 = r8.getString("transactionId");
            if (r1 == null) goto L16;
            String r3 = r1;
        L19:
            if (r8.containsKey("coinSymbol") == false) goto L25;
            String r12 = r8.getString("coinSymbol");
            if (r12 == null) goto L24;
            String r4 = r12;
        L27:
            if (r8.containsKey("coinName") == false) goto L33;
            String r13 = r8.getString("coinName");
            if (r13 == null) goto L32;
            String r5 = r13;
        L35:
            if (r8.containsKey("coinLogo") == false) goto L38;
            r2 = r8.getString("coinLogo");
            if (r2 != null) goto L38;
            throw new IllegalArgumentException("Argument \"coinLogo\" is marked as non-null but was passed a null value.");
        L38:
            String r6 = r2;
            return new e(r02, r3, r4, r5, r6);
        L32:
            throw new IllegalArgumentException("Argument \"coinName\" is marked as non-null but was passed a null value.");
        L33:
            r5 = "";
            goto L35
        L24:
            throw new IllegalArgumentException("Argument \"coinSymbol\" is marked as non-null but was passed a null value.");
        L25:
            r4 = "";
            goto L27
        L16:
            throw new IllegalArgumentException("Argument \"transactionId\" is marked as non-null but was passed a null value.");
        L17:
            r3 = "";
            goto L19
        L9:
            r02 = "";
            goto L11
        }

        public a() {
        }
    }

    static {
        f93708f = new a(null);
    }

    public e(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, "txnType");
        p.l(r3, "transactionId");
        p.l(r4, "coinSymbol");
        p.l(r5, "coinName");
        p.l(r6, "coinLogo");
        this.f93709a = r2;
        this.f93710b = r3;
        this.f93711c = r4;
        this.d = r5;
        this.f93712e = r6;
    }

    public static final e fromBundle(Bundle r1) {
        return f93708f.a(r1);
    }

    public final String a() {
        return this.f93712e;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f93711c;
    }

    public final String d() {
        return this.f93710b;
    }

    public final String e() {
        return this.f93709a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f93709a, r52.f93709a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f93710b, r52.f93710b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f93711c, r52.f93711c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f93712e, r52.f93712e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final Bundle f() {
        Bundle r02 = new Bundle();
        r02.putString("txnType", this.f93709a);
        r02.putString("transactionId", this.f93710b);
        r02.putString("coinSymbol", this.f93711c);
        r02.putString("coinName", this.d);
        r02.putString("coinLogo", this.f93712e);
        return r02;
    }

    public int hashCode() {
        return (((((((this.f93709a.hashCode() * 31) + this.f93710b.hashCode()) * 31) + this.f93711c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f93712e.hashCode();
    }

    public String toString() {
        return "CryptoHistoryDetailFragmentArgs(txnType=" + this.f93709a + ", transactionId=" + this.f93710b + ", coinSymbol=" + this.f93711c + ", coinName=" + this.d + ", coinLogo=" + this.f93712e + ')';
    }
}
