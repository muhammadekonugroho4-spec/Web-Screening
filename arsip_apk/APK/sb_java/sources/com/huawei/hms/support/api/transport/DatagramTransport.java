package com.huawei.hms.support.api.transport;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.ApiClient;

/* loaded from: classes6.dex */
public interface DatagramTransport {

    public interface a {
        void a(int r1, IMessageEntity r2);
    }

    void post(ApiClient r1, a r2);

    void send(ApiClient r1, a r2);
}
