package com.stockbit.withdrawaldeposit.ui.history;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes2.dex */
public final class k implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f172681b = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f172682a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final k a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(k.class.getClassLoader());
            if (r3.containsKey("openWithdrawalHistory") == false) goto L5;
            boolean r32 = r3.getBoolean("openWithdrawalHistory");
        L7:
            return new k(r32);
        L5:
            r32 = false;
            goto L7
        }

        public a() {
        }
    }

    static {
        f172681b = new a(null);
    }

    public k(boolean r1) {
        this.f172682a = r1;
    }

    public static final k fromBundle(Bundle r1) {
        return f172681b.a(r1);
    }

    public final boolean a() {
        return this.f172682a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putBoolean("openWithdrawalHistory", this.f172682a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof k) == true) goto L9;
        return false;
    L9:
        if (this.f172682a == ((k) r4).f172682a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f172682a);
    }

    public String toString() {
        return "SettingHistoryFragmentArgs(openWithdrawalHistory=" + this.f172682a + ')';
    }
}
