package com.stockbit.feature.cryptotransaction.ui.amend.sell.model;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.cryptotransaction.contract.entity.b f95333a;

        static {
        }

        public a(com.stockbit.usecase.cryptotransaction.contract.entity.b r2) {
            p.l(r2, "result");
            this.f95333a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f95333a, ((a) r4).f95333a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f95333a.hashCode();
        }

        public String toString() {
            return "NavigateToConfirmation(result=" + this.f95333a + ')';
        }
    }

    /* renamed from: com.stockbit.feature.cryptotransaction.ui.amend.sell.model.b$b, reason: collision with other inner class name */
    public static final class C0901b implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0901b f95334a = null;

        static {
            f95334a = new C0901b();
        }

        public C0901b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0901b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 125912415;
        }

        public String toString() {
            return "ShowConfirmation";
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.cryptotransaction.failure.a f95335a;

        static {
        }

        public c(com.stockbit.usecase.cryptotransaction.failure.a r2) {
            p.l(r2, "failure");
            this.f95335a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f95335a, ((c) r4).f95335a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f95335a.hashCode();
        }

        public String toString() {
            return "ShowError(failure=" + this.f95335a + ')';
        }
    }
}
