package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.util.j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public abstract class a extends b {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile androidx.loader.content.a.a mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile androidx.loader.content.a.a mTask;
    long mUpdateThrottle;

    /* renamed from: androidx.loader.content.a$a, reason: collision with other inner class name */
    public final class RunnableC0211a extends ModernAsyncTask implements Runnable {

        /* renamed from: k, reason: collision with root package name */
        public final CountDownLatch f25797k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f25798l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f25799m;

        public RunnableC0211a(a r2) {
            this.f25799m = r2;
            this.f25797k = new CountDownLatch(1);
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public /* bridge */ /* synthetic */ Object b(Object[] r1) {
            return m((Void[]) r1);
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public void g(Object r2) {
            this.f25799m.dispatchOnCancelled(this, r2);     // Catch: Throwable -> L5
            this.f25797k.countDown();
            return;
        L5:
            th = move-exception;
            this.f25797k.countDown();
            throw th;
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public void h(Object r2) {
            this.f25799m.dispatchOnLoadComplete(this, r2);     // Catch: Throwable -> L5
            this.f25797k.countDown();
            return;
        L5:
            th = move-exception;
            this.f25797k.countDown();
            throw th;
        }

        public Object m(Void... r2) {
            return this.f25799m.onLoadInBackground();
        L4:
            e = move-exception;
            if (f() == false) goto L9;
            return null;
        L9:
            throw e;
        }

        public void n() {
            this.f25797k.await();     // Catch: InterruptedException -> L4
            return;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25798l = false;
            this.f25799m.executePendingTask();
        }
    }

    public a(Context r2) {
        this(r2, ModernAsyncTask.f25782h);
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(androidx.loader.content.a.a r1, Object r2) {
        onCanceled(r2);
        if (this.mCancellingTask != r1) goto L6;
        rollbackContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mCancellingTask = null;
        deliverCancellation();
        executePendingTask();
        return;
    }

    public void dispatchOnLoadComplete(androidx.loader.content.a.a r3, Object r4) {
        if (this.mTask == r3) goto L7;
        dispatchOnCancelled(r3, r4);
        return;
    L7:
        if (isAbandoned() == false) goto L10;
        onCanceled(r4);
        return;
    L10:
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(r4);
    }

    @Override // androidx.loader.content.b
    @Deprecated
    public void dump(String r5, FileDescriptor r6, PrintWriter r7, String[] r8) {
        super.dump(r5, r6, r7, r8);
        if (this.mTask == null) goto L6;
        r7.print(r5);
        r7.print("mTask=");
        r7.print(this.mTask);
        r7.print(" waiting=");
        r7.println(this.mTask.f25798l);
    L6:
        if (this.mCancellingTask == null) goto L9;
        r7.print(r5);
        r7.print("mCancellingTask=");
        r7.print(this.mCancellingTask);
        r7.print(" waiting=");
        r7.println(this.mCancellingTask.f25798l);
    L9:
        if (this.mUpdateThrottle == 0) goto L12;
        r7.print(r5);
        r7.print("mUpdateThrottle=");
        j.c(this.mUpdateThrottle, r7);
        r7.print(" mLastLoadCompleteTime=");
        j.b(this.mLastLoadCompleteTime, SystemClock.uptimeMillis(), r7);
        r7.println();
        return;
    }

    public void executePendingTask() {
        if (this.mCancellingTask == null) goto L5;
        return;
    L5:
        if (this.mTask != null) goto L7;
        return;
    L7:
        if (this.mTask.f25798l == false) goto L10;
        this.mTask.f25798l = false;
        this.mHandler.removeCallbacks(this.mTask);
    L10:
        if (this.mUpdateThrottle > 0) goto L12;
    L15:
        this.mTask.c(this.mExecutor, null);
        return;
    L12:
        if (SystemClock.uptimeMillis() >= (this.mLastLoadCompleteTime + this.mUpdateThrottle)) goto L15;
        this.mTask.f25798l = true;
        this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
    }

    public boolean isLoadInBackgroundCanceled() {
        if (this.mCancellingTask == null) goto L6;
        return true;
    L6:
        return false;
    }

    public abstract Object loadInBackground();

    @Override // androidx.loader.content.b
    public boolean onCancelLoad() {
        if (this.mTask != null) goto L5;
        return false;
    L5:
        if (this.mStarted == true) goto L8;
        this.mContentChanged = true;
    L8:
        if (this.mCancellingTask == null) goto L15;
        if (this.mTask.f25798l == false) goto L12;
        this.mTask.f25798l = false;
        this.mHandler.removeCallbacks(this.mTask);
    L12:
        this.mTask = null;
        return false;
    L15:
        if (this.mTask.f25798l == false) goto L18;
        this.mTask.f25798l = false;
        this.mHandler.removeCallbacks(this.mTask);
        this.mTask = null;
        return false;
    L18:
        boolean r02 = this.mTask.a(false);
        if (r02 == false) goto L21;
        this.mCancellingTask = this.mTask;
        cancelLoadInBackground();
    L21:
        this.mTask = null;
        return r02;
    }

    public void onCanceled(Object r1) {
    }

    @Override // androidx.loader.content.b
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new RunnableC0211a(this);
        executePendingTask();
    }

    public Object onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long r3) {
        this.mUpdateThrottle = r3;
        if (r3 == 0) goto L6;
        this.mHandler = new Handler();
        return;
    }

    public void waitForLoader() {
        androidx.loader.content.a.a r02 = this.mTask;
        if (r02 == null) goto L6;
        r02.n();
        return;
    }

    public a(Context r3, Executor r4) {
        super(r3);
        this.mLastLoadCompleteTime = -10000;
        this.mExecutor = r4;
    }
}
