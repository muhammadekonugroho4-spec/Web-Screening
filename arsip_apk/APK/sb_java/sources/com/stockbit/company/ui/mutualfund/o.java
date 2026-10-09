package com.stockbit.company.ui.mutualfund;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes7.dex */
public final class o implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f66494b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f66495a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final o a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(o.class.getClassLoader());
            if (r3.containsKey("companySymbol") == false) goto L11;
            String r32 = r3.getString("companySymbol");
            if (r32 == null) goto L9;
            return new o(r32);
        L9:
            throw new IllegalArgumentException("Argument \"companySymbol\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"companySymbol\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f66494b = new a(null);
    }

    public o(String r2) {
        kotlin.jvm.internal.p.l(r2, "companySymbol");
        this.f66495a = r2;
    }

    public static final o fromBundle(Bundle r1) {
        return f66494b.a(r1);
    }

    public final Bundle a() {
        Bundle r02 = new Bundle();
        r02.putString("companySymbol", this.f66495a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof o) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f66495a, ((o) r4).f66495a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f66495a.hashCode();
    }

    public String toString() {
        return "MutualFundFragmentArgs(companySymbol=" + this.f66495a + ')';
    }
}
