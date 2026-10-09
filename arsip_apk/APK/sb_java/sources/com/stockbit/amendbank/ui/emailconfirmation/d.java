package com.stockbit.amendbank.ui.emailconfirmation;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f46301a = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2) {
            p.l(r2, "changeToken");
            return new b(r2);
        }

        public a() {
        }
    }

    public static final class b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f46302a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46303b;

        public b(String r2) {
            p.l(r2, "changeToken");
            this.f46302a = r2;
            this.f46303b = com.stockbit.amendbank.c.f45894m0;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("changeToken", this.f46302a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f46303b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f46302a, ((b) r4).f46302a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f46302a.hashCode();
        }

        public String toString() {
            return "ToInputAccountNumber(changeToken=" + this.f46302a + ')';
        }
    }

    static {
        f46301a = new a(null);
    }
}
