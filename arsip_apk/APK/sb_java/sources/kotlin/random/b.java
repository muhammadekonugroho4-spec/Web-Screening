package kotlin.random;

import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final class b extends kotlin.random.a {

    /* renamed from: c, reason: collision with root package name */
    public final a f177534c;

    public static final class a extends ThreadLocal {
        public a() {
        }

        public java.util.Random a() {
            return new java.util.Random();
        }

        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ Object initialValue() {
            return a();
        }
    }

    public b() {
        this.f177534c = new a();
    }

    @Override // kotlin.random.a
    public java.util.Random i() {
        Object r02 = this.f177534c.get();
        p.k(r02, "get(...)");
        return (java.util.Random) r02;
    }
}
