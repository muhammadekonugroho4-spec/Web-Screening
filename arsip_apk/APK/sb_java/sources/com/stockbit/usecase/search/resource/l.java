package com.stockbit.usecase.search.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class l {

    public static final class a extends l {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f160146a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f160146a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160146a, ((a) r4).f160146a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160146a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f160146a + ")";
        }
    }

    public static final class b extends l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f160147a = null;

        static {
            f160147a = new b();
        }

        public b() {
            super(null);
        }
    }

    public /* synthetic */ l(kotlin.jvm.internal.i r1) {
        this();
    }

    public l() {
    }
}
