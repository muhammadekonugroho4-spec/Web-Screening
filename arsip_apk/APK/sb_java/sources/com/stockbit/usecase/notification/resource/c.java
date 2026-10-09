package com.stockbit.usecase.notification.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f158656a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f158656a = r2;
        }

        public final DomainExodusException a() {
            return this.f158656a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158656a, ((a) r4).f158656a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158656a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158656a + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f158657a = null;

        static {
            f158657a = new b();
        }

        public b() {
            super(null);
        }
    }

    public /* synthetic */ c(i r1) {
        this();
    }

    public c() {
    }
}
