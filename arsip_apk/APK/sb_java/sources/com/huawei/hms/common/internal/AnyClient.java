package com.huawei.hms.common.internal;

import com.huawei.hms.core.aidl.IMessageEntity;

/* loaded from: classes6.dex */
public interface AnyClient {

    public interface CallBack {
        void onCallback(IMessageEntity r1, String r2);
    }

    void connect(int r1);

    void connect(int r1, boolean r2);

    void disconnect();

    int getRequestHmsVersionCode();

    String getSessionId();

    boolean isConnected();

    boolean isConnecting();

    void post(IMessageEntity r1, String r2, CallBack r3);
}
