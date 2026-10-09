package com.stockbit.chat.ui.assignadmin;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class j {

    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        public final String f55687a;

        static {
        }

        public a(String r2) {
            p.l(r2, "message");
            super(null);
            this.f55687a = r2;
        }

        public final String a() {
            return this.f55687a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f55687a, ((a) r4).f55687a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f55687a.hashCode();
        }

        public String toString() {
            return "OnAssignAdminFailed(message=" + this.f55687a + ')';
        }
    }

    public static final class b extends j {

        /* renamed from: a, reason: collision with root package name */
        public final String f55688a;

        static {
        }

        public b(String r2) {
            p.l(r2, "message");
            super(null);
            this.f55688a = r2;
        }

        public final String a() {
            return this.f55688a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f55688a, ((b) r4).f55688a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f55688a.hashCode();
        }

        public String toString() {
            return "OnAssignAdminSuccess(message=" + this.f55688a + ')';
        }
    }

    static {
    }

    public /* synthetic */ j(kotlin.jvm.internal.i r1) {
        this();
    }

    public j() {
    }
}
