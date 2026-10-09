package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/intrinsics/CoroutineSingletons;", "", "<init>", "(Ljava/lang/String;I)V", "COROUTINE_SUSPENDED", "UNDECIDED", "RESUMED", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum CoroutineSingletons extends Enum<CoroutineSingletons> {
    public static final CoroutineSingletons COROUTINE_SUSPENDED = null;
    public static final CoroutineSingletons RESUMED = null;
    public static final CoroutineSingletons UNDECIDED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CoroutineSingletons[] f177412a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f177413b = null;

    static {
        COROUTINE_SUSPENDED = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);
        UNDECIDED = new CoroutineSingletons("UNDECIDED", 1);
        RESUMED = new CoroutineSingletons("RESUMED", 2);
        CoroutineSingletons[] r02 = a();
        f177412a = r02;
        f177413b = b.a(r02);
    }

    CoroutineSingletons(String r1, int r2) {
    }

    public static final /* synthetic */ CoroutineSingletons[] a() {
        return new CoroutineSingletons[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    public static kotlin.enums.a getEntries() {
        return f177413b;
    }

    public static CoroutineSingletons valueOf(String r1) {
        return (CoroutineSingletons) Enum.valueOf(CoroutineSingletons.class, r1);
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[]) f177412a.clone();
    }
}
