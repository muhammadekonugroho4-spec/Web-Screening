package com.istockbit.usecase.amendbank.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: com.istockbit.usecase.amendbank.resource.a$a, reason: collision with other inner class name */
    public static final class C0438a extends a {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f41004a;

        public C0438a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f41004a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0438a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f41004a, ((C0438a) r4).f41004a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f41004a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f41004a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f41005a = null;

        static {
            f41005a = new b();
        }

        public b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 511170628;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f41006a = null;

        static {
            f41006a = new c();
        }

        public c() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1692649717;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
