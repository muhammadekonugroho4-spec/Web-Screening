package kotlinx.coroutines.channels;

import com.gojek.ojosdk.exif.ExifInterface;
import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.InternalCoroutinesApi;

@kotlin.jvm.b
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087@\u0018\u0000 \"*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003 !\"B\u0013\b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0010\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0011\u0010\u0005J\r\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006#"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult;", ExifInterface.GpsTrackRef.TRUE_DIRECTION, "", "holder", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "getHolder$annotations", "()V", "isSuccess", "", "isSuccess-impl", "(Ljava/lang/Object;)Z", "isFailure", "isFailure-impl", "isClosed", "isClosed-impl", "getOrNull", "getOrNull-impl", "getOrThrow", "getOrThrow-impl", "exceptionOrNull", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "equals", "other", "hashCode", "", "Failed", "Closed", "Companion", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChannelResult<T> {
    public static final Companion Companion = null;
    private static final Failed failed = null;
    private final Object holder;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Closed;", "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Closed extends Failed {
        public final Throwable cause;

        public Closed(Throwable r1) {
            this.cause = r1;
        }

        public boolean equals(Object r2) {
            if ((r2 instanceof Closed) == true) goto L5;
            return false;
        L5:
            if (p.g(this.cause, ((Closed) r2).cause) == false) goto L10;
            return true;
        L10:
            return false;
        }

        public int hashCode() {
            Throwable r02 = this.cause;
            if (r02 != null) goto L5;
            return 0;
        L5:
            return r02.hashCode();
        }

        @Override // kotlinx.coroutines.channels.ChannelResult.Failed
        public String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    @InternalCoroutinesApi
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0001\u0010\b2\u0006\u0010\t\u001a\u0002H\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0001\u0010\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0001\u0010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Companion;", "", "<init>", "()V", TransactionResult.STATUS_FAILED, "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "success", "Lkotlinx/coroutines/channels/ChannelResult;", ExifInterface.GpsLongitudeRef.EAST, "value", "success-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "failure", "failure-PtdJZtk", "()Ljava/lang/Object;", "closed", "cause", "", "closed-JP2dKIU", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(i r1) {
            this();
        }

        @InternalCoroutinesApi
        /* renamed from: closed-JP2dKIU, reason: not valid java name */
        public final <E> Object m840closedJP2dKIU(Throwable r2) {
            return ChannelResult.m828constructorimpl(new Closed(r2));
        }

        @InternalCoroutinesApi
        /* renamed from: failure-PtdJZtk, reason: not valid java name */
        public final <E> Object m841failurePtdJZtk() {
            return ChannelResult.m828constructorimpl(ChannelResult.access$getFailed$cp());
        }

        @InternalCoroutinesApi
        /* renamed from: success-JP2dKIU, reason: not valid java name */
        public final <E> Object m842successJP2dKIU(E r1) {
            return ChannelResult.m828constructorimpl(r1);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Failed;", "", "<init>", "()V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class Failed {
        public Failed() {
        }

        public String toString() {
            return "Failed";
        }
    }

    static {
        Companion = new Companion(null);
        failed = new Failed();
    }

    private /* synthetic */ ChannelResult(Object r1) {
        this.holder = r1;
    }

    public static final /* synthetic */ Failed access$getFailed$cp() {
        return failed;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ChannelResult m827boximpl(Object r1) {
        return new ChannelResult(r1);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m828constructorimpl(Object r02) {
        return r02;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m829equalsimpl(Object r2, Object r3) {
        if ((r3 instanceof ChannelResult) == true) goto L6;
        return false;
    L6:
        if (p.g(r2, ((ChannelResult) r3).m839unboximpl()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m830equalsimpl0(Object r02, Object r1) {
        return p.g(r02, r1);
    }

    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m831exceptionOrNullimpl(Object r2) {
        if ((r2 instanceof Closed) == false) goto L5;
        Closed r22 = (Closed) r2;
    L6:
        if (r22 != null) goto L8;
        return null;
    L8:
        return r22.cause;
    L5:
        r22 = null;
        goto L6
    }

    public static /* synthetic */ void getHolder$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOrNull-impl, reason: not valid java name */
    public static final T m832getOrNullimpl(Object r1) {
        if ((r1 instanceof Failed) == true) goto L5;
        return r1;
    L5:
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOrThrow-impl, reason: not valid java name */
    public static final T m833getOrThrowimpl(Object r1) {
        if ((r1 instanceof Failed) == true) goto L6;
        return r1;
    L6:
        if ((r1 instanceof Closed) == false) goto L13;
        Throwable r12 = ((Closed) r1).cause;
        if (r12 == null) goto L11;
        throw r12;
    L11:
        throw new IllegalStateException("Trying to call 'getOrThrow' on a channel closed without a cause");
    L13:
        throw new IllegalStateException("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m834hashCodeimpl(Object r02) {
        if (r02 != null) goto L6;
        return 0;
    L6:
        return r02.hashCode();
    }

    /* renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m835isClosedimpl(Object r02) {
        return r02 instanceof Closed;
    }

    /* renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m836isFailureimpl(Object r02) {
        return r02 instanceof Failed;
    }

    /* renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m837isSuccessimpl(Object r02) {
        return !(r02 instanceof Failed);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m838toStringimpl(Object r2) {
        if ((r2 instanceof Closed) == false) goto L7;
        return ((Closed) r2).toString();
    L7:
        return "Value(" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return m829equalsimpl(this.holder, r2);
    }

    public int hashCode() {
        return m834hashCodeimpl(this.holder);
    }

    public String toString() {
        return m838toStringimpl(this.holder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m839unboximpl() {
        return this.holder;
    }
}
