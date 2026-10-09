package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class c implements Iterable, Closeable {

    public interface a {
        void a(Object r1, OutputStream r2);

        Object b(byte[] r1);
    }

    public c() {
    }

    public static c l(d r1, a r2) {
        return new b(r1, r2);
    }

    public static c n() {
        return new io.sentry.cache.tape.a();
    }

    public void clear() {
        u(size());
    }

    public abstract void f(Object r1);

    public List k() {
        return t(size());
    }

    public abstract int size();

    public List t(int r5) {
        int r52 = Math.min(r5, size());
        ArrayList r02 = new ArrayList(r52);
        Iterator r1 = iterator();
        int r2 = 0;
    L3:
        if (r2 >= r52) goto L6;
        r02.add(r1.next());
        r2 = r2 + 1;
        goto L3
    L6:
        return Collections.unmodifiableList(r02);
    }

    public abstract void u(int r1);
}
