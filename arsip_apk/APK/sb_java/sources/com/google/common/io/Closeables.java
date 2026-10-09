package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: classes5.dex */
public final class Closeables {

    @VisibleForTesting
    static final Logger logger = null;

    static {
        logger = Logger.getLogger(Closeables.class.getName());
    }

    private Closeables() {
    }

    public static void close(Closeable r2, boolean r3) throws IOException {
        if (r2 == null) goto L13;
        r2.close();     // Catch: IOException -> L6
        return;
    L6:
        e = move-exception;
        if (r3 == false) goto L10;
        logger.log(Level.WARNING, "IOException thrown while closing Closeable.", e);
        return;
    L10:
        throw e;
    }

    public static void closeQuietly(InputStream r1) {
        close(r1, true);     // Catch: IOException -> L5
        return;
    L5:
        e = move-exception;
        throw new AssertionError(e);
    }

    public static void closeQuietly(Reader r1) {
        close(r1, true);     // Catch: IOException -> L5
        return;
    L5:
        e = move-exception;
        throw new AssertionError(e);
    }
}
