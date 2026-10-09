package com.stockbit.usecase.search.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class k {

    public static final class a extends k {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f160144a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f160144a = r2;
        }

        public final DomainExodusException a() {
            return this.f160144a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160144a, ((a) r4).f160144a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160144a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f160144a + ")";
        }
    }

    public static final class b extends k {

        /* renamed from: a, reason: collision with root package name */
        public static final b f160145a = null;

        static {
            f160145a = new b();
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
            return -1008615304;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ k(kotlin.jvm.internal.i r1) {
        this();
    }

    public k() {
    }
}
