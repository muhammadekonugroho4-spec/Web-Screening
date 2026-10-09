package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public abstract class I {

    public static final class a extends I {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155753a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155753a = r2;
        }

        public final DomainExodusException a() {
            return this.f155753a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155753a, ((a) r4).f155753a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155753a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155753a + ")";
        }
    }

    public static final class b extends I {

        /* renamed from: a, reason: collision with root package name */
        public final String f155754a;

        public b(String r2) {
            kotlin.jvm.internal.p.l(r2, "message");
            super(null);
            this.f155754a = r2;
        }

        public final String a() {
            return this.f155754a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155754a, ((b) r4).f155754a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155754a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f155754a + ")";
        }
    }

    public /* synthetic */ I(kotlin.jvm.internal.i r1) {
        this();
    }

    public I() {
    }
}
