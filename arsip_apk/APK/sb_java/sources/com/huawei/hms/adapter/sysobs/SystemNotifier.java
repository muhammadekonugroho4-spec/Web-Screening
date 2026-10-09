package com.huawei.hms.adapter.sysobs;

import android.content.Intent;

/* loaded from: classes6.dex */
public interface SystemNotifier {
    void notifyNoticeObservers(int r1);

    void notifyObservers(int r1);

    void notifyObservers(Intent r1, String r2);

    void registerObserver(SystemObserver r1);

    void unRegisterObserver(SystemObserver r1);
}
