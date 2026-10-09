package com.stockbit.chat.ui.chooseadmin;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: com.stockbit.chat.ui.chooseadmin.a$a, reason: collision with other inner class name */
    public static final class C0571a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f55849a;

        static {
        }

        public C0571a(String r2) {
            p.l(r2, "message");
            super(null);
            this.f55849a = r2;
        }

        public final String a() {
            return this.f55849a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0571a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f55849a, ((C0571a) r4).f55849a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f55849a.hashCode();
        }

        public String toString() {
            return "ChooseAdminFailed(message=" + this.f55849a + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f55850a = null;

        static {
            f55850a = new b();
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
