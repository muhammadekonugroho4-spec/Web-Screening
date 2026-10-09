package com.stockbit.eipo.ui.detail;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes8.dex */
public final class k implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f91085b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f91086a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final k a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(k.class.getClassLoader());
            if (r3.containsKey("companyCode") == false) goto L11;
            String r32 = r3.getString("companyCode");
            if (r32 == null) goto L9;
            return new k(r32);
        L9:
            throw new IllegalArgumentException("Argument \"companyCode\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"companyCode\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f91085b = new a(null);
    }

    public k(String r2) {
        kotlin.jvm.internal.p.l(r2, "companyCode");
        this.f91086a = r2;
    }

    public static final k fromBundle(Bundle r1) {
        return f91085b.a(r1);
    }

    public final String a() {
        return this.f91086a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("companyCode", this.f91086a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof k) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f91086a, ((k) r4).f91086a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f91086a.hashCode();
    }

    public String toString() {
        return "EipoDetailDialogFragmentArgs(companyCode=" + this.f91086a + ')';
    }
}
