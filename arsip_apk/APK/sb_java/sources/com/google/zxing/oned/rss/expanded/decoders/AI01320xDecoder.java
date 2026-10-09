package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;
import com.huawei.hms.android.HwBuildEx;

/* loaded from: classes6.dex */
final class AI01320xDecoder extends AI013x0xDecoder {
    public AI01320xDecoder(BitArray r1) {
        super(r1);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    public void addWeightCode(StringBuilder r2, int r3) {
        if (r3 >= 10000) goto L6;
        r2.append("(3202)");
        return;
    L6:
        r2.append("(3203)");
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    public int checkWeight(int r2) {
        if (r2 >= 10000) goto L6;
        return r2;
    L6:
        return r2 - HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
    }
}
