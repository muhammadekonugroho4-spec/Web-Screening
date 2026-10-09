package com.stockbit.usecase.securities.model.order.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.stockbit.usecase.securities.model.order.resource.a$a, reason: collision with other inner class name */
    public static final class C1631a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f161430a;

        public C1631a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f161430a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f161430a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1631a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f161430a, ((C1631a) r4).f161430a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f161430a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f161430a + ")";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f161431a;

        public b(String r2) {
            p.l(r2, "message");
            this.f161431a = r2;
        }

        public final String a() {
            return this.f161431a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f161431a, ((b) r4).f161431a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f161431a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f161431a + ")";
        }
    }
}
