package androidx.camera.core;

/* loaded from: classes.dex */
public class CameraUnavailableException extends Exception {
    private final int mReason;

    public CameraUnavailableException(int r1, String r2) {
        super(r2);
        this.mReason = r1;
    }

    public CameraUnavailableException(int r1, Throwable r2) {
        super(r2);
        this.mReason = r1;
    }
}
