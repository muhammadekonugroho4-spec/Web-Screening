package kotlinx.coroutines.internal;

import com.clevertap.android.sdk.Constants;
import com.gojek.ojosdk.exif.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 5*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u000265B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000b2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000b2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u001f\u0010 J-\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010$\"\u0004\b\u0001\u0010!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0005¢\u0006\u0004\b'\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010*\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0011\u0010+\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u0011\u0010.\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010-R%\u00100\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000b0/8\u0002X\u0082\u0004R\u000b\u00102\u001a\u0002018\u0002X\u0082\u0004R\u0013\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001038\u0002X\u0082\u0004¨\u00067"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "", ExifInterface.GpsLongitudeRef.EAST, "", "capacity", "", "singleConsumer", "<init>", "(IZ)V", FirebaseAnalytics.Param.INDEX, "element", "Lkotlinx/coroutines/internal/Core;", "fillPlaceholder", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "oldHead", "newHead", "removeSlowPath", "(II)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "", "markFrozen", "()J", RemoteConfigConstants.ResponseFieldKey.STATE, "allocateOrGetNextCopy", "(J)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "allocateNextCopy", Constants.KEY_HIDE_CLOSE, "()Z", "addLast", "(Ljava/lang/Object;)I", "removeFirstOrNull", "()Ljava/lang/Object;", "next", "()Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "R", "Lkotlin/Function1;", "transform", "", "map", "(Lkotlin/jvm/functions/l;)Ljava/util/List;", "isClosed", "I", "Z", "mask", "isEmpty", "getSize", "()I", "size", "Lkotlinx/atomicfu/AtomicRef;", "_next", "Lkotlinx/atomicfu/AtomicLong;", "_state", "Lkotlinx/atomicfu/AtomicArray;", "array", "Companion", "Placeholder", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LockFreeTaskQueueCore<E> {
    public static final int ADD_CLOSED = 2;
    public static final int ADD_FROZEN = 1;
    public static final int ADD_SUCCESS = 0;
    public static final int CAPACITY_BITS = 30;
    public static final long CLOSED_MASK = 2305843009213693952L;
    public static final int CLOSED_SHIFT = 61;
    public static final Companion Companion = null;
    public static final long FROZEN_MASK = 1152921504606846976L;
    public static final int FROZEN_SHIFT = 60;
    public static final long HEAD_MASK = 1073741823;
    public static final int HEAD_SHIFT = 0;
    public static final int INITIAL_CAPACITY = 8;
    public static final int MAX_CAPACITY_MASK = 1073741823;
    public static final int MIN_ADD_SPIN_CAPACITY = 1024;
    public static final Symbol REMOVE_FROZEN = null;
    public static final long TAIL_MASK = 1152921503533105152L;
    public static final int TAIL_SHIFT = 30;
    private static final /* synthetic */ AtomicReferenceFieldUpdater _next$volatile$FU = null;
    private static final /* synthetic */ AtomicLongFieldUpdater _state$volatile$FU = null;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    private final /* synthetic */ AtomicReferenceArray array;
    private final int capacity;
    private final int mask;
    private final boolean singleConsumer;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000bJ4\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000e*\u00020\u00042\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00010\u000fH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0016R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0014\u0010\"\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0016R\u0014\u0010$\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0016R\u0014\u0010'\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0016R\u0014\u0010(\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0016¨\u0006)"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;", "", "<init>", "()V", "", "other", "wo", "(JJ)J", "", "newHead", "updateHead", "(JI)J", "newTail", "updateTail", ExifInterface.GpsTrackRef.TRUE_DIRECTION, "Lkotlin/Function2;", "block", "withState", "(JLkotlin/jvm/functions/p;)Ljava/lang/Object;", "addFailReason", "(J)I", "INITIAL_CAPACITY", "I", "CAPACITY_BITS", "MAX_CAPACITY_MASK", "HEAD_SHIFT", "HEAD_MASK", "J", "TAIL_SHIFT", "TAIL_MASK", "FROZEN_SHIFT", "FROZEN_MASK", "CLOSED_SHIFT", "CLOSED_MASK", "MIN_ADD_SPIN_CAPACITY", "Lkotlinx/coroutines/internal/Symbol;", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/Symbol;", "ADD_SUCCESS", "ADD_FROZEN", "ADD_CLOSED", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int addFailReason(long r3) {
            if ((r3 & LockFreeTaskQueueCore.CLOSED_MASK) == 0) goto L6;
            return 2;
        L6:
            return 1;
        }

        public final long updateHead(long r3, int r5) {
            return wo(r3, LockFreeTaskQueueCore.HEAD_MASK) | r5;
        }

        public final long updateTail(long r3, int r5) {
            return wo(r3, LockFreeTaskQueueCore.TAIL_MASK) | (r5 << 30);
        }

        public final <T> T withState(long r4, p r6) {
            int r02 = (int) (LockFreeTaskQueueCore.HEAD_MASK & r4);
            int r42 = (int) ((r4 & LockFreeTaskQueueCore.TAIL_MASK) >> 30);
            return (T) r6.invoke(Integer.valueOf(r02), Integer.valueOf(r42));
        }

        public final long wo(long r1, long r3) {
            return r1 & (~r3);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Placeholder;", "", FirebaseAnalytics.Param.INDEX, "", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Placeholder {
        public final int index;

        public Placeholder(int r1) {
            this.index = r1;
        }
    }

    static {
        Companion = new Companion(null);
        _next$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, Object.class, "_next$volatile");
        _state$volatile$FU = AtomicLongFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, "_state$volatile");
        REMOVE_FROZEN = new Symbol("REMOVE_FROZEN");
    }

    public LockFreeTaskQueueCore(int r3, boolean r4) {
        this.capacity = r3;
        this.singleConsumer = r4;
        int r42 = r3 - 1;
        this.mask = r42;
        this.array = new AtomicReferenceArray(r3);
        if (r42 > 1073741823) goto L10;
        if ((r3 & r42) != 0) goto L8;
        return;
    L8:
        throw new IllegalStateException("Check failed.");
    L10:
        throw new IllegalStateException("Check failed.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final LockFreeTaskQueueCore<E> allocateNextCopy(long r7) {
        LockFreeTaskQueueCore<E> r02 = new LockFreeTaskQueueCore(this.capacity * 2, this.singleConsumer);
        int r1 = (int) (HEAD_MASK & r7);
        int r2 = (int) ((TAIL_MASK & r7) >> 30);
    L3:
        int r3 = this.mask;
        if ((r1 & r3) == (r3 & r2)) goto L9;
        Object r32 = getArray().get(this.mask & r1);
        if (r32 != null) goto L8;
        r32 = new Placeholder(r1);
    L8:
        r02.getArray().set(r02.mask & r1, r32);
        r1 = r1 + 1;
        goto L3
    L9:
        get_state$volatile$FU().set(r02, Companion.wo(r7, FROZEN_MASK));
        return r02;
    }

    private final LockFreeTaskQueueCore<E> allocateOrGetNextCopy(long r5) {
        AtomicReferenceFieldUpdater r02 = get_next$volatile$FU();
    L3:
        LockFreeTaskQueueCore<E> r1 = (LockFreeTaskQueueCore) r02.get(this);
        if (r1 != null) goto L5;
        androidx.concurrent.futures.a.a(get_next$volatile$FU(), this, null, allocateNextCopy(r5));
        goto L3
    L5:
        return r1;
    }

    private final LockFreeTaskQueueCore<E> fillPlaceholder(int r3, E r4) {
        Object r02 = getArray().get(this.mask & r3);
        if ((r02 instanceof Placeholder) == true) goto L5;
        return null;
    L5:
        if (((Placeholder) r02).index != r3) goto L10;
        getArray().set(r3 & this.mask, r4);
        return this;
    L10:
        return null;
    }

    private final /* synthetic */ AtomicReferenceArray getArray() {
        return this.array;
    }

    private final /* synthetic */ Object get_next$volatile() {
        return this._next$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater get_next$volatile$FU() {
        return _next$volatile$FU;
    }

    private final /* synthetic */ long get_state$volatile() {
        return this._state$volatile;
    }

    private static final /* synthetic */ AtomicLongFieldUpdater get_state$volatile$FU() {
        return _state$volatile$FU;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater r2, Object r3, l r4) {
    L2:
        r4.invoke(r2.get(r3));
        goto L2
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Long(AtomicLongFieldUpdater r3, Object r4, l r5) {
    L2:
        r5.invoke(Long.valueOf(r3.get(r4)));
        goto L2
    }

    private final long markFrozen() {
        AtomicLongFieldUpdater r02 = get_state$volatile$FU();
    L3:
        long r2 = r02.get(this);
        if ((r2 & FROZEN_MASK) != 0) goto L5;
        long r4 = FROZEN_MASK | r2;
        if (r02.compareAndSet(this, r2, r4) == false) goto L3;
        return r4;
    L5:
        return r2;
    }

    private final LockFreeTaskQueueCore<E> removeSlowPath(int r8, int r9) {
        AtomicLongFieldUpdater r82 = get_state$volatile$FU();
    L3:
        long r2 = r82.get(this);
        int r6 = (int) (HEAD_MASK & r2);
        if ((FROZEN_MASK & r2) != 0) goto L6;
        if (get_state$volatile$FU().compareAndSet(this, r2, Companion.updateHead(r2, r9)) == false) goto L3;
        getArray().set(this.mask & r6, null);
        return null;
    L6:
        return next();
    }

    private final /* synthetic */ void set_next$volatile(Object r1) {
        this._next$volatile = r1;
    }

    private final /* synthetic */ void set_state$volatile(long r1) {
        this._state$volatile = r1;
    }

    private final /* synthetic */ void update$atomicfu$ATOMIC_FIELD_UPDATER$Long(AtomicLongFieldUpdater r7, Object r8, l r9) {
    L2:
        long r2 = r7.get(r8);
        long r4 = ((Number) r9.invoke(Long.valueOf(r2))).longValue();
        AtomicLongFieldUpdater r02 = r7;
        Object r1 = r8;
        if (r02.compareAndSet(r1, r2, r4) == true) goto L4;
        r7 = r02;
        r8 = r1;
        goto L2
    }

    private final /* synthetic */ long updateAndGet$atomicfu$ATOMIC_FIELD_UPDATER$Long(AtomicLongFieldUpdater r8, Object r9, l r10) {
    L2:
        long r2 = r8.get(r9);
        Number r6 = (Number) r10.invoke(Long.valueOf(r2));
        AtomicLongFieldUpdater r02 = r8;
        Object r1 = r9;
        if (r02.compareAndSet(r1, r2, r6.longValue()) == true) goto L5;
        r8 = r02;
        r9 = r1;
        goto L2
    L5:
        return r6.longValue();
    }

    public final int addLast(E r13) {
        AtomicLongFieldUpdater r02 = get_state$volatile$FU();
    L3:
        long r3 = r02.get(this);
        if ((3458764513820540928L & r3) != 0) goto L6;
        int r1 = (int) (HEAD_MASK & r3);
        int r9 = (int) ((TAIL_MASK & r3) >> 30);
        int r10 = this.mask;
        if (((r9 + 2) & r10) == (r1 & r10)) goto L9;
        if (this.singleConsumer == true) goto L19;
        if (getArray().get(r9 & r10) == null) goto L19;
        int r2 = this.capacity;
        if (r2 < 1024) goto L18;
        if (((r9 - r1) & MAX_CAPACITY_MASK) <= (r2 >> 1)) goto L3;
    L18:
        return 1;
    L19:
        int r12 = (r9 + 1) & MAX_CAPACITY_MASK;
        if (get_state$volatile$FU().compareAndSet(this, r3, Companion.updateTail(r3, r12)) == false) goto L3;
        getArray().set(r9 & r10, r13);
        LockFreeTaskQueueCore<E> r03 = this;
    L23:
        if ((get_state$volatile$FU().get(r03) & FROZEN_MASK) == 0) goto L26;
        r03 = r03.next().fillPlaceholder(r9, r13);
        if (r03 != null) goto L23;
        return 0;
    L26:
        return 0;
    L9:
        return 1;
    L6:
        return Companion.addFailReason(r3);
    }

    public final boolean close() {
        AtomicLongFieldUpdater r02 = get_state$volatile$FU();
    L3:
        long r2 = r02.get(this);
        if ((r2 & CLOSED_MASK) != 0) goto L5;
        if ((FROZEN_MASK & r2) != 0) goto L8;
        if (r02.compareAndSet(this, r2, CLOSED_MASK | r2) == false) goto L3;
        return true;
    L8:
        return false;
    L5:
        return true;
    }

    public final int getSize() {
        long r02 = get_state$volatile$FU().get(this);
        int r2 = (int) (HEAD_MASK & r02);
        return (((int) ((r02 & TAIL_MASK) >> 30)) - r2) & MAX_CAPACITY_MASK;
    }

    public final boolean isClosed() {
        if ((get_state$volatile$FU().get(this) & CLOSED_MASK) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean isEmpty() {
        long r02 = get_state$volatile$FU().get(this);
        if (((int) (HEAD_MASK & r02)) != ((int) ((r02 & TAIL_MASK) >> 30))) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> List<R> map(l r7) {
        ArrayList r02 = new ArrayList(this.capacity);
        long r1 = get_state$volatile$FU().get(this);
        int r3 = (int) (HEAD_MASK & r1);
        int r12 = (int) ((r1 & TAIL_MASK) >> 30);
    L3:
        int r2 = this.mask;
        if ((r3 & r2) == (r2 & r12)) goto L11;
        Object r22 = getArray().get(this.mask & r3);
        if (r22 == null) goto L10;
        if ((r22 instanceof Placeholder) == true) goto L10;
        r02.add(r7.invoke(r22));
    L10:
        r3 = r3 + 1;
        goto L3
    L11:
        return r02;
    }

    public final LockFreeTaskQueueCore<E> next() {
        return allocateOrGetNextCopy(markFrozen());
    }

    public final Object removeFirstOrNull() {
        AtomicLongFieldUpdater r02 = get_state$volatile$FU();
    L3:
        long r3 = r02.get(this);
        if ((FROZEN_MASK & r3) != 0) goto L6;
        int r7 = (int) (HEAD_MASK & r3);
        int r1 = (int) ((TAIL_MASK & r3) >> 30);
        int r2 = this.mask;
        if ((r1 & r2) == (r2 & r7)) goto L9;
        Object r9 = getArray().get(this.mask & r7);
        if (r9 == null) goto L13;
        if ((r9 instanceof Placeholder) == true) goto L17;
        int r10 = (r7 + 1) & MAX_CAPACITY_MASK;
        if (get_state$volatile$FU().compareAndSet(this, r3, Companion.updateHead(r3, r10)) == true) goto L20;
        if (this.singleConsumer == false) goto L3;
        LockFreeTaskQueueCore<E> r03 = this;
    L25:
        r03 = r03.removeSlowPath(r7, r10);
        if (r03 != null) goto L25;
        return r9;
    L20:
        getArray().set(this.mask & r7, null);
        return r9;
    L17:
        return null;
    L13:
        if (this.singleConsumer == false) goto L3;
        return null;
    L9:
        return null;
    L6:
        return REMOVE_FROZEN;
    }
}
