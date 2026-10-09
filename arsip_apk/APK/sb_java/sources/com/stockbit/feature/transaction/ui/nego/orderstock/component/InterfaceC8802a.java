package com.stockbit.feature.transaction.ui.nego.orderstock.component;

/* renamed from: com.stockbit.feature.transaction.ui.nego.orderstock.component.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC8802a {

    /* renamed from: com.stockbit.feature.transaction.ui.nego.orderstock.component.a$a, reason: collision with other inner class name */
    public static final class C0999a implements InterfaceC8802a {

        /* renamed from: a, reason: collision with root package name */
        public final double f114660a;

        static {
        }

        public C0999a(double r1) {
            this.f114660a = r1;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof C0999a) == true) goto L9;
            return false;
        L9:
            if (Double.compare(this.f114660a, ((C0999a) r8).f114660a) == 0) goto L11;
            return false;
        L11:
            return true;
        }

        @Override // com.stockbit.feature.transaction.ui.nego.orderstock.component.InterfaceC8802a
        public double getValue() {
            return this.f114660a;
        }

        public int hashCode() {
            return Double.hashCode(this.f114660a);
        }

        public String toString() {
            return "Ara(value=" + this.f114660a + ')';
        }
    }

    /* renamed from: com.stockbit.feature.transaction.ui.nego.orderstock.component.a$b */
    public static final class b implements InterfaceC8802a {

        /* renamed from: a, reason: collision with root package name */
        public final double f114661a;

        static {
        }

        public b(double r1) {
            this.f114661a = r1;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof b) == true) goto L9;
            return false;
        L9:
            if (Double.compare(this.f114661a, ((b) r8).f114661a) == 0) goto L11;
            return false;
        L11:
            return true;
        }

        @Override // com.stockbit.feature.transaction.ui.nego.orderstock.component.InterfaceC8802a
        public double getValue() {
            return this.f114661a;
        }

        public int hashCode() {
            return Double.hashCode(this.f114661a);
        }

        public String toString() {
            return "Arb(value=" + this.f114661a + ')';
        }
    }

    double getValue();
}
