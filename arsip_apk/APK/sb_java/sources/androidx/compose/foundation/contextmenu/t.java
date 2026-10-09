package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.G0;
import androidx.compose.runtime.b2;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final G0 f7353a;

    public static abstract class a {

        /* renamed from: androidx.compose.foundation.contextmenu.t$a$a, reason: collision with other inner class name */
        public static final class C0065a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0065a f7354a = null;

            static {
                f7354a = new C0065a();
            }

            public C0065a() {
                super(null);
            }

            public String toString() {
                return "Closed";
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public final long f7355a;

            static {
            }

            public /* synthetic */ b(long r1, kotlin.jvm.internal.i r3) {
                this(r1);
            }

            public final long a() {
                return this.f7355a;
            }

            public boolean equals(Object r5) {
                if (r5 != this) goto L6;
                return true;
            L6:
                if ((r5 instanceof b) == true) goto L10;
                return false;
            L10:
                return androidx.compose.ui.geometry.e.j(this.f7355a, ((b) r5).f7355a);
            }

            public int hashCode() {
                return androidx.compose.ui.geometry.e.o(this.f7355a);
            }

            public String toString() {
                return "Open(offset=" + androidx.compose.ui.geometry.e.s(this.f7355a) + ')';
            }

            public b(long r3) {
                super(null);
                this.f7355a = r3;
                if ((r3 & 9223372034707292159L) == 9205357640488583168L) goto L5;
                boolean r32 = true;
            L6:
                if (r32 == true) goto L9;
                androidx.compose.foundation.internal.e.c("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
                return;
            L9:
                return;
            L5:
                r32 = false;
                goto L6
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

    static {
    }

    public t(a r3) {
        this.f7353a = b2.k(r3, null, 2, null);
    }

    public final a a() {
        return (a) this.f7353a.getValue();
    }

    public final void b(a r2) {
        this.f7353a.setValue(r2);
    }

    public boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof t) == true) goto L10;
        return false;
    L10:
        return kotlin.jvm.internal.p.g(((t) r2).a(), a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return "ContextMenuState(status=" + a() + ')';
    }

    public /* synthetic */ t(a r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = a.C0065a.f7354a;
    L5:
        this(r1);
    }
}
