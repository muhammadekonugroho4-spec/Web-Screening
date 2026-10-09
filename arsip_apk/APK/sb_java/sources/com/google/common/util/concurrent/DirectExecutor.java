package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes5.dex */
enum DirectExecutor extends Enum<DirectExecutor> implements Executor {
    private static final /* synthetic */ DirectExecutor[] $VALUES = null;
    public static final DirectExecutor INSTANCE = null;

    private static /* synthetic */ DirectExecutor[] $values() {
        return new DirectExecutor[]{INSTANCE};
    }

    static {
        INSTANCE = new DirectExecutor("INSTANCE", 0);
        $VALUES = $values();
    }

    DirectExecutor(String r1, int r2) {
    }

    public static DirectExecutor valueOf(String r1) {
        return (DirectExecutor) Enum.valueOf(DirectExecutor.class, r1);
    }

    public static DirectExecutor[] values() {
        return (DirectExecutor[]) $VALUES.clone();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r1) {
        r1.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
