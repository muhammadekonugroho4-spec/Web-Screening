package com.stockbit.usecase.alert.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f154370a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f154370a = r2;
        }

        public final DomainExodusException a() {
            return this.f154370a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f154370a, ((a) r4).f154370a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f154370a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f154370a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.alert.resource.b$b, reason: collision with other inner class name */
    public static final class C1398b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1398b f154371a = null;

        static {
            f154371a = new C1398b();
        }

        public C1398b() {
            super(null);
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
