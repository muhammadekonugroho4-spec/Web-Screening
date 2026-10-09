package com.stockbit.virtual.ui.amend.buy;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes2.dex */
public final class r implements InterfaceC4094y {

    /* renamed from: g, reason: collision with root package name */
    public static final a f166595g = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f166596a;

    /* renamed from: b, reason: collision with root package name */
    public final String f166597b;

    /* renamed from: c, reason: collision with root package name */
    public final String f166598c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f166599e;

    /* renamed from: f, reason: collision with root package name */
    public final String f166600f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final r a(Bundle r10) {
            kotlin.jvm.internal.p.l(r10, "bundle");
            r10.setClassLoader(r.class.getClassLoader());
            if (r10.containsKey("EXTRA_SYMBOL") == false) goto L27;
            String r3 = r10.getString("EXTRA_SYMBOL");
            if (r10.containsKey("EXTRA_LAST_PRICE") == false) goto L25;
            String r4 = r10.getString("EXTRA_LAST_PRICE");
            if (r10.containsKey("EXTRA_ORDER_ID") == false) goto L23;
            String r5 = r10.getString("EXTRA_ORDER_ID");
            if (r10.containsKey("EXTRA_LOT") == false) goto L21;
            String r6 = r10.getString("EXTRA_LOT");
            if (r10.containsKey("EXTRA_RESULT_LOT") == false) goto L19;
            String r7 = r10.getString("EXTRA_RESULT_LOT");
            if (r10.containsKey("EXTRA_TOTAL_AMOUNT") == false) goto L17;
            return new r(r3, r4, r5, r6, r7, r10.getString("EXTRA_TOTAL_AMOUNT"));
        L17:
            throw new IllegalArgumentException("Required argument \"EXTRA_TOTAL_AMOUNT\" is missing and does not have an android:defaultValue");
        L19:
            throw new IllegalArgumentException("Required argument \"EXTRA_RESULT_LOT\" is missing and does not have an android:defaultValue");
        L21:
            throw new IllegalArgumentException("Required argument \"EXTRA_LOT\" is missing and does not have an android:defaultValue");
        L23:
            throw new IllegalArgumentException("Required argument \"EXTRA_ORDER_ID\" is missing and does not have an android:defaultValue");
        L25:
            throw new IllegalArgumentException("Required argument \"EXTRA_LAST_PRICE\" is missing and does not have an android:defaultValue");
        L27:
            throw new IllegalArgumentException("Required argument \"EXTRA_SYMBOL\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f166595g = new a(null);
    }

    public r(String r1, String r2, String r3, String r4, String r5, String r6) {
        this.f166596a = r1;
        this.f166597b = r2;
        this.f166598c = r3;
        this.d = r4;
        this.f166599e = r5;
        this.f166600f = r6;
    }

    public static final r fromBundle(Bundle r1) {
        return f166595g.a(r1);
    }

    public final String a() {
        return this.f166597b;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f166598c;
    }

    public final String d() {
        return this.f166599e;
    }

    public final String e() {
        return this.f166596a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof r) == true) goto L8;
        return false;
    L8:
        r r52 = (r) r5;
        if (kotlin.jvm.internal.p.g(this.f166596a, r52.f166596a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f166597b, r52.f166597b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f166598c, r52.f166598c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f166599e, r52.f166599e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f166600f, r52.f166600f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f166600f;
    }

    public final Bundle g() {
        Bundle r02 = new Bundle();
        r02.putString("EXTRA_SYMBOL", this.f166596a);
        r02.putString("EXTRA_LAST_PRICE", this.f166597b);
        r02.putString("EXTRA_ORDER_ID", this.f166598c);
        r02.putString("EXTRA_LOT", this.d);
        r02.putString("EXTRA_RESULT_LOT", this.f166599e);
        r02.putString("EXTRA_TOTAL_AMOUNT", this.f166600f);
        return r02;
    }

    public int hashCode() {
        String r02 = this.f166596a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f166597b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f166598c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f166599e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f166600f;
        if (r29 == null) goto L27;
        r1 = r29.hashCode();
    L27:
        return r08 + r1;
    L21:
        r28 = r27.hashCode();
        goto L22
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
        return "VirtualAmendBuyFragmentArgs(EXTRASYMBOL=" + this.f166596a + ", EXTRALASTPRICE=" + this.f166597b + ", EXTRAORDERID=" + this.f166598c + ", EXTRALOT=" + this.d + ", EXTRARESULTLOT=" + this.f166599e + ", EXTRATOTALAMOUNT=" + this.f166600f + ')';
    }
}
