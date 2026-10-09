package androidx.work.impl.background.systemjob;

import android.app.job.JobScheduler;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f29323a = null;

    static {
        f29323a = new c();
    }

    public c() {
    }

    public final JobScheduler a(JobScheduler r2) {
        p.l(r2, "jobScheduler");
        JobScheduler r22 = b.a(r2, "androidx.work.systemjobscheduler");
        p.k(r22, "jobScheduler.forNamespace(WORKMANAGER_NAMESPACE)");
        return r22;
    }
}
