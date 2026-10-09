package com.stockbit.feature.trusteddevice.ui.change.waitingapproval;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f118194a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f118195a;

        /* renamed from: b, reason: collision with root package name */
        public final int f118196b;

        public a(String r2) {
            p.l(r2, "token");
            this.f118195a = r2;
            this.f118196b = com.stockbit.feature.trusteddevice.c.d;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("token", this.f118195a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f118196b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f118195a, ((a) r4).f118195a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f118195a.hashCode();
        }

        public String toString() {
            return "ActionChangeWaitingApprovalFragmentToChangeVerifyIdentityFragment(token=" + this.f118195a + ')';
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
        f118194a = new b(null);
    }
}
