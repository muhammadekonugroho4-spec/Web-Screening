package com.stockbit.feature.freezeaccount.contract.delegation;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: com.stockbit.feature.freezeaccount.contract.delegation.a$a, reason: collision with other inner class name */
    public static final class C0907a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0907a f96533a = null;

        static {
            f96533a = new C0907a();
        }

        public C0907a() {
            super(null);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f96534a;

        static {
        }

        public b(String r2) {
            p.l(r2, "message");
            super(null);
            this.f96534a = r2;
        }

        public final String a() {
            return this.f96534a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f96534a, ((b) r4).f96534a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f96534a.hashCode();
        }

        public String toString() {
            return "ShowErrorMessage(message=" + this.f96534a + ')';
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f96535a = null;

        static {
            f96535a = new c();
        }

        public c() {
            super(null);
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f96536a = null;

        static {
            f96536a = new d();
        }

        public d() {
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
