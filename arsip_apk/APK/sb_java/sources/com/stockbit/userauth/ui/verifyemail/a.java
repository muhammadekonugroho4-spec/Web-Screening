package com.stockbit.userauth.ui.verifyemail;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.userauth.ui.verifyemail.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1743a extends a {

        /* renamed from: com.stockbit.userauth.ui.verifyemail.a$a$a, reason: collision with other inner class name */
        public static final class C1744a extends AbstractC1743a {

            /* renamed from: a, reason: collision with root package name */
            public final String f165556a;

            static {
            }

            public C1744a(String r2) {
                p.l(r2, "msg");
                super(null);
                this.f165556a = r2;
            }

            public final String a() {
                return this.f165556a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1744a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f165556a, ((C1744a) r4).f165556a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f165556a.hashCode();
            }

            public String toString() {
                return "ShowBottomSheet(msg=" + this.f165556a + ')';
            }
        }

        /* renamed from: com.stockbit.userauth.ui.verifyemail.a$a$b */
        public static final class b extends AbstractC1743a {

            /* renamed from: a, reason: collision with root package name */
            public final String f165557a;

            static {
            }

            public b(String r2) {
                p.l(r2, "msg");
                super(null);
                this.f165557a = r2;
            }

            public final String a() {
                return this.f165557a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof b) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f165557a, ((b) r4).f165557a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f165557a.hashCode();
            }

            public String toString() {
                return "ShowToast(msg=" + this.f165557a + ')';
            }
        }

        static {
        }

        public /* synthetic */ AbstractC1743a(kotlin.jvm.internal.i r1) {
            this();
        }

        public AbstractC1743a() {
            super(null);
        }
    }

    public static final class b extends a {
        static {
        }

        public b() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }

    public a() {
    }
}
