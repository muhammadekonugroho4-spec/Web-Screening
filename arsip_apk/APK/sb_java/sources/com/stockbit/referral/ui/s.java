package com.stockbit.referral.ui;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* loaded from: classes10.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final b f129049a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f129050a;

        /* renamed from: b, reason: collision with root package name */
        public final String f129051b;

        /* renamed from: c, reason: collision with root package name */
        public final int f129052c;

        public a(boolean r2, String r3) {
            kotlin.jvm.internal.p.l(r3, "termsId");
            this.f129050a = r2;
            this.f129051b = r3;
            this.f129052c = com.stockbit.referral.c.f128588a;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putBoolean("isFromSpinner", this.f129050a);
            r02.putString("termsId", this.f129051b);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f129052c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f129050a == r52.f129050a) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f129051b, r52.f129051b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f129050a) * 31) + this.f129051b.hashCode();
        }

        public String toString() {
            return "ActionMainSpinWheelFragmentToAgreementFragment(isFromSpinner=" + this.f129050a + ", termsId=" + this.f129051b + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(boolean r2, String r3) {
            kotlin.jvm.internal.p.l(r3, "termsId");
            return new a(r2, r3);
        }

        public b() {
        }
    }

    static {
        f129049a = new b(null);
    }
}
