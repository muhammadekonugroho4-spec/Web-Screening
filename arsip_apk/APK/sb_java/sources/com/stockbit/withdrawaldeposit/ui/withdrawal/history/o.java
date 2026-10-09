package com.stockbit.withdrawaldeposit.ui.withdrawal.history;

/* loaded from: classes2.dex */
public abstract class o {

    public static final class a extends o {

        /* renamed from: a, reason: collision with root package name */
        public final String f173218a;

        static {
        }

        public a(String r2) {
            kotlin.jvm.internal.p.l(r2, "historyPeriode");
            super(null);
            this.f173218a = r2;
        }

        public final String a() {
            return this.f173218a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f173218a, ((a) r4).f173218a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f173218a.hashCode();
        }

        public String toString() {
            return "ChooseHistoryPeriode(historyPeriode=" + this.f173218a + ')';
        }
    }

    static {
    }

    public /* synthetic */ o(kotlin.jvm.internal.i r1) {
        this();
    }

    public o() {
    }
}
