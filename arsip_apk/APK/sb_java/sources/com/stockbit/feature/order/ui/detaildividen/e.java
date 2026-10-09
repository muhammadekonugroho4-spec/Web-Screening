package com.stockbit.feature.order.ui.detaildividen;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f101421e = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f101422a;

    /* renamed from: b, reason: collision with root package name */
    public final String f101423b;

    /* renamed from: c, reason: collision with root package name */
    public final String f101424c;
    public final String d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a(Bundle r6) {
            p.l(r6, "bundle");
            r6.setClassLoader(e.class.getClassLoader());
            if (r6.containsKey(Constants.KEY_ID) == false) goto L35;
            String r02 = r6.getString(Constants.KEY_ID);
            if (r02 == null) goto L33;
            if (r6.containsKey("companySymbol") == false) goto L31;
            String r1 = r6.getString("companySymbol");
            if (r1 == null) goto L29;
            if (r6.containsKey("companyName") == false) goto L27;
            String r2 = r6.getString("companyName");
            if (r2 == null) goto L25;
            if (r6.containsKey("companyIconUrl") == false) goto L23;
            String r62 = r6.getString("companyIconUrl");
            if (r62 == null) goto L21;
            return new e(r02, r1, r2, r62);
        L21:
            throw new IllegalArgumentException("Argument \"companyIconUrl\" is marked as non-null but was passed a null value.");
        L23:
            throw new IllegalArgumentException("Required argument \"companyIconUrl\" is missing and does not have an android:defaultValue");
        L25:
            throw new IllegalArgumentException("Argument \"companyName\" is marked as non-null but was passed a null value.");
        L27:
            throw new IllegalArgumentException("Required argument \"companyName\" is missing and does not have an android:defaultValue");
        L29:
            throw new IllegalArgumentException("Argument \"companySymbol\" is marked as non-null but was passed a null value.");
        L31:
            throw new IllegalArgumentException("Required argument \"companySymbol\" is missing and does not have an android:defaultValue");
        L33:
            throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
        L35:
            throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f101421e = new a(null);
    }

    public e(String r2, String r3, String r4, String r5) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "companySymbol");
        p.l(r4, "companyName");
        p.l(r5, "companyIconUrl");
        this.f101422a = r2;
        this.f101423b = r3;
        this.f101424c = r4;
        this.d = r5;
    }

    public static final e fromBundle(Bundle r1) {
        return f101421e.a(r1);
    }

    public final String a() {
        return this.f101424c;
    }

    public final String b() {
        return this.f101423b;
    }

    public final String c() {
        return this.f101422a;
    }

    public final Bundle d() {
        Bundle r02 = new Bundle();
        r02.putString(Constants.KEY_ID, this.f101422a);
        r02.putString("companySymbol", this.f101423b);
        r02.putString("companyName", this.f101424c);
        r02.putString("companyIconUrl", this.d);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f101422a, r52.f101422a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f101423b, r52.f101423b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f101424c, r52.f101424c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f101422a.hashCode() * 31) + this.f101423b.hashCode()) * 31) + this.f101424c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "DividendOrderDetailComposeFragmentArgs(id=" + this.f101422a + ", companySymbol=" + this.f101423b + ", companyName=" + this.f101424c + ", companyIconUrl=" + this.d + ')';
    }
}
