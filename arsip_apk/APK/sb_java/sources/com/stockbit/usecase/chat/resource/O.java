package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public abstract class O {

    public static final class a extends O {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155768a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155768a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155768a, ((a) r4).f155768a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155768a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155768a + ")";
        }
    }

    public static final class b extends O {

        /* renamed from: a, reason: collision with root package name */
        public static final b f155769a = null;

        static {
            f155769a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends O {

        /* renamed from: a, reason: collision with root package name */
        public final String f155770a;

        public c(String r2) {
            kotlin.jvm.internal.p.l(r2, "url");
            super(null);
            this.f155770a = r2;
        }

        public final String a() {
            return this.f155770a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155770a, ((c) r4).f155770a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155770a.hashCode();
        }

        public String toString() {
            return "Success(url=" + this.f155770a + ")";
        }
    }

    public /* synthetic */ O(kotlin.jvm.internal.i r1) {
        this();
    }

    public O() {
    }
}
