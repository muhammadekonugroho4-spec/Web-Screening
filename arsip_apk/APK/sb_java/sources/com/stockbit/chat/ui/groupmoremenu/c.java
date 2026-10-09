package com.stockbit.chat.ui.groupmoremenu;

/* loaded from: classes7.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f56251a;

        static {
        }

        public a(boolean r2) {
            super(null);
            this.f56251a = r2;
        }

        public final boolean a() {
            return this.f56251a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f56251a == ((a) r4).f56251a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f56251a);
        }

        public String toString() {
            return "OnMuteUnmuteGroup(isMute=" + this.f56251a + ')';
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
