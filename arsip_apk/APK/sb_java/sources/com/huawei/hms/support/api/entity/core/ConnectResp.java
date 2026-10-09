package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class ConnectResp implements IMessageEntity {

    @Packed
    public List<Integer> protocolVersion;

    @Packed
    public String sessionId;

    public ConnectResp() {
        this.protocolVersion = Arrays.asList(new Integer[]{1, 2});
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder("protocol version:");
        Iterator<Integer> r1 = this.protocolVersion.iterator();
    L4:
        if (r1.hasNext() == false) goto L7;
        r02.append(r1.next());
        r02.append(',');
        goto L4
    L7:
        return r02.toString();
    }
}
