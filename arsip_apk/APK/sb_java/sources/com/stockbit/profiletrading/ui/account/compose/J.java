package com.stockbit.profiletrading.ui.account.compose;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* loaded from: classes10.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final b f128315a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f128316a;

        /* renamed from: b, reason: collision with root package name */
        public final int f128317b;

        public a(boolean r1) {
            this.f128316a = r1;
            this.f128317b = com.stockbit.profiletrading.c.f128088g;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putBoolean("isFromNotification", this.f128316a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f128317b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f128316a == ((a) r4).f128316a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f128316a);
        }

        public String toString() {
            return "ActionTradingProfileFragmentComposeToSettingStockbitTradingProfileWebviewFragment(isFromNotification=" + this.f128316a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public static /* synthetic */ InterfaceC4081o0 b(b r02, boolean r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = false;
        L6:
            return r02.a(r1);
        }

        public final InterfaceC4081o0 a(boolean r2) {
            return new a(r2);
        }

        public b() {
        }
    }

    static {
        f128315a = new b(null);
    }
}
