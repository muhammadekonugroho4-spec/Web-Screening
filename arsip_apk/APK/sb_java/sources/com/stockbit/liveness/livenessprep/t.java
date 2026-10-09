package com.stockbit.liveness.livenessprep;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* loaded from: classes10.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final b f121163a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f121164a;

        /* renamed from: b, reason: collision with root package name */
        public final int f121165b;

        public a(boolean r1) {
            this.f121164a = r1;
            this.f121165b = ai.advance.liveness.sdk.d.f1828a;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putBoolean("backToHomePage", this.f121164a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f121165b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f121164a == ((a) r4).f121164a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f121164a);
        }

        public String toString() {
            return "ActionLivenessPreparationFragmentToLivenessLimitDialogFragment(backToHomePage=" + this.f121164a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(boolean r2) {
            return new a(r2);
        }

        public b() {
        }
    }

    static {
        f121163a = new b(null);
    }
}
