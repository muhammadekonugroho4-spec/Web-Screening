package com.stockbit.cashsweep.ui.screen.activation;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* renamed from: com.stockbit.cashsweep.ui.screen.activation.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5234p implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f52224b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f52225a;

    /* renamed from: com.stockbit.cashsweep.ui.screen.activation.p$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C5234p a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(C5234p.class.getClassLoader());
            if (r3.containsKey("cashOnHand") == false) goto L5;
            String r32 = r3.getString("cashOnHand");
        L7:
            return new C5234p(r32);
        L5:
            r32 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f52224b = new a(null);
    }

    public C5234p(String r1) {
        this.f52225a = r1;
    }

    public static final C5234p fromBundle(Bundle r1) {
        return f52224b.a(r1);
    }

    public final String a() {
        return this.f52225a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C5234p) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f52225a, ((C5234p) r4).f52225a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f52225a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "CashSweepReverseCashFragmentArgs(cashOnHand=" + this.f52225a + ')';
    }
}
