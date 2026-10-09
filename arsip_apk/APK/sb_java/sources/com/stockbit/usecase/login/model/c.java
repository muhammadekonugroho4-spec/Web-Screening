package com.stockbit.usecase.login.model;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f158350a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f158350a = r2;
        }

        public final DomainExodusException a() {
            return this.f158350a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f158350a, ((a) r4).f158350a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158350a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158350a + ')';
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f158351a = null;

        static {
            f158351a = new b();
        }

        public b() {
            super(null);
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
            return 1370993478;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ c(kotlin.jvm.internal.i r1) {
        this();
    }

    public c() {
    }
}
