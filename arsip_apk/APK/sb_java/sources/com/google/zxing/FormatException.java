package com.google.zxing;

/* loaded from: classes6.dex */
public final class FormatException extends ReaderException {
    private static final FormatException INSTANCE = null;

    static {
        FormatException r02 = new FormatException();
        INSTANCE = r02;
        r02.setStackTrace(ReaderException.NO_TRACE);
    }

    private FormatException() {
    }

    public static FormatException getFormatInstance() {
        if (ReaderException.isStackTrace == false) goto L7;
        return new FormatException();
    L7:
        return INSTANCE;
    }

    private FormatException(Throwable r1) {
        super(r1);
    }

    public static FormatException getFormatInstance(Throwable r1) {
        if (ReaderException.isStackTrace == false) goto L7;
        return new FormatException(r1);
    L7:
        return INSTANCE;
    }
}
