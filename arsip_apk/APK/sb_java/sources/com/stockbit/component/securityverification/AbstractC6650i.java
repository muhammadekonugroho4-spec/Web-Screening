package com.stockbit.component.securityverification;

/* renamed from: com.stockbit.component.securityverification.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC6650i {

    /* renamed from: com.stockbit.component.securityverification.i$a */
    public static final class a extends AbstractC6650i {

        /* renamed from: a, reason: collision with root package name */
        public static final a f76891a = null;

        static {
            f76891a = new a();
        }

        public a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1789150347;
        }

        public String toString() {
            return "DismissRequested";
        }
    }

    /* renamed from: com.stockbit.component.securityverification.i$b */
    public static final class b extends AbstractC6650i {

        /* renamed from: a, reason: collision with root package name */
        public final String f76892a;

        static {
        }

        public b(String r2) {
            kotlin.jvm.internal.p.l(r2, "rayId");
            super(null);
            this.f76892a = r2;
        }

        public final String a() {
            return this.f76892a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f76892a, ((b) r4).f76892a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f76892a.hashCode();
        }

        public String toString() {
            return "OpenSupport(rayId=" + this.f76892a + ')';
        }
    }

    /* renamed from: com.stockbit.component.securityverification.i$c */
    public static final class c extends AbstractC6650i {

        /* renamed from: a, reason: collision with root package name */
        public static final c f76893a = null;

        static {
            f76893a = new c();
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
            return 576811615;
        }

        public String toString() {
            return "VerificationSucceeded";
        }
    }

    static {
    }

    public /* synthetic */ AbstractC6650i(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC6650i() {
    }
}
