package com.stockbit.usecase.personalamend.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class i {

    public static final class a extends i {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f159245a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f159245a = r2;
        }

        public final DomainExodusException a() {
            return this.f159245a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159245a, ((a) r4).f159245a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159245a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f159245a + ")";
        }
    }

    public static final class b extends i {

        /* renamed from: a, reason: collision with root package name */
        public static final b f159246a = null;

        static {
            f159246a = new b();
        }

        public b() {
            super(null);
        }
    }

    public /* synthetic */ i(kotlin.jvm.internal.i r1) {
        this();
    }

    public i() {
    }
}
