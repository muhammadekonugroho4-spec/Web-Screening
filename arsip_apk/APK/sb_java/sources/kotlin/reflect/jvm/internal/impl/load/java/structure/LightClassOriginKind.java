package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* loaded from: classes3.dex */
public enum LightClassOriginKind extends Enum<LightClassOriginKind> {
    public static final LightClassOriginKind BINARY = null;
    public static final LightClassOriginKind SOURCE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LightClassOriginKind[] f178675a = null;

    static {
        SOURCE = new LightClassOriginKind("SOURCE", 0);
        BINARY = new LightClassOriginKind("BINARY", 1);
        f178675a = a();
    }

    LightClassOriginKind(String r1, int r2) {
    }

    public static final /* synthetic */ LightClassOriginKind[] a() {
        return new LightClassOriginKind[]{SOURCE, BINARY};
    }

    public static LightClassOriginKind valueOf(String r1) {
        return (LightClassOriginKind) Enum.valueOf(LightClassOriginKind.class, r1);
    }

    public static LightClassOriginKind[] values() {
        return (LightClassOriginKind[]) f178675a.clone();
    }
}
