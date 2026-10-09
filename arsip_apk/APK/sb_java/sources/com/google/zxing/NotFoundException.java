package com.google.zxing;

/* loaded from: classes6.dex */
public final class NotFoundException extends ReaderException {
    private static final NotFoundException INSTANCE = null;

    static {
        NotFoundException r02 = new NotFoundException();
        INSTANCE = r02;
        r02.setStackTrace(ReaderException.NO_TRACE);
    }

    private NotFoundException() {
    }

    public static NotFoundException getNotFoundInstance() {
        return INSTANCE;
    }
}
