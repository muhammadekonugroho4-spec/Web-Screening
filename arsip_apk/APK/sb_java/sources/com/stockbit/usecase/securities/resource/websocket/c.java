package com.stockbit.usecase.securities.resource.websocket;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import com.stockbit.usecase.securities.model.order.p;

/* loaded from: classes2.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final p f162222a;

        public a(p r2) {
            kotlin.jvm.internal.p.l(r2, "uiState");
            this.f162222a = r2;
        }

        public final p a() {
            return this.f162222a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162222a, ((a) r4).f162222a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162222a.hashCode();
        }

        public String toString() {
            return "Success(uiState=" + this.f162222a + ")";
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f162223a;

        public b(DomainSecuritiesException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f162223a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f162223a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162223a, ((b) r4).f162223a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162223a.hashCode();
        }

        public String toString() {
            return "Unauthorized(error=" + this.f162223a + ")";
        }
    }
}
