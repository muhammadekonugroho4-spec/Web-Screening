package com.stockbit.usecase.livestream.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f158285a = null;

        static {
            f158285a = new a();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f158286a;

        public b(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f158286a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158286a, ((b) r4).f158286a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158286a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158286a + ")";
        }
    }

    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final c f158287a = null;

        static {
            f158287a = new c();
        }

        public c() {
            super(null);
        }
    }

    public /* synthetic */ d(i r1) {
        this();
    }

    public d() {
    }
}
