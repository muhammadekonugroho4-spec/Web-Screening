package com.stockbit.discoverfriend.contact;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: com.stockbit.discoverfriend.contact.a$a, reason: collision with other inner class name */
    public static final class C0764a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0764a f80190a = null;

        static {
            f80190a = new C0764a();
        }

        public C0764a() {
            super(null);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f80191a = null;

        static {
            f80191a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f80192a = null;

        static {
            f80192a = new c();
        }

        public c() {
            super(null);
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f80193a = null;

        static {
            f80193a = new d();
        }

        public d() {
            super(null);
        }
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public final int f80194a;

        public e(int r2) {
            super(null);
            this.f80194a = r2;
        }

        public final int a() {
            return this.f80194a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof e) == true) goto L9;
            return false;
        L9:
            if (this.f80194a == ((e) r4).f80194a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f80194a);
        }

        public String toString() {
            return "StateFriend(state=" + this.f80194a + ')';
        }
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }

    public a() {
    }
}
