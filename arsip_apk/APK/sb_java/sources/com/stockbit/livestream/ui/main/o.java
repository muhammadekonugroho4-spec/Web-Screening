package com.stockbit.livestream.ui.main;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* loaded from: classes10.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final b f121863a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f121864a;

        /* renamed from: b, reason: collision with root package name */
        public final String f121865b;

        /* renamed from: c, reason: collision with root package name */
        public final int f121866c;

        public a(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "liveStreamId");
            kotlin.jvm.internal.p.l(r3, "liveStreamSource");
            this.f121864a = r2;
            this.f121865b = r3;
            this.f121866c = com.stockbit.livestream.d.f121348b;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("liveStreamId", this.f121864a);
            r02.putString("liveStreamSource", this.f121865b);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f121866c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f121864a, r52.f121864a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f121865b, r52.f121865b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f121864a.hashCode() * 31) + this.f121865b.hashCode();
        }

        public String toString() {
            return "ActionLivestreamMainFragmentToLivestreamDetailFragment(liveStreamId=" + this.f121864a + ", liveStreamSource=" + this.f121865b + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "liveStreamId");
            kotlin.jvm.internal.p.l(r3, "liveStreamSource");
            return new a(r2, r3);
        }

        public b() {
        }
    }

    static {
        f121863a = new b(null);
    }
}
