package com.stockbit.usecase.stream.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface i {

    public static final class a implements i {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f163089a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f163089a = r2;
        }

        public final DomainExodusException a() {
            return this.f163089a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163089a, ((a) r4).f163089a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163089a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f163089a + ")";
        }
    }

    public static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        public static final b f163090a = null;

        static {
            f163090a = new b();
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
            return -1845619793;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements i {

        /* renamed from: a, reason: collision with root package name */
        public final String f163091a;

        public c(String r2) {
            p.l(r2, "message");
            this.f163091a = r2;
        }

        public final String a() {
            return this.f163091a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163091a, ((c) r4).f163091a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163091a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f163091a + ")";
        }
    }
}
