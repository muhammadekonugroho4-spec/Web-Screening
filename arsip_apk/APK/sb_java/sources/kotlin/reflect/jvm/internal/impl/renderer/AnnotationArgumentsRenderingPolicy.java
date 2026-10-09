package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.i;

/* loaded from: classes3.dex */
public enum AnnotationArgumentsRenderingPolicy extends Enum<AnnotationArgumentsRenderingPolicy> {
    public static final AnnotationArgumentsRenderingPolicy ALWAYS_PARENTHESIZED = null;
    public static final AnnotationArgumentsRenderingPolicy NO_ARGUMENTS = null;
    public static final AnnotationArgumentsRenderingPolicy UNLESS_EMPTY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AnnotationArgumentsRenderingPolicy[] f179476a = null;
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;

    static {
        String r1 = "NO_ARGUMENTS";
        int r2 = 0;
        boolean r3 = false;
        boolean r4 = false;
        NO_ARGUMENTS = new AnnotationArgumentsRenderingPolicy(r1, r2, r3, r4, 3, null);
        String r22 = "UNLESS_EMPTY";
        int r32 = 1;
        boolean r42 = true;
        boolean r5 = false;
        UNLESS_EMPTY = new AnnotationArgumentsRenderingPolicy(r22, r32, r42, r5, 2, null);
        ALWAYS_PARENTHESIZED = new AnnotationArgumentsRenderingPolicy("ALWAYS_PARENTHESIZED", 2, true, true);
        f179476a = a();
    }

    AnnotationArgumentsRenderingPolicy(String r1, int r2, boolean r3, boolean r4) {
        this.includeAnnotationArguments = r3;
        this.includeEmptyAnnotationArguments = r4;
    }

    public static final /* synthetic */ AnnotationArgumentsRenderingPolicy[] a() {
        return new AnnotationArgumentsRenderingPolicy[]{NO_ARGUMENTS, UNLESS_EMPTY, ALWAYS_PARENTHESIZED};
    }

    public static AnnotationArgumentsRenderingPolicy valueOf(String r1) {
        return (AnnotationArgumentsRenderingPolicy) Enum.valueOf(AnnotationArgumentsRenderingPolicy.class, r1);
    }

    public static AnnotationArgumentsRenderingPolicy[] values() {
        return (AnnotationArgumentsRenderingPolicy[]) f179476a.clone();
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.includeAnnotationArguments;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.includeEmptyAnnotationArguments;
    }

    /* synthetic */ AnnotationArgumentsRenderingPolicy(String r2, int r3, boolean r4, boolean r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r4 = false;
    L6:
        if ((r6 & 2) == 0) goto L8;
        r5 = false;
    L8:
        this(r2, r3, r4, r5);
    }
}
