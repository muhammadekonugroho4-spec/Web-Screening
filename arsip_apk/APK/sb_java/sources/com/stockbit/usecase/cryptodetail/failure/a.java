package com.stockbit.usecase.cryptodetail.failure;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.cryptodetail.failure.a$a, reason: collision with other inner class name */
    public static final class C1447a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1447a f157097a = null;

        static {
            f157097a = new C1447a();
        }

        public C1447a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1447a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1031354801;
        }

        public String toString() {
            return "NetworkError";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f157098a = null;

        static {
            f157098a = new b();
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
            return 1883835588;
        }

        public String toString() {
            return "NotFound";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f157099a = null;

        static {
            f157099a = new c();
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
            return -366908727;
        }

        public String toString() {
            return "Unauthorized";
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157100a;

        public d(String r2) {
            super(null);
            this.f157100a = r2;
        }

        public final String a() {
            return this.f157100a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157100a, ((d) r4).f157100a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f157100a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Unknown(message=" + this.f157100a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
