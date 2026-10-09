package com.stockbit.tradingcommunity.ui.success;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final b f149881a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f149882a;

        /* renamed from: b, reason: collision with root package name */
        public final String f149883b;

        /* renamed from: c, reason: collision with root package name */
        public final int f149884c;

        public a(String r2, String r3) {
            p.l(r3, "entryPoint");
            this.f149882a = r2;
            this.f149883b = r3;
            this.f149884c = com.stockbit.tradingcommunity.d.f148998h;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("communityCode", this.f149882a);
            r02.putString("entryPoint", this.f149883b);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f149884c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f149882a, r52.f149882a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f149883b, r52.f149883b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.f149882a;
            if (r02 != null) goto L5;
            int r03 = 0;
        L7:
            return (r03 * 31) + this.f149883b.hashCode();
        L5:
            r03 = r02.hashCode();
            goto L7
        }

        public String toString() {
            return "ActionSuccessTradingCommunityFragmentToLoadingTradingCommunityFragment(communityCode=" + this.f149882a + ", entryPoint=" + this.f149883b + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public static /* synthetic */ InterfaceC4081o0 b(b r02, String r1, String r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = "";
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = "SETTINGS";
        L9:
            return r02.a(r1, r2);
        }

        public final InterfaceC4081o0 a(String r2, String r3) {
            p.l(r3, "entryPoint");
            return new a(r2, r3);
        }

        public b() {
        }
    }

    static {
        f149881a = new b(null);
    }
}
