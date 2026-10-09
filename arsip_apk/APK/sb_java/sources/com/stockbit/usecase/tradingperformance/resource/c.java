package com.stockbit.usecase.tradingperformance.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f163598a;

        public a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f163598a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f163598a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163598a, ((a) r4).f163598a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163598a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f163598a + ")";
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f163599a = null;

        static {
            f163599a = new b();
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
            return 1659619745;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* renamed from: com.stockbit.usecase.tradingperformance.resource.c$c, reason: collision with other inner class name */
    public static final class C1682c implements c {

        /* renamed from: a, reason: collision with root package name */
        public final List f163600a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f163601b;

        public C1682c(List r2, boolean r3) {
            p.l(r2, "equityReturns");
            this.f163600a = r2;
            this.f163601b = r3;
        }

        public final List a() {
            return this.f163600a;
        }

        public final boolean b() {
            return this.f163601b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1682c) == true) goto L8;
            return false;
        L8:
            C1682c r52 = (C1682c) r5;
            if (p.g(this.f163600a, r52.f163600a) == true) goto L12;
            return false;
        L12:
            if (this.f163601b == r52.f163601b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f163600a.hashCode() * 31) + Boolean.hashCode(this.f163601b);
        }

        public String toString() {
            return "Success(equityReturns=" + this.f163600a + ", isInitial=" + this.f163601b + ")";
        }
    }
}
