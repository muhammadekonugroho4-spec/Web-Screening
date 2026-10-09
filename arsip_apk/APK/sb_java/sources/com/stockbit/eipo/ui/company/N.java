package com.stockbit.eipo.ui.company;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* loaded from: classes8.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    public static final b f89391a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f89392a;

        /* renamed from: b, reason: collision with root package name */
        public final int f89393b;

        public a(String r2) {
            kotlin.jvm.internal.p.l(r2, "companyCode");
            this.f89392a = r2;
            this.f89393b = com.stockbit.eipo.f.f89090c;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("companyCode", this.f89392a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f89393b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f89392a, ((a) r4).f89392a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f89392a.hashCode();
        }

        public String toString() {
            return "ActionEIpoCompanyFragmentToEIpoDetailDialogFragment(companyCode=" + this.f89392a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2) {
            kotlin.jvm.internal.p.l(r2, "companyCode");
            return new a(r2);
        }

        public b() {
        }
    }

    static {
        f89391a = new b(null);
    }
}
