package com.stockbit.usecase.alert.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f154374a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f154374a = r2;
        }

        public final DomainExodusException a() {
            return this.f154374a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f154374a, ((a) r4).f154374a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f154374a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f154374a + ")";
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public String f154375a;

        public b(String r2) {
            p.l(r2, "message");
            super(null);
            this.f154375a = r2;
        }

        public final String a() {
            return this.f154375a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f154375a, ((b) r4).f154375a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f154375a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f154375a + ")";
        }
    }

    public /* synthetic */ d(i r1) {
        this();
    }

    public d() {
    }
}
