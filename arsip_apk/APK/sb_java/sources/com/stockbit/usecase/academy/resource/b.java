package com.stockbit.usecase.academy.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f154315a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f154315a = r2;
        }

        public final DomainExodusException a() {
            return this.f154315a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f154315a, ((a) r4).f154315a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f154315a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f154315a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.academy.resource.b$b, reason: collision with other inner class name */
    public static final class C1395b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f154316a;

        public C1395b(String r2) {
            p.l(r2, "webUrl");
            super(null);
            this.f154316a = r2;
        }

        public final String a() {
            return this.f154316a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1395b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f154316a, ((C1395b) r4).f154316a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f154316a.hashCode();
        }

        public String toString() {
            return "Success(webUrl=" + this.f154316a + ")";
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
