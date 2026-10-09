package com.stockbit.feature.cryptotransaction.ui.amend.buy.model;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.cryptotransaction.contract.entity.b f95166a;

        static {
        }

        public a(com.stockbit.usecase.cryptotransaction.contract.entity.b r2) {
            p.l(r2, "result");
            this.f95166a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f95166a, ((a) r4).f95166a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f95166a.hashCode();
        }

        public String toString() {
            return "NavigateToConfirmation(result=" + this.f95166a + ')';
        }
    }

    /* renamed from: com.stockbit.feature.cryptotransaction.ui.amend.buy.model.b$b, reason: collision with other inner class name */
    public static final class C0900b implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0900b f95167a = null;

        static {
            f95167a = new C0900b();
        }

        public C0900b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0900b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1949833051;
        }

        public String toString() {
            return "ShowConfirmation";
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.cryptotransaction.failure.a f95168a;

        static {
        }

        public c(com.stockbit.usecase.cryptotransaction.failure.a r2) {
            p.l(r2, "failure");
            this.f95168a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f95168a, ((c) r4).f95168a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f95168a.hashCode();
        }

        public String toString() {
            return "ShowError(failure=" + this.f95168a + ')';
        }
    }
}
