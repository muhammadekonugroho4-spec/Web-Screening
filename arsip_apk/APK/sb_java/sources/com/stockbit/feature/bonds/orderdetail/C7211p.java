package com.stockbit.feature.bonds.orderdetail;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* renamed from: com.stockbit.feature.bonds.orderdetail.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7211p implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f92469b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f92470a;

    /* renamed from: com.stockbit.feature.bonds.orderdetail.p$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C7211p a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(C7211p.class.getClassLoader());
            if (r3.containsKey("orderId") == false) goto L11;
            String r32 = r3.getString("orderId");
            if (r32 == null) goto L9;
            return new C7211p(r32);
        L9:
            throw new IllegalArgumentException("Argument \"orderId\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f92469b = new a(null);
    }

    public C7211p(String r2) {
        kotlin.jvm.internal.p.l(r2, "orderId");
        this.f92470a = r2;
    }

    public static final C7211p fromBundle(Bundle r1) {
        return f92469b.a(r1);
    }

    public final String a() {
        return this.f92470a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("orderId", this.f92470a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C7211p) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f92470a, ((C7211p) r4).f92470a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f92470a.hashCode();
    }

    public String toString() {
        return "BondOrderDetailComposeFragmentArgs(orderId=" + this.f92470a + ')';
    }
}
