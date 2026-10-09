package com.stockbit.feature.transaction.ui.buystockcompose;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes9.dex */
public final class E implements InterfaceC4094y {

    /* renamed from: f, reason: collision with root package name */
    public static final a f110482f = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f110483a;

    /* renamed from: b, reason: collision with root package name */
    public final String f110484b;

    /* renamed from: c, reason: collision with root package name */
    public final String f110485c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f110486e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final E a(Bundle r8) {
            kotlin.jvm.internal.p.l(r8, "bundle");
            r8.setClassLoader(E.class.getClassLoader());
            String r2 = "";
            if (r8.containsKey("symbol") == false) goto L9;
            String r02 = r8.getString("symbol");
            if (r02 != null) goto L11;
            throw new IllegalArgumentException("Argument \"symbol\" is marked as non-null but was passed a null value.");
        L11:
            if (r8.containsKey(AppMeasurementSdk.ConditionalUserProperty.NAME) == false) goto L17;
            String r1 = r8.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (r1 == null) goto L16;
            String r3 = r1;
        L19:
            if (r8.containsKey("buySource") == false) goto L25;
            String r12 = r8.getString("buySource");
            if (r12 == null) goto L24;
            String r4 = r12;
        L27:
            if (r8.containsKey("companyType") == false) goto L30;
            r2 = r8.getString("companyType");
            if (r2 != null) goto L30;
            throw new IllegalArgumentException("Argument \"companyType\" is marked as non-null but was passed a null value.");
        L30:
            String r5 = r2;
            if (r8.containsKey("currentOrderType") == false) goto L37;
            String r82 = r8.getString("currentOrderType");
        L39:
            return new E(r02, r3, r4, r5, r82);
        L37:
            r82 = null;
            goto L39
        L24:
            throw new IllegalArgumentException("Argument \"buySource\" is marked as non-null but was passed a null value.");
        L25:
            r4 = "";
            goto L27
        L16:
            throw new IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.");
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
        f110482f = new a(null);
    }

    public E(String r2, String r3, String r4, String r5, String r6) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r4, "buySource");
        kotlin.jvm.internal.p.l(r5, "companyType");
        this.f110483a = r2;
        this.f110484b = r3;
        this.f110485c = r4;
        this.d = r5;
        this.f110486e = r6;
    }

    public static final E fromBundle(Bundle r1) {
        return f110482f.a(r1);
    }

    public final String a() {
        return this.f110485c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f110486e;
    }

    public final String d() {
        return this.f110484b;
    }

    public final String e() {
        return this.f110483a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof E) == true) goto L8;
        return false;
    L8:
        E r52 = (E) r5;
        if (kotlin.jvm.internal.p.g(this.f110483a, r52.f110483a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f110484b, r52.f110484b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f110485c, r52.f110485c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f110486e, r52.f110486e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final Bundle f() {
        Bundle r02 = new Bundle();
        r02.putString("symbol", this.f110483a);
        r02.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f110484b);
        r02.putString("buySource", this.f110485c);
        r02.putString("companyType", this.d);
        r02.putString("currentOrderType", this.f110486e);
        return r02;
    }

    public int hashCode() {
        int r02 = ((((((this.f110483a.hashCode() * 31) + this.f110484b.hashCode()) * 31) + this.f110485c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String r1 = this.f110486e;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "BuyStockComposeFragmentArgs(symbol=" + this.f110483a + ", name=" + this.f110484b + ", buySource=" + this.f110485c + ", companyType=" + this.d + ", currentOrderType=" + this.f110486e + ')';
    }

    public /* synthetic */ E(String r2, String r3, String r4, String r5, String r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = null;
    L17:
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72);
    }
}
