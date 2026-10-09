package androidx.glance.session;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/glance/session/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "message", "", "block", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "a", "()Landroidx/glance/session/TimeoutCancellationException;", "Ljava/lang/String;", "getMessage", "I", "b", "()I", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimeoutCancellationException extends CancellationException {
    private final int block;
    private final String message;

    static {
    }

    public TimeoutCancellationException(String r1, int r2) {
        super(r1);
        this.message = r1;
        this.block = r2;
    }

    public TimeoutCancellationException a() {
        return this;
    }

    public final int b() {
        return this.block;
    }

    @Override // java.lang.Throwable
    public /* bridge */ /* synthetic */ Throwable fillInStackTrace() {
        return a();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "TimeoutCancellationException(" + getMessage() + ", " + this.block + ')';
    }
}
