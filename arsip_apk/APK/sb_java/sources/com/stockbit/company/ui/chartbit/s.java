package com.stockbit.company.ui.chartbit;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes7.dex */
public final class s implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f64915b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f64916a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final s a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(s.class.getClassLoader());
            if (r3.containsKey("companySymbol") == false) goto L11;
            String r32 = r3.getString("companySymbol");
            if (r32 == null) goto L9;
            return new s(r32);
        L9:
            throw new IllegalArgumentException("Argument \"companySymbol\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"companySymbol\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f64915b = new a(null);
    }

    public s(String r2) {
        kotlin.jvm.internal.p.l(r2, "companySymbol");
        this.f64916a = r2;
    }

    public static final s fromBundle(Bundle r1) {
        return f64915b.a(r1);
    }

    public final String a() {
        return this.f64916a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("companySymbol", this.f64916a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof s) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f64916a, ((s) r4).f64916a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f64916a.hashCode();
    }

    public String toString() {
        return "CompanyChartbitFragmentArgs(companySymbol=" + this.f64916a + ')';
    }
}
