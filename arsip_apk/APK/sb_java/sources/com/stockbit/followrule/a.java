package com.stockbit.followrule;

import kotlin.jvm.internal.i;

/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: com.stockbit.followrule.a$a, reason: collision with other inner class name */
    public static final class C1033a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f120035a;

        static {
        }

        public C1033a(boolean r2) {
            super(null);
            this.f120035a = r2;
        }

        public final boolean a() {
            return this.f120035a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1033a) == true) goto L9;
            return false;
        L9:
            if (this.f120035a == ((C1033a) r4).f120035a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f120035a);
        }

        public String toString() {
            return "OnDailyLimit(isSecuritiesAccount=" + this.f120035a + ')';
        }
    }

    static {
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
