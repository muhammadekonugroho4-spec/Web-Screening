package com.stockbit.onboarding.ui.forgotpassword.newpassword;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f123594a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f123595a;

        /* renamed from: b, reason: collision with root package name */
        public final int f123596b;

        public a(String r2) {
            p.l(r2, "token");
            this.f123595a = r2;
            this.f123596b = com.stockbit.onboarding.f.f123298b;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("token", this.f123595a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f123596b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f123595a, ((a) r4).f123595a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f123595a.hashCode();
        }

        public String toString() {
            return "ActionForgotPasswordNewInputFragmentToForgotPasswordConfirmInputFragment(token=" + this.f123595a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
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
        f123594a = new b(null);
    }
}
