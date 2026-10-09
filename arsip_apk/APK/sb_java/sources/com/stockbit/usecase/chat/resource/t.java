package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public abstract class t {

    public static final class a extends t {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155826a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155826a = r2;
        }

        public final DomainExodusException a() {
            return this.f155826a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155826a, ((a) r4).f155826a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155826a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155826a + ")";
        }
    }

    public static final class b extends t {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f155827a;

        public b(boolean r2) {
            super(null);
            this.f155827a = r2;
        }

        public final boolean a() {
            return this.f155827a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f155827a == ((b) r4).f155827a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f155827a);
        }

        public String toString() {
            return "Success(hasNewMessages=" + this.f155827a + ")";
        }
    }

    public /* synthetic */ t(kotlin.jvm.internal.i r1) {
        this();
    }

    public t() {
    }
}
