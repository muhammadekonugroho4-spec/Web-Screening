package com.stockbit.amendbank.ui.bankaccount;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes6.dex */
public final class d implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f46206c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f46207a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46208b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final d a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(d.class.getClassLoader());
            if (r4.containsKey("currentEmail") == false) goto L15;
            String r02 = r4.getString("currentEmail");
            if (r4.containsKey("changeToken") == false) goto L13;
            String r42 = r4.getString("changeToken");
            if (r42 == null) goto L11;
            return new d(r02, r42);
        L11:
            throw new IllegalArgumentException("Argument \"changeToken\" is marked as non-null but was passed a null value.");
        L13:
            throw new IllegalArgumentException("Required argument \"changeToken\" is missing and does not have an android:defaultValue");
        L15:
            throw new IllegalArgumentException("Required argument \"currentEmail\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f46206c = new a(null);
    }

    public d(String r2, String r3) {
        kotlin.jvm.internal.p.l(r3, "changeToken");
        this.f46207a = r2;
        this.f46208b = r3;
    }

    public static final d fromBundle(Bundle r1) {
        return f46206c.a(r1);
    }

    public final String a() {
        return this.f46208b;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("currentEmail", this.f46207a);
        r02.putString("changeToken", this.f46208b);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (kotlin.jvm.internal.p.g(this.f46207a, r52.f46207a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f46208b, r52.f46208b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f46207a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + this.f46208b.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "AmendBankListFragmentArgs(currentEmail=" + this.f46207a + ", changeToken=" + this.f46208b + ')';
    }
}
