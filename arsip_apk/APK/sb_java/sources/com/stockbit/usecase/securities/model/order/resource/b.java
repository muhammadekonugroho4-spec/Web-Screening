package com.stockbit.usecase.securities.model.order.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f161432a;

        public a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f161432a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f161432a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f161432a, ((a) r4).f161432a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f161432a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f161432a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.securities.model.order.resource.b$b, reason: collision with other inner class name */
    public static final class C1632b implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1632b f161433a = null;

        static {
            f161433a = new C1632b();
        }

        public C1632b() {
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f161434a;

        public c(String r2) {
            p.l(r2, "orderId");
            this.f161434a = r2;
        }

        public final String a() {
            return this.f161434a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f161434a, ((c) r4).f161434a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f161434a.hashCode();
        }

        public String toString() {
            return "Success(orderId=" + this.f161434a + ")";
        }
    }
}
