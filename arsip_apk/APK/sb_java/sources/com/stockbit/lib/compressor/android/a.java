package com.stockbit.lib.compressor.android;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a {
    public static final C1037a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f120133a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f120134b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120135c;

    /* renamed from: com.stockbit.lib.compressor.android.a$a, reason: collision with other inner class name */
    public static final class C1037a {
        public /* synthetic */ C1037a(i r1) {
            this();
        }

        public final a a(String r4) {
            p.l(r4, "errorMessage");
            return new a(0, null, r4);
        }

        public final a b() {
            return new a(0, null, null);
        }

        public final a c(Object r7) {
            int r1 = 1;
            String r3 = null;
            return new a(r1, r7, r3, 4, null);
        }

        public C1037a() {
        }
    }

    static {
        d = new C1037a(null);
    }

    public a(int r1, Object r2, String r3) {
        this.f120133a = r1;
        this.f120134b = r2;
        this.f120135c = r3;
    }

    public final String a() {
        return this.f120135c;
    }

    public final int b() {
        return this.f120133a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f120133a == r52.f120133a) goto L12;
        return false;
    L12:
        if (p.g(this.f120134b, r52.f120134b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f120135c, r52.f120135c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f120133a) * 31;
        Object r1 = this.f120134b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f120135c;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "CompressorResource(resultType=" + this.f120133a + ", result=" + this.f120134b + ", errorMessage=" + this.f120135c + ')';
    }

    public /* synthetic */ a(int r2, Object r3, String r4, int r5, i r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r5 & 4) == 0) goto L8;
        r4 = null;
    L8:
        this(r2, r3, r4);
    }
}
