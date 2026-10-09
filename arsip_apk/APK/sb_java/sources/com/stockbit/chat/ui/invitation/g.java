package com.stockbit.chat.ui.invitation;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class g {

    public static final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public final String f56443a;

        static {
        }

        public a(String r2) {
            p.l(r2, "message");
            super(null);
            this.f56443a = r2;
        }

        public final String a() {
            return this.f56443a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f56443a, ((a) r4).f56443a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f56443a.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.f56443a + ')';
        }
    }

    public static final class b extends g {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f56444a;

        static {
        }

        public b(boolean r2) {
            super(null);
            this.f56444a = r2;
        }

        public final boolean a() {
            return this.f56444a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f56444a == ((b) r4).f56444a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f56444a);
        }

        public String toString() {
            return "Loading(isLoading=" + this.f56444a + ')';
        }
    }

    public static final class c extends g {

        /* renamed from: a, reason: collision with root package name */
        public final int f56445a;

        static {
        }

        public c(int r2) {
            super(null);
            this.f56445a = r2;
        }

        public final int a() {
            return this.f56445a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (this.f56445a == ((c) r4).f56445a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f56445a);
        }

        public String toString() {
            return "OpenGroupRoom(roomId=" + this.f56445a + ')';
        }
    }

    public static final class d extends g {

        /* renamed from: a, reason: collision with root package name */
        public final String f56446a;

        static {
        }

        public d(String r2) {
            p.l(r2, "rejectionMessage");
            super(null);
            this.f56446a = r2;
        }

        public final String a() {
            return this.f56446a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f56446a, ((d) r4).f56446a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f56446a.hashCode();
        }

        public String toString() {
            return "ShowInsufficientRequirementDialog(rejectionMessage=" + this.f56446a + ')';
        }
    }

    static {
    }

    public /* synthetic */ g(kotlin.jvm.internal.i r1) {
        this();
    }

    public g() {
    }
}
