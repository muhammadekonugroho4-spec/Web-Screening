package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.collections.builders.SetBuilder;

/* loaded from: classes3.dex */
public abstract class Z {
    public static Set a(Set r1) {
        kotlin.jvm.internal.p.l(r1, "builder");
        return ((SetBuilder) r1).a();
    }

    public static Set b() {
        return new SetBuilder();
    }

    public static Set c(int r1) {
        return new SetBuilder(r1);
    }

    public static Set d(Object r1) {
        Set r12 = Collections.singleton(r1);
        kotlin.jvm.internal.p.k(r12, "singleton(...)");
        return r12;
    }
}
