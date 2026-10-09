package com.stockbit.feature.insider.ui.search;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* loaded from: classes9.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f99064a = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "insiderId");
            kotlin.jvm.internal.p.l(r3, "insiderName");
            return new b(r2, r3);
        }

        public a() {
        }
    }

    public static final class b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f99065a;

        /* renamed from: b, reason: collision with root package name */
        public final String f99066b;

        /* renamed from: c, reason: collision with root package name */
        public final int f99067c;

        public b(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "insiderId");
            kotlin.jvm.internal.p.l(r3, "insiderName");
            this.f99065a = r2;
            this.f99066b = r3;
            this.f99067c = com.stockbit.feature.insider.d.f98477f;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("insiderId", this.f99065a);
            r02.putString("insiderName", this.f99066b);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f99067c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f99065a, r52.f99065a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f99066b, r52.f99066b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f99065a.hashCode() * 31) + this.f99066b.hashCode();
        }

        public String toString() {
            return "ToInsiderDetailComposeFragment(insiderId=" + this.f99065a + ", insiderName=" + this.f99066b + ')';
        }
    }

    static {
        f99064a = new a(null);
    }
}
