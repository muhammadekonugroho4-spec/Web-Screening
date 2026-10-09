package com.stockbit.usecase.cryptoportfolio.failure;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.cryptoportfolio.failure.a$a, reason: collision with other inner class name */
    public static final class C1455a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1455a f157359a = null;

        static {
            f157359a = new C1455a();
        }

        public C1455a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1455a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 202539321;
        }

        public String toString() {
            return "NetworkError";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f157360a = null;

        static {
            f157360a = new b();
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
            return -504705874;
        }

        public String toString() {
            return "NotFound";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f157361a = null;

        static {
            f157361a = new c();
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
            return 866985395;
        }

        public String toString() {
            return "Unauthorized";
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157362a;

        public d(String r2) {
            super(null);
            this.f157362a = r2;
        }

        public final String a() {
            return this.f157362a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157362a, ((d) r4).f157362a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f157362a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Unknown(message=" + this.f157362a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
