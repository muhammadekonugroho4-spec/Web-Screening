package kotlin.reflect.jvm.internal.impl.types.model;

/* loaded from: classes3.dex */
public enum TypeVariance extends Enum<TypeVariance> {
    public static final TypeVariance IN = null;
    public static final TypeVariance INV = null;
    public static final TypeVariance OUT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TypeVariance[] f180114a = null;
    private final String presentation;

    static {
        IN = new TypeVariance("IN", 0, "in");
        OUT = new TypeVariance("OUT", 1, "out");
        INV = new TypeVariance("INV", 2, "");
        f180114a = a();
    }

    TypeVariance(String r1, int r2, String r3) {
        this.presentation = r3;
    }

    public static final /* synthetic */ TypeVariance[] a() {
        return new TypeVariance[]{IN, OUT, INV};
    }

    public static TypeVariance valueOf(String r1) {
        return (TypeVariance) Enum.valueOf(TypeVariance.class, r1);
    }

    public static TypeVariance[] values() {
        return (TypeVariance[]) f180114a.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.presentation;
    }
}
