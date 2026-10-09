package androidx.room.util;

import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes4.dex */
public abstract class d {
    public static final void a(ReadableByteChannel r7, FileChannel r8) {
        kotlin.jvm.internal.p.l(r7, "input");
        kotlin.jvm.internal.p.l(r8, "output");
        r8.transferFrom(r7, 0, Long.MAX_VALUE);     // Catch: Throwable -> L6
        r8.force(false);     // Catch: Throwable -> L6
        r7.close();
        r8.close();
        return;
    L6:
        th = move-exception;
        r7.close();
        r8.close();
        throw th;
    }
}
