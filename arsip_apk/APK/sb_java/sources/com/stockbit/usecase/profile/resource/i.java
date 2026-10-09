package com.stockbit.usecase.profile.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class i {

    public static final class a extends i {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f159504a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f159504a = r2;
        }

        public final DomainExodusException a() {
            return this.f159504a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159504a, ((a) r4).f159504a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159504a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f159504a + ')';
        }
    }

    public static final class b extends i {

        /* renamed from: a, reason: collision with root package name */
        public static final b f159505a = null;

        static {
            f159505a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends i {

        /* renamed from: a, reason: collision with root package name */
        public final String f159506a;

        public c(String r2) {
            p.l(r2, "message");
            super(null);
            this.f159506a = r2;
        }

        public final String a() {
            return this.f159506a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159506a, ((c) r4).f159506a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159506a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f159506a + ')';
        }
    }

    public /* synthetic */ i(kotlin.jvm.internal.i r1) {
        this();
    }

    public i() {
    }
}
