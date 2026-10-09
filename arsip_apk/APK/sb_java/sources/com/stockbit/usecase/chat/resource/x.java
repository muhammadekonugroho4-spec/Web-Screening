package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public abstract class x {

    public static final class a extends x {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155840a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155840a = r2;
        }

        public final DomainExodusException a() {
            return this.f155840a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155840a, ((a) r4).f155840a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155840a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155840a + ")";
        }
    }

    public static final class b extends x {

        /* renamed from: a, reason: collision with root package name */
        public final String f155841a;

        public b(String r2) {
            kotlin.jvm.internal.p.l(r2, "message");
            super(null);
            this.f155841a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155841a, ((b) r4).f155841a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155841a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f155841a + ")";
        }
    }

    public /* synthetic */ x(kotlin.jvm.internal.i r1) {
        this();
    }

    public x() {
    }
}
