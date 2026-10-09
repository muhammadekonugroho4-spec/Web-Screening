package com.stockbit.feature.trusteddevice.ui.login.verifyidentity;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f118423a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f118424a;

        /* renamed from: b, reason: collision with root package name */
        public final int f118425b;

        public a(String r2) {
            p.l(r2, "token");
            this.f118424a = r2;
            this.f118425b = com.stockbit.feature.trusteddevice.c.f117762g;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("token", this.f118424a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f118425b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f118424a, ((a) r4).f118424a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f118424a.hashCode();
        }

        public String toString() {
            return "ActionLoginVerifyIdentityFragmentToLoginVerifyPasswordFragment(token=" + this.f118424a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2) {
            p.l(r2, "token");
            return new a(r2);
        }

        public b() {
        }
    }

    static {
        f118423a = new b(null);
    }
}
