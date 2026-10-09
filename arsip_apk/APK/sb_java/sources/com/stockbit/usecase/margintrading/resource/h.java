package com.stockbit.usecase.margintrading.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class h {

    public static final class a extends h {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f158478a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f158478a = r2;
        }

        public final DomainExodusException a() {
            return this.f158478a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158478a, ((a) r4).f158478a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158478a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158478a + ")";
        }
    }

    public static final class b extends h {

        /* renamed from: a, reason: collision with root package name */
        public final String f158479a;

        public b(String r2) {
            p.l(r2, "signatureUrl");
            super(null);
            this.f158479a = r2;
        }

        public final String a() {
            return this.f158479a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158479a, ((b) r4).f158479a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158479a.hashCode();
        }

        public String toString() {
            return "Success(signatureUrl=" + this.f158479a + ")";
        }
    }

    public /* synthetic */ h(i r1) {
        this();
    }

    public h() {
    }
}
