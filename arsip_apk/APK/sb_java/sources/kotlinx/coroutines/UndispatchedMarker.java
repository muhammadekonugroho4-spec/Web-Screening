package kotlinx.coroutines;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.coroutines.i;
import kotlin.jvm.functions.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/UndispatchedMarker;", "Lkotlin/coroutines/i$b;", "Lkotlin/coroutines/i$c;", "<init>", "()V", "getKey", "()Lkotlin/coroutines/i$c;", Constants.KEY_KEY, "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class UndispatchedMarker implements i.b, i.c {
    public static final UndispatchedMarker INSTANCE = null;

    static {
        INSTANCE = new UndispatchedMarker();
    }

    private UndispatchedMarker() {
    }

    @Override // kotlin.coroutines.i
    public <R> R fold(R r1, p r2) {
        return (R) i.b.a.a(this, r1, r2);
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    public <E extends i.b> E get(i.c r1) {
        return (E) i.b.a.b(this, r1);
    }

    @Override // kotlin.coroutines.i.b
    public i.c getKey() {
        return this;
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    public i minusKey(i.c r1) {
        return i.b.a.c(this, r1);
    }

    @Override // kotlin.coroutines.i
    public i plus(i r1) {
        return i.b.a.d(this, r1);
    }
}
