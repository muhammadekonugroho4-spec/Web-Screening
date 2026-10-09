package com.stockbit.domains.usecase.eipo.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface g {

    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f88295a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f88295a = r2;
        }

        public final DomainExodusException a() {
            return this.f88295a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f88295a, ((a) r4).f88295a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88295a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f88295a + ")";
        }
    }

    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final b f88296a = null;

        static {
            f88296a = new b();
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
            return -1227907597;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements g {

        /* renamed from: a, reason: collision with root package name */
        public final List f88297a;

        public c(List r2) {
            p.l(r2, "eIpoEntities");
            this.f88297a = r2;
        }

        public final List a() {
            return this.f88297a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f88297a, ((c) r4).f88297a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88297a.hashCode();
        }

        public String toString() {
            return "Success(eIpoEntities=" + this.f88297a + ")";
        }
    }
}
