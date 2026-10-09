package com.stockbit.usecase.login.model;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.login.model.a$a, reason: collision with other inner class name */
    public static final class C1523a extends a {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f158345a;

        public C1523a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f158345a = r2;
        }

        public final DomainExodusException a() {
            return this.f158345a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1523a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f158345a, ((C1523a) r4).f158345a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158345a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158345a + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f158346a = null;

        static {
            f158346a = new b();
        }

        public b() {
            super(null);
        }
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }

    public a() {
    }
}
