package _COROUTINE;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1345a = "_COROUTINE";

    static {
    }

    public static final /* synthetic */ StackTraceElement a(Throwable r02, String r1) {
        return b(r02, r1);
    }

    public static final StackTraceElement b(Throwable r3, String r4) {
        StackTraceElement r32 = r3.getStackTrace()[0];
        return new StackTraceElement(f1345a + '.' + r4, "_", r32.getFileName(), r32.getLineNumber());
    }

    public static final String c() {
        return f1345a;
    }
}
