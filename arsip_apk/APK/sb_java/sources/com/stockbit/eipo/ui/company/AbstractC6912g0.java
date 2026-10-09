package com.stockbit.eipo.ui.company;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* renamed from: com.stockbit.eipo.ui.company.g0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC6912g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f89517a = null;

    /* renamed from: com.stockbit.eipo.ui.company.g0$a */
    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f89518a;

        /* renamed from: b, reason: collision with root package name */
        public final int f89519b;

        public a(String r1) {
            this.f89518a = r1;
            this.f89519b = com.stockbit.eipo.f.f89095f;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("urlUnboxingEIpo", this.f89518a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f89519b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f89518a, ((a) r4).f89518a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f89518a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "ActionEIpoDetailCompanyFragmentToEIpoUnboxingFragment(urlUnboxingEIpo=" + this.f89518a + ')';
        }
    }

    /* renamed from: com.stockbit.eipo.ui.company.g0$b */
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
        f89517a = new b(null);
    }
}
