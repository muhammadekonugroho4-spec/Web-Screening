package kotlin.reflect.jvm.internal.impl.renderer;

/* loaded from: classes3.dex */
public enum ParameterNameRenderingPolicy extends Enum<ParameterNameRenderingPolicy> {
    public static final ParameterNameRenderingPolicy ALL = null;
    public static final ParameterNameRenderingPolicy NONE = null;
    public static final ParameterNameRenderingPolicy ONLY_NON_SYNTHESIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ParameterNameRenderingPolicy[] f179562a = null;

    static {
        ALL = new ParameterNameRenderingPolicy("ALL", 0);
        ONLY_NON_SYNTHESIZED = new ParameterNameRenderingPolicy("ONLY_NON_SYNTHESIZED", 1);
        NONE = new ParameterNameRenderingPolicy("NONE", 2);
        f179562a = a();
    }

    ParameterNameRenderingPolicy(String r1, int r2) {
    }

    public static final /* synthetic */ ParameterNameRenderingPolicy[] a() {
        return new ParameterNameRenderingPolicy[]{ALL, ONLY_NON_SYNTHESIZED, NONE};
    }

    public static ParameterNameRenderingPolicy valueOf(String r1) {
        return (ParameterNameRenderingPolicy) Enum.valueOf(ParameterNameRenderingPolicy.class, r1);
    }

    public static ParameterNameRenderingPolicy[] values() {
        return (ParameterNameRenderingPolicy[]) f179562a.clone();
    }
}
