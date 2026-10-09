package com.stockbit.eipo.ui.deeplink;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a implements InterfaceC4094y {
    public static final C0869a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f90992a;

    /* renamed from: b, reason: collision with root package name */
    public final String f90993b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f90994c;

    /* renamed from: com.stockbit.eipo.ui.deeplink.a$a, reason: collision with other inner class name */
    public static final class C0869a {
        public /* synthetic */ C0869a(i r1) {
            this();
        }

        public final a a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(a.class.getClassLoader());
            if (r5.containsKey("companyCode") == false) goto L23;
            String r02 = r5.getString("companyCode");
            if (r02 == null) goto L21;
            if (r5.containsKey("eipoType") == false) goto L19;
            String r1 = r5.getString("eipoType");
            if (r1 == null) goto L17;
            if (r5.containsKey("performUnboxing") == false) goto L13;
            boolean r52 = r5.getBoolean("performUnboxing");
        L15:
            return new a(r02, r1, r52);
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

        public C0869a() {
        }
    }

    static {
        d = new C0869a(null);
    }

    public a(String r2, String r3, boolean r4) {
        p.l(r2, "companyCode");
        p.l(r3, "eipoType");
        this.f90992a = r2;
        this.f90993b = r3;
        this.f90994c = r4;
    }

    public static final a fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f90992a;
    }

    public final String b() {
        return this.f90993b;
    }

    public final boolean c() {
        return this.f90994c;
    }

    public final Bundle d() {
        Bundle r02 = new Bundle();
        r02.putString("companyCode", this.f90992a);
        r02.putString("eipoType", this.f90993b);
        r02.putBoolean("performUnboxing", this.f90994c);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f90992a, r52.f90992a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f90993b, r52.f90993b) == true) goto L15;
        return false;
    L15:
        if (this.f90994c == r52.f90994c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f90992a.hashCode() * 31) + this.f90993b.hashCode()) * 31) + Boolean.hashCode(this.f90994c);
    }

    public String toString() {
        return "EIpoDeeplinkRouterFragmentArgs(companyCode=" + this.f90992a + ", eipoType=" + this.f90993b + ", performUnboxing=" + this.f90994c + ')';
    }
}
