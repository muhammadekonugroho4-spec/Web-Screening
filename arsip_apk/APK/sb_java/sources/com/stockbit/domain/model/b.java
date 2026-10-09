package com.stockbit.domain.model;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f80694a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f80694a = r2;
        }

        public final DomainExodusException a() {
            return this.f80694a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f80694a, ((a) r4).f80694a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f80694a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f80694a + ")";
        }
    }

    /* renamed from: com.stockbit.domain.model.b$b, reason: collision with other inner class name */
    public static final class C0770b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f80695a;

        /* renamed from: b, reason: collision with root package name */
        public final String f80696b;

        public C0770b(Object r2, String r3) {
            super(null);
            this.f80695a = r2;
            this.f80696b = r3;
        }

        public final Object a() {
            return this.f80695a;
        }

        public final String b() {
            return this.f80696b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0770b) == true) goto L8;
            return false;
        L8:
            C0770b r52 = (C0770b) r5;
            if (p.g(this.f80695a, r52.f80695a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f80696b, r52.f80696b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            Object r02 = this.f80695a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f80696b;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "Success(data=" + this.f80695a + ", message=" + this.f80696b + ")";
        }

        public /* synthetic */ C0770b(Object r1, String r2, int r3, kotlin.jvm.internal.i r4) {
            if ((r3 & 2) == 0) goto L5;
            r2 = null;
        L5:
            this(r1, r2);
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f80697a;

        public c(String r2) {
            p.l(r2, "message");
            super(null);
            this.f80697a = r2;
        }

        public final String a() {
            return this.f80697a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f80697a, ((c) r4).f80697a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f80697a.hashCode();
        }

        public String toString() {
            return "SuccessNoData(message=" + this.f80697a + ")";
        }
    }

    public /* synthetic */ b(kotlin.jvm.internal.i r1) {
        this();
    }

    public b() {
    }
}
