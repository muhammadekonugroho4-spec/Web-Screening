package kotlinx.coroutines;

import com.gojek.ojosdk.exif.ExifInterface;
import kotlin.Metadata;
import kotlin.coroutines.i;
import kotlin.jvm.functions.p;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/ThreadContextElement;", ExifInterface.GpsLatitudeRef.SOUTH, "Lkotlin/coroutines/i$b;", "Lkotlin/coroutines/i;", "context", "updateThreadContext", "(Lkotlin/coroutines/i;)Ljava/lang/Object;", "oldState", "Lkotlin/w;", "restoreThreadContext", "(Lkotlin/coroutines/i;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ThreadContextElement<S> extends i.b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <S, R> R fold(ThreadContextElement<S> r02, R r1, p r2) {
            return (R) i.b.a.a(r02, r1, r2);
        }

        public static <S, E extends i.b> E get(ThreadContextElement<S> r02, i.c r1) {
            return (E) i.b.a.b(r02, r1);
        }

        public static <S> i minusKey(ThreadContextElement<S> r02, i.c r1) {
            return i.b.a.c(r02, r1);
        }

        public static <S> i plus(ThreadContextElement<S> r02, i r1) {
            return i.b.a.d(r02, r1);
        }
    }

    @Override // kotlin.coroutines.i
    /* synthetic */ Object fold(Object r1, p r2);

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    /* synthetic */ i.b get(i.c r1);

    @Override // kotlin.coroutines.i.b
    /* synthetic */ i.c getKey();

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    /* synthetic */ i minusKey(i.c r1);

    @Override // kotlin.coroutines.i
    /* synthetic */ i plus(i r1);

    void restoreThreadContext(i r1, S r2);

    S updateThreadContext(i r1);
}
