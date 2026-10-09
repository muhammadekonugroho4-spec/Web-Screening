package com.stockbit.usecase.transaction.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f164004a;

        public a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f164004a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164004a, ((a) r4).f164004a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164004a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f164004a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.transaction.resource.b$b, reason: collision with other inner class name */
    public static final class C1698b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final double f164005a;

        /* renamed from: b, reason: collision with root package name */
        public final double f164006b;

        /* renamed from: c, reason: collision with root package name */
        public final double f164007c;

        public C1698b(double r2, double r4, double r6) {
            super(null);
            this.f164005a = r2;
            this.f164006b = r4;
            this.f164007c = r6;
        }

        public final double a() {
            return this.f164005a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof C1698b) == true) goto L8;
            return false;
        L8:
            C1698b r82 = (C1698b) r8;
            if (Double.compare(this.f164005a, r82.f164005a) == 0) goto L12;
            return false;
        L12:
            if (Double.compare(this.f164006b, r82.f164006b) == 0) goto L15;
            return false;
        L15:
            if (Double.compare(this.f164007c, r82.f164007c) == 0) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Double.hashCode(this.f164005a) * 31) + Double.hashCode(this.f164006b)) * 31) + Double.hashCode(this.f164007c);
        }

        public String toString() {
            return "Success(debtRatio=" + this.f164005a + ", debtMarketValue=" + this.f164006b + ", debtTotal=" + this.f164007c + ")";
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
