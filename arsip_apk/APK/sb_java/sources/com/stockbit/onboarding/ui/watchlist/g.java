package com.stockbit.onboarding.ui.watchlist;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public abstract class g {

    public static final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public final String f124300a;

        static {
        }

        public a(String r2) {
            p.l(r2, "errorMsg");
            super(null);
            this.f124300a = r2;
        }

        public final String a() {
            return this.f124300a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f124300a, ((a) r4).f124300a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f124300a.hashCode();
        }

        public String toString() {
            return "OnFailed(errorMsg=" + this.f124300a + ')';
        }
    }

    public static final class b extends g {

        /* renamed from: a, reason: collision with root package name */
        public final List f124301a;

        static {
        }

        public b(List r2) {
            super(null);
            this.f124301a = r2;
        }

        public final List a() {
            return this.f124301a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f124301a, ((b) r4).f124301a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            List r02 = this.f124301a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "OnSuccess(companies=" + this.f124301a + ')';
        }
    }

    static {
    }

    public /* synthetic */ g(i r1) {
        this();
    }

    public g() {
    }
}
