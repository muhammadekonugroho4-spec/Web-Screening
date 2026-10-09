package androidx.core.os;

/* loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String r2) {
        super(androidx.core.util.c.e(r2, "The operation has been canceled."));
    }
}
