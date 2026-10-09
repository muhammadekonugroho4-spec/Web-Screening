package okhttp3.internal.concurrent;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u000fR\"\u0010\u001f\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lokhttp3/internal/concurrent/Task;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "cancelable", "<init>", "(Ljava/lang/String;Z)V", "", "f", "()J", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "Lkotlin/w;", "e", "(Lokhttp3/internal/concurrent/TaskQueue;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Z", "()Z", "c", "Lokhttp3/internal/concurrent/TaskQueue;", Constants.INAPP_DATA_TAG, "()Lokhttp3/internal/concurrent/TaskQueue;", "setQueue$okhttp", "J", "g", "(J)V", "nextExecuteNanoTime", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Task {

    /* renamed from: a, reason: collision with root package name */
    public final String f181725a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f181726b;

    /* renamed from: c, reason: collision with root package name */
    public TaskQueue f181727c;
    public long d;

    public Task(String r2, boolean r3) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f181725a = r2;
        this.f181726b = r3;
        this.d = -1;
    }

    public final boolean a() {
        return this.f181726b;
    }

    public final String b() {
        return this.f181725a;
    }

    public final long c() {
        return this.d;
    }

    public final TaskQueue d() {
        return this.f181727c;
    }

    public final void e(TaskQueue r2) {
        p.l(r2, "queue");
        TaskQueue r02 = this.f181727c;
        if (r02 != r2) goto L5;
        return;
    L5:
        if (r02 != null) goto L9;
        this.f181727c = r2;
        return;
    L9:
        throw new IllegalStateException("task is in multiple queues");
    }

    public abstract long f();

    public final void g(long r1) {
        this.d = r1;
    }

    public String toString() {
        return this.f181725a;
    }

    public /* synthetic */ Task(String r1, boolean r2, int r3, i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = true;
    L5:
        this(r1, r2);
    }
}
