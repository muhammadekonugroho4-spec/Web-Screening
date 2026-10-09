package com.stockbit.eipo.ui.deeplink;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import com.stockbit.eipo.EipoEntryPoint;
import com.stockbit.eipo.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final c f90995a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f90996a;

        /* renamed from: b, reason: collision with root package name */
        public final String f90997b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f90998c;
        public final int d;

        public a(String r1, String r2, boolean r3) {
            this.f90996a = r1;
            this.f90997b = r2;
            this.f90998c = r3;
            this.d = f.d;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("urlEIpoCompany", this.f90996a);
            r02.putString(EipoEntryPoint.EXTRA_EMITEN_CODE, this.f90997b);
            r02.putBoolean(EipoEntryPoint.EXTRA_IS_PERFORM_UNBOXING, this.f90998c);
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
            if (p.g(this.f90996a, r52.f90996a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f90997b, r52.f90997b) == true) goto L15;
            return false;
        L15:
            if (this.f90998c == r52.f90998c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            String r02 = this.f90996a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f90997b;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return ((r04 + r1) * 31) + Boolean.hashCode(this.f90998c);
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "ActionEIpoDeeplinkRouterFragmentToEIpoDetailCompanyFragment(urlEIpoCompany=" + this.f90996a + ", emitenCode=" + this.f90997b + ", performUnBoxing=" + this.f90998c + ')';
        }
    }

    /* renamed from: com.stockbit.eipo.ui.deeplink.b$b, reason: collision with other inner class name */
    public static final class C0870b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f90999a;

        /* renamed from: b, reason: collision with root package name */
        public final String f91000b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f91001c;
        public final int d;

        public C0870b(String r2, String r3, boolean r4) {
            p.l(r2, "companyCode");
            p.l(r3, "eipoType");
            this.f90999a = r2;
            this.f91000b = r3;
            this.f91001c = r4;
            this.d = f.f89093e;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("companyCode", this.f90999a);
            r02.putString("eipoType", this.f91000b);
            r02.putBoolean("performUnboxing", this.f91001c);
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
            if ((r5 instanceof C0870b) == true) goto L8;
            return false;
        L8:
            C0870b r52 = (C0870b) r5;
            if (p.g(this.f90999a, r52.f90999a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f91000b, r52.f91000b) == true) goto L15;
            return false;
        L15:
            if (this.f91001c == r52.f91001c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f90999a.hashCode() * 31) + this.f91000b.hashCode()) * 31) + Boolean.hashCode(this.f91001c);
        }

        public String toString() {
            return "ActionEIpoDeeplinkRouterFragmentToEIpoDetailComposeFragment(companyCode=" + this.f90999a + ", eipoType=" + this.f91000b + ", performUnboxing=" + this.f91001c + ')';
        }
    }

    public static final class c {
        public /* synthetic */ c(i r1) {
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

        public final InterfaceC4081o0 c(String r2, String r3, boolean r4) {
            p.l(r2, "companyCode");
            p.l(r3, "eipoType");
            return new C0870b(r2, r3, r4);
        }

        public c() {
        }
    }

    static {
        f90995a = new c(null);
    }
}
