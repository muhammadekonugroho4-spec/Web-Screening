package com.stockbit.usecase.trusteddevice.resource.login;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public interface d {

    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f164323a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f164323a = r2;
        }

        public final DomainExodusException a() {
            return this.f164323a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f164323a, ((a) r4).f164323a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164323a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f164323a + ')';
        }
    }

    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164324a = null;

        static {
            f164324a = new b();
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
            return -1412770604;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final String f164325a;

        /* renamed from: b, reason: collision with root package name */
        public final String f164326b;

        public c(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "loginToken");
            kotlin.jvm.internal.p.l(r3, "verificationToken");
            this.f164325a = r2;
            this.f164326b = r3;
        }

        public final String a() {
            return this.f164325a;
        }

        public final String b() {
            return this.f164326b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f164325a, r52.f164325a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f164326b, r52.f164326b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f164325a.hashCode() * 31) + this.f164326b.hashCode();
        }

        public String toString() {
            return "Success(loginToken=" + this.f164325a + ", verificationToken=" + this.f164326b + ')';
        }
    }
}
