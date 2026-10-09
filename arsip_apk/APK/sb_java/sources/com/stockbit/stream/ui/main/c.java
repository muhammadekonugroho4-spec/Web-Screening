package com.stockbit.stream.ui.main;

/* loaded from: classes11.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f143588a;

        /* renamed from: b, reason: collision with root package name */
        public final int f143589b;

        static {
        }

        public a(String r2, int r3) {
            kotlin.jvm.internal.p.l(r2, "identifier");
            super(null);
            this.f143588a = r2;
            this.f143589b = r3;
        }

        public final String a() {
            return this.f143588a;
        }

        public final int b() {
            return this.f143589b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f143588a, r52.f143588a) == true) goto L12;
            return false;
        L12:
            if (this.f143589b == r52.f143589b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f143588a.hashCode() * 31) + Integer.hashCode(this.f143589b);
        }

        public String toString() {
            return "OnReceiveNewContent(identifier=" + this.f143588a + ", researchCounter=" + this.f143589b + ')';
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f143590a;

        static {
        }

        public b(String r2) {
            kotlin.jvm.internal.p.l(r2, "identifier");
            super(null);
            this.f143590a = r2;
        }

        public final String a() {
            return this.f143590a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f143590a, ((b) r4).f143590a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f143590a.hashCode();
        }

        public String toString() {
            return "RequestClearTabBadge(identifier=" + this.f143590a + ')';
        }
    }

    /* renamed from: com.stockbit.stream.ui.main.c$c, reason: collision with other inner class name */
    public static final class C1288c extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f143591a;

        static {
        }

        public C1288c(String r2) {
            kotlin.jvm.internal.p.l(r2, "identifier");
            super(null);
            this.f143591a = r2;
        }

        public final String a() {
            return this.f143591a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1288c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f143591a, ((C1288c) r4).f143591a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f143591a.hashCode();
        }

        public String toString() {
            return "RequestTab(identifier=" + this.f143591a + ')';
        }
    }

    static {
    }

    public /* synthetic */ c(kotlin.jvm.internal.i r1) {
        this();
    }

    public c() {
    }
}
