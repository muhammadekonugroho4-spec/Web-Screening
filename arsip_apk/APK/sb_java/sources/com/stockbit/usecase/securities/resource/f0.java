package com.stockbit.usecase.securities.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;

/* loaded from: classes2.dex */
public interface f0 {

    public static final class a implements f0 {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f162148a;

        public a(DomainSecuritiesException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f162148a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f162148a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162148a, ((a) r4).f162148a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162148a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f162148a + ")";
        }
    }

    public static final class b implements f0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f162149a = null;

        static {
            f162149a = new b();
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
            return -597835410;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements f0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f162150a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f162151b;

        public c(String r2, boolean r3) {
            kotlin.jvm.internal.p.l(r2, "accountId");
            this.f162150a = r2;
            this.f162151b = r3;
        }

        public final boolean a() {
            return this.f162151b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f162150a, r52.f162150a) == true) goto L12;
            return false;
        L12:
            if (this.f162151b == r52.f162151b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f162150a.hashCode() * 31) + Boolean.hashCode(this.f162151b);
        }

        public String toString() {
            return "Success(accountId=" + this.f162150a + ", isMainAccount=" + this.f162151b + ")";
        }
    }
}
