package androidx.concurrent.futures;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public enum DirectExecutor extends Enum<DirectExecutor> implements Executor {
    public static final DirectExecutor INSTANCE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DirectExecutor[] f20867a = null;

    static {
        DirectExecutor r02 = new DirectExecutor("INSTANCE", 0);
        INSTANCE = r02;
        f20867a = new DirectExecutor[]{r02};
    }

    DirectExecutor(String r1, int r2) {
    }

    public static DirectExecutor valueOf(String r1) {
        return (DirectExecutor) Enum.valueOf(DirectExecutor.class, r1);
    }

    public static DirectExecutor[] values() {
        return (DirectExecutor[]) f20867a.clone();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r1) {
        r1.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
