package com.stockbit.usecase.personalamend.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.stockbit.usecase.personalamend.resource.a$a, reason: collision with other inner class name */
    public static final class C1552a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f159094a;

        public C1552a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f159094a = r2;
        }

        public final DomainExodusException a() {
            return this.f159094a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1552a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159094a, ((C1552a) r4).f159094a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159094a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f159094a + ")";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f159095a;

        public b(String r1) {
            this.f159095a = r1;
        }

        public final String a() {
            return this.f159095a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159095a, ((b) r4).f159095a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f159095a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f159095a + ")";
        }
    }
}
