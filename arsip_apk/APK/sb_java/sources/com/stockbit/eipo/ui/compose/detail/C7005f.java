package com.stockbit.eipo.ui.compose.detail;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* renamed from: com.stockbit.eipo.ui.compose.detail.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7005f implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f89914a;

    /* renamed from: b, reason: collision with root package name */
    public final String f89915b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f89916c;

    /* renamed from: com.stockbit.eipo.ui.compose.detail.f$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C7005f a(Bundle r5) {
            kotlin.jvm.internal.p.l(r5, "bundle");
            r5.setClassLoader(C7005f.class.getClassLoader());
            if (r5.containsKey("companyCode") == false) goto L23;
            String r02 = r5.getString("companyCode");
            if (r02 == null) goto L21;
            if (r5.containsKey("eipoType") == false) goto L19;
            String r1 = r5.getString("eipoType");
            if (r1 == null) goto L17;
            if (r5.containsKey("performUnboxing") == false) goto L13;
            boolean r52 = r5.getBoolean("performUnboxing");
        L15:
            return new C7005f(r02, r1, r52);
        L13:
            r52 = false;
            goto L15
        L17:
            throw new IllegalArgumentException("Argument \"eipoType\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"eipoType\" is missing and does not have an android:defaultValue");
        L21:
            throw new IllegalArgumentException("Argument \"companyCode\" is marked as non-null but was passed a null value.");
        L23:
            throw new IllegalArgumentException("Required argument \"companyCode\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public C7005f(String r2, String r3, boolean r4) {
        kotlin.jvm.internal.p.l(r2, "companyCode");
        kotlin.jvm.internal.p.l(r3, "eipoType");
        this.f89914a = r2;
        this.f89915b = r3;
        this.f89916c = r4;
    }

    public static final C7005f fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f89914a;
    }

    public final String b() {
        return this.f89915b;
    }

    public final boolean c() {
        return this.f89916c;
    }

    public final Bundle d() {
        Bundle r02 = new Bundle();
        r02.putString("companyCode", this.f89914a);
        r02.putString("eipoType", this.f89915b);
        r02.putBoolean("performUnboxing", this.f89916c);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C7005f) == true) goto L8;
        return false;
    L8:
        C7005f r52 = (C7005f) r5;
        if (kotlin.jvm.internal.p.g(this.f89914a, r52.f89914a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f89915b, r52.f89915b) == true) goto L15;
        return false;
    L15:
        if (this.f89916c == r52.f89916c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f89914a.hashCode() * 31) + this.f89915b.hashCode()) * 31) + Boolean.hashCode(this.f89916c);
    }

    public String toString() {
        return "EIpoDetailComposeFragmentArgs(companyCode=" + this.f89914a + ", eipoType=" + this.f89915b + ", performUnboxing=" + this.f89916c + ')';
    }
}
