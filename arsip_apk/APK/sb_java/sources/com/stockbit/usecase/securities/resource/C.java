package com.stockbit.usecase.securities.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import java.util.Map;

/* loaded from: classes2.dex */
public interface C {

    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f162048a;

        public a(DomainSecuritiesException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f162048a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162048a, ((a) r4).f162048a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162048a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f162048a + ")";
        }
    }

    public static final class b implements C {

        /* renamed from: a, reason: collision with root package name */
        public final Map f162049a;

        public b(Map r2) {
            kotlin.jvm.internal.p.l(r2, "portfolioBySymbol");
            this.f162049a = r2;
        }

        public final Map a() {
            return this.f162049a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162049a, ((b) r4).f162049a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162049a.hashCode();
        }

        public String toString() {
            return "Success(portfolioBySymbol=" + this.f162049a + ")";
        }
    }
}
