package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f29322a = null;

    static {
        f29322a = new a();
    }

    public a() {
    }

    public final List a(JobScheduler r2) {
        p.l(r2, "jobScheduler");
        List<JobInfo> r22 = r2.getAllPendingJobs();
        p.k(r22, "jobScheduler.allPendingJobs");
        return r22;
    }
}
