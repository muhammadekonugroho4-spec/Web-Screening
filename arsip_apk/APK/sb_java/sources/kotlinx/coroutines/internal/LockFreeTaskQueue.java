package kotlinx.coroutines.internal;

import com.clevertap.android.sdk.Constants;
import com.gojek.ojosdk.exif.ExifInterface;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0001\u0010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR!\u0010\u001f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u001dj\b\u0012\u0004\u0012\u00028\u0000`\u001e0\u001c8\u0002X\u0082\u0004¨\u0006 "}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "", ExifInterface.GpsLongitudeRef.EAST, "", "singleConsumer", "<init>", "(Z)V", "Lkotlin/w;", Constants.KEY_HIDE_CLOSE, "()V", "element", "addLast", "(Ljava/lang/Object;)Z", "removeFirstOrNull", "()Ljava/lang/Object;", "R", "Lkotlin/Function1;", "transform", "", "map", "(Lkotlin/jvm/functions/l;)Ljava/util/List;", "isClosed", "()Z", "isEmpty", "", "getSize", "()I", "size", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "Lkotlinx/coroutines/internal/Core;", "_cur", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class LockFreeTaskQueue<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _cur$volatile$FU = null;
    private volatile /* synthetic */ Object _cur$volatile;

    static {
        _cur$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueue.class, Object.class, "_cur$volatile");
    }

    public LockFreeTaskQueue(boolean r3) {
        this._cur$volatile = new LockFreeTaskQueueCore(8, r3);
    }

    private final /* synthetic */ Object get_cur$volatile() {
        return this._cur$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater get_cur$volatile$FU() {
        return _cur$volatile$FU;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater r2, Object r3, l r4) {
    L2:
        r4.invoke(r2.get(r3));
        goto L2
    }

    private final /* synthetic */ void set_cur$volatile(Object r1) {
        this._cur$volatile = r1;
    }

    public final boolean addLast(E r5) {
        AtomicReferenceFieldUpdater r02 = get_cur$volatile$FU();
    L3:
        LockFreeTaskQueueCore r1 = (LockFreeTaskQueueCore) r02.get(this);
        int r2 = r1.addLast(r5);
        if (r2 == 0) goto L12;
        if (r2 != 1) goto L7;
        androidx.concurrent.futures.a.a(get_cur$volatile$FU(), this, r1, r1.next());
        goto L3
    L7:
        if (r2 != 2) goto L3;
        return false;
    L12:
        return true;
    }

    public final void close() {
        AtomicReferenceFieldUpdater r02 = get_cur$volatile$FU();
    L3:
        LockFreeTaskQueueCore r1 = (LockFreeTaskQueueCore) r02.get(this);
        if (r1.close() == true) goto L5;
        androidx.concurrent.futures.a.a(get_cur$volatile$FU(), this, r1, r1.next());
        goto L3
    }

    public final int getSize() {
        return ((LockFreeTaskQueueCore) get_cur$volatile$FU().get(this)).getSize();
    }

    public final boolean isClosed() {
        return ((LockFreeTaskQueueCore) get_cur$volatile$FU().get(this)).isClosed();
    }

    public final boolean isEmpty() {
        return ((LockFreeTaskQueueCore) get_cur$volatile$FU().get(this)).isEmpty();
    }

    public final <R> List<R> map(l r2) {
        return ((LockFreeTaskQueueCore) get_cur$volatile$FU().get(this)).map(r2);
    }

    public final E removeFirstOrNull() {
        AtomicReferenceFieldUpdater r02 = get_cur$volatile$FU();
    L3:
        LockFreeTaskQueueCore r1 = (LockFreeTaskQueueCore) r02.get(this);
        E r2 = (E) r1.removeFirstOrNull();
        if (r2 != LockFreeTaskQueueCore.REMOVE_FROZEN) goto L5;
        androidx.concurrent.futures.a.a(get_cur$volatile$FU(), this, r1, r1.next());
        goto L3
    L5:
        return r2;
    }
}
