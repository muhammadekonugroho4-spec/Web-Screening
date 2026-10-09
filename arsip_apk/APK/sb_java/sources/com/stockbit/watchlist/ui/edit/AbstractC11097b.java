package com.stockbit.watchlist.ui.edit;

/* renamed from: com.stockbit.watchlist.ui.edit.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC11097b {

    /* renamed from: com.stockbit.watchlist.ui.edit.b$a */
    public static final class a extends AbstractC11097b {

        /* renamed from: a, reason: collision with root package name */
        public final String f168915a;

        static {
        }

        public a(String r2) {
            super(null);
            this.f168915a = r2;
        }

        public final String a() {
            return this.f168915a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f168915a, ((a) r4).f168915a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f168915a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "SaveFailed(message=" + this.f168915a + ')';
        }
    }

    /* renamed from: com.stockbit.watchlist.ui.edit.b$b, reason: collision with other inner class name */
    public static final class C1763b extends AbstractC11097b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1763b f168916a = null;

        static {
            f168916a = new C1763b();
        }

        public C1763b() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.watchlist.ui.edit.b$c */
    public static final class c extends AbstractC11097b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f168917a = null;

        static {
            f168917a = new c();
        }

        public c() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ AbstractC11097b(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC11097b() {
    }
}
