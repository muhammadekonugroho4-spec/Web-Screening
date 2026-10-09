package com.stockbit.profiletrading.ui.account.webview;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes10.dex */
public final class q implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f128532b = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f128533a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final q a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(q.class.getClassLoader());
            if (r3.containsKey("isFromNotification") == false) goto L5;
            boolean r32 = r3.getBoolean("isFromNotification");
        L7:
            return new q(r32);
        L5:
            r32 = false;
            goto L7
        }

        public a() {
        }
    }

    static {
        f128532b = new a(null);
    }

    public q(boolean r1) {
        this.f128533a = r1;
    }

    public static final q fromBundle(Bundle r1) {
        return f128532b.a(r1);
    }

    public final boolean a() {
        return this.f128533a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putBoolean("isFromNotification", this.f128533a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof q) == true) goto L9;
        return false;
    L9:
        if (this.f128533a == ((q) r4).f128533a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f128533a);
    }

    public String toString() {
        return "SettingStockbitTradingProfileWebviewFragmentArgs(isFromNotification=" + this.f128533a + ')';
    }
}
