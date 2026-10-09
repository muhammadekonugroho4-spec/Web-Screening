package com.stockbit.feature.transaction.util.compose;

/* loaded from: classes9.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f116716a;

    public static final class a extends f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f116717b = null;

        static {
            f116717b = new a();
        }

        public a() {
            super("⌫", null);
        }
    }

    public static final class b extends f {

        /* renamed from: b, reason: collision with root package name */
        public static final b f116718b = null;

        static {
            f116718b = new b();
        }

        public b() {
            super("00", null);
        }
    }

    public static final class c extends f {

        /* renamed from: b, reason: collision with root package name */
        public final int f116719b;

        static {
        }

        public c(int r3) {
            super(String.valueOf(r3), null);
            this.f116719b = r3;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (this.f116719b == ((c) r4).f116719b) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f116719b);
        }

        public String toString() {
            return "Number(number=" + this.f116719b + ')';
        }
    }

    static {
    }

    public /* synthetic */ f(String r1, kotlin.jvm.internal.i r2) {
        this(r1);
    }

    public final String a() {
        return this.f116716a;
    }

    public f(String r1) {
        this.f116716a = r1;
    }
}
