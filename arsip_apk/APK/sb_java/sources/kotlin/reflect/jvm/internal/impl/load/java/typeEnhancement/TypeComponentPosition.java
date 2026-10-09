package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: classes3.dex */
public enum TypeComponentPosition extends Enum<TypeComponentPosition> {
    public static final TypeComponentPosition FLEXIBLE_LOWER = null;
    public static final TypeComponentPosition FLEXIBLE_UPPER = null;
    public static final TypeComponentPosition INFLEXIBLE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TypeComponentPosition[] f178710a = null;

    static {
        FLEXIBLE_LOWER = new TypeComponentPosition("FLEXIBLE_LOWER", 0);
        FLEXIBLE_UPPER = new TypeComponentPosition("FLEXIBLE_UPPER", 1);
        INFLEXIBLE = new TypeComponentPosition("INFLEXIBLE", 2);
        f178710a = a();
    }

    TypeComponentPosition(String r1, int r2) {
    }

    public static final /* synthetic */ TypeComponentPosition[] a() {
        return new TypeComponentPosition[]{FLEXIBLE_LOWER, FLEXIBLE_UPPER, INFLEXIBLE};
    }

    public static TypeComponentPosition valueOf(String r1) {
        return (TypeComponentPosition) Enum.valueOf(TypeComponentPosition.class, r1);
    }

    public static TypeComponentPosition[] values() {
        return (TypeComponentPosition[]) f178710a.clone();
    }
}
