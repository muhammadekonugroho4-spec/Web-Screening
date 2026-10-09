package com.stockbit.usecase.securities.account.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface d {

    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f160206a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f160206a = r2;
        }

        public final DomainExodusException a() {
            return this.f160206a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160206a, ((a) r4).f160206a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160206a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f160206a + ")";
        }
    }

    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f160207a = null;

        static {
            f160207a = new b();
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
            return -1378008147;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final c f160208a = null;

        static {
            f160208a = new c();
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
            return 713138804;
        }

        public String toString() {
            return "Success";
        }
    }
}
