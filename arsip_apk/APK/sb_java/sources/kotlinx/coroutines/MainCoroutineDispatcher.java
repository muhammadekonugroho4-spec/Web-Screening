package kotlinx.coroutines;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\bH\u0005R\u0012\u0010\u0004\u001a\u00020\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "immediate", "getImmediate", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "toString", "", "limitedParallelism", "parallelism", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "toStringInternalImpl", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class MainCoroutineDispatcher extends CoroutineDispatcher {
    public MainCoroutineDispatcher() {
    }

    public abstract MainCoroutineDispatcher getImmediate();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int r1, String r2) {
        LimitedDispatcherKt.checkParallelism(r1);
        return LimitedDispatcherKt.namedOrThis(this, r2);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String r02 = toStringInternalImpl();
        if (r02 == null) goto L5;
        return r02;
    L5:
        return DebugStringsKt.getClassSimpleName(this) + '@' + DebugStringsKt.getHexAddress(this);
    }

    @InternalCoroutinesApi
    public final String toStringInternalImpl() {
        MainCoroutineDispatcher r02 = Dispatchers.getMain();
        if (this != r02) goto L14;
        return "Dispatchers.Main";
    L14:
        MainCoroutineDispatcher r03 = r02.getImmediate();     // Catch: UnsupportedOperationException -> L9
    L10:
        if (this != r03) goto L13;
        return "Dispatchers.Main.immediate";
    L13:
        return null;
    L9:
        r03 = null;
        goto L10
    }
}
