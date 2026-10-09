package androidx.paging;

import com.google.firebase.messaging.Constants;

/* renamed from: androidx.paging.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4116v {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27035a;

    /* renamed from: androidx.paging.v$a */
    public static final class a extends AbstractC4116v {

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f27036b;

        public a(Throwable r3) {
            kotlin.jvm.internal.p.l(r3, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(false, null);
            this.f27036b = r3;
        }

        public final Throwable b() {
            return this.f27036b;
        }

        public boolean equals(Object r3) {
            if ((r3 instanceof a) == false) goto L10;
            a r32 = (a) r3;
            if (a() == r32.a()) goto L7;
            return false;
        L7:
            if (kotlin.jvm.internal.p.g(this.f27036b, r32.f27036b) == false) goto L13;
            return true;
        L13:
            return false;
        L10:
            return false;
        }

        public int hashCode() {
            return Boolean.hashCode(a()) + this.f27036b.hashCode();
        }

        public String toString() {
            return "Error(endOfPaginationReached=" + a() + ", error=" + this.f27036b + ')';
        }
    }

    /* renamed from: androidx.paging.v$b */
    public static final class b extends AbstractC4116v {

        /* renamed from: b, reason: collision with root package name */
        public static final b f27037b = null;

        static {
            f27037b = new b();
        }

        public b() {
            super(false, null);
        }

        public boolean equals(Object r2) {
            if ((r2 instanceof b) == true) goto L5;
            return false;
        L5:
            if (a() != ((b) r2).a()) goto L10;
            return true;
        L10:
            return false;
        }

        public int hashCode() {
            return Boolean.hashCode(a());
        }

        public String toString() {
            return "Loading(endOfPaginationReached=" + a() + ')';
        }
    }

    /* renamed from: androidx.paging.v$c */
    public static final class c extends AbstractC4116v {

        /* renamed from: b, reason: collision with root package name */
        public static final a f27038b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final c f27039c = null;
        public static final c d = null;

        /* renamed from: androidx.paging.v$c$a */
        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.i r1) {
                this();
            }

            public final c a() {
                return c.b();
            }

            public final c b() {
                return c.c();
            }

            public a() {
            }
        }

        static {
            f27038b = new a(null);
            f27039c = new c(true);
            d = new c(false);
        }

        public c(boolean r2) {
            super(r2, null);
        }

        public static final /* synthetic */ c b() {
            return f27039c;
        }

        public static final /* synthetic */ c c() {
            return d;
        }

        public boolean equals(Object r2) {
            if ((r2 instanceof c) == true) goto L5;
            return false;
        L5:
            if (a() != ((c) r2).a()) goto L10;
            return true;
        L10:
            return false;
        }

        public int hashCode() {
            return Boolean.hashCode(a());
        }

        public String toString() {
            return "NotLoading(endOfPaginationReached=" + a() + ')';
        }
    }

    public /* synthetic */ AbstractC4116v(boolean r1, kotlin.jvm.internal.i r2) {
        this(r1);
    }

    public final boolean a() {
        return this.f27035a;
    }

    public AbstractC4116v(boolean r1) {
        this.f27035a = r1;
    }
}
