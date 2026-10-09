package com.stockbit.domains.usecase.eipo.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface a {

    /* renamed from: com.stockbit.domains.usecase.eipo.resource.a$a, reason: collision with other inner class name */
    public static final class C0833a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f88279a;

        public C0833a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f88279a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f88279a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0833a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f88279a, ((C0833a) r4).f88279a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88279a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f88279a + ")";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f88280a = null;

        static {
            f88280a = new b();
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
            return -989690922;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f88281a;

        public c(String r2) {
            p.l(r2, "orderId");
            this.f88281a = r2;
        }

        public final String a() {
            return this.f88281a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f88281a, ((c) r4).f88281a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88281a.hashCode();
        }

        public String toString() {
            return "Success(orderId=" + this.f88281a + ")";
        }
    }
}
