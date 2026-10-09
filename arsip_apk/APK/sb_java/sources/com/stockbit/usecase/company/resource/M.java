package com.stockbit.usecase.company.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class M {

    public static final class a extends M {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f156759a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f156759a = r2;
        }

        public final DomainExodusException a() {
            return this.f156759a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156759a, ((a) r4).f156759a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156759a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f156759a + ")";
        }
    }

    public static final class b extends M {

        /* renamed from: a, reason: collision with root package name */
        public static final b f156760a = null;

        static {
            f156760a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends M {

        /* renamed from: a, reason: collision with root package name */
        public final List f156761a;

        public c(List r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f156761a = r2;
        }

        public final List a() {
            return this.f156761a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156761a, ((c) r4).f156761a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156761a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f156761a + ")";
        }
    }

    public static final class d extends M {

        /* renamed from: a, reason: collision with root package name */
        public static final d f156762a = null;

        static {
            f156762a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ M(kotlin.jvm.internal.i r1) {
        this();
    }

    public M() {
    }
}
