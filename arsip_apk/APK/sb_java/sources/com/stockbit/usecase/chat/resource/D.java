package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class D {

    public static final class a extends D {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155736a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155736a = r2;
        }

        public final DomainExodusException a() {
            return this.f155736a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155736a, ((a) r4).f155736a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155736a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155736a + ")";
        }
    }

    public static final class b extends D {

        /* renamed from: a, reason: collision with root package name */
        public static final b f155737a = null;

        static {
            f155737a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends D {

        /* renamed from: a, reason: collision with root package name */
        public final List f155738a;

        public c(List r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f155738a = r2;
        }

        public final List a() {
            return this.f155738a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155738a, ((c) r4).f155738a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155738a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f155738a + ")";
        }
    }

    public /* synthetic */ D(kotlin.jvm.internal.i r1) {
        this();
    }

    public D() {
    }
}
