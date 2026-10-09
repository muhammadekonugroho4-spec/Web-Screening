package com.stockbit.model.type;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f122228a = null;

        static {
            f122228a = new a();
        }

        public a() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.model.type.b$b, reason: collision with other inner class name */
    public static final class C1067b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final int f122229a;

        /* renamed from: b, reason: collision with root package name */
        public final String f122230b;

        public C1067b(int r2, String r3) {
            p.l(r3, "reason");
            super(null);
            this.f122229a = r2;
            this.f122230b = r3;
        }

        public final String a() {
            return this.f122230b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1067b) == true) goto L8;
            return false;
        L8:
            C1067b r52 = (C1067b) r5;
            if (this.f122229a == r52.f122229a) goto L12;
            return false;
        L12:
            if (p.g(this.f122230b, r52.f122230b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f122229a) * 31) + this.f122230b.hashCode();
        }

        public String toString() {
            return "Disconnecting(code=" + this.f122229a + ", reason=" + this.f122230b + ')';
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f122231a;

        public c(Throwable r2) {
            p.l(r2, "throwable");
            super(null);
            this.f122231a = r2;
        }

        public final Throwable a() {
            return this.f122231a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f122231a, ((c) r4).f122231a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f122231a.hashCode();
        }

        public String toString() {
            return "Failed(throwable=" + this.f122231a + ')';
        }
    }

    public static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f122232a = null;

        static {
            f122232a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
