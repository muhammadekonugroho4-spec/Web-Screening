package org.minidns.util;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class MultipleIoException extends IOException {
    private static final long serialVersionUID = -5932211337552319515L;
    private final List<IOException> ioExceptions;

    static {
    }

    public MultipleIoException(List r2) {
        super(a(r2));
        this.ioExceptions = Collections.unmodifiableList(r2);
    }

    public static String a(Collection r2) {
        StringBuilder r02 = new StringBuilder();
        Iterator r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L9;
        r02.append(((Exception) r22.next()).getMessage());
        if (r22.hasNext() == false) goto L4;
        r02.append(", ");
        goto L4
    L9:
        return r02.toString();
    }

    public static void b(List r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        if (r2.isEmpty() == false) goto L7;
        return;
    L7:
        if (r2.size() != 1) goto L11;
        throw ((IOException) r2.get(0));
    L11:
        throw new MultipleIoException(r2);
    }
}
