package okhttp3.internal.http2.flowcontrol;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0016¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "", "", "streamId", "<init>", "(I)V", "", "total", "acknowledged", "Lkotlin/w;", "b", "(JJ)V", "", "toString", "()Ljava/lang/String;", "a", "I", "getStreamId", "()I", "value", "J", "getTotal", "()J", "c", "getAcknowledged", "unacknowledged", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WindowCounter {

    /* renamed from: a, reason: collision with root package name */
    public final int f182111a;

    /* renamed from: b, reason: collision with root package name */
    public long f182112b;

    /* renamed from: c, reason: collision with root package name */
    public long f182113c;

    public WindowCounter(int r1) {
        this.f182111a = r1;
    }

    public static /* synthetic */ void c(WindowCounter r2, long r3, long r5, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r7 & 2) == 0) goto L8;
        r5 = 0;
    L8:
        r2.b(r3, r5);
    }

    public final synchronized long a() {
        monitor-enter(this);
        long r02 = this.f182112b - this.f182113c;
        monitor-exit(this);
        return r02;
    L7:
        th = move-exception;
        throw th;
    }

    public final synchronized void b(long r4, long r6) {
        monitor-enter(this);
        if (r4 < 0) goto L19;
        if (r6 < 0) goto L17;
        long r02 = this.f182112b + r4;     // Catch: Throwable -> L14
        this.f182112b = r02;     // Catch: Throwable -> L14
        long r42 = this.f182113c + r6;     // Catch: Throwable -> L14
        this.f182113c = r42;     // Catch: Throwable -> L14
        if (r42 > r02) goto L13;
        monitor-exit(this);
        return;
    L13:
        throw new IllegalStateException("Check failed.");     // Catch: Throwable -> L14
    L17:
        throw new IllegalStateException("Check failed.");     // Catch: Throwable -> L14
    L19:
        throw new IllegalStateException("Check failed.");     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        throw th;
    }

    public String toString() {
        return "WindowCounter(streamId=" + this.f182111a + ", total=" + this.f182112b + ", acknowledged=" + this.f182113c + ", unacknowledged=" + a() + ')';
    }
}
