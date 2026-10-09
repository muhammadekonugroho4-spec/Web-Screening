package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.IntentSender;
import androidx.activity.result.b;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.AppUpdateType;

/* loaded from: classes5.dex */
public interface AppUpdateManager {
    Task<Void> completeUpdate();

    Task<AppUpdateInfo> getAppUpdateInfo();

    void registerListener(InstallStateUpdatedListener r1);

    Task<Integer> startUpdateFlow(AppUpdateInfo r1, Activity r2, AppUpdateOptions r3);

    @Deprecated
    boolean startUpdateFlowForResult(AppUpdateInfo r1, @AppUpdateType int r2, Activity r3, int r4) throws IntentSender.SendIntentException;

    @Deprecated
    boolean startUpdateFlowForResult(AppUpdateInfo r1, @AppUpdateType int r2, IntentSenderForResultStarter r3, int r4) throws IntentSender.SendIntentException;

    boolean startUpdateFlowForResult(AppUpdateInfo r1, Activity r2, AppUpdateOptions r3, int r4) throws IntentSender.SendIntentException;

    boolean startUpdateFlowForResult(AppUpdateInfo r1, b r2, AppUpdateOptions r3);

    boolean startUpdateFlowForResult(AppUpdateInfo r1, IntentSenderForResultStarter r2, AppUpdateOptions r3, int r4) throws IntentSender.SendIntentException;

    void unregisterListener(InstallStateUpdatedListener r1);
}
