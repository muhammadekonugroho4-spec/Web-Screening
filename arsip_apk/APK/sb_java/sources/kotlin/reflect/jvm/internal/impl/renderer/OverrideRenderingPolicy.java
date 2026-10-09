package kotlin.reflect.jvm.internal.impl.renderer;

/* loaded from: classes3.dex */
public enum OverrideRenderingPolicy extends Enum<OverrideRenderingPolicy> {
    public static final OverrideRenderingPolicy RENDER_OPEN = null;
    public static final OverrideRenderingPolicy RENDER_OPEN_OVERRIDE = null;
    public static final OverrideRenderingPolicy RENDER_OVERRIDE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OverrideRenderingPolicy[] f179561a = null;

    static {
        RENDER_OVERRIDE = new OverrideRenderingPolicy("RENDER_OVERRIDE", 0);
        RENDER_OPEN = new OverrideRenderingPolicy("RENDER_OPEN", 1);
        RENDER_OPEN_OVERRIDE = new OverrideRenderingPolicy("RENDER_OPEN_OVERRIDE", 2);
        f179561a = a();
    }

    OverrideRenderingPolicy(String r1, int r2) {
    }

    public static final /* synthetic */ OverrideRenderingPolicy[] a() {
        return new OverrideRenderingPolicy[]{RENDER_OVERRIDE, RENDER_OPEN, RENDER_OPEN_OVERRIDE};
    }

    public static OverrideRenderingPolicy valueOf(String r1) {
        return (OverrideRenderingPolicy) Enum.valueOf(OverrideRenderingPolicy.class, r1);
    }

    public static OverrideRenderingPolicy[] values() {
        return (OverrideRenderingPolicy[]) f179561a.clone();
    }
}
