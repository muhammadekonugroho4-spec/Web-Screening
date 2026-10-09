package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public abstract class g {

    public static class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f22966a;

        public a(Handler r1) {
            this.f22966a = (Handler) androidx.core.util.h.g(r1);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable r3) {
            if (this.f22966a.post((Runnable) androidx.core.util.h.g(r3)) == false) goto L6;
            return;
        L6:
            throw new RejectedExecutionException(this.f22966a + " is shutting down");
        }
    }

    public static Executor a(Handler r1) {
        return new a(r1);
    }
}
