package com.stockbit.usecase.trusteddevice.model;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class g {

    public static final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f164213a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f164213a = r2;
        }

        public final DomainExodusException a() {
            return this.f164213a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164213a, ((a) r4).f164213a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164213a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f164213a + ')';
        }
    }

    public static final class b extends g {

        /* renamed from: a, reason: collision with root package name */
        public final String f164214a;

        public b(String r2) {
            super(null);
            this.f164214a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164214a, ((b) r4).f164214a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f164214a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f164214a + ')';
        }
    }

    public /* synthetic */ g(kotlin.jvm.internal.i r1) {
        this();
    }

    public g() {
    }
}
