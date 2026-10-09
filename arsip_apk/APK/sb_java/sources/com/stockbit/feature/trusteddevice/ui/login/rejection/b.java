package com.stockbit.feature.trusteddevice.ui.login.rejection;

import com.stockbit.usecase.personalamend.resource.changepassword.a;

/* loaded from: classes9.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final a.AbstractC1570a f118386a;

        static {
        }

        public a(a.AbstractC1570a r2) {
            kotlin.jvm.internal.p.l(r2, "nextState");
            super(null);
            this.f118386a = r2;
        }

        public final a.AbstractC1570a a() {
            return this.f118386a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f118386a, ((a) r4).f118386a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f118386a.hashCode();
        }

        public String toString() {
            return "ChangePassword(nextState=" + this.f118386a + ')';
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
