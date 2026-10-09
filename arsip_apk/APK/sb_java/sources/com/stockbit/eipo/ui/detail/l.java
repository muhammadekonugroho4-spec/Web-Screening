package com.stockbit.eipo.ui.detail;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import com.stockbit.eipo.EipoEntryPoint;

/* loaded from: classes8.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final c f91087a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f91088a;

        /* renamed from: b, reason: collision with root package name */
        public final String f91089b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f91090c;
        public final int d;

        public a(String r1, String r2, boolean r3) {
            this.f91088a = r1;
            this.f91089b = r2;
            this.f91090c = r3;
            this.d = com.stockbit.eipo.f.f89099h;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("urlEIpoCompany", this.f91088a);
            r02.putString(EipoEntryPoint.EXTRA_EMITEN_CODE, this.f91089b);
            r02.putBoolean(EipoEntryPoint.EXTRA_IS_PERFORM_UNBOXING, this.f91090c);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f91088a, r52.f91088a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f91089b, r52.f91089b) == true) goto L15;
            return false;
        L15:
            if (this.f91090c == r52.f91090c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            String r02 = this.f91088a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f91089b;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return ((r04 + r1) * 31) + Boolean.hashCode(this.f91090c);
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "ActionEIpoDetailDialogFragmentToEIpoDetailCompanyFragment(urlEIpoCompany=" + this.f91088a + ", emitenCode=" + this.f91089b + ", performUnBoxing=" + this.f91090c + ')';
        }
    }

    public static final class b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f91091a;

        /* renamed from: b, reason: collision with root package name */
        public final int f91092b;

        public b(String r1) {
            this.f91091a = r1;
            this.f91092b = com.stockbit.eipo.f.f89101i;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("urlUnboxingEIpo", this.f91091a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f91092b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f91091a, ((b) r4).f91091a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f91091a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "ActionEIpoDetailDialogFragmentToEIpoUnboxingFragment(urlUnboxingEIpo=" + this.f91091a + ')';
        }
    }

    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.i r1) {
            this();
        }

        public static /* synthetic */ InterfaceC4081o0 b(c r1, String r2, String r3, boolean r4, int r5, Object r6) {
            if ((r5 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r3 = null;
        L9:
            if ((r5 & 4) == 0) goto L12;
            r4 = false;
        L12:
            return r1.a(r2, r3, r4);
        }

        public final InterfaceC4081o0 a(String r2, String r3, boolean r4) {
            return new a(r2, r3, r4);
        }

        public final InterfaceC4081o0 c(String r2) {
            return new b(r2);
        }

        public c() {
        }
    }

    static {
        f91087a = new c(null);
    }
}
