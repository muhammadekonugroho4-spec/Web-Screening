package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.i;

/* loaded from: classes3.dex */
public enum AnnotationUseSiteTarget extends Enum<AnnotationUseSiteTarget> {
    public static final AnnotationUseSiteTarget CONSTRUCTOR_PARAMETER = null;
    public static final AnnotationUseSiteTarget FIELD = null;
    public static final AnnotationUseSiteTarget FILE = null;
    public static final AnnotationUseSiteTarget PROPERTY = null;
    public static final AnnotationUseSiteTarget PROPERTY_DELEGATE_FIELD = null;
    public static final AnnotationUseSiteTarget PROPERTY_GETTER = null;
    public static final AnnotationUseSiteTarget PROPERTY_SETTER = null;
    public static final AnnotationUseSiteTarget RECEIVER = null;
    public static final AnnotationUseSiteTarget SETTER_PARAMETER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AnnotationUseSiteTarget[] f178021a = null;
    private final String renderName;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String r1 = "FIELD";
        int r2 = 0;
        String r3 = null;
        FIELD = new AnnotationUseSiteTarget(r1, r2, r3, 1, null);
        String r22 = "FILE";
        int r32 = 1;
        String r4 = null;
        FILE = new AnnotationUseSiteTarget(r22, r32, r4, 1, null);
        String r33 = "PROPERTY";
        int r42 = 2;
        String r5 = null;
        PROPERTY = new AnnotationUseSiteTarget(r33, r42, r5, 1, null);
        PROPERTY_GETTER = new AnnotationUseSiteTarget("PROPERTY_GETTER", 3, "get");
        PROPERTY_SETTER = new AnnotationUseSiteTarget("PROPERTY_SETTER", 4, "set");
        String r52 = "RECEIVER";
        int r6 = 5;
        Object[] r7 = 0 == true ? 1 : 0;
        RECEIVER = new AnnotationUseSiteTarget(r52, r6, r7, 1, null);
        CONSTRUCTOR_PARAMETER = new AnnotationUseSiteTarget("CONSTRUCTOR_PARAMETER", 6, "param");
        SETTER_PARAMETER = new AnnotationUseSiteTarget("SETTER_PARAMETER", 7, "setparam");
        PROPERTY_DELEGATE_FIELD = new AnnotationUseSiteTarget("PROPERTY_DELEGATE_FIELD", 8, "delegate");
        f178021a = a();
    }

    AnnotationUseSiteTarget(String r1, int r2, String r3) {
        if (r3 != null) goto L5;
        r3 = kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.a.f(name());
    L5:
        this.renderName = r3;
    }

    public static final /* synthetic */ AnnotationUseSiteTarget[] a() {
        return new AnnotationUseSiteTarget[]{FIELD, FILE, PROPERTY, PROPERTY_GETTER, PROPERTY_SETTER, RECEIVER, CONSTRUCTOR_PARAMETER, SETTER_PARAMETER, PROPERTY_DELEGATE_FIELD};
    }

    public static AnnotationUseSiteTarget valueOf(String r1) {
        return (AnnotationUseSiteTarget) Enum.valueOf(AnnotationUseSiteTarget.class, r1);
    }

    public static AnnotationUseSiteTarget[] values() {
        return (AnnotationUseSiteTarget[]) f178021a.clone();
    }

    public final String getRenderName() {
        return this.renderName;
    }

    /* synthetic */ AnnotationUseSiteTarget(String r1, int r2, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L5;
        r3 = null;
    L5:
        this(r1, r2, r3);
    }
}
