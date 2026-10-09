package kotlin.reflect;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/KVariance;", "", "<init>", "(Ljava/lang/String;I)V", "INVARIANT", "IN", "OUT", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum KVariance extends Enum<KVariance> {
    public static final KVariance IN = null;
    public static final KVariance INVARIANT = null;
    public static final KVariance OUT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KVariance[] f177567a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f177568b = null;

    static {
        INVARIANT = new KVariance("INVARIANT", 0);
        IN = new KVariance("IN", 1);
        OUT = new KVariance("OUT", 2);
        KVariance[] r02 = a();
        f177567a = r02;
        f177568b = kotlin.enums.b.a(r02);
    }

    KVariance(String r1, int r2) {
    }

    public static final /* synthetic */ KVariance[] a() {
        return new KVariance[]{INVARIANT, IN, OUT};
    }

    public static kotlin.enums.a getEntries() {
        return f177568b;
    }

    public static KVariance valueOf(String r1) {
        return (KVariance) Enum.valueOf(KVariance.class, r1);
    }

    public static KVariance[] values() {
        return (KVariance[]) f177567a.clone();
    }
}
