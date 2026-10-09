package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: classes3.dex */
public enum NullabilityQualifier extends Enum<NullabilityQualifier> {
    public static final NullabilityQualifier FORCE_FLEXIBILITY = null;
    public static final NullabilityQualifier NOT_NULL = null;
    public static final NullabilityQualifier NULLABLE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ NullabilityQualifier[] f178701a = null;

    static {
        FORCE_FLEXIBILITY = new NullabilityQualifier("FORCE_FLEXIBILITY", 0);
        NULLABLE = new NullabilityQualifier("NULLABLE", 1);
        NOT_NULL = new NullabilityQualifier("NOT_NULL", 2);
        f178701a = a();
    }

    NullabilityQualifier(String r1, int r2) {
    }

    public static final /* synthetic */ NullabilityQualifier[] a() {
        return new NullabilityQualifier[]{FORCE_FLEXIBILITY, NULLABLE, NOT_NULL};
    }

    public static NullabilityQualifier valueOf(String r1) {
        return (NullabilityQualifier) Enum.valueOf(NullabilityQualifier.class, r1);
    }

    public static NullabilityQualifier[] values() {
        return (NullabilityQualifier[]) f178701a.clone();
    }
}
