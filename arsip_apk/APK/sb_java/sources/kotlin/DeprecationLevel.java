package kotlin;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/DeprecationLevel;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "HIDDEN", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum DeprecationLevel extends Enum<DeprecationLevel> {
    public static final DeprecationLevel ERROR = null;
    public static final DeprecationLevel HIDDEN = null;
    public static final DeprecationLevel WARNING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DeprecationLevel[] f177321a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f177322b = null;

    static {
        WARNING = new DeprecationLevel("WARNING", 0);
        ERROR = new DeprecationLevel("ERROR", 1);
        HIDDEN = new DeprecationLevel("HIDDEN", 2);
        DeprecationLevel[] r02 = a();
        f177321a = r02;
        f177322b = kotlin.enums.b.a(r02);
    }

    DeprecationLevel(String r1, int r2) {
    }

    public static final /* synthetic */ DeprecationLevel[] a() {
        return new DeprecationLevel[]{WARNING, ERROR, HIDDEN};
    }

    public static kotlin.enums.a getEntries() {
        return f177322b;
    }

    public static DeprecationLevel valueOf(String r1) {
        return (DeprecationLevel) Enum.valueOf(DeprecationLevel.class, r1);
    }

    public static DeprecationLevel[] values() {
        return (DeprecationLevel[]) f177321a.clone();
    }
}
