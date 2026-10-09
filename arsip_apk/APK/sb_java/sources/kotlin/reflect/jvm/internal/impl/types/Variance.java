package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes3.dex */
public enum Variance extends Enum<Variance> {
    public static final Variance INVARIANT = null;
    public static final Variance IN_VARIANCE = null;
    public static final Variance OUT_VARIANCE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Variance[] f180031a = null;
    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;
    private final String label;
    private final int superpositionFactor;

    static {
        INVARIANT = new Variance("INVARIANT", 0, "", true, true, 0);
        IN_VARIANCE = new Variance("IN_VARIANCE", 1, "in", true, false, -1);
        OUT_VARIANCE = new Variance("OUT_VARIANCE", 2, "out", false, true, 1);
        f180031a = a();
    }

    Variance(String r1, int r2, String r3, boolean r4, boolean r5, int r6) {
        this.label = r3;
        this.allowsInPosition = r4;
        this.allowsOutPosition = r5;
        this.superpositionFactor = r6;
    }

    public static final /* synthetic */ Variance[] a() {
        return new Variance[]{INVARIANT, IN_VARIANCE, OUT_VARIANCE};
    }

    public static Variance valueOf(String r1) {
        return (Variance) Enum.valueOf(Variance.class, r1);
    }

    public static Variance[] values() {
        return (Variance[]) f180031a.clone();
    }

    public final boolean getAllowsOutPosition() {
        return this.allowsOutPosition;
    }

    public final String getLabel() {
        return this.label;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.label;
    }
}
