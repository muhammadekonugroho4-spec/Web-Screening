package com.stockbit.usecase.watchlist.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f164585a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f164585a = r2;
        }

        public final DomainExodusException a() {
            return this.f164585a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164585a, ((a) r4).f164585a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164585a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f164585a + ")";
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164586a = null;

        static {
            f164586a = new b();
        }

        public b() {
            super(null);
        }
    }

    public /* synthetic */ e(kotlin.jvm.internal.i r1) {
        this();
    }

    public e() {
    }
}
