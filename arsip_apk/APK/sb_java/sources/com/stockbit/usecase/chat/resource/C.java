package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public abstract class C {

    public static final class a extends C {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155733a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155733a = r2;
        }

        public final DomainExodusException a() {
            return this.f155733a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155733a, ((a) r4).f155733a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155733a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155733a + ")";
        }
    }

    public static final class b extends C {

        /* renamed from: a, reason: collision with root package name */
        public static final b f155734a = null;

        static {
            f155734a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends C {

        /* renamed from: a, reason: collision with root package name */
        public static final c f155735a = null;

        static {
            f155735a = new c();
        }

        public c() {
            super(null);
        }
    }

    public /* synthetic */ C(kotlin.jvm.internal.i r1) {
        this();
    }

    public C() {
    }
}
