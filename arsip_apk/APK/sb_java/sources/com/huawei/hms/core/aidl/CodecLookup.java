package com.huawei.hms.core.aidl;

/* loaded from: classes6.dex */
public final class CodecLookup {
    private CodecLookup() {
    }

    public static MessageCodec find(int r1) {
        if (r1 != 2) goto L7;
        return new MessageCodecV2();
    L7:
        return new MessageCodec();
    }
}
