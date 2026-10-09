package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes3.dex */
public enum ClassKind extends Enum<ClassKind> {
    public static final ClassKind ANNOTATION_CLASS = null;
    public static final ClassKind CLASS = null;
    public static final ClassKind ENUM_CLASS = null;
    public static final ClassKind ENUM_ENTRY = null;
    public static final ClassKind INTERFACE = null;
    public static final ClassKind OBJECT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ClassKind[] f177993a = null;
    private final String codeRepresentation;

    static {
        CLASS = new ClassKind("CLASS", 0, "class");
        INTERFACE = new ClassKind("INTERFACE", 1, "interface");
        ENUM_CLASS = new ClassKind("ENUM_CLASS", 2, "enum class");
        ENUM_ENTRY = new ClassKind("ENUM_ENTRY", 3, null);
        ANNOTATION_CLASS = new ClassKind("ANNOTATION_CLASS", 4, "annotation class");
        OBJECT = new ClassKind("OBJECT", 5, "object");
        f177993a = a();
    }

    ClassKind(String r1, int r2, String r3) {
        this.codeRepresentation = r3;
    }

    public static final /* synthetic */ ClassKind[] a() {
        return new ClassKind[]{CLASS, INTERFACE, ENUM_CLASS, ENUM_ENTRY, ANNOTATION_CLASS, OBJECT};
    }

    public static ClassKind valueOf(String r1) {
        return (ClassKind) Enum.valueOf(ClassKind.class, r1);
    }

    public static ClassKind[] values() {
        return (ClassKind[]) f177993a.clone();
    }

    public final boolean isSingleton() {
        if (this != OBJECT) goto L5;
        return true;
    L5:
        if (this == ENUM_ENTRY) goto L11;
        return false;
    L11:
        return true;
    }
}
