package com.stockbit.watchlist.ui.sort;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class f {

    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        public final String f171118a;

        /* renamed from: b, reason: collision with root package name */
        public final String f171119b;

        static {
        }

        public a(String r2, String r3) {
            p.l(r2, "sortBy");
            p.l(r3, "sortDirection");
            super(null);
            this.f171118a = r2;
            this.f171119b = r3;
        }

        public final String a() {
            return this.f171118a;
        }

        public final String b() {
            return this.f171119b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f171118a, r52.f171118a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f171119b, r52.f171119b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f171118a.hashCode() * 31) + this.f171119b.hashCode();
        }

        public String toString() {
            return "Done(sortBy=" + this.f171118a + ", sortDirection=" + this.f171119b + ')';
        }
    }

    static {
    }

    public /* synthetic */ f(i r1) {
        this();
    }

    public f() {
    }
}
