package com.stockbit.cashsweep.ui.screen.activation;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* loaded from: classes7.dex */
public abstract class P0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f52132a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f52133a;

        /* renamed from: b, reason: collision with root package name */
        public final int f52134b;

        public a(String r1) {
            this.f52133a = r1;
            this.f52134b = com.stockbit.cashsweep.d.f51863e;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("url", this.f52133a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f52134b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f52133a, ((a) r4).f52133a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f52133a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "ActionCashSweepTnCFragmentToCashSweepActivationWebViewFragment(url=" + this.f52133a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2) {
            return new a(r2);
        }

        public b() {
        }
    }

    static {
        f52132a = new b(null);
    }
}
