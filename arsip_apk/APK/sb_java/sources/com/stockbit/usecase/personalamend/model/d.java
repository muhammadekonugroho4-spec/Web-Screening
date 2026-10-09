package com.stockbit.usecase.personalamend.model;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f159042a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f159042a = r2;
        }

        public final DomainExodusException a() {
            return this.f159042a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159042a, ((a) r4).f159042a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159042a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f159042a + ")";
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public final String f159043a;

        public b(String r2) {
            p.l(r2, "token");
            super(null);
            this.f159043a = r2;
        }

        public final String a() {
            return this.f159043a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159043a, ((b) r4).f159043a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159043a.hashCode();
        }

        public String toString() {
            return "Token(token=" + this.f159043a + ")";
        }
    }

    public /* synthetic */ d(kotlin.jvm.internal.i r1) {
        this();
    }

    public d() {
    }
}
