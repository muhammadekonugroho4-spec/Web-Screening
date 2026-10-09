package com.stockbit.company.ui.paywall;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: com.stockbit.company.ui.paywall.a$a, reason: collision with other inner class name */
    public static final class C0690a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0690a f67670a = null;

        static {
            f67670a = new C0690a();
        }

        public C0690a() {
            super(null);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f67671a;

        static {
        }

        public b(String r2) {
            p.l(r2, "errorType");
            super(null);
            this.f67671a = r2;
        }

        public final String a() {
            return this.f67671a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f67671a, ((b) r4).f67671a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f67671a.hashCode();
        }

        public String toString() {
            return "FailedIncrementCounter(errorType=" + this.f67671a + ')';
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f67672a = null;

        static {
            f67672a = new c();
        }

        public c() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
