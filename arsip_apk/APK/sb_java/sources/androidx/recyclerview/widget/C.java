package androidx.recyclerview.widget;

import androidx.collection.C2361z;

/* loaded from: classes4.dex */
public interface C {

    public static class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public long f27188a;

        /* renamed from: androidx.recyclerview.widget.C$a$a, reason: collision with other inner class name */
        public class C0237a implements d {

            /* renamed from: a, reason: collision with root package name */
            public final C2361z f27189a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f27190b;

            public C0237a(a r1) {
                this.f27190b = r1;
                this.f27189a = new C2361z();
            }

            @Override // androidx.recyclerview.widget.C.d
            public long a(long r3) {
                Long r02 = (Long) this.f27189a.e(r3);
                if (r02 != null) goto L6;
                r02 = Long.valueOf(this.f27190b.b());
                this.f27189a.j(r3, r02);
            L6:
                return r02.longValue();
            }
        }

        public a() {
            this.f27188a = 0;
        }

        @Override // androidx.recyclerview.widget.C
        public d a() {
            return new C0237a(this);
        }

        public long b() {
            long r02 = this.f27188a;
            this.f27188a = 1 + r02;
            return r02;
        }
    }

    public static class b implements C {

        /* renamed from: a, reason: collision with root package name */
        public final d f27191a;

        public class a implements d {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f27192a;

            public a(b r1) {
                this.f27192a = r1;
            }

            @Override // androidx.recyclerview.widget.C.d
            public long a(long r1) {
                return -1;
            }
        }

        public b() {
            this.f27191a = new a(this);
        }

        @Override // androidx.recyclerview.widget.C
        public d a() {
            return this.f27191a;
        }
    }

    public static class c implements C {

        /* renamed from: a, reason: collision with root package name */
        public final d f27193a;

        public class a implements d {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f27194a;

            public a(c r1) {
                this.f27194a = r1;
            }

            @Override // androidx.recyclerview.widget.C.d
            public long a(long r1) {
                return r1;
            }
        }

        public c() {
            this.f27193a = new a(this);
        }

        @Override // androidx.recyclerview.widget.C
        public d a() {
            return this.f27193a;
        }
    }

    public interface d {
        long a(long r1);
    }

    d a();
}
