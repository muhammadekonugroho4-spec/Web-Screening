package com.stockbit.usecase.forgotpin.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.forgotpin.resource.a$a, reason: collision with other inner class name */
    public static final class C1499a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157993a;

        public C1499a(String r2) {
            p.l(r2, "message");
            super(null);
            this.f157993a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1499a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157993a, ((C1499a) r4).f157993a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157993a.hashCode();
        }

        public String toString() {
            return "InvalidSession(message=" + this.f157993a + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157994a;

        public b(String r2) {
            p.l(r2, "message");
            super(null);
            this.f157994a = r2;
        }

        public final String a() {
            return this.f157994a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157994a, ((b) r4).f157994a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157994a.hashCode();
        }

        public String toString() {
            return "OTPLimit(message=" + this.f157994a + ')';
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f157995a;

        public c(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f157995a = r2;
        }

        public final DomainExodusException a() {
            return this.f157995a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157995a, ((c) r4).f157995a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157995a.hashCode();
        }

        public String toString() {
            return "OtherError(error=" + this.f157995a + ')';
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157996a;

        /* renamed from: b, reason: collision with root package name */
        public final long f157997b;

        public d(String r2, long r3) {
            p.l(r2, "token");
            super(null);
            this.f157996a = r2;
            this.f157997b = r3;
        }

        public final long a() {
            return this.f157997b;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof d) == true) goto L8;
            return false;
        L8:
            d r82 = (d) r8;
            if (p.g(this.f157996a, r82.f157996a) == true) goto L12;
            return false;
        L12:
            if (this.f157997b == r82.f157997b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f157996a.hashCode() * 31) + Long.hashCode(this.f157997b);
        }

        public String toString() {
            return "Success(token=" + this.f157996a + ", nextAttemptTime=" + this.f157997b + ')';
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
