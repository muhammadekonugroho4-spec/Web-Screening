package kotlin;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/LazyThreadSafetyMode;", "", "<init>", "(Ljava/lang/String;I)V", "SYNCHRONIZED", "PUBLICATION", "NONE", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum LazyThreadSafetyMode extends Enum<LazyThreadSafetyMode> {
    public static final LazyThreadSafetyMode NONE = null;
    public static final LazyThreadSafetyMode PUBLICATION = null;
    public static final LazyThreadSafetyMode SYNCHRONIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LazyThreadSafetyMode[] f177324a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f177325b = null;

    static {
        SYNCHRONIZED = new LazyThreadSafetyMode("SYNCHRONIZED", 0);
        PUBLICATION = new LazyThreadSafetyMode("PUBLICATION", 1);
        NONE = new LazyThreadSafetyMode("NONE", 2);
        LazyThreadSafetyMode[] r02 = a();
        f177324a = r02;
        f177325b = kotlin.enums.b.a(r02);
    }

    LazyThreadSafetyMode(String r1, int r2) {
    }

    public static final /* synthetic */ LazyThreadSafetyMode[] a() {
        return new LazyThreadSafetyMode[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    public static kotlin.enums.a getEntries() {
        return f177325b;
    }

    public static LazyThreadSafetyMode valueOf(String r1) {
        return (LazyThreadSafetyMode) Enum.valueOf(LazyThreadSafetyMode.class, r1);
    }

    public static LazyThreadSafetyMode[] values() {
        return (LazyThreadSafetyMode[]) f177324a.clone();
    }
}
