package com.stockbit.stream.ui.announcement;

import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: com.stockbit.stream.ui.announcement.a$a, reason: collision with other inner class name */
    public static final class C1265a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f141690a;

        static {
        }

        public C1265a(String r2) {
            p.l(r2, "message");
            super(null);
            this.f141690a = r2;
        }

        public final String a() {
            return this.f141690a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1265a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f141690a, ((C1265a) r4).f141690a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f141690a.hashCode();
        }

        public String toString() {
            return "AnnouncementError(message=" + this.f141690a + ')';
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
