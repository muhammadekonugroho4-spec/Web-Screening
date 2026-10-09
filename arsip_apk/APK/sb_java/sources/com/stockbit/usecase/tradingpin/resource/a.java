package com.stockbit.usecase.tradingpin.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.tradingpin.resource.a$a, reason: collision with other inner class name */
    public static final class C1683a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f163666a;

        public C1683a(String r2) {
            p.l(r2, "message");
            super(null);
            this.f163666a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1683a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163666a, ((C1683a) r4).f163666a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163666a.hashCode();
        }

        public String toString() {
            return "InvalidSession(message=" + this.f163666a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f163667a;

        public b(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f163667a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f163667a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163667a, ((b) r4).f163667a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163667a.hashCode();
        }

        public String toString() {
            return "OtherError(error=" + this.f163667a + ")";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f163668a;

        public c(String r2) {
            p.l(r2, "message");
            super(null);
            this.f163668a = r2;
        }

        public final String a() {
            return this.f163668a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163668a, ((c) r4).f163668a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163668a.hashCode();
        }

        public String toString() {
            return "OtpLimit(message=" + this.f163668a + ")";
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f163669a;

        /* renamed from: b, reason: collision with root package name */
        public final long f163670b;

        public d(String r2, long r3) {
            p.l(r2, "sessionToken");
            super(null);
            this.f163669a = r2;
            this.f163670b = r3;
        }

        public final long a() {
            return this.f163670b;
        }

        public final String b() {
            return this.f163669a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof d) == true) goto L8;
            return false;
        L8:
            d r82 = (d) r8;
            if (p.g(this.f163669a, r82.f163669a) == true) goto L12;
            return false;
        L12:
            if (this.f163670b == r82.f163670b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f163669a.hashCode() * 31) + Long.hashCode(this.f163670b);
        }

        public String toString() {
            return "Success(sessionToken=" + this.f163669a + ", nextAttemptTime=" + this.f163670b + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
