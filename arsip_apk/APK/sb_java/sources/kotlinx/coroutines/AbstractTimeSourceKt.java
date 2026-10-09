package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001a\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0010\u0010\u0006\u001a\u00020\u0005H\u0081\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0010\u0010\b\u001a\u00020\u0005H\u0081\b¢\u0006\u0004\b\b\u0010\u0007\u001a \u0010\f\u001a\u00060\tj\u0002`\n2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0081\b¢\u0006\u0004\b\f\u0010\r\u001a\u0010\u0010\u000e\u001a\u00020\u0002H\u0081\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0010\u0010\u0010\u001a\u00020\u0002H\u0081\b¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u0010\u0010\u0011\u001a\u00020\u0002H\u0081\b¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u0010\u0010\u0012\u001a\u00020\u0002H\u0081\b¢\u0006\u0004\b\u0012\u0010\u000f\u001a \u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0005H\u0081\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0081\b¢\u0006\u0004\b\u001a\u0010\u001b\"\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/AbstractTimeSource;", "source", "Lkotlin/w;", "mockTimeSource", "(Lkotlinx/coroutines/AbstractTimeSource;)V", "", "currentTimeMillis", "()J", "nanoTime", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "wrapTask", "(Ljava/lang/Runnable;)Ljava/lang/Runnable;", "trackTask", "()V", "unTrackTask", "registerTimeLoopThread", "unregisterTimeLoopThread", "", "blocker", "nanos", "parkNanos", "(Ljava/lang/Object;J)V", "Ljava/lang/Thread;", "thread", "unpark", "(Ljava/lang/Thread;)V", "timeSource", "Lkotlinx/coroutines/AbstractTimeSource;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AbstractTimeSourceKt {
    private static AbstractTimeSource timeSource;

    static {
    }

    public static final /* synthetic */ AbstractTimeSource access$getTimeSource$p() {
        return timeSource;
    }

    public static final /* synthetic */ void access$setTimeSource$p(AbstractTimeSource r02) {
        timeSource = r02;
    }

    private static final long currentTimeMillis() {
        AbstractTimeSource r02 = access$getTimeSource$p();
        if (r02 == null) goto L7;
        return r02.currentTimeMillis();
    L7:
        return System.currentTimeMillis();
    }

    public static final void mockTimeSource(AbstractTimeSource r02) {
        access$setTimeSource$p(r02);
    }

    private static final long nanoTime() {
        AbstractTimeSource r02 = access$getTimeSource$p();
        if (r02 == null) goto L7;
        return r02.nanoTime();
    L7:
        return System.nanoTime();
    }

    private static final void parkNanos(Object r1, long r2) {
        AbstractTimeSource r02 = access$getTimeSource$p();
        if (r02 == null) goto L6;
        r02.parkNanos(r1, r2);
        return;
    L6:
        LockSupport.parkNanos(r1, r2);
    }

    private static final void registerTimeLoopThread() {
        AbstractTimeSource r02 = access$getTimeSource$p();
        if (r02 == null) goto L6;
        r02.registerTimeLoopThread();
        return;
    }

    private static final void trackTask() {
        AbstractTimeSource r02 = access$getTimeSource$p();
        if (r02 == null) goto L6;
        r02.trackTask();
        return;
    }

    private static final void unTrackTask() {
        AbstractTimeSource r02 = access$getTimeSource$p();
        if (r02 == null) goto L6;
        r02.unTrackTask();
        return;
    }

    private static final void unpark(Thread r1) {
        AbstractTimeSource r02 = access$getTimeSource$p();
        if (r02 == null) goto L6;
        r02.unpark(r1);
        return;
    L6:
        LockSupport.unpark(r1);
    }

    private static final void unregisterTimeLoopThread() {
        AbstractTimeSource r02 = access$getTimeSource$p();
        if (r02 == null) goto L6;
        r02.unregisterTimeLoopThread();
        return;
    }

    private static final Runnable wrapTask(Runnable r1) {
        AbstractTimeSource r02 = access$getTimeSource$p();
        if (r02 == null) goto L8;
        Runnable r03 = r02.wrapTask(r1);
        if (r03 == null) goto L8;
        return r03;
    L8:
        return r1;
    }
}
