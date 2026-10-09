package kotlinx.coroutines.internal;

import com.gojek.ojosdk.exif.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlinx.coroutines.InternalCoroutinesApi;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007*\u0010\b\u0007\u0010\t\"\u00020\u00012\u00020\u0001B\u0002\b\b¨\u0006\n"}, d2 = {ExifInterface.GpsTrackRef.TRUE_DIRECTION, "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "lock", "Lkotlin/Function0;", "block", "synchronizedImpl", "(Ljava/lang/Object;Lkotlin/jvm/functions/a;)Ljava/lang/Object;", "Lkotlinx/coroutines/InternalCoroutinesApi;", "SynchronizedObject", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SynchronizedKt {
    @InternalCoroutinesApi
    public static /* synthetic */ void SynchronizedObject$annotations() {
    }

    @InternalCoroutinesApi
    public static final <T> T synchronizedImpl(Object r1, kotlin.jvm.functions.a r2) {
        monitor-enter(r1);
        T r22 = (T) r2.invoke();
        n.b(1);
        monitor-exit(r1);
        n.a(1);
        return r22;
    L9:
        th = move-exception;
        n.b(1);
        n.a(1);
        throw th;
    }
}
