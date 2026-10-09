package com.stockbit.withdrawaldeposit.ui.withdrawal.dialog;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes2.dex */
public final class u implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f173132b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f173133a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final u a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(u.class.getClassLoader());
            if (r3.containsKey("extraWithdrawalMessage") == false) goto L7;
            return new u(r3.getString("extraWithdrawalMessage"));
        L7:
            throw new IllegalArgumentException("Required argument \"extraWithdrawalMessage\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f173132b = new a(null);
    }

    public u(String r1) {
        this.f173133a = r1;
    }

    public static final u fromBundle(Bundle r1) {
        return f173132b.a(r1);
    }

    public final String a() {
        return this.f173133a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof u) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f173133a, ((u) r4).f173133a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f173133a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "SettingWithdrawConfirmationFailedDialogFragmentArgs(extraWithdrawalMessage=" + this.f173133a + ')';
    }
}
