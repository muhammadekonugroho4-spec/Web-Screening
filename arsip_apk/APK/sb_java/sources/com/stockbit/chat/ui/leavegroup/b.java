package com.stockbit.chat.ui.leavegroup;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f56480a;

        static {
        }

        public a(String r2) {
            p.l(r2, "message");
            super(null);
            this.f56480a = r2;
        }

        public final String a() {
            return this.f56480a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f56480a, ((a) r4).f56480a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f56480a.hashCode();
        }

        public String toString() {
            return "LeaveGroupError(message=" + this.f56480a + ')';
        }
    }

    /* renamed from: com.stockbit.chat.ui.leavegroup.b$b, reason: collision with other inner class name */
    public static final class C0580b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f56481a;

        static {
        }

        public C0580b(String r2) {
            p.l(r2, "roomName");
            super(null);
            this.f56481a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0580b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f56481a, ((C0580b) r4).f56481a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f56481a.hashCode();
        }

        public String toString() {
            return "LeaveGroupSuccess(roomName=" + this.f56481a + ')';
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f56482a = null;

        static {
            f56482a = new c();
        }

        public c() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ b(kotlin.jvm.internal.i r1) {
        this();
    }

    public b() {
    }
}
