package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public abstract class B {

    public static final class a extends B {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155731a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155731a = r2;
        }

        public final DomainExodusException a() {
            return this.f155731a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155731a, ((a) r4).f155731a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155731a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155731a + ")";
        }
    }

    public static final class b extends B {

        /* renamed from: a, reason: collision with root package name */
        public final String f155732a;

        public b(String r2) {
            kotlin.jvm.internal.p.l(r2, "url");
            super(null);
            this.f155732a = r2;
        }

        public final String a() {
            return this.f155732a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155732a, ((b) r4).f155732a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155732a.hashCode();
        }

        public String toString() {
            return "Success(url=" + this.f155732a + ")";
        }
    }

    public /* synthetic */ B(kotlin.jvm.internal.i r1) {
        this();
    }

    public B() {
    }
}
