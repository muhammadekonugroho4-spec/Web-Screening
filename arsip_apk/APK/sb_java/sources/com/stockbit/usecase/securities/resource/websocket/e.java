package com.stockbit.usecase.securities.resource.websocket;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import com.stockbit.usecase.securities.model.portfolio.y;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface e {

    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public final y f162228a;

        public a(y r2) {
            p.l(r2, "portfolio");
            this.f162228a = r2;
        }

        public final y a() {
            return this.f162228a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f162228a, ((a) r4).f162228a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162228a.hashCode();
        }

        public String toString() {
            return "Success(portfolio=" + this.f162228a + ")";
        }
    }

    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f162229a;

        public b(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f162229a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f162229a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f162229a, ((b) r4).f162229a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162229a.hashCode();
        }

        public String toString() {
            return "Unauthorized(error=" + this.f162229a + ")";
        }
    }
}
