package com.stockbit.usecase.securities.resource.websocket;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.stockbit.usecase.securities.resource.websocket.a$a, reason: collision with other inner class name */
    public static final class C1639a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1639a f162214a = null;

        static {
            f162214a = new C1639a();
        }

        public C1639a() {
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f162215a;

        public b(String r1) {
            this.f162215a = r1;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f162215a, ((b) r4).f162215a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f162215a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.f162215a + ")";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f162216a = null;

        static {
            f162216a = new c();
        }

        public c() {
        }
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.securities.model.fasttrade.e f162217a;

        public d(com.stockbit.usecase.securities.model.fasttrade.e r2) {
            p.l(r2, "uiState");
            this.f162217a = r2;
        }

        public final com.stockbit.usecase.securities.model.fasttrade.e a() {
            return this.f162217a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f162217a, ((d) r4).f162217a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162217a.hashCode();
        }

        public String toString() {
            return "Success(uiState=" + this.f162217a + ")";
        }
    }

    public static final class e implements a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f162218a;

        public e(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f162218a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof e) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f162218a, ((e) r4).f162218a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162218a.hashCode();
        }

        public String toString() {
            return "Unauthorized(error=" + this.f162218a + ")";
        }
    }
}
