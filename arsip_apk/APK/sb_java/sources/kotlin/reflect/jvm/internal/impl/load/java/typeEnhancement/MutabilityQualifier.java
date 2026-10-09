package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: classes3.dex */
public enum MutabilityQualifier extends Enum<MutabilityQualifier> {
    public static final MutabilityQualifier MUTABLE = null;
    public static final MutabilityQualifier READ_ONLY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MutabilityQualifier[] f178700a = null;

    static {
        READ_ONLY = new MutabilityQualifier("READ_ONLY", 0);
        MUTABLE = new MutabilityQualifier("MUTABLE", 1);
        f178700a = a();
    }

    MutabilityQualifier(String r1, int r2) {
    }

    public static final /* synthetic */ MutabilityQualifier[] a() {
        return new MutabilityQualifier[]{READ_ONLY, MUTABLE};
    }

    public static MutabilityQualifier valueOf(String r1) {
        return (MutabilityQualifier) Enum.valueOf(MutabilityQualifier.class, r1);
    }

    public static MutabilityQualifier[] values() {
        return (MutabilityQualifier[]) f178700a.clone();
    }
}
