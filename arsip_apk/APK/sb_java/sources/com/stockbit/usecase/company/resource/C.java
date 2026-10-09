package com.stockbit.usecase.company.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class C {

    public static final class a extends C {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f156727a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f156727a = r2;
        }

        public final DomainExodusException a() {
            return this.f156727a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156727a, ((a) r4).f156727a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156727a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f156727a + ")";
        }
    }

    public static final class b extends C {

        /* renamed from: a, reason: collision with root package name */
        public static final b f156728a = null;

        static {
            f156728a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends C {

        /* renamed from: a, reason: collision with root package name */
        public final List f156729a;

        public c(List r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f156729a = r2;
        }

        public final List a() {
            return this.f156729a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156729a, ((c) r4).f156729a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156729a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f156729a + ")";
        }
    }

    public static final class d extends C {

        /* renamed from: a, reason: collision with root package name */
        public static final d f156730a = null;

        static {
            f156730a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ C(kotlin.jvm.internal.i r1) {
        this();
    }

    public C() {
    }
}
