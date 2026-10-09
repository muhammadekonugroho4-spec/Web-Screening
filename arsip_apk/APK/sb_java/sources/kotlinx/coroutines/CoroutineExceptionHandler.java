package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.i;
import kotlin.jvm.functions.p;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/i$b;", "Lkotlin/coroutines/i;", "context", "", "exception", "Lkotlin/w;", "handleException", "(Lkotlin/coroutines/i;Ljava/lang/Throwable;)V", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CoroutineExceptionHandler extends i.b {
    public static final Key Key = null;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(CoroutineExceptionHandler r02, R r1, p r2) {
            return (R) i.b.a.a(r02, r1, r2);
        }

        public static <E extends i.b> E get(CoroutineExceptionHandler r02, i.c r1) {
            return (E) i.b.a.b(r02, r1);
        }

        public static i minusKey(CoroutineExceptionHandler r02, i.c r1) {
            return i.b.a.c(r02, r1);
        }

        public static i plus(CoroutineExceptionHandler r02, i r1) {
            return i.b.a.d(r02, r1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler$Key;", "Lkotlin/coroutines/i$c;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Key implements i.c {
        static final /* synthetic */ Key $$INSTANCE = null;

        static {
            $$INSTANCE = new Key();
        }

        private Key() {
        }
    }

    static {
        Key = Key.$$INSTANCE;
    }

    @Override // kotlin.coroutines.i
    /* synthetic */ Object fold(Object r1, p r2);

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    /* synthetic */ i.b get(i.c r1);

    @Override // kotlin.coroutines.i.b
    /* synthetic */ i.c getKey();

    void handleException(i r1, Throwable r2);

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    /* synthetic */ i minusKey(i.c r1);

    @Override // kotlin.coroutines.i
    /* synthetic */ i plus(i r1);
}
