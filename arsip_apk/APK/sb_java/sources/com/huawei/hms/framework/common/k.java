package com.huawei.hms.framework.common;

import android.telephony.SignalStrength;
import java.util.List;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class k {
    public static /* bridge */ /* synthetic */ List a(SignalStrength r02, Class r1) {
        return r02.getCellSignalStrengths(r1);
    }
}
