package com.stockbit.userauthcontract.pin;

/* loaded from: classes2.dex */
public abstract class u {

    public static final class a extends u {

        /* renamed from: a, reason: collision with root package name */
        public final kotlin.jvm.functions.a f165675a;

        static {
        }

        public a(kotlin.jvm.functions.a r2) {
            kotlin.jvm.internal.p.l(r2, "onSelectBroker");
            super(null);
            this.f165675a = r2;
        }

        public final kotlin.jvm.functions.a a() {
            return this.f165675a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f165675a, ((a) r4).f165675a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f165675a.hashCode();
        }

        public String toString() {
            return "BrokerSelect(onSelectBroker=" + this.f165675a + ')';
        }
    }

    public static final class b extends u {

        /* renamed from: a, reason: collision with root package name */
        public static final b f165676a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final int f165677b = 0;

        static {
            f165676a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends u {

        /* renamed from: a, reason: collision with root package name */
        public final String f165678a;

        static {
        }

        public c(String r2) {
            super(null);
            this.f165678a = r2;
        }

        public final String a() {
            return this.f165678a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f165678a, ((c) r4).f165678a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f165678a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Title(title=" + this.f165678a + ')';
        }
    }

    static {
    }

    public /* synthetic */ u(kotlin.jvm.internal.i r1) {
        this();
    }

    public u() {
    }
}
