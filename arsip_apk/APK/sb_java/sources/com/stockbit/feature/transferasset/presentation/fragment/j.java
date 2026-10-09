package com.stockbit.feature.transferasset.presentation.fragment;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes9.dex */
public final class j implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f117263b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f117264a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final j a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(j.class.getClassLoader());
            if (r3.containsKey("currentAccountNo") == false) goto L11;
            String r32 = r3.getString("currentAccountNo");
            if (r32 == null) goto L9;
            return new j(r32);
        L9:
            throw new IllegalArgumentException("Argument \"currentAccountNo\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"currentAccountNo\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f117263b = new a(null);
    }

    public j(String r2) {
        kotlin.jvm.internal.p.l(r2, "currentAccountNo");
        this.f117264a = r2;
    }

    public static final j fromBundle(Bundle r1) {
        return f117263b.a(r1);
    }

    public final Bundle a() {
        Bundle r02 = new Bundle();
        r02.putString("currentAccountNo", this.f117264a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof j) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f117264a, ((j) r4).f117264a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f117264a.hashCode();
    }

    public String toString() {
        return "TransferCashComposeFragmentArgs(currentAccountNo=" + this.f117264a + ')';
    }
}
