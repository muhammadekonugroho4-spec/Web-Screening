package kotlinx.coroutines.flow.internal;

import com.clevertap.android.sdk.Constants;
import com.gojek.ojosdk.exif.ExifInterface;
import kotlin.Metadata;
import kotlin.coroutines.i;
import kotlin.jvm.functions.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0003¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\u0012\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0096\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/flow/internal/DownstreamExceptionContext;", "Lkotlin/coroutines/i;", "", "e", "originalContext", "<init>", "(Ljava/lang/Throwable;Lkotlin/coroutines/i;)V", "Lkotlin/coroutines/i$b;", ExifInterface.GpsLongitudeRef.EAST, "Lkotlin/coroutines/i$c;", Constants.KEY_KEY, "get", "(Lkotlin/coroutines/i$c;)Lkotlin/coroutines/i$b;", "", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/p;)Ljava/lang/Object;", "context", "plus", "(Lkotlin/coroutines/i;)Lkotlin/coroutines/i;", "minusKey", "(Lkotlin/coroutines/i$c;)Lkotlin/coroutines/i;", "Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DownstreamExceptionContext implements i {
    private final /* synthetic */ i $$delegate_0;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f180474e;

    public DownstreamExceptionContext(Throwable r1, i r2) {
        this.$$delegate_0 = r2;
        this.f180474e = r1;
    }

    @Override // kotlin.coroutines.i
    public <R> R fold(R r2, p r3) {
        return (R) this.$$delegate_0.fold(r2, r3);
    }

    @Override // kotlin.coroutines.i
    public <E extends i.b> E get(i.c r2) {
        return (E) this.$$delegate_0.get(r2);
    }

    @Override // kotlin.coroutines.i
    public i minusKey(i.c r2) {
        return this.$$delegate_0.minusKey(r2);
    }

    @Override // kotlin.coroutines.i
    public i plus(i r2) {
        return this.$$delegate_0.plus(r2);
    }
}
