package com.stockbit.onboarding.ui.forgotpassword.inputemail;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* loaded from: classes10.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final b f123553a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f123554a;

        /* renamed from: b, reason: collision with root package name */
        public final int f123555b;

        public a(String r2) {
            kotlin.jvm.internal.p.l(r2, "email");
            this.f123554a = r2;
            this.f123555b = com.stockbit.onboarding.f.f123296a;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("email", this.f123554a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f123555b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f123554a, ((a) r4).f123554a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f123554a.hashCode();
        }

        public String toString() {
            return "ActionForgotPasswordInputEmailFragmentToForgotPasswordOTPFragment(email=" + this.f123554a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2) {
            kotlin.jvm.internal.p.l(r2, "email");
            return new a(r2);
        }

        public b() {
        }
    }

    static {
        f123553a = new b(null);
    }
}
