package com.stockbit.virtual.ui.amend.sell;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes2.dex */
public final class s implements InterfaceC4094y {

    /* renamed from: f, reason: collision with root package name */
    public static final a f166710f = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f166711a;

    /* renamed from: b, reason: collision with root package name */
    public final String f166712b;

    /* renamed from: c, reason: collision with root package name */
    public final String f166713c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f166714e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final s a(Bundle r9) {
            kotlin.jvm.internal.p.l(r9, "bundle");
            r9.setClassLoader(s.class.getClassLoader());
            if (r9.containsKey("EXTRA_SYMBOL") == false) goto L23;
            String r3 = r9.getString("EXTRA_SYMBOL");
            if (r9.containsKey("EXTRA_LAST_PRICE") == false) goto L21;
            String r4 = r9.getString("EXTRA_LAST_PRICE");
            if (r9.containsKey("EXTRA_ORDER_ID") == false) goto L19;
            String r5 = r9.getString("EXTRA_ORDER_ID");
            if (r9.containsKey("EXTRA_LOT") == false) goto L17;
            String r6 = r9.getString("EXTRA_LOT");
            if (r9.containsKey("EXTRA_RESULT_SUM_LOT") == false) goto L15;
            return new s(r3, r4, r5, r6, r9.getString("EXTRA_RESULT_SUM_LOT"));
        L15:
            throw new IllegalArgumentException("Required argument \"EXTRA_RESULT_SUM_LOT\" is missing and does not have an android:defaultValue");
        L17:
            throw new IllegalArgumentException("Required argument \"EXTRA_LOT\" is missing and does not have an android:defaultValue");
        L19:
            throw new IllegalArgumentException("Required argument \"EXTRA_ORDER_ID\" is missing and does not have an android:defaultValue");
        L21:
            throw new IllegalArgumentException("Required argument \"EXTRA_LAST_PRICE\" is missing and does not have an android:defaultValue");
        L23:
            throw new IllegalArgumentException("Required argument \"EXTRA_SYMBOL\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f166710f = new a(null);
    }

    public s(String r1, String r2, String r3, String r4, String r5) {
        this.f166711a = r1;
        this.f166712b = r2;
        this.f166713c = r3;
        this.d = r4;
        this.f166714e = r5;
    }

    public static final s fromBundle(Bundle r1) {
        return f166710f.a(r1);
    }

    public final String a() {
        return this.f166712b;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f166713c;
    }

    public final String d() {
        return this.f166714e;
    }

    public final String e() {
        return this.f166711a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof s) == true) goto L8;
        return false;
    L8:
        s r52 = (s) r5;
        if (kotlin.jvm.internal.p.g(this.f166711a, r52.f166711a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f166712b, r52.f166712b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f166713c, r52.f166713c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f166714e, r52.f166714e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final Bundle f() {
        Bundle r02 = new Bundle();
        r02.putString("EXTRA_SYMBOL", this.f166711a);
        r02.putString("EXTRA_LAST_PRICE", this.f166712b);
        r02.putString("EXTRA_ORDER_ID", this.f166713c);
        r02.putString("EXTRA_LOT", this.d);
        r02.putString("EXTRA_RESULT_SUM_LOT", this.f166714e);
        return r02;
    }

    public int hashCode() {
        String r02 = this.f166711a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f166712b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f166713c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f166714e;
        if (r27 == null) goto L23;
        r1 = r27.hashCode();
    L23:
        return r07 + r1;
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "VirtualAmendSellFragmentArgs(EXTRASYMBOL=" + this.f166711a + ", EXTRALASTPRICE=" + this.f166712b + ", EXTRAORDERID=" + this.f166713c + ", EXTRALOT=" + this.d + ", EXTRARESULTSUMLOT=" + this.f166714e + ')';
    }
}
