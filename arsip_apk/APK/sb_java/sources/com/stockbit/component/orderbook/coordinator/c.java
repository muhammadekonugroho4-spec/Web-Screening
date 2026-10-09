package com.stockbit.component.orderbook.coordinator;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f72874a = 0;

    public static final class a extends c {

        /* renamed from: b, reason: collision with root package name */
        public final DomainExodusException f72875b;

        static {
        }

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f72875b = r2;
        }

        public final DomainExodusException a() {
            return this.f72875b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f72875b, ((a) r4).f72875b) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f72875b.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f72875b + ')';
        }
    }

    static {
    }

    public /* synthetic */ c(i r1) {
        this();
    }

    public c() {
    }
}
