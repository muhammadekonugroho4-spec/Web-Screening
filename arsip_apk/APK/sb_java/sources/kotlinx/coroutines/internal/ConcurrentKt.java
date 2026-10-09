package kotlinx.coroutines.internal;

import com.clevertap.android.sdk.Constants;
import com.gojek.ojosdk.exif.ExifInterface;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00060\u0001j\u0002`\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\bH\u0080\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014*\f\b\u0000\u0010\u0015\"\u00020\u00012\u00020\u0001*\u001e\b\u0000\u0010\u0017\u001a\u0004\b\u0000\u0010\u0000\"\b\u0012\u0004\u0012\u00028\u00000\u00162\b\u0012\u0004\u0012\u00028\u00000\u0016¨\u0006\u0018"}, d2 = {ExifInterface.GpsTrackRef.TRUE_DIRECTION, "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "Lkotlin/Function0;", Constants.KEY_ACTION, "withLock", "(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/functions/a;)Ljava/lang/Object;", ExifInterface.GpsLongitudeRef.EAST, "", "expectedSize", "", "identitySet", "(I)Ljava/util/Set;", "Ljava/util/concurrent/Executor;", "executor", "", "removeFutureOnCancel", "(Ljava/util/concurrent/Executor;)Z", "Ljava/lang/reflect/Method;", "REMOVE_FUTURE_ON_CANCEL", "Ljava/lang/reflect/Method;", "ReentrantLock", "Ljava/util/concurrent/atomic/AtomicReference;", "WorkaroundAtomicReference", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConcurrentKt {
    private static final Method REMOVE_FUTURE_ON_CANCEL = null;

    static {
        Method r02 = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});     // Catch: Throwable -> L4
    L5:
        REMOVE_FUTURE_ON_CANCEL = r02;
        return;
    L4:
        r02 = null;
        goto L5
    }

    public static final <E> Set<E> identitySet(int r1) {
        return Collections.newSetFromMap(new IdentityHashMap(r1));
    }

    public static final boolean removeFutureOnCancel(Executor r3) {
    L15:
        return false;
    L4:
        if ((r3 instanceof ScheduledThreadPoolExecutor) == false) goto L6;
        ScheduledThreadPoolExecutor r32 = (ScheduledThreadPoolExecutor) r3;     // Catch: Throwable -> L15
    L7:
        if (r32 != null) goto L9;
        return false;
    L9:
        Method r1 = REMOVE_FUTURE_ON_CANCEL;     // Catch: Throwable -> L15
        if (r1 != null) goto L12;
        return false;
    L12:
        r1.invoke(r32, new Object[]{Boolean.TRUE});     // Catch: Throwable -> L15
        return true;
    L6:
        r32 = null;
        goto L7
    }

    public static final <T> T withLock(ReentrantLock r1, kotlin.jvm.functions.a r2) {
        r1.lock();
        T r22 = (T) r2.invoke();
        n.b(1);
        r1.unlock();
        n.a(1);
        return r22;
    L6:
        th = move-exception;
        n.b(1);
        r1.unlock();
        n.a(1);
        throw th;
    }
}
