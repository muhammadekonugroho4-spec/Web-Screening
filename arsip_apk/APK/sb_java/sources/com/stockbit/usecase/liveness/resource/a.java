package com.stockbit.usecase.liveness.resource;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.liveness.resource.a$a, reason: collision with other inner class name */
    public static final class C1516a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f158236a;

        public C1516a(String r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f158236a = r2;
        }

        public final String a() {
            return this.f158236a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1516a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158236a, ((C1516a) r4).f158236a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158236a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158236a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f158237a = null;

        static {
            f158237a = new b();
        }

        public b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1256113338;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.liveness.model.a f158238a;

        public c(com.stockbit.usecase.liveness.model.a r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f158238a = r2;
        }

        public final com.stockbit.usecase.liveness.model.a a() {
            return this.f158238a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158238a, ((c) r4).f158238a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158238a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f158238a + ")";
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final long f158239a;

        public d(long r2) {
            super(null);
            this.f158239a = r2;
        }

        public final long a() {
            return this.f158239a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof d) == true) goto L9;
            return false;
        L9:
            if (this.f158239a == ((d) r8).f158239a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f158239a);
        }

        public String toString() {
            return "Suspended(remainingTimeStamp=" + this.f158239a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
