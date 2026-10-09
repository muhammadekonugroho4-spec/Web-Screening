package com.stockbit.liveness.livenessprep;

/* renamed from: com.stockbit.liveness.livenessprep.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC9160h {

    /* renamed from: com.stockbit.liveness.livenessprep.h$a */
    public static final class a extends AbstractC9160h {

        /* renamed from: a, reason: collision with root package name */
        public static final a f121147a = null;

        static {
            f121147a = new a();
        }

        public a() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.liveness.livenessprep.h$b */
    public static final class b extends AbstractC9160h {

        /* renamed from: a, reason: collision with root package name */
        public final int f121148a;

        static {
        }

        public b(int r2) {
            super(null);
            this.f121148a = r2;
        }

        public final int a() {
            return this.f121148a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f121148a == ((b) r4).f121148a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f121148a);
        }

        public String toString() {
            return "UploadProgress(progress=" + this.f121148a + ')';
        }
    }

    /* renamed from: com.stockbit.liveness.livenessprep.h$c */
    public static final class c extends AbstractC9160h {

        /* renamed from: a, reason: collision with root package name */
        public static final c f121149a = null;

        static {
            f121149a = new c();
        }

        public c() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 296522060;
        }

        public String toString() {
            return "UploadVideoFailed";
        }
    }

    static {
    }

    public /* synthetic */ AbstractC9160h(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC9160h() {
    }
}
