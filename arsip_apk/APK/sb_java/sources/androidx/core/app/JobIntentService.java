package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f22598h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f22599i = null;

    /* renamed from: a, reason: collision with root package name */
    public b f22600a;

    /* renamed from: b, reason: collision with root package name */
    public f f22601b;

    /* renamed from: c, reason: collision with root package name */
    public a f22602c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22603e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22604f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f22605g;

    public final class a extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JobIntentService f22606a;

        public a(JobIntentService r1) {
            this.f22606a = r1;
        }

        public Void a(Void... r3) {
        L2:
            d r32 = this.f22606a.a();
            if (r32 == null) goto L5;
            this.f22606a.d(r32.getIntent());
            r32.complete();
            goto L2
        L5:
            return null;
        }

        public void b(Void r1) {
            this.f22606a.f();
        }

        public void c(Void r1) {
            this.f22606a.f();
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Object doInBackground(Object[] r1) {
            return a((Void[]) r1);
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onCancelled(Object r1) {
            b((Void) r1);
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Object r1) {
            c((Void) r1);
        }
    }

    public interface b {
        IBinder a();

        d b();
    }

    public final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f22607a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22608b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JobIntentService f22609c;

        public c(JobIntentService r1, Intent r2, int r3) {
            this.f22609c = r1;
            this.f22607a = r2;
            this.f22608b = r3;
        }

        @Override // androidx.core.app.JobIntentService.d
        public void complete() {
            this.f22609c.stopSelf(this.f22608b);
        }

        @Override // androidx.core.app.JobIntentService.d
        public Intent getIntent() {
            return this.f22607a;
        }
    }

    public interface d {
        void complete();

        Intent getIntent();
    }

    public static final class e extends JobServiceEngine implements b {

        /* renamed from: a, reason: collision with root package name */
        public final JobIntentService f22610a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f22611b;

        /* renamed from: c, reason: collision with root package name */
        public JobParameters f22612c;

        public final class a implements d {

            /* renamed from: a, reason: collision with root package name */
            public final JobWorkItem f22613a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f22614b;

            public a(e r1, JobWorkItem r2) {
                this.f22614b = r1;
                this.f22613a = r2;
            }

            @Override // androidx.core.app.JobIntentService.d
            public void complete() {
                Object r02 = this.f22614b.f22611b;
                monitor-enter(r02);
                JobParameters r1 = this.f22614b.f22612c;     // Catch: Throwable -> L7
                if (r1 == null) goto L9;
                r1.completeWork(this.f22613a);     // Catch: Throwable -> L7
            L9:
                monitor-exit(r02);     // Catch: Throwable -> L7
                return;
            L7:
                th = move-exception;
                throw th;
            }

            @Override // androidx.core.app.JobIntentService.d
            public Intent getIntent() {
                return this.f22613a.getIntent();
            }
        }

        public e(JobIntentService r2) {
            super(r2);
            this.f22611b = new Object();
            this.f22610a = r2;
        }

        @Override // androidx.core.app.JobIntentService.b
        public IBinder a() {
            return getBinder();
        }

        @Override // androidx.core.app.JobIntentService.b
        public d b() {
            Object r02 = this.f22611b;
            monitor-enter(r02);
            JobParameters r1 = this.f22612c;     // Catch: Throwable -> L8
            if (r1 != null) goto L10;
            monitor-exit(r02);     // Catch: Throwable -> L8
            return null;
        L10:
            JobWorkItem r12 = r1.dequeueWork();     // Catch: Throwable -> L8
            monitor-exit(r02);     // Catch: Throwable -> L8
            if (r12 == null) goto L15;
            r12.getIntent().setExtrasClassLoader(this.f22610a.getClassLoader());
            return new a(this, r12);
        L15:
            return null;
        L8:
            th = move-exception;
            throw th;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters r2) {
            this.f22612c = r2;
            this.f22610a.c(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters r3) {
            boolean r32 = this.f22610a.b();
            Object r02 = this.f22611b;
            monitor-enter(r02);
            this.f22612c = null;     // Catch: Throwable -> L8
            monitor-exit(r02);     // Catch: Throwable -> L8
            return r32;
        L8:
            th = move-exception;
            throw th;
        }
    }

    public static abstract class f {
        public abstract void a();

        public abstract void b();

        public abstract void c();
    }

    static {
        f22598h = new Object();
        f22599i = new HashMap();
    }

    public JobIntentService() {
        this.d = false;
        this.f22603e = false;
        this.f22604f = false;
        this.f22605g = null;
    }

    public d a() {
        b r02 = this.f22600a;
        if (r02 != null) goto L5;
        ArrayList r03 = this.f22605g;
        monitor-enter(r03);
    L13:
        th = move-exception;
        throw th;
    L9:
        if (this.f22605g.size() <= 0) goto L16;
        d r1 = (d) this.f22605g.remove(0);     // Catch: Throwable -> L13
        monitor-exit(r03);     // Catch: Throwable -> L13
        return r1;
    L16:
        monitor-exit(r03);     // Catch: Throwable -> L13
        return null;
    L5:
        return r02.b();
    }

    public boolean b() {
        a r02 = this.f22602c;
        if (r02 == null) goto L5;
        r02.cancel(this.d);
    L5:
        this.f22603e = true;
        return e();
    }

    public void c(boolean r3) {
        if (this.f22602c != null) goto L6;
        this.f22602c = new a(this);
        this.f22602c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return;
    }

    public abstract void d(Intent r1);

    public boolean e() {
        return true;
    }

    public void f() {
        ArrayList r02 = this.f22605g;
        if (r02 == null) goto L20;
        monitor-enter(r02);
        this.f22602c = null;     // Catch: Throwable -> L11
        ArrayList r1 = this.f22605g;     // Catch: Throwable -> L11
        if (r1 == null) goto L14;
        if (r1.size() <= 0) goto L14;
        c(false);     // Catch: Throwable -> L11
    L16:
        monitor-exit(r02);     // Catch: Throwable -> L11
        return;
    L14:
        if (this.f22604f == true) goto L16;
        this.f22601b.a();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent r1) {
        b r12 = this.f22600a;
        if (r12 != null) goto L5;
        return null;
    L5:
        return r12.a();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f22600a = new e(this);
        this.f22601b = null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList r02 = this.f22605g;
        if (r02 == null) goto L12;
        monitor-enter(r02);
        this.f22604f = true;     // Catch: Throwable -> L9
        this.f22601b.a();     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return;
    L9:
        th = move-exception;
        throw th;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent r3, int r4, int r5) {
        if (this.f22605g == null) goto L17;
        this.f22601b.c();
        ArrayList r42 = this.f22605g;
        monitor-enter(r42);
        ArrayList r02 = this.f22605g;     // Catch: Throwable -> L14
        if (r3 != null) goto L10;
        r3 = new Intent();     // Catch: Throwable -> L14
    L10:
        r02.add(new c(this, r3, r5));     // Catch: Throwable -> L14
        c(true);     // Catch: Throwable -> L14
        monitor-exit(r42);     // Catch: Throwable -> L14
        return 3;
    L14:
        th = move-exception;
        throw th;
    L17:
        return 2;
    }
}
