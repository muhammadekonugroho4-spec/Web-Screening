package com.stockbit.cashsweep.ui.screen.cashsweep;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes7.dex */
public final class p0 implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f52650b = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f52651a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final p0 a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(p0.class.getClassLoader());
            if (r3.containsKey("isToggleVisible") == false) goto L5;
            boolean r32 = r3.getBoolean("isToggleVisible");
        L7:
            return new p0(r32);
        L5:
            r32 = true;
            goto L7
        }

        public a() {
        }
    }

    static {
        f52650b = new a(null);
    }

    public p0(boolean r1) {
        this.f52651a = r1;
    }

    public static final p0 fromBundle(Bundle r1) {
        return f52650b.a(r1);
    }

    public final boolean a() {
        return this.f52651a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putBoolean("isToggleVisible", this.f52651a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof p0) == true) goto L9;
        return false;
    L9:
        if (this.f52651a == ((p0) r4).f52651a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f52651a);
    }

    public String toString() {
        return "CashSweepComposeFragmentArgs(isToggleVisible=" + this.f52651a + ')';
    }
}
