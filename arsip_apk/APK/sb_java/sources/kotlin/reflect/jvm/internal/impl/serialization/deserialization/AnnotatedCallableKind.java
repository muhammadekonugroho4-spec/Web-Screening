package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes3.dex */
public enum AnnotatedCallableKind extends Enum<AnnotatedCallableKind> {
    public static final AnnotatedCallableKind FUNCTION = null;
    public static final AnnotatedCallableKind PROPERTY = null;
    public static final AnnotatedCallableKind PROPERTY_GETTER = null;
    public static final AnnotatedCallableKind PROPERTY_SETTER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AnnotatedCallableKind[] f179739a = null;

    static {
        AnnotatedCallableKind r02 = new AnnotatedCallableKind("FUNCTION", 0);
        FUNCTION = r02;
        AnnotatedCallableKind r1 = new AnnotatedCallableKind("PROPERTY", 1);
        PROPERTY = r1;
        AnnotatedCallableKind r2 = new AnnotatedCallableKind("PROPERTY_GETTER", 2);
        PROPERTY_GETTER = r2;
        AnnotatedCallableKind r3 = new AnnotatedCallableKind("PROPERTY_SETTER", 3);
        PROPERTY_SETTER = r3;
        f179739a = new AnnotatedCallableKind[]{r02, r1, r2, r3};
    }

    AnnotatedCallableKind(String r1, int r2) {
    }

    public static AnnotatedCallableKind valueOf(String r1) {
        return (AnnotatedCallableKind) Enum.valueOf(AnnotatedCallableKind.class, r1);
    }

    public static AnnotatedCallableKind[] values() {
        return (AnnotatedCallableKind[]) f179739a.clone();
    }
}
