package com.stockbit.personalamend.delegation.changepassword;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: com.stockbit.personalamend.delegation.changepassword.a$a, reason: collision with other inner class name */
    public static final class C1091a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1091a f125015a = null;

        static {
            f125015a = new C1091a();
        }

        public C1091a() {
            super(null);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f125016a;

        static {
        }

        public b(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f125016a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f125016a, ((b) r4).f125016a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f125016a.hashCode();
        }

        public String toString() {
            return "ShowErrorInvalidSession(error=" + this.f125016a + ')';
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f125017a;

        static {
        }

        public c(String r2) {
            p.l(r2, "errorMessage");
            super(null);
            this.f125017a = r2;
        }

        public final String a() {
            return this.f125017a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f125017a, ((c) r4).f125017a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f125017a.hashCode();
        }

        public String toString() {
            return "ShowErrorMessage(errorMessage=" + this.f125017a + ')';
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f125018a = null;

        static {
            f125018a = new d();
        }

        public d() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
