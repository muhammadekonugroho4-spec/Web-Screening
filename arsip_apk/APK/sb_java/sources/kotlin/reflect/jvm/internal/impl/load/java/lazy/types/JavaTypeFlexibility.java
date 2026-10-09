package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* loaded from: classes3.dex */
public enum JavaTypeFlexibility extends Enum<JavaTypeFlexibility> {
    public static final JavaTypeFlexibility FLEXIBLE_LOWER_BOUND = null;
    public static final JavaTypeFlexibility FLEXIBLE_UPPER_BOUND = null;
    public static final JavaTypeFlexibility INFLEXIBLE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ JavaTypeFlexibility[] f178639a = null;

    static {
        INFLEXIBLE = new JavaTypeFlexibility("INFLEXIBLE", 0);
        FLEXIBLE_UPPER_BOUND = new JavaTypeFlexibility("FLEXIBLE_UPPER_BOUND", 1);
        FLEXIBLE_LOWER_BOUND = new JavaTypeFlexibility("FLEXIBLE_LOWER_BOUND", 2);
        f178639a = a();
    }

    JavaTypeFlexibility(String r1, int r2) {
    }

    public static final /* synthetic */ JavaTypeFlexibility[] a() {
        return new JavaTypeFlexibility[]{INFLEXIBLE, FLEXIBLE_UPPER_BOUND, FLEXIBLE_LOWER_BOUND};
    }

    public static JavaTypeFlexibility valueOf(String r1) {
        return (JavaTypeFlexibility) Enum.valueOf(JavaTypeFlexibility.class, r1);
    }

    public static JavaTypeFlexibility[] values() {
        return (JavaTypeFlexibility[]) f178639a.clone();
    }
}
