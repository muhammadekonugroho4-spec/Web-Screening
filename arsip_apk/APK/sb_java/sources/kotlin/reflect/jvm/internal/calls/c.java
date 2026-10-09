package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public interface c {

    public static final class a {
        public static void a(c r3, Object[] r4) {
            p.l(r4, "args");
            if (e.a(r3) != r4.length) goto L6;
            return;
        L6:
            throw new IllegalArgumentException("Callable expects " + e.a(r3) + " arguments, but " + r4.length + " were provided.");
        }
    }

    List a();

    Member b();

    Object call(Object[] r1);

    Type getReturnType();
}
