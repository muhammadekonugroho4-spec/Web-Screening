package androidx.activity;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract /* synthetic */ class T {
    public static /* synthetic */ void a(ExecutorService r5) {
        if (r5 == ForkJoinPool.commonPool()) goto L26;
        boolean r02 = r5.isTerminated();
        if (r02 == true) goto L24;
        r5.shutdown();
        boolean r1 = false;
    L8:
        if (r02 == true) goto L13;
        r02 = r5.awaitTermination(1, TimeUnit.DAYS);     // Catch: InterruptedException -> L11
    L11:
        if (r1 == true) goto L8;
        r5.shutdownNow();
        r1 = true;
        goto L8
    L13:
        if (r1 == false) goto L25;
        Thread.currentThread().interrupt();
        return;
    L25:
        return;
    L24:
        return;
    }
}
