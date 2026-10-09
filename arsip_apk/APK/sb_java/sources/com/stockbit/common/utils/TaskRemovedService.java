package com.stockbit.common.utils;

import android.content.Intent;
import android.os.IBinder;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.tinder.scarlet.c;
import com.tinder.scarlet.lifecycle.LifecycleRegistry;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/stockbit/common/utils/TaskRemovedService;", "Landroid/app/Service;", "<init>", "()V", "lifecycleRegistry", "Lcom/tinder/scarlet/lifecycle/LifecycleRegistry;", "getLifecycleRegistry$annotations", "getLifecycleRegistry", "()Lcom/tinder/scarlet/lifecycle/LifecycleRegistry;", "setLifecycleRegistry", "(Lcom/tinder/scarlet/lifecycle/LifecycleRegistry;)V", "onBind", "Landroid/os/IBinder;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "onTaskRemoved", "", "rootIntent", "common_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TaskRemovedService extends Hilt_TaskRemovedService {
    public LifecycleRegistry d;

    static {
    }

    public TaskRemovedService() {
    }

    public final LifecycleRegistry d() {
        LifecycleRegistry r02 = this.d;
        if (r02 == null) goto L5;
        return r02;
    L5:
        kotlin.jvm.internal.p.D("lifecycleRegistry");
        return null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent r1) {
        return null;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent r2) {
        super.onTaskRemoved(r2);
        d().e(c.a.AbstractC1813c.C1814a.f173647a);
        stopSelf();
    }
}
