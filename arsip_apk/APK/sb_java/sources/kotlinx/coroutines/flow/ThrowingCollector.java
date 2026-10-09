package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.w;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/flow/ThrowingCollector;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "", "e", "<init>", "(Ljava/lang/Throwable;)V", "value", "Lkotlin/w;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/e;)Ljava/lang/Object;", "Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThrowingCollector implements FlowCollector<Object> {

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f180471e;

    public ThrowingCollector(Throwable r1) {
        this.f180471e = r1;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object r1, kotlin.coroutines.e<? super w> r2) {
        throw this.f180471e;
    }
}
