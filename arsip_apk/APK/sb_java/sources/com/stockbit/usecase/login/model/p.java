package com.stockbit.usecase.login.model;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public interface p {

    public static final class a implements p {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f158373a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f158373a = r2;
        }

        public final DomainExodusException a() {
            return this.f158373a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f158373a, ((a) r4).f158373a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158373a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158373a + ')';
        }
    }

    public static final class b implements p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f158374a = null;

        static {
            f158374a = new b();
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
            return -1900650572;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f158375a = null;

        static {
            f158375a = new c();
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
            return 190496379;
        }

        public String toString() {
            return "Success";
        }
    }
}
