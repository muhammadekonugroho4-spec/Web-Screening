package com.stockbit.chat.ui.groupshare;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class f {

    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        public final String f56394a;

        static {
        }

        public a(String r2) {
            p.l(r2, "message");
            super(null);
            this.f56394a = r2;
        }

        public final String a() {
            return this.f56394a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f56394a, ((a) r4).f56394a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f56394a.hashCode();
        }

        public String toString() {
            return "OnErrorResetLink(message=" + this.f56394a + ')';
        }
    }

    public static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        public static final b f56395a = null;

        static {
            f56395a = new b();
        }

        public b() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ f(kotlin.jvm.internal.i r1) {
        this();
    }

    public f() {
    }
}
