package com.stockbit.feature.transaction.util.compose;

import com.stockbit.lib.extension.l;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f116689a;

    /* renamed from: com.stockbit.feature.transaction.util.compose.a$a, reason: collision with other inner class name */
    public static final class C1012a extends a {

        /* renamed from: b, reason: collision with root package name */
        public final int f116690b;

        static {
        }

        public C1012a(int r10) {
            super('+' + l.c(Integer.valueOf(r10), false, 0, false, false, 14, null), null);
            this.f116690b = r10;
        }

        public final int b() {
            return this.f116690b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1012a) == true) goto L9;
            return false;
        L9:
            if (this.f116690b == ((C1012a) r4).f116690b) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f116690b);
        }

        public String toString() {
            return "AddNumber(number=" + this.f116690b + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public static final b f116691b = null;

        static {
            f116691b = new b();
        }

        public b() {
            super("Max Buy", null);
        }
    }

    public static final class c extends a {

        /* renamed from: b, reason: collision with root package name */
        public static final c f116692b = null;

        static {
            f116692b = new c();
        }

        public c() {
            super("Max Sell", null);
        }
    }

    public static final class d extends a {

        /* renamed from: b, reason: collision with root package name */
        public final int f116693b;

        static {
        }

        public d(int r3) {
            StringBuilder r02 = new StringBuilder();
            r02.append(r3);
            r02.append('%');
            super(r02.toString(), null);
            this.f116693b = r3;
        }

        public final int b() {
            return this.f116693b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (this.f116693b == ((d) r4).f116693b) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f116693b);
        }

        public String toString() {
            return "Percentage(percent=" + this.f116693b + ')';
        }
    }

    static {
    }

    public /* synthetic */ a(String r1, kotlin.jvm.internal.i r2) {
        this(r1);
    }

    public final String a() {
        return this.f116689a;
    }

    public a(String r1) {
        this.f116689a = r1;
    }
}
