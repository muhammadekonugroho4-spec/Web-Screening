package com.stockbit.usecase.sharetrade.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f162938a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f162938a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f162938a, ((a) r4).f162938a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162938a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f162938a + ")";
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f162939a = null;

        static {
            f162939a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public String f162940a;

        public c(String r2) {
            p.l(r2, "message");
            super(null);
            this.f162940a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f162940a, ((c) r4).f162940a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162940a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f162940a + ")";
        }
    }

    public /* synthetic */ e(i r1) {
        this();
    }

    public e() {
    }
}
