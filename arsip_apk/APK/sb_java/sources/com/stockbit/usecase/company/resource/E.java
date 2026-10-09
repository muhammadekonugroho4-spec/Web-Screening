package com.stockbit.usecase.company.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public abstract class E {

    public static final class a extends E {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f156733a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f156733a = r2;
        }

        public final DomainExodusException a() {
            return this.f156733a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156733a, ((a) r4).f156733a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156733a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f156733a + ")";
        }
    }

    public static final class b extends E {

        /* renamed from: a, reason: collision with root package name */
        public final String f156734a;

        public b(String r2) {
            kotlin.jvm.internal.p.l(r2, "webUrl");
            super(null);
            this.f156734a = r2;
        }

        public final String a() {
            return this.f156734a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156734a, ((b) r4).f156734a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156734a.hashCode();
        }

        public String toString() {
            return "Success(webUrl=" + this.f156734a + ")";
        }
    }

    public /* synthetic */ E(kotlin.jvm.internal.i r1) {
        this();
    }

    public E() {
    }
}
