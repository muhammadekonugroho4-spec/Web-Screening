package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes3.dex */
public interface S {

    /* renamed from: a, reason: collision with root package name */
    public static final S f178010a = null;

    public static class a implements S {
        public a() {
        }

        public static /* synthetic */ void d(int r1) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"}));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.S
        public T b() {
            T r02 = T.f178016a;
            if (r02 != null) goto L5;
            d(0);
        L5:
            return r02;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    static {
        f178010a = new a();
    }

    T b();
}
