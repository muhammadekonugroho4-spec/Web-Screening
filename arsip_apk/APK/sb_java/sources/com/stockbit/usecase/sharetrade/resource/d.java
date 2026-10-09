package com.stockbit.usecase.sharetrade.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f162935a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f162935a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f162935a, ((a) r4).f162935a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162935a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f162935a + ")";
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f162936a = null;

        static {
            f162936a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public String f162937a;

        public c(String r2) {
            p.l(r2, "message");
            super(null);
            this.f162937a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f162937a, ((c) r4).f162937a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162937a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f162937a + ")";
        }
    }

    public /* synthetic */ d(i r1) {
        this();
    }

    public d() {
    }
}
