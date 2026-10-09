package com.stockbit.chat.ui.more;

/* loaded from: classes7.dex */
public abstract class k {

    public static final class a extends k {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f56583a;

        static {
        }

        public a(boolean r2) {
            super(null);
            this.f56583a = r2;
        }

        public final boolean a() {
            return this.f56583a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f56583a == ((a) r4).f56583a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f56583a);
        }

        public String toString() {
            return "OnBlockUser(isBlocked=" + this.f56583a + ')';
        }
    }

    public static final class b extends k {

        /* renamed from: a, reason: collision with root package name */
        public static final b f56584a = null;

        static {
            f56584a = new b();
        }

        public b() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ k(kotlin.jvm.internal.i r1) {
        this();
    }

    public k() {
    }
}
