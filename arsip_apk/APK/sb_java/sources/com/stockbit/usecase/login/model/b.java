package com.stockbit.usecase.login.model;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f158347a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f158347a = r2;
        }

        public final DomainExodusException a() {
            return this.f158347a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f158347a, ((a) r4).f158347a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158347a.hashCode();
        }

        public String toString() {
            return "ErrorBiometricNotFound(error=" + this.f158347a + ')';
        }
    }

    /* renamed from: com.stockbit.usecase.login.model.b$b, reason: collision with other inner class name */
    public static final class C1524b extends b {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f158348a;

        public C1524b(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f158348a = r2;
        }

        public final DomainExodusException a() {
            return this.f158348a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1524b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f158348a, ((C1524b) r4).f158348a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158348a.hashCode();
        }

        public String toString() {
            return "ErrorGeneral(error=" + this.f158348a + ')';
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public String f158349a;

        public c(String r2) {
            kotlin.jvm.internal.p.l(r2, "challengeToken");
            super(null);
            this.f158349a = r2;
        }

        public final String a() {
            return this.f158349a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f158349a, ((c) r4).f158349a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158349a.hashCode();
        }

        public String toString() {
            return "Success(challengeToken=" + this.f158349a + ')';
        }
    }

    public /* synthetic */ b(kotlin.jvm.internal.i r1) {
        this();
    }

    public b() {
    }
}
