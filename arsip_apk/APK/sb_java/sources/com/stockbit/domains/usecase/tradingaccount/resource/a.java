package com.stockbit.domains.usecase.tradingaccount.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: com.stockbit.domains.usecase.tradingaccount.resource.a$a, reason: collision with other inner class name */
    public static final class C0845a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f88556a;

        public C0845a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f88556a = r2;
        }

        public final DomainExodusException a() {
            return this.f88556a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0845a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f88556a, ((C0845a) r4).f88556a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88556a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f88556a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f88557a;

        public b(String r2) {
            p.l(r2, "url");
            super(null);
            this.f88557a = r2;
        }

        public final String a() {
            return this.f88557a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f88557a, ((b) r4).f88557a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88557a.hashCode();
        }

        public String toString() {
            return "Success(url=" + this.f88557a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
