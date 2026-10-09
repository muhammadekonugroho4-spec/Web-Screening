package dagger.internal;

/* loaded from: classes2.dex */
public abstract class i {

    public class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ javax.inject.a f173987a;

        public a(javax.inject.a r1) {
            this.f173987a = r1;
        }

        @Override // javax.inject.a
        public Object get() {
            return this.f173987a.get();
        }
    }

    public static h a(javax.inject.a r1) {
        g.b(r1);
        if ((r1 instanceof h) == false) goto L7;
        return (h) r1;
    L7:
        return new a(r1);
    }
}
