package com.stockbit.profile.userprofilemoremenu;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public final String f128026a;

        static {
        }

        public a(String r2) {
            p.l(r2, "message");
            super(null);
            this.f128026a = r2;
        }

        public final String a() {
            return this.f128026a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f128026a, ((a) r4).f128026a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f128026a.hashCode();
        }

        public String toString() {
            return "OnBlockUserFailed(message=" + this.f128026a + ')';
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public final String f128027a;

        static {
        }

        public b(String r2) {
            p.l(r2, "message");
            super(null);
            this.f128027a = r2;
        }

        public final String a() {
            return this.f128027a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f128027a, ((b) r4).f128027a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f128027a.hashCode();
        }

        public String toString() {
            return "OnBlockUserSuccess(message=" + this.f128027a + ')';
        }
    }

    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final c f128028a = null;

        static {
            f128028a = new c();
        }

        public c() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.profile.userprofilemoremenu.d$d, reason: collision with other inner class name */
    public static final class C1160d extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final C1160d f128029a = null;

        static {
            f128029a = new C1160d();
        }

        public C1160d() {
            super(null);
        }
    }

    public static final class e extends d {

        /* renamed from: a, reason: collision with root package name */
        public final String f128030a;

        static {
        }

        public e(String r2) {
            p.l(r2, "userId");
            super(null);
            this.f128030a = r2;
        }

        public final String a() {
            return this.f128030a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof e) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f128030a, ((e) r4).f128030a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f128030a.hashCode();
        }

        public String toString() {
            return "OnReport(userId=" + this.f128030a + ')';
        }
    }

    public static final class f extends d {

        /* renamed from: a, reason: collision with root package name */
        public final String f128031a;

        /* renamed from: b, reason: collision with root package name */
        public final String f128032b;

        static {
        }

        public f(String r2, String r3) {
            super(null);
            this.f128031a = r2;
            this.f128032b = r3;
        }

        public final String a() {
            return this.f128031a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof f) == true) goto L8;
            return false;
        L8:
            f r52 = (f) r5;
            if (p.g(this.f128031a, r52.f128031a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f128032b, r52.f128032b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.f128031a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f128032b;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "OnStreamCompose(username=" + this.f128031a + ", userId=" + this.f128032b + ')';
        }
    }

    public static final class g extends d {

        /* renamed from: a, reason: collision with root package name */
        public final String f128033a;

        static {
        }

        public g(String r2) {
            p.l(r2, "userId");
            super(null);
            this.f128033a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof g) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f128033a, ((g) r4).f128033a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f128033a.hashCode();
        }

        public String toString() {
            return "OnUnblockUser(userId=" + this.f128033a + ')';
        }
    }

    static {
    }

    public /* synthetic */ d(kotlin.jvm.internal.i r1) {
        this();
    }

    public d() {
    }
}
