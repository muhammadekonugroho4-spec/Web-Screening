package com.stockbit.stream.ui.share.adapter;

/* loaded from: classes11.dex */
public abstract class g {

    public static final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f144840a;

        static {
        }

        public a(boolean r2) {
            super(null);
            this.f144840a = r2;
        }

        public final boolean a() {
            return this.f144840a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f144840a == ((a) r4).f144840a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f144840a);
        }

        public String toString() {
            return "UpdateSelectState(selected=" + this.f144840a + ')';
        }
    }

    static {
    }

    public /* synthetic */ g(kotlin.jvm.internal.i r1) {
        this();
    }

    public g() {
    }
}
