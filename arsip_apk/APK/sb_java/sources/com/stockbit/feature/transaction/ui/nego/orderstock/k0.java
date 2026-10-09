package com.stockbit.feature.transaction.ui.nego.orderstock;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* loaded from: classes9.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f114830a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f114831a;

        /* renamed from: b, reason: collision with root package name */
        public final int f114832b;

        public a(String r2) {
            kotlin.jvm.internal.p.l(r2, "url");
            this.f114831a = r2;
            this.f114832b = com.stockbit.feature.transaction.m.f108222q;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("url", this.f114831a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f114832b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f114831a, ((a) r4).f114831a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f114831a.hashCode();
        }

        public String toString() {
            return "ActionOrderNegoStockFragmentToOrderNegoTnCFragment(url=" + this.f114831a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2) {
            kotlin.jvm.internal.p.l(r2, "url");
            return new a(r2);
        }

        public b() {
        }
    }

    static {
        f114830a = new b(null);
    }
}
