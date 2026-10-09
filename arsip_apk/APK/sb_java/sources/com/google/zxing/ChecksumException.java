package com.google.zxing;

/* loaded from: classes6.dex */
public final class ChecksumException extends ReaderException {
    private static final ChecksumException INSTANCE = null;

    static {
        ChecksumException r02 = new ChecksumException();
        INSTANCE = r02;
        r02.setStackTrace(ReaderException.NO_TRACE);
    }

    private ChecksumException() {
    }

    public static ChecksumException getChecksumInstance() {
        if (ReaderException.isStackTrace == false) goto L7;
        return new ChecksumException();
    L7:
        return INSTANCE;
    }

    private ChecksumException(Throwable r1) {
        super(r1);
    }

    public static ChecksumException getChecksumInstance(Throwable r1) {
        if (ReaderException.isStackTrace == false) goto L7;
        return new ChecksumException(r1);
    L7:
        return INSTANCE;
    }
}
