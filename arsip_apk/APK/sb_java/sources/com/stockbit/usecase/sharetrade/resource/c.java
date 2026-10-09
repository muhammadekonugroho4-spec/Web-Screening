package com.stockbit.usecase.sharetrade.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f162932a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f162932a = r2;
        }

        public final DomainExodusException a() {
            return this.f162932a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f162932a, ((a) r4).f162932a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162932a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f162932a + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f162933a = null;

        static {
            f162933a = new b();
        }

        public b() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.usecase.sharetrade.resource.c$c, reason: collision with other inner class name */
    public static final class C1658c extends c {

        /* renamed from: a, reason: collision with root package name */
        public String f162934a;

        public C1658c(String r2) {
            p.l(r2, "message");
            super(null);
            this.f162934a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1658c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f162934a, ((C1658c) r4).f162934a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162934a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f162934a + ")";
        }
    }

    public /* synthetic */ c(i r1) {
        this();
    }

    public c() {
    }
}
