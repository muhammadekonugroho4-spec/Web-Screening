package com.stockbit.multiplatformfacematch.ui;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* loaded from: classes10.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final b f122299a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f122300a;

        /* renamed from: b, reason: collision with root package name */
        public final int f122301b;

        public a(String r2) {
            kotlin.jvm.internal.p.l(r2, "useCase");
            this.f122300a = r2;
            this.f122301b = com.stockbit.multiplatformfacematch.d.f122262a;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("useCase", this.f122300a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f122301b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f122300a, ((a) r4).f122300a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f122300a.hashCode();
        }

        public String toString() {
            return "ActionMultiPlatformFaceMatchToSuccess(useCase=" + this.f122300a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2) {
            kotlin.jvm.internal.p.l(r2, "useCase");
            return new a(r2);
        }

        public b() {
        }
    }

    static {
        f122299a = new b(null);
    }
}
