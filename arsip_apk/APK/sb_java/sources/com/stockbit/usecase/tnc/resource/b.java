package com.stockbit.usecase.tnc.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f163099a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f163099a = r2;
        }

        public final DomainExodusException a() {
            return this.f163099a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163099a, ((a) r4).f163099a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163099a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f163099a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.tnc.resource.b$b, reason: collision with other inner class name */
    public static final class C1669b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1669b f163100a = null;

        static {
            f163100a = new C1669b();
        }

        public C1669b() {
            super(null);
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f163101a;

        public c(String r2) {
            p.l(r2, "message");
            super(null);
            this.f163101a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163101a, ((c) r4).f163101a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163101a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f163101a + ")";
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
