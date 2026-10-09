package retrofit2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: retrofit2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC12128a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f183435a;

    public ExecutorC12128a() {
        this.f183435a = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r2) {
        this.f183435a.post(r2);
    }
}
