package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public abstract class z {

    public static final class a extends z {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155847a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155847a = r2;
        }

        public final DomainExodusException a() {
            return this.f155847a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155847a, ((a) r4).f155847a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155847a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155847a + ")";
        }
    }

    public static final class b extends z {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f155848a;

        public b(boolean r2) {
            super(null);
            this.f155848a = r2;
        }

        public final boolean a() {
            return this.f155848a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f155848a == ((b) r4).f155848a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f155848a);
        }

        public String toString() {
            return "Success(isMute=" + this.f155848a + ")";
        }
    }

    public /* synthetic */ z(kotlin.jvm.internal.i r1) {
        this();
    }

    public z() {
    }
}
