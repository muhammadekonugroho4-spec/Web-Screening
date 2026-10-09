package com.stockbit.usecase.forgotphone.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.stockbit.usecase.forgotphone.resource.a$a, reason: collision with other inner class name */
    public static final class C1493a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157959a;

        public C1493a(String r2) {
            p.l(r2, "message");
            this.f157959a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1493a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157959a, ((C1493a) r4).f157959a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157959a.hashCode();
        }

        public String toString() {
            return "InvalidSession(message=" + this.f157959a + ")";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f157960a;

        public b(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f157960a = r2;
        }

        public final DomainExodusException a() {
            return this.f157960a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157960a, ((b) r4).f157960a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157960a.hashCode();
        }

        public String toString() {
            return "OtherError(error=" + this.f157960a + ")";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157961a;

        public c(String r2) {
            p.l(r2, "message");
            this.f157961a = r2;
        }

        public final String a() {
            return this.f157961a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157961a, ((c) r4).f157961a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157961a.hashCode();
        }

        public String toString() {
            return "OtpLimit(message=" + this.f157961a + ")";
        }
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157962a;

        /* renamed from: b, reason: collision with root package name */
        public final long f157963b;

        public d(String r2, long r3) {
            p.l(r2, "token");
            this.f157962a = r2;
            this.f157963b = r3;
        }

        public final long a() {
            return this.f157963b;
        }

        public final String b() {
            return this.f157962a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof d) == true) goto L8;
            return false;
        L8:
            d r82 = (d) r8;
            if (p.g(this.f157962a, r82.f157962a) == true) goto L12;
            return false;
        L12:
            if (this.f157963b == r82.f157963b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f157962a.hashCode() * 31) + Long.hashCode(this.f157963b);
        }

        public String toString() {
            return "Success(token=" + this.f157962a + ", nextAttemptTime=" + this.f157963b + ")";
        }
    }
}
