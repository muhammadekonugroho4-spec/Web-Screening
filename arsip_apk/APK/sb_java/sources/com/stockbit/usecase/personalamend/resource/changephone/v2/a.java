package com.stockbit.usecase.personalamend.resource.changephone.v2;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.stockbit.usecase.personalamend.resource.changephone.v2.a$a, reason: collision with other inner class name */
    public static final class C1577a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f159179a;

        public C1577a(String r2) {
            p.l(r2, "message");
            this.f159179a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1577a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159179a, ((C1577a) r4).f159179a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159179a.hashCode();
        }

        public String toString() {
            return "InvalidSession(message=" + this.f159179a + ")";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f159180a;

        public b(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f159180a = r2;
        }

        public final DomainExodusException a() {
            return this.f159180a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159180a, ((b) r4).f159180a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159180a.hashCode();
        }

        public String toString() {
            return "OtherError(error=" + this.f159180a + ")";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f159181a;

        public c(String r2) {
            p.l(r2, "message");
            this.f159181a = r2;
        }

        public final String a() {
            return this.f159181a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159181a, ((c) r4).f159181a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159181a.hashCode();
        }

        public String toString() {
            return "OtpLimit(message=" + this.f159181a + ")";
        }
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f159182a;

        /* renamed from: b, reason: collision with root package name */
        public final long f159183b;

        public d(String r2, long r3) {
            p.l(r2, "token");
            this.f159182a = r2;
            this.f159183b = r3;
        }

        public final long a() {
            return this.f159183b;
        }

        public final String b() {
            return this.f159182a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof d) == true) goto L8;
            return false;
        L8:
            d r82 = (d) r8;
            if (p.g(this.f159182a, r82.f159182a) == true) goto L12;
            return false;
        L12:
            if (this.f159183b == r82.f159183b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159182a.hashCode() * 31) + Long.hashCode(this.f159183b);
        }

        public String toString() {
            return "Success(token=" + this.f159182a + ", nextAttemptTime=" + this.f159183b + ")";
        }
    }
}
