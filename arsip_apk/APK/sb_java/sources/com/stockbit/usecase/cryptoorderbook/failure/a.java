package com.stockbit.usecase.cryptoorderbook.failure;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.cryptoorderbook.failure.a$a, reason: collision with other inner class name */
    public static final class C1452a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1452a f157305a = null;

        static {
            f157305a = new C1452a();
        }

        public C1452a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1452a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1409271497;
        }

        public String toString() {
            return "NetworkError";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f157306a = null;

        static {
            f157306a = new b();
        }

        public b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1761620908;
        }

        public String toString() {
            return "NotFound";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f157307a = null;

        static {
            f157307a = new c();
        }

        public c() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -744825423;
        }

        public String toString() {
            return "Unauthorized";
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157308a;

        public d(String r2) {
            super(null);
            this.f157308a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157308a, ((d) r4).f157308a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f157308a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Unknown(message=" + this.f157308a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
