package com.stockbit.usecase.alert.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.alert.resource.a$a, reason: collision with other inner class name */
    public static final class C1397a extends a {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f154368a;

        public C1397a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f154368a = r2;
        }

        public final DomainExodusException a() {
            return this.f154368a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1397a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f154368a, ((C1397a) r4).f154368a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f154368a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f154368a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f154369a = null;

        static {
            f154369a = new b();
        }

        public b() {
            super(null);
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
