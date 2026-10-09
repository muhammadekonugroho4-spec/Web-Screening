package com.stockbit.trading.ui.openingaccount.preparation.password.create;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import com.stockbit.trading.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1347b f148366a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f148367a;

        /* renamed from: b, reason: collision with root package name */
        public final int f148368b;

        public a(String r2) {
            p.l(r2, "newPassword");
            this.f148367a = r2;
            this.f148368b = h.f146980p;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("newPassword", this.f148367a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f148368b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f148367a, ((a) r4).f148367a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f148367a.hashCode();
        }

        public String toString() {
            return "ActionRegistrationPreparationCreatePasswordFragmentToRegistrationPreparationConfirmPasswordFragment(newPassword=" + this.f148367a + ')';
        }
    }

    /* renamed from: com.stockbit.trading.ui.openingaccount.preparation.password.create.b$b, reason: collision with other inner class name */
    public static final class C1347b {
        public /* synthetic */ C1347b(i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2) {
            p.l(r2, "newPassword");
            return new a(r2);
        }

        public C1347b() {
        }
    }

    static {
        f148366a = new C1347b(null);
    }
}
