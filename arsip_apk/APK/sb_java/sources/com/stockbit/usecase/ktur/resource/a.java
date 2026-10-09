package com.stockbit.usecase.ktur.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.ktur.resource.a$a, reason: collision with other inner class name */
    public static final class C1513a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1513a f158182a = null;

        static {
            f158182a = new C1513a();
        }

        public C1513a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1513a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -762889650;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f158183a;

        public b(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f158183a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158183a, ((b) r4).f158183a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158183a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158183a + ")";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f158184a = null;

        static {
            f158184a = new c();
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
            return -1032037891;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public com.stockbit.usecase.ktur.model.a f158185a;

        public d(com.stockbit.usecase.ktur.model.a r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f158185a = r2;
        }

        public final com.stockbit.usecase.ktur.model.a a() {
            return this.f158185a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158185a, ((d) r4).f158185a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158185a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f158185a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
