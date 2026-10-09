package kotlin.reflect;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/KVisibility;", "", "<init>", "(Ljava/lang/String;I)V", "PUBLIC", "PROTECTED", "INTERNAL", "PRIVATE", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum KVisibility extends Enum<KVisibility> {
    public static final KVisibility INTERNAL = null;
    public static final KVisibility PRIVATE = null;
    public static final KVisibility PROTECTED = null;
    public static final KVisibility PUBLIC = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KVisibility[] f177569a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f177570b = null;

    static {
        PUBLIC = new KVisibility("PUBLIC", 0);
        PROTECTED = new KVisibility("PROTECTED", 1);
        INTERNAL = new KVisibility("INTERNAL", 2);
        PRIVATE = new KVisibility("PRIVATE", 3);
        KVisibility[] r02 = a();
        f177569a = r02;
        f177570b = kotlin.enums.b.a(r02);
    }

    KVisibility(String r1, int r2) {
    }

    public static final /* synthetic */ KVisibility[] a() {
        return new KVisibility[]{PUBLIC, PROTECTED, INTERNAL, PRIVATE};
    }

    public static kotlin.enums.a getEntries() {
        return f177570b;
    }

    public static KVisibility valueOf(String r1) {
        return (KVisibility) Enum.valueOf(KVisibility.class, r1);
    }

    public static KVisibility[] values() {
        return (KVisibility[]) f177569a.clone();
    }
}
