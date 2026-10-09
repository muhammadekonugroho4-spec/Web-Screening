package com.stockbit.eipo.ui.compose.order;

/* renamed from: com.stockbit.eipo.ui.compose.order.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC7090g {

    /* renamed from: com.stockbit.eipo.ui.compose.order.g$a */
    public static final class a implements InterfaceC7090g {

        /* renamed from: a, reason: collision with root package name */
        public final String f90391a;

        static {
        }

        public a(String r2) {
            kotlin.jvm.internal.p.l(r2, "message");
            this.f90391a = r2;
        }

        public final String a() {
            return this.f90391a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f90391a, ((a) r4).f90391a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f90391a.hashCode();
        }

        public String toString() {
            return "ShowSnackBar(message=" + this.f90391a + ')';
        }
    }

    /* renamed from: com.stockbit.eipo.ui.compose.order.g$b */
    public static final class b implements InterfaceC7090g {

        /* renamed from: a, reason: collision with root package name */
        public static final b f90392a = null;

        static {
            f90392a = new b();
        }

        public b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -909658599;
        }

        public String toString() {
            return "SuccessCreateOrder";
        }
    }
}
