package com.stockbit.feature.order.ui.orderlist;

/* renamed from: com.stockbit.feature.order.ui.orderlist.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC7829c {

    /* renamed from: com.stockbit.feature.order.ui.orderlist.c$a */
    public static final class a implements InterfaceC7829c {

        /* renamed from: a, reason: collision with root package name */
        public final String f103146a;

        static {
        }

        public a(String r2) {
            kotlin.jvm.internal.p.l(r2, "errorMessage");
            this.f103146a = r2;
        }

        public final String a() {
            return this.f103146a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f103146a, ((a) r4).f103146a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f103146a.hashCode();
        }

        public String toString() {
            return "ShowBottomSheetError(errorMessage=" + this.f103146a + ')';
        }
    }
}
