package com.stockbit.usecase.securities.account.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.stockbit.usecase.securities.account.resource.a$a, reason: collision with other inner class name */
    public static final class C1609a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f160195a;

        public C1609a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f160195a = r2;
        }

        public final DomainExodusException a() {
            return this.f160195a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1609a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160195a, ((C1609a) r4).f160195a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160195a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f160195a + ")";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f160196a = null;

        static {
            f160196a = new b();
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
            return 1185341197;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f160197a;

        /* renamed from: b, reason: collision with root package name */
        public final String f160198b;

        public c(String r2, String r3) {
            p.l(r2, "url");
            p.l(r3, "exit");
            this.f160197a = r2;
            this.f160198b = r3;
        }

        public final String a() {
            return this.f160198b;
        }

        public final String b() {
            return this.f160197a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f160197a, r52.f160197a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f160198b, r52.f160198b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f160197a.hashCode() * 31) + this.f160198b.hashCode();
        }

        public String toString() {
            return "Success(url=" + this.f160197a + ", exit=" + this.f160198b + ")";
        }
    }
}
