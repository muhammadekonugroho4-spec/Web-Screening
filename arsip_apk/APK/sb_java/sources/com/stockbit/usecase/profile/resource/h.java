package com.stockbit.usecase.profile.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class h {

    public static abstract class a extends h {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f159499a;

        /* renamed from: com.stockbit.usecase.profile.resource.h$a$a, reason: collision with other inner class name */
        public static final class C1594a extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f159500b;

            public C1594a(DomainExodusException r2) {
                p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f159500b = r2;
            }

            public DomainExodusException a() {
                return this.f159500b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1594a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159500b, ((C1594a) r4).f159500b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159500b.hashCode();
            }

            public String toString() {
                return "General(error=" + this.f159500b + ')';
            }
        }

        public static final class b extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f159501b;

            public b(DomainExodusException r2) {
                p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f159501b = r2;
            }

            public DomainExodusException a() {
                return this.f159501b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof b) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159501b, ((b) r4).f159501b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159501b.hashCode();
            }

            public String toString() {
                return "LimitExceeded(error=" + this.f159501b + ')';
            }
        }

        public /* synthetic */ a(DomainExodusException r1, kotlin.jvm.internal.i r2) {
            this(r1);
        }

        public a(DomainExodusException r2) {
            super(null);
            this.f159499a = r2;
        }
    }

    public static final class b extends h {

        /* renamed from: a, reason: collision with root package name */
        public static final b f159502a = null;

        static {
            f159502a = new b();
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
            return -1227127448;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends h {

        /* renamed from: a, reason: collision with root package name */
        public static final c f159503a = null;

        static {
            f159503a = new c();
        }

        public c() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 864019503;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ h(kotlin.jvm.internal.i r1) {
        this();
    }

    public h() {
    }
}
