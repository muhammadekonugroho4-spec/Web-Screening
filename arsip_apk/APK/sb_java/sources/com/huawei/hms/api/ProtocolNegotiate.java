package com.huawei.hms.api;

import java.util.List;

/* loaded from: classes6.dex */
public class ProtocolNegotiate {
    private static final int MAX_VERSION = 2;
    private static ProtocolNegotiate instance;
    private int version;

    static {
        instance = new ProtocolNegotiate();
    }

    public ProtocolNegotiate() {
        this.version = 1;
    }

    public static ProtocolNegotiate getInstance() {
        return instance;
    }

    public int getVersion() {
        return this.version;
    }

    public int negotiate(List<Integer> r4) {
        if (r4 != null) goto L5;
    L13:
        this.version = 1;
        return 1;
    L5:
        if (r4.isEmpty() == true) goto L13;
        if (r4.contains(2) == true) goto L10;
        this.version = r4.get(r4.size() - 1).intValue();
    L12:
        return this.version;
    L10:
        this.version = 2;
        goto L12
    }
}
