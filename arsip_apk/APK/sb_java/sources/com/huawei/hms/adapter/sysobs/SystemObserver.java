package com.huawei.hms.adapter.sysobs;

import android.content.Intent;

/* loaded from: classes6.dex */
public interface SystemObserver {
    boolean onNoticeResult(int r1);

    boolean onSolutionResult(Intent r1, String r2);

    boolean onUpdateResult(int r1);
}
