package com.stockbit.chat.ui.newgroup;

import com.stockbit.domain.model.profile.VerifiedStatusType;

/* loaded from: classes7.dex */
public abstract class l {

    public static final class a extends l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f56881a = null;

        static {
            f56881a = new a();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends l {

        /* renamed from: a, reason: collision with root package name */
        public final int f56882a;

        static {
        }

        public b(int r2) {
            super(null);
            this.f56882a = r2;
        }

        public final int a() {
            return this.f56882a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f56882a == ((b) r4).f56882a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f56882a);
        }

        public String toString() {
            return "OnMaximumInvite(amount=" + this.f56882a + ')';
        }
    }

    public static final class c extends l {

        /* renamed from: a, reason: collision with root package name */
        public final VerifiedStatusType f56883a;

        static {
        }

        public c(VerifiedStatusType r2) {
            kotlin.jvm.internal.p.l(r2, "verifiedStatusType");
            super(null);
            this.f56883a = r2;
        }

        public final VerifiedStatusType a() {
            return this.f56883a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (this.f56883a == ((c) r4).f56883a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f56883a.hashCode();
        }

        public String toString() {
            return "OnMaximumInviteDaily(verifiedStatusType=" + this.f56883a + ')';
        }
    }

    public static final class d extends l {

        /* renamed from: a, reason: collision with root package name */
        public final int f56884a;

        static {
        }

        public d(int r2) {
            super(null);
            this.f56884a = r2;
        }

        public final int a() {
            return this.f56884a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (this.f56884a == ((d) r4).f56884a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f56884a);
        }

        public String toString() {
            return "OnMaximumSelection(amount=" + this.f56884a + ')';
        }
    }

    static {
    }

    public /* synthetic */ l(kotlin.jvm.internal.i r1) {
        this();
    }

    public l() {
    }
}
