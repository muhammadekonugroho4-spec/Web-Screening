package com.stockbit.uikit.compose.button.v2.attributes;

import com.stockbit.uikit.compose.theme.token.g;
import kotlin.jvm.internal.i;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f151676e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f151677a;

    /* renamed from: b, reason: collision with root package name */
    public final long f151678b;

    /* renamed from: c, reason: collision with root package name */
    public final long f151679c;
    public final long d;

    /* renamed from: com.stockbit.uikit.compose.button.v2.attributes.a$a, reason: collision with other inner class name */
    public static final class C1381a extends a {

        /* renamed from: f, reason: collision with root package name */
        public static final C1381a f151680f = null;

        /* renamed from: g, reason: collision with root package name */
        public static final int f151681g = 0;

        static {
            f151680f = new C1381a();
        }

        public C1381a() {
            g r02 = g.f152354a;
            long r2 = r02.S0();
            com.stockbit.uikit.compose.theme.token.f r1 = com.stockbit.uikit.compose.theme.token.f.f152263a;
            long r6 = r1.S0();
            super(r2, r02.z(), r6, r1.U0(), null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1381a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1913650788;
        }

        public String toString() {
            return "Green";
        }
    }

    public static final class b extends a {

        /* renamed from: f, reason: collision with root package name */
        public static final b f151682f = null;

        /* renamed from: g, reason: collision with root package name */
        public static final int f151683g = 0;

        static {
            f151682f = new b();
        }

        public b() {
            g r02 = g.f152354a;
            long r2 = r02.T0();
            com.stockbit.uikit.compose.theme.token.f r1 = com.stockbit.uikit.compose.theme.token.f.f152263a;
            long r6 = r1.T0();
            super(r2, r02.a0(), r6, r1.U0(), null);
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
            return 658983986;
        }

        public String toString() {
            return "Red";
        }
    }

    static {
    }

    public /* synthetic */ a(long r1, long r3, long r5, long r7, i r9) {
        this(r1, r3, r5, r7);
    }

    public long a() {
        return this.f151679c;
    }

    public long b() {
        return this.f151677a;
    }

    public long c() {
        return this.d;
    }

    public long d() {
        return this.f151678b;
    }

    public a(long r1, long r3, long r5, long r7) {
        this.f151677a = r1;
        this.f151678b = r3;
        this.f151679c = r5;
        this.d = r7;
    }
}
