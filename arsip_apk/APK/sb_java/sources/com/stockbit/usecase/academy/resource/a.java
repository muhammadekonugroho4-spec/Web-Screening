package com.stockbit.usecase.academy.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.academy.resource.a$a, reason: collision with other inner class name */
    public static final class C1394a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f154312a;

        public C1394a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f154312a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1394a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f154312a, ((C1394a) r4).f154312a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f154312a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f154312a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f154313a = null;

        static {
            f154313a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f154314a;

        public c(String r2) {
            p.l(r2, "webUrl");
            super(null);
            this.f154314a = r2;
        }

        public final String a() {
            return this.f154314a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f154314a, ((c) r4).f154314a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f154314a.hashCode();
        }

        public String toString() {
            return "Success(webUrl=" + this.f154314a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
