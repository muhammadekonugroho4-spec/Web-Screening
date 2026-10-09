package androidx.collection.internal;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public abstract class d {
    public static final void a(String r1) {
        p.l(r1, "message");
        throw new IllegalArgumentException(r1);
    }

    public static final void b(String r1) {
        p.l(r1, "message");
        throw new IllegalStateException(r1);
    }

    public static final void c(String r1) {
        p.l(r1, "message");
        throw new IndexOutOfBoundsException(r1);
    }

    public static final void d(String r1) {
        p.l(r1, "message");
        throw new NoSuchElementException(r1);
    }
}
