package com.stockbit.usecase.margintrading.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class g {

    public static final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f158476a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f158476a = r2;
        }

        public final DomainExodusException a() {
            return this.f158476a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158476a, ((a) r4).f158476a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158476a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158476a + ")";
        }
    }

    public static final class b extends g {

        /* renamed from: a, reason: collision with root package name */
        public final String f158477a;

        public b(String r2) {
            p.l(r2, "popupMessage");
            super(null);
            this.f158477a = r2;
        }

        public final String a() {
            return this.f158477a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158477a, ((b) r4).f158477a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158477a.hashCode();
        }

        public String toString() {
            return "Success(popupMessage=" + this.f158477a + ")";
        }
    }

    public /* synthetic */ g(i r1) {
        this();
    }

    public g() {
    }
}
