package com.stockbit.feature.portfolio.presentation.detail;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* loaded from: classes9.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    public static final b f105070a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f105071a;

        /* renamed from: b, reason: collision with root package name */
        public final String f105072b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f105073c;
        public final boolean d;

        /* renamed from: e, reason: collision with root package name */
        public final int f105074e;

        public a(String r2, String r3, boolean r4, boolean r5) {
            kotlin.jvm.internal.p.l(r2, "symbol");
            kotlin.jvm.internal.p.l(r3, "tradeType");
            this.f105071a = r2;
            this.f105072b = r3;
            this.f105073c = r4;
            this.d = r5;
            this.f105074e = com.stockbit.feature.portfolio.h.f104611j;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("symbol", this.f105071a);
            r02.putString("tradeType", this.f105072b);
            r02.putBoolean("isFromOrderList", this.f105073c);
            r02.putBoolean("useCompleteView", this.d);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f105074e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f105071a, r52.f105071a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f105072b, r52.f105072b) == true) goto L15;
            return false;
        L15:
            if (this.f105073c == r52.f105073c) goto L18;
            return false;
        L18:
            if (this.d == r52.d) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((this.f105071a.hashCode() * 31) + this.f105072b.hashCode()) * 31) + Boolean.hashCode(this.f105073c)) * 31) + Boolean.hashCode(this.d);
        }

        public String toString() {
            return "ActionPortfolioStocksDetailFragmentToPortfolioOrderlistHistoryFragment(symbol=" + this.f105071a + ", tradeType=" + this.f105072b + ", isFromOrderList=" + this.f105073c + ", useCompleteView=" + this.d + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public static /* synthetic */ InterfaceC4081o0 b(b r02, String r1, String r2, boolean r3, boolean r4, int r5, Object r6) {
            if ((r5 & 8) == 0) goto L6;
            r4 = false;
        L6:
            return r02.a(r1, r2, r3, r4);
        }

        public final InterfaceC4081o0 a(String r2, String r3, boolean r4, boolean r5) {
            kotlin.jvm.internal.p.l(r2, "symbol");
            kotlin.jvm.internal.p.l(r3, "tradeType");
            return new a(r2, r3, r4, r5);
        }

        public b() {
        }
    }

    static {
        f105070a = new b(null);
    }
}
