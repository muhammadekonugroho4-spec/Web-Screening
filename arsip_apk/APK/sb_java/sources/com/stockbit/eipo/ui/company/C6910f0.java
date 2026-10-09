package com.stockbit.eipo.ui.company;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.eipo.EipoEntryPoint;

/* renamed from: com.stockbit.eipo.ui.company.f0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6910f0 implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f89514a;

    /* renamed from: b, reason: collision with root package name */
    public final String f89515b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f89516c;

    /* renamed from: com.stockbit.eipo.ui.company.f0$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C6910f0 a(Bundle r5) {
            kotlin.jvm.internal.p.l(r5, "bundle");
            r5.setClassLoader(C6910f0.class.getClassLoader());
            String r2 = null;
            if (r5.containsKey("urlEIpoCompany") == false) goto L5;
            String r02 = r5.getString("urlEIpoCompany");
        L7:
            if (r5.containsKey(EipoEntryPoint.EXTRA_EMITEN_CODE) == false) goto L10;
            r2 = r5.getString(EipoEntryPoint.EXTRA_EMITEN_CODE);
        L10:
            if (r5.containsKey(EipoEntryPoint.EXTRA_IS_PERFORM_UNBOXING) == false) goto L12;
            boolean r52 = r5.getBoolean(EipoEntryPoint.EXTRA_IS_PERFORM_UNBOXING);
        L14:
            return new C6910f0(r02, r2, r52);
        L12:
            r52 = false;
            goto L14
        L5:
            r02 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public C6910f0(String r1, String r2, boolean r3) {
        this.f89514a = r1;
        this.f89515b = r2;
        this.f89516c = r3;
    }

    public static final C6910f0 fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f89515b;
    }

    public final boolean b() {
        return this.f89516c;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("urlEIpoCompany", this.f89514a);
        r02.putString(EipoEntryPoint.EXTRA_EMITEN_CODE, this.f89515b);
        r02.putBoolean(EipoEntryPoint.EXTRA_IS_PERFORM_UNBOXING, this.f89516c);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C6910f0) == true) goto L8;
        return false;
    L8:
        C6910f0 r52 = (C6910f0) r5;
        if (kotlin.jvm.internal.p.g(this.f89514a, r52.f89514a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f89515b, r52.f89515b) == true) goto L15;
        return false;
    L15:
        if (this.f89516c == r52.f89516c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f89514a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f89515b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return ((r04 + r1) * 31) + Boolean.hashCode(this.f89516c);
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "EIpoDetailCompanyFragmentArgs(urlEIpoCompany=" + this.f89514a + ", emitenCode=" + this.f89515b + ", performUnBoxing=" + this.f89516c + ')';
    }
}
