package com.stockbit.usecase.trading.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.stockbit.usecase.trading.resource.a$a, reason: collision with other inner class name */
    public static final class C1675a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f163331a;

        public C1675a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f163331a = r2;
        }

        public final DomainExodusException a() {
            return this.f163331a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1675a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163331a, ((C1675a) r4).f163331a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163331a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f163331a + ")";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f163332a = null;

        static {
            f163332a = new b();
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
            return -1572638462;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f163333a;

        public c(String r2) {
            p.l(r2, "fileName");
            this.f163333a = r2;
        }

        public final String a() {
            return this.f163333a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163333a, ((c) r4).f163333a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163333a.hashCode();
        }

        public String toString() {
            return "Success(fileName=" + this.f163333a + ")";
        }
    }
}
