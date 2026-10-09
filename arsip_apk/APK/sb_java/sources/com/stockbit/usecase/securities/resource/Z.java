package com.stockbit.usecase.securities.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;

/* loaded from: classes2.dex */
public interface Z {

    public static final class a implements Z {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f162112a;

        public a(DomainSecuritiesException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f162112a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f162112a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162112a, ((a) r4).f162112a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162112a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f162112a + ")";
        }
    }

    public static final class b implements Z {

        /* renamed from: a, reason: collision with root package name */
        public static final b f162113a = null;

        static {
            f162113a = new b();
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
            return 231535520;
        }

        public String toString() {
            return "Initial";
        }
    }

    public static final class c implements Z {

        /* renamed from: a, reason: collision with root package name */
        public static final c f162114a = null;

        static {
            f162114a = new c();
        }

        public c() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1380156008;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d implements Z {

        /* renamed from: a, reason: collision with root package name */
        public final String f162115a;

        public d(String r2) {
            kotlin.jvm.internal.p.l(r2, "orderId");
            this.f162115a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162115a, ((d) r4).f162115a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162115a.hashCode();
        }

        public String toString() {
            return "Success(orderId=" + this.f162115a + ")";
        }
    }
}
