package com.stockbit.usecase.trusteddevice.model;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class j {

    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f164222a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f164222a = r2;
        }

        public final DomainExodusException a() {
            return this.f164222a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164222a, ((a) r4).f164222a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164222a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f164222a + ')';
        }
    }

    public static final class b extends j {

        /* renamed from: a, reason: collision with root package name */
        public final String f164223a;

        public b(String r2) {
            super(null);
            this.f164223a = r2;
        }

        public final String a() {
            return this.f164223a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164223a, ((b) r4).f164223a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f164223a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "ErrorLimit(message=" + this.f164223a + ')';
        }
    }

    public static final class c extends j {

        /* renamed from: a, reason: collision with root package name */
        public final String f164224a;

        /* renamed from: b, reason: collision with root package name */
        public final String f164225b;

        /* renamed from: c, reason: collision with root package name */
        public final String f164226c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f164227e;

        public c(String r2, String r3, String r4, String r5, String r6) {
            p.l(r2, "currentPhoneNumber");
            p.l(r3, "currentEmail");
            p.l(r4, "target");
            p.l(r5, "channel");
            p.l(r6, "nextAttemptTime");
            super(null);
            this.f164224a = r2;
            this.f164225b = r3;
            this.f164226c = r4;
            this.d = r5;
            this.f164227e = r6;
        }

        public final String a() {
            return this.f164227e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f164224a, r52.f164224a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f164225b, r52.f164225b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f164226c, r52.f164226c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f164227e, r52.f164227e) == true) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            return (((((((this.f164224a.hashCode() * 31) + this.f164225b.hashCode()) * 31) + this.f164226c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f164227e.hashCode();
        }

        public String toString() {
            return "Success(currentPhoneNumber=" + this.f164224a + ", currentEmail=" + this.f164225b + ", target=" + this.f164226c + ", channel=" + this.d + ", nextAttemptTime=" + this.f164227e + ')';
        }
    }

    public /* synthetic */ j(kotlin.jvm.internal.i r1) {
        this();
    }

    public j() {
    }
}
