package kotlin.coroutines;

import com.clevertap.android.sdk.Constants;
import kotlin.coroutines.f;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public interface i {

    public static final class a {
        public static /* synthetic */ i a(i r02, b r1) {
            return c(r02, r1);
        }

        public static i b(i r1, i r2) {
            p.l(r2, "context");
            if (r2 != EmptyCoroutineContext.f177407a) goto L6;
            return r1;
        L6:
            return (i) r2.fold(r1, new h());
        }

        public static i c(i r3, b r4) {
            p.l(r3, "acc");
            p.l(r4, "element");
            i r32 = r3.minusKey(r4.getKey());
            EmptyCoroutineContext r02 = EmptyCoroutineContext.f177407a;
            if (r32 != r02) goto L5;
            return r4;
        L5:
            f.b r1 = f.f177410v0;
            f r2 = (f) r32.get(r1);
            if (r2 == null) goto L8;
            i r33 = r32.minusKey(r1);
            if (r33 != r02) goto L14;
            return new CombinedContext(r4, r2);
        L14:
            return new CombinedContext(new CombinedContext(r33, r4), r2);
        L8:
            return new CombinedContext(r32, r4);
        }
    }

    public interface b extends i {

        public static final class a {
            public static Object a(b r1, Object r2, kotlin.jvm.functions.p r3) {
                p.l(r3, "operation");
                return r3.invoke(r2, r1);
            }

            public static b b(b r1, c r2) {
                p.l(r2, Constants.KEY_KEY);
                if (p.g(r1.getKey(), r2) == false) goto L6;
                p.j(r1, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return r1;
            L6:
                return null;
            }

            public static i c(b r1, c r2) {
                p.l(r2, Constants.KEY_KEY);
                if (p.g(r1.getKey(), r2) == true) goto L5;
                return r1;
            L5:
                return EmptyCoroutineContext.f177407a;
            }

            public static i d(b r1, i r2) {
                p.l(r2, "context");
                return a.b(r1, r2);
            }
        }

        @Override // kotlin.coroutines.i
        b get(c r1);

        c getKey();

        @Override // kotlin.coroutines.i
        i minusKey(c r1);
    }

    public interface c {
    }

    Object fold(Object r1, kotlin.jvm.functions.p r2);

    b get(c r1);

    i minusKey(c r1);

    i plus(i r1);
}
