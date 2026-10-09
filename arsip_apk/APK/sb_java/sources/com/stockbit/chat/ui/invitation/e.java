package com.stockbit.chat.ui.invitation;

/* loaded from: classes7.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final a f56437a = null;

        static {
            f56437a = new a();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public final int f56438a;

        static {
        }

        public b(int r2) {
            super(null);
            this.f56438a = r2;
        }

        public final int a() {
            return this.f56438a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f56438a == ((b) r4).f56438a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f56438a);
        }

        public String toString() {
            return "OpenGroupRoom(roomId=" + this.f56438a + ')';
        }
    }

    static {
    }

    public /* synthetic */ e(kotlin.jvm.internal.i r1) {
        this();
    }

    public e() {
    }
}
