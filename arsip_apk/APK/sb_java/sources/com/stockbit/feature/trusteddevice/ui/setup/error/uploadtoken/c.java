package com.stockbit.feature.trusteddevice.ui.setup.error.uploadtoken;

/* loaded from: classes9.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final long f118646a;

        static {
        }

        public a(long r2) {
            super(null);
            this.f118646a = r2;
        }

        public final long a() {
            return this.f118646a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f118646a == ((a) r8).f118646a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f118646a);
        }

        public String toString() {
            return "OnStartCountDown(timeLeft=" + this.f118646a + ')';
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
