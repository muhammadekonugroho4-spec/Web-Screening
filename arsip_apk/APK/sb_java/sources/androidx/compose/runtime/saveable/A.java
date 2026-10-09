package androidx.compose.runtime.saveable;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final x f16442a = null;

    public static final class a implements x {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.functions.p f16443a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.functions.l f16444b;

        public a(kotlin.jvm.functions.p r1, kotlin.jvm.functions.l r2) {
            this.f16443a = r1;
            this.f16444b = r2;
        }

        @Override // androidx.compose.runtime.saveable.x
        public Object a(B r2, Object r3) {
            return this.f16443a.invoke(r2, r3);
        }

        @Override // androidx.compose.runtime.saveable.x
        public Object b(Object r2) {
            return this.f16444b.invoke(r2);
        }
    }

    static {
        f16442a = e(new y(), new z());
    }

    public static /* synthetic */ Object a(B r02, Object r1) {
        return c(r02, r1);
    }

    public static /* synthetic */ Object b(Object r02) {
        return d(r02);
    }

    public static final Object c(B r02, Object r1) {
        return r1;
    }

    public static final Object d(Object r02) {
        return r02;
    }

    public static final x e(kotlin.jvm.functions.p r1, kotlin.jvm.functions.l r2) {
        return new a(r1, r2);
    }

    public static final x f() {
        x r02 = f16442a;
        kotlin.jvm.internal.p.j(r02, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return r02;
    }
}
