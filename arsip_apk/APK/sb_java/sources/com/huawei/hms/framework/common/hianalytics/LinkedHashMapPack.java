package com.huawei.hms.framework.common.hianalytics;

import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public class LinkedHashMapPack {
    private LinkedHashMap<String, String> map;

    public LinkedHashMapPack() {
        this.map = new LinkedHashMap();
    }

    public LinkedHashMap<String, String> getAll() {
        return this.map;
    }

    public LinkedHashMapPack put(String r2, String r3) {
        if (r2 == null) goto L5;
        if (r3 == null) goto L5;
        this.map.put(r2, r3);
    L5:
        return this;
    }

    public LinkedHashMapPack putIfNotDefault(String r1, long r2, long r4) {
        if (r2 != r4) goto L6;
        return this;
    L6:
        return put(r1, r2);
    }

    public LinkedHashMapPack put(String r2, boolean r3) {
        if (r2 == null) goto L7;
        if (r3 == false) goto L6;
        this.map.put(r2, GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A);
        return this;
    L6:
        this.map.put(r2, "0");
    L7:
        return this;
    }

    public LinkedHashMapPack put(String r4, long r5) {
        if (r4 == null) goto L4;
        this.map.put(r4, "" + r5);
    L4:
        return this;
    }
}
