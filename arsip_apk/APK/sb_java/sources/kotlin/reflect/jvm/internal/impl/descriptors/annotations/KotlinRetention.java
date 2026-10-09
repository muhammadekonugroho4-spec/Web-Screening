package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* loaded from: classes3.dex */
public enum KotlinRetention extends Enum<KotlinRetention> {
    public static final KotlinRetention BINARY = null;
    public static final KotlinRetention RUNTIME = null;
    public static final KotlinRetention SOURCE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KotlinRetention[] f178031a = null;

    static {
        RUNTIME = new KotlinRetention("RUNTIME", 0);
        BINARY = new KotlinRetention("BINARY", 1);
        SOURCE = new KotlinRetention("SOURCE", 2);
        f178031a = a();
    }

    KotlinRetention(String r1, int r2) {
    }

    public static final /* synthetic */ KotlinRetention[] a() {
        return new KotlinRetention[]{RUNTIME, BINARY, SOURCE};
    }

    public static KotlinRetention valueOf(String r1) {
        return (KotlinRetention) Enum.valueOf(KotlinRetention.class, r1);
    }

    public static KotlinRetention[] values() {
        return (KotlinRetention[]) f178031a.clone();
    }
}
