package com.stockbit.usecase.personalamend.resource.forgotpassword;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.personalamend.resource.forgotpassword.a$a, reason: collision with other inner class name */
    public static final class C1586a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f159218a;

        public C1586a(String r2) {
            p.l(r2, "message");
            super(null);
            this.f159218a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1586a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159218a, ((C1586a) r4).f159218a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159218a.hashCode();
        }

        public String toString() {
            return "InvalidSession(message=" + this.f159218a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f159219a;

        public b(String r2) {
            p.l(r2, "message");
            super(null);
            this.f159219a = r2;
        }

        public final String a() {
            return this.f159219a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159219a, ((b) r4).f159219a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159219a.hashCode();
        }

        public String toString() {
            return "OTPError(message=" + this.f159219a + ")";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f159220a;

        public c(String r2) {
            p.l(r2, "message");
            super(null);
            this.f159220a = r2;
        }

        public final String a() {
            return this.f159220a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159220a, ((c) r4).f159220a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159220a.hashCode();
        }

        public String toString() {
            return "OTPLimit(message=" + this.f159220a + ")";
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f159221a;

        public d(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f159221a = r2;
        }

        public final DomainExodusException a() {
            return this.f159221a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159221a, ((d) r4).f159221a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159221a.hashCode();
        }

        public String toString() {
            return "OtherError(error=" + this.f159221a + ")";
        }
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f159222a;

        /* renamed from: b, reason: collision with root package name */
        public final long f159223b;

        public e(String r2, long r3) {
            p.l(r2, "token");
            super(null);
            this.f159222a = r2;
            this.f159223b = r3;
        }

        public final long a() {
            return this.f159223b;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof e) == true) goto L8;
            return false;
        L8:
            e r82 = (e) r8;
            if (p.g(this.f159222a, r82.f159222a) == true) goto L12;
            return false;
        L12:
            if (this.f159223b == r82.f159223b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159222a.hashCode() * 31) + Long.hashCode(this.f159223b);
        }

        public String toString() {
            return "Success(token=" + this.f159222a + ", nextAttemptTime=" + this.f159223b + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
