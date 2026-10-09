package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public abstract class w {

    public static abstract class a extends w {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155835a;

        /* renamed from: com.stockbit.usecase.chat.resource.w$a$a, reason: collision with other inner class name */
        public static final class C1429a extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f155836b;

            public C1429a(DomainExodusException r2) {
                kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f155836b = r2;
            }

            public DomainExodusException a() {
                return this.f155836b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1429a) == true) goto L9;
                return false;
            L9:
                if (kotlin.jvm.internal.p.g(this.f155836b, ((C1429a) r4).f155836b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f155836b.hashCode();
            }

            public String toString() {
                return "General(error=" + this.f155836b + ")";
            }
        }

        public static final class b extends a {

            /* renamed from: b, reason: collision with root package name */
            public final String f155837b;

            /* renamed from: c, reason: collision with root package name */
            public final DomainExodusException f155838c;

            public b(String r2, DomainExodusException r3) {
                kotlin.jvm.internal.p.l(r2, "rejectionMessage");
                kotlin.jvm.internal.p.l(r3, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r3, null);
                this.f155837b = r2;
                this.f155838c = r3;
            }

            public final String a() {
                return this.f155837b;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof b) == true) goto L8;
                return false;
            L8:
                b r52 = (b) r5;
                if (kotlin.jvm.internal.p.g(this.f155837b, r52.f155837b) == true) goto L12;
                return false;
            L12:
                if (kotlin.jvm.internal.p.g(this.f155838c, r52.f155838c) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (this.f155837b.hashCode() * 31) + this.f155838c.hashCode();
            }

            public String toString() {
                return "InsufficientRequirement(rejectionMessage=" + this.f155837b + ", error=" + this.f155838c + ")";
            }
        }

        public /* synthetic */ a(DomainExodusException r1, kotlin.jvm.internal.i r2) {
            this(r1);
        }

        public a(DomainExodusException r2) {
            super(null);
            this.f155835a = r2;
        }
    }

    public static final class b extends w {

        /* renamed from: a, reason: collision with root package name */
        public final int f155839a;

        public b(int r2) {
            super(null);
            this.f155839a = r2;
        }

        public final int a() {
            return this.f155839a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f155839a == ((b) r4).f155839a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f155839a);
        }

        public String toString() {
            return "Success(roomId=" + this.f155839a + ")";
        }
    }

    public /* synthetic */ w(kotlin.jvm.internal.i r1) {
        this();
    }

    public w() {
    }
}
