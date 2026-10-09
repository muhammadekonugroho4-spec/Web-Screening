package kotlin.reflect.jvm.internal.impl.renderer;

/* loaded from: classes3.dex */
public enum PropertyAccessorRenderingPolicy extends Enum<PropertyAccessorRenderingPolicy> {
    public static final PropertyAccessorRenderingPolicy DEBUG = null;
    public static final PropertyAccessorRenderingPolicy NONE = null;
    public static final PropertyAccessorRenderingPolicy PRETTY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PropertyAccessorRenderingPolicy[] f179563a = null;

    static {
        PRETTY = new PropertyAccessorRenderingPolicy("PRETTY", 0);
        DEBUG = new PropertyAccessorRenderingPolicy("DEBUG", 1);
        NONE = new PropertyAccessorRenderingPolicy("NONE", 2);
        f179563a = a();
    }

    PropertyAccessorRenderingPolicy(String r1, int r2) {
    }

    public static final /* synthetic */ PropertyAccessorRenderingPolicy[] a() {
        return new PropertyAccessorRenderingPolicy[]{PRETTY, DEBUG, NONE};
    }

    public static PropertyAccessorRenderingPolicy valueOf(String r1) {
        return (PropertyAccessorRenderingPolicy) Enum.valueOf(PropertyAccessorRenderingPolicy.class, r1);
    }

    public static PropertyAccessorRenderingPolicy[] values() {
        return (PropertyAccessorRenderingPolicy[]) f179563a.clone();
    }
}
