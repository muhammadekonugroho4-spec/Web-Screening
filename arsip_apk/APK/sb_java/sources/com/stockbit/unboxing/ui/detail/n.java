package com.stockbit.unboxing.ui.detail;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final b f154167a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f154168a;

        /* renamed from: b, reason: collision with root package name */
        public final String f154169b;

        /* renamed from: c, reason: collision with root package name */
        public final String f154170c;
        public final int d;

        public a(String r2, String r3, String r4) {
            p.l(r2, "volume");
            p.l(r3, "volumeName");
            this.f154168a = r2;
            this.f154169b = r3;
            this.f154170c = r4;
            this.d = com.stockbit.unboxing.c.f153961a;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("pdfUrl", this.f154170c);
            r02.putString("volume", this.f154168a);
            r02.putString("volumeName", this.f154169b);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f154168a, r52.f154168a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f154169b, r52.f154169b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f154170c, r52.f154170c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int r02 = ((this.f154168a.hashCode() * 31) + this.f154169b.hashCode()) * 31;
            String r1 = this.f154170c;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "ActionUnboxingDetailFragmentToUnboxingReaderFragment(volume=" + this.f154168a + ", volumeName=" + this.f154169b + ", pdfUrl=" + this.f154170c + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2, String r3, String r4) {
            p.l(r2, "volume");
            p.l(r3, "volumeName");
            return new a(r2, r3, r4);
        }

        public b() {
        }
    }

    static {
        f154167a = new b(null);
    }
}
