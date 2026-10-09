package com.stockbit.stream.ui.announcement;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class j {

    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        public static final a f141706a = null;

        static {
            f141706a = new a();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends j {

        /* renamed from: a, reason: collision with root package name */
        public final String f141707a;

        static {
        }

        public b(String r2) {
            p.l(r2, "message");
            super(null);
            this.f141707a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f141707a, ((b) r4).f141707a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f141707a.hashCode();
        }

        public String toString() {
            return "AnnouncementError(message=" + this.f141707a + ')';
        }
    }

    public static final class c extends j {

        /* renamed from: a, reason: collision with root package name */
        public final List f141708a;

        static {
        }

        public c(List r2) {
            p.l(r2, "announcements");
            super(null);
            this.f141708a = r2;
        }

        public final List a() {
            return this.f141708a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f141708a, ((c) r4).f141708a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f141708a.hashCode();
        }

        public String toString() {
            return "AnnouncementSuccess(announcements=" + this.f141708a + ')';
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
