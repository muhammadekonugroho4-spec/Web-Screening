package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* loaded from: classes5.dex */
public class IntegrityServiceException extends ApiException {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f38202a;

    public IntegrityServiceException(int r5, Throwable r6) {
        super(new Status(r5, String.format(Locale.ROOT, "Integrity API error (%d): %s.", new Object[]{Integer.valueOf(r5), com.google.android.play.core.integrity.model.a.a(r5)})));
        if (r5 == 0) goto L7;
        this.f38202a = r6;
        return;
    L7:
        throw new IllegalArgumentException("ErrorCode should not be 0.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        monitor-enter(this);
        Throwable r02 = this.f38202a;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
