package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.collections.AbstractC11777v;

/* loaded from: classes3.dex */
public interface f {
    default boolean b() {
        return false;
    }

    int c(String r1);

    f d(int r1);

    int e();

    String f(int r1);

    List g(int r1);

    default List getAnnotations() {
        return AbstractC11777v.o();
    }

    l getKind();

    String h();

    boolean i(int r1);

    default boolean isInline() {
        return false;
    }
}
