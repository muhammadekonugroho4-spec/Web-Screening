package com.stockbit.tipping.ui.mytipjar;

import com.stockbit.domain.model.type.tipping.TippingActivityType;

/* loaded from: classes11.dex */
public abstract class n {

    public static final class a extends n {

        /* renamed from: a, reason: collision with root package name */
        public final TippingActivityType f146020a;

        /* renamed from: b, reason: collision with root package name */
        public final int f146021b;

        public a(TippingActivityType r2, int r3) {
            kotlin.jvm.internal.p.l(r2, "type");
            super(null);
            this.f146020a = r2;
            this.f146021b = r3;
        }

        public final int a() {
            return this.f146021b;
        }

        public final TippingActivityType b() {
            return this.f146020a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f146020a == r52.f146020a) goto L12;
            return false;
        L12:
            if (this.f146021b == r52.f146021b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f146020a.hashCode() * 31) + Integer.hashCode(this.f146021b);
        }

        public String toString() {
            return "ShowTippingClaimDialog(type=" + this.f146020a + ", identifier=" + this.f146021b + ')';
        }
    }

    public static final class b extends n {

        /* renamed from: a, reason: collision with root package name */
        public final TippingActivityType f146022a;

        /* renamed from: b, reason: collision with root package name */
        public final int f146023b;

        public b(TippingActivityType r2, int r3) {
            kotlin.jvm.internal.p.l(r2, "type");
            super(null);
            this.f146022a = r2;
            this.f146023b = r3;
        }

        public final int a() {
            return this.f146023b;
        }

        public final TippingActivityType b() {
            return this.f146022a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (this.f146022a == r52.f146022a) goto L12;
            return false;
        L12:
            if (this.f146023b == r52.f146023b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f146022a.hashCode() * 31) + Integer.hashCode(this.f146023b);
        }

        public String toString() {
            return "ShowTippingSendReceiveDialog(type=" + this.f146022a + ", identifier=" + this.f146023b + ')';
        }
    }

    public /* synthetic */ n(kotlin.jvm.internal.i r1) {
        this();
    }

    public n() {
    }
}
