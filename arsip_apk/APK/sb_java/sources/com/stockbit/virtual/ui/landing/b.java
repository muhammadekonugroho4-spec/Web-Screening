package com.stockbit.virtual.ui.landing;

import kotlin.jvm.internal.i;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f166992a;

        public a(boolean r2) {
            super(null);
            this.f166992a = r2;
        }

        public final boolean a() {
            return this.f166992a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f166992a == ((a) r4).f166992a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f166992a);
        }

        public String toString() {
            return "Loading(isShow=" + this.f166992a + ')';
        }
    }

    /* renamed from: com.stockbit.virtual.ui.landing.b$b, reason: collision with other inner class name */
    public static final class C1753b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1753b f166993a = null;

        static {
            f166993a = new C1753b();
        }

        public C1753b() {
            super(null);
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
