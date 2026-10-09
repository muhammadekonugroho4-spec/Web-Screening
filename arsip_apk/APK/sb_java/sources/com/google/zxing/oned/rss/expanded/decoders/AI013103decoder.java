package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;

/* loaded from: classes6.dex */
final class AI013103decoder extends AI013x0xDecoder {
    public AI013103decoder(BitArray r1) {
        super(r1);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    public void addWeightCode(StringBuilder r1, int r2) {
        r1.append("(3103)");
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    public int checkWeight(int r1) {
        return r1;
    }
}
