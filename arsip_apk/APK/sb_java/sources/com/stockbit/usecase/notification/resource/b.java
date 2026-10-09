package com.stockbit.usecase.notification.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f158652a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f158652a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158652a, ((a) r4).f158652a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158652a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158652a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.notification.resource.b$b, reason: collision with other inner class name */
    public static final class C1536b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1536b f158653a = null;

        static {
            f158653a = new C1536b();
        }

        public C1536b() {
            super(null);
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f158654a = null;

        static {
            f158654a = new c();
        }

        public c() {
            super(null);
        }
    }

    public static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        public final List f158655a;

        public d(List r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f158655a = r2;
        }

        public final List a() {
            return this.f158655a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158655a, ((d) r4).f158655a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158655a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f158655a + ")";
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
