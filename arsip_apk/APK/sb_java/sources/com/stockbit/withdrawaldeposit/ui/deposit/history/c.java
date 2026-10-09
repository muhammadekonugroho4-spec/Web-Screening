package com.stockbit.withdrawaldeposit.ui.deposit.history;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f172603a;

        static {
        }

        public a(String r2) {
            kotlin.jvm.internal.p.l(r2, "historyPeriode");
            super(null);
            this.f172603a = r2;
        }

        public final String a() {
            return this.f172603a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f172603a, ((a) r4).f172603a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f172603a.hashCode();
        }

        public String toString() {
            return "ChooseHistoryPeriode(historyPeriode=" + this.f172603a + ')';
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
