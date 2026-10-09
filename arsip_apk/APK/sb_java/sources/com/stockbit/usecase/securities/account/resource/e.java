package com.stockbit.usecase.securities.account.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f160209a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f160209a = r2;
        }

        public final DomainExodusException a() {
            return this.f160209a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160209a, ((a) r4).f160209a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160209a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f160209a + ")";
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f160210a = null;

        static {
            f160210a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final c f160211a = null;

        static {
            f160211a = new c();
        }

        public c() {
            super(null);
        }
    }

    public /* synthetic */ e(i r1) {
        this();
    }

    public e() {
    }
}
