package com.stockbit.cashsweep.ui.screen.activation;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes7.dex */
public final class O0 implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f52127b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f52128a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final O0 a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(O0.class.getClassLoader());
            if (r3.containsKey("reservedAmount") == false) goto L5;
            String r32 = r3.getString("reservedAmount");
        L7:
            return new O0(r32);
        L5:
            r32 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f52127b = new a(null);
    }

    public O0(String r1) {
        this.f52128a = r1;
    }

    public static final O0 fromBundle(Bundle r1) {
        return f52127b.a(r1);
    }

    public final String a() {
        return this.f52128a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof O0) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f52128a, ((O0) r4).f52128a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f52128a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "CashSweepTnCFragmentArgs(reservedAmount=" + this.f52128a + ')';
    }
}
