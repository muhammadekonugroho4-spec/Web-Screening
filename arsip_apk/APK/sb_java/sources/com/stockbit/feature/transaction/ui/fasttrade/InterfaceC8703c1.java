package com.stockbit.feature.transaction.ui.fasttrade;

/* renamed from: com.stockbit.feature.transaction.ui.fasttrade.c1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC8703c1 {

    /* renamed from: com.stockbit.feature.transaction.ui.fasttrade.c1$a */
    public static final class a implements InterfaceC8703c1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f113892a;

        static {
        }

        public a(String r2) {
            kotlin.jvm.internal.p.l(r2, "errorMessage");
            this.f113892a = r2;
        }

        public final String a() {
            return this.f113892a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f113892a, ((a) r4).f113892a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f113892a.hashCode();
        }

        public String toString() {
            return "ShowBottomSheetError(errorMessage=" + this.f113892a + ')';
        }
    }
}
