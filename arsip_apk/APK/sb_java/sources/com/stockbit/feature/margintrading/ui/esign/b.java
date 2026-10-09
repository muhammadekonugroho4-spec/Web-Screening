package com.stockbit.feature.margintrading.ui.esign;

/* loaded from: classes9.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f99732a;

        static {
        }

        public a(String r2) {
            kotlin.jvm.internal.p.l(r2, "popUpMessage");
            this.f99732a = r2;
        }

        public final String a() {
            return this.f99732a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f99732a, ((a) r4).f99732a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f99732a.hashCode();
        }

        public String toString() {
            return "NavigateToPortfolioList(popUpMessage=" + this.f99732a + ')';
        }
    }
}
