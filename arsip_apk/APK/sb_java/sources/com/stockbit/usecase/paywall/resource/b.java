package com.stockbit.usecase.paywall.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f158978a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f158978a = r2;
        }

        public final DomainExodusException a() {
            return this.f158978a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158978a, ((a) r4).f158978a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158978a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158978a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.paywall.resource.b$b, reason: collision with other inner class name */
    public static final class C1546b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f158979a;

        public C1546b(String r2) {
            super(null);
            this.f158979a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1546b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158979a, ((C1546b) r4).f158979a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f158979a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f158979a + ")";
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
