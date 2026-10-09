package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.PDF417Common;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class BarcodeValue {
    private final Map<Integer, Integer> values;

    public BarcodeValue() {
        this.values = new HashMap();
    }

    public Integer getConfidence(int r2) {
        return this.values.get(Integer.valueOf(r2));
    }

    public int[] getValue() {
        ArrayList r02 = new ArrayList();
        Iterator<Map.Entry<Integer, Integer>> r1 = this.values.entrySet().iterator();
        int r2 = -1;
    L4:
        if (r1.hasNext() == false) goto L12;
        Map.Entry<Integer, Integer> r3 = r1.next();
        if (r3.getValue().intValue() > r2) goto L7;
        if (r3.getValue().intValue() != r2) goto L4;
        r02.add(r3.getKey());
        goto L4
    L7:
        r2 = r3.getValue().intValue();
        r02.clear();
        r02.add(r3.getKey());
        goto L4
    L12:
        return PDF417Common.toIntArray(r02);
    }

    public void setValue(int r3) {
        Integer r02 = this.values.get(Integer.valueOf(r3));
        if (r02 != null) goto L5;
        r02 = 0;
    L5:
        Integer r03 = Integer.valueOf(r02.intValue() + 1);
        this.values.put(Integer.valueOf(r3), r03);
    }
}
