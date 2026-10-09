package com.stockbit.feature.transferasset.presentation.fragment;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes9.dex */
public final class x implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f117275b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f117276a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final x a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(x.class.getClassLoader());
            if (r3.containsKey("currentAccountNo") == false) goto L11;
            String r32 = r3.getString("currentAccountNo");
            if (r32 == null) goto L9;
            return new x(r32);
        L9:
            throw new IllegalArgumentException("Argument \"currentAccountNo\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"currentAccountNo\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f117275b = new a(null);
    }

    public x(String r2) {
        kotlin.jvm.internal.p.l(r2, "currentAccountNo");
        this.f117276a = r2;
    }

    public static final x fromBundle(Bundle r1) {
        return f117275b.a(r1);
    }

    public final Bundle a() {
        Bundle r02 = new Bundle();
        r02.putString("currentAccountNo", this.f117276a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof x) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f117276a, ((x) r4).f117276a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f117276a.hashCode();
    }

    public String toString() {
        return "TransferStockComposeFragmentArgs(currentAccountNo=" + this.f117276a + ')';
    }
}
