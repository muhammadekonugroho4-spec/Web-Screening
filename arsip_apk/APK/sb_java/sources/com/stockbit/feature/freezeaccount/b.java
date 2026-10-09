package com.stockbit.feature.freezeaccount;

/* loaded from: classes9.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f96453a;

        static {
        }

        public a(String r2) {
            super(null);
            this.f96453a = r2;
        }

        public final String a() {
            return this.f96453a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f96453a, ((a) r4).f96453a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f96453a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "ShowErrorMessage(message=" + this.f96453a + ')';
        }
    }

    /* renamed from: com.stockbit.feature.freezeaccount.b$b, reason: collision with other inner class name */
    public static final class C0906b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0906b f96454a = null;

        static {
            f96454a = new C0906b();
        }

        public C0906b() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ b(kotlin.jvm.internal.i r1) {
        this();
    }

    public b() {
    }
}
