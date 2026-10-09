package com.stockbit.trading.ui.openingaccount.jago;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes11.dex */
public final class y implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f148161b = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f148162a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final y a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(y.class.getClassLoader());
            if (r3.containsKey("isSharia") == false) goto L5;
            boolean r32 = r3.getBoolean("isSharia");
        L7:
            return new y(r32);
        L5:
            r32 = false;
            goto L7
        }

        public a() {
        }
    }

    static {
        f148161b = new a(null);
    }

    public y(boolean r1) {
        this.f148162a = r1;
    }

    public static final y fromBundle(Bundle r1) {
        return f148161b.a(r1);
    }

    public final boolean a() {
        return this.f148162a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof y) == true) goto L9;
        return false;
    L9:
        if (this.f148162a == ((y) r4).f148162a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f148162a);
    }

    public String toString() {
        return "RegisterTradingJagoActivationFragmentArgs(isSharia=" + this.f148162a + ')';
    }
}
