package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

/* loaded from: classes3.dex */
public enum DeprecationLevelValue extends Enum<DeprecationLevelValue> {
    public static final DeprecationLevelValue ERROR = null;
    public static final DeprecationLevelValue HIDDEN = null;
    public static final DeprecationLevelValue WARNING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DeprecationLevelValue[] f179624a = null;

    static {
        WARNING = new DeprecationLevelValue("WARNING", 0);
        ERROR = new DeprecationLevelValue("ERROR", 1);
        HIDDEN = new DeprecationLevelValue("HIDDEN", 2);
        f179624a = a();
    }

    DeprecationLevelValue(String r1, int r2) {
    }

    public static final /* synthetic */ DeprecationLevelValue[] a() {
        return new DeprecationLevelValue[]{WARNING, ERROR, HIDDEN};
    }

    public static DeprecationLevelValue valueOf(String r1) {
        return (DeprecationLevelValue) Enum.valueOf(DeprecationLevelValue.class, r1);
    }

    public static DeprecationLevelValue[] values() {
        return (DeprecationLevelValue[]) f179624a.clone();
    }
}
