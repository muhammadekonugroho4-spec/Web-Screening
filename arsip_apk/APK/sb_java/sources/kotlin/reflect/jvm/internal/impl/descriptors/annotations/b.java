package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* loaded from: classes3.dex */
public abstract class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final e f178048a;

    public b(e r2) {
        if (r2 != null) goto L4;
        Q(0);
    L4:
        this.f178048a = r2;
    }

    private static /* synthetic */ void Q(int r7) {
        if (r7 == 1) goto L5;
        String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
    L7:
        if (r7 == 1) goto L9;
        int r3 = 3;
    L10:
        Object[] r32 = new Object[r3];
        if (r7 == 1) goto L13;
        r32[0] = "annotations";
    L14:
        if (r7 == 1) goto L16;
        r32[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
    L17:
        if (r7 == 1) goto L19;
        r32[2] = "<init>";
    L19:
        String r12 = String.format(r1, r32);
        if (r7 == 1) goto L23;
        throw new IllegalArgumentException(r12);
    L23:
        throw new IllegalStateException(r12);
    L16:
        r32[1] = "getAnnotations";
        goto L17
    L13:
        r32[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        goto L14
    L9:
        r3 = 2;
        goto L10
    L5:
        r1 = "@NotNull method %s.%s must not return null";
        goto L7
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public e getAnnotations() {
        e r02 = this.f178048a;
        if (r02 != null) goto L5;
        Q(1);
    L5:
        return r02;
    }
}
