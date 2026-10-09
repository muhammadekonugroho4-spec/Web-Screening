package com.stockbit.usecase.screener.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f159779a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f159779a = r2;
        }

        public final DomainExodusException a() {
            return this.f159779a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159779a, ((a) r4).f159779a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159779a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f159779a + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f159780a;

        public b(String r2) {
            p.l(r2, "message");
            super(null);
            this.f159780a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159780a, ((b) r4).f159780a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159780a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f159780a + ")";
        }
    }

    public /* synthetic */ c(i r1) {
        this();
    }

    public c() {
    }
}
