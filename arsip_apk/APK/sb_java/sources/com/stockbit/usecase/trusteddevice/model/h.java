package com.stockbit.usecase.trusteddevice.model;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class h {

    public static final class a extends h {

        /* renamed from: a, reason: collision with root package name */
        public final long f164215a;

        public a(long r2) {
            super(null);
            this.f164215a = r2;
        }

        public final long a() {
            return this.f164215a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f164215a == ((a) r8).f164215a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f164215a);
        }

        public String toString() {
            return "AppCheckFailed(timeLeftInMillis=" + this.f164215a + ')';
        }
    }

    public static final class b extends h {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f164216a;

        public b(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f164216a = r2;
        }

        public final DomainExodusException a() {
            return this.f164216a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164216a, ((b) r4).f164216a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164216a.hashCode();
        }

        public String toString() {
            return "ErrorElse(error=" + this.f164216a + ')';
        }
    }

    public static final class c extends h {

        /* renamed from: a, reason: collision with root package name */
        public static final c f164217a = null;

        static {
            f164217a = new c();
        }

        public c() {
            super(null);
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
            return 72385886;
        }

        public String toString() {
            return "MaxRetryReached";
        }
    }

    public static final class d extends h {

        /* renamed from: a, reason: collision with root package name */
        public final String f164218a;

        public d(String r2) {
            super(null);
            this.f164218a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164218a, ((d) r4).f164218a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f164218a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f164218a + ')';
        }
    }

    public /* synthetic */ h(kotlin.jvm.internal.i r1) {
        this();
    }

    public h() {
    }
}
