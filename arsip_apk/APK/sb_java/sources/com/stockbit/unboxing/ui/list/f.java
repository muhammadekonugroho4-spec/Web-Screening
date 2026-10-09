package com.stockbit.unboxing.ui.list;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final b f154206a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f154207a;

        /* renamed from: b, reason: collision with root package name */
        public final String f154208b;

        /* renamed from: c, reason: collision with root package name */
        public final String f154209c;
        public final int d;

        public a(String r1, String r2, String r3) {
            this.f154207a = r1;
            this.f154208b = r2;
            this.f154209c = r3;
            this.d = com.stockbit.unboxing.c.f153962b;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("volume", this.f154207a);
            r02.putString("volumeName", this.f154208b);
            r02.putString("source", this.f154209c);
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
            if (p.g(this.f154207a, r52.f154207a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f154208b, r52.f154208b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f154209c, r52.f154209c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            String r02 = this.f154207a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f154208b;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.f154209c;
            if (r23 == null) goto L15;
            r1 = r23.hashCode();
        L15:
            return r05 + r1;
        L9:
            r22 = r2.hashCode();
            goto L10
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "ActionUnboxingListFragmentToUnboxingDetailFragment(volume=" + this.f154207a + ", volumeName=" + this.f154208b + ", source=" + this.f154209c + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2, String r3, String r4) {
            return new a(r2, r3, r4);
        }

        public b() {
        }
    }

    static {
        f154206a = new b(null);
    }
}
