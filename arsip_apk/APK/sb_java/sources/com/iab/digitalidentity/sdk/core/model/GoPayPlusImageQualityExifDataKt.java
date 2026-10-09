package com.iab.digitalidentity.sdk.core.model;

import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0000¨\u0006\u0007"}, d2 = {"getExifData", "Lcom/iab/digitalidentity/sdk/core/model/GoPayPlusImageQualityExifData;", "extras", "", "isManualSave", "", "extraSignal", "OneKycSdk_universalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GoPayPlusImageQualityExifDataKt {
    public static final GoPayPlusImageQualityExifData getExifData(String r1, boolean r2, String r3) {
        p.l(r1, "extras");
        p.l(r3, "extraSignal");
        return new GoPayPlusImageQualityExifData(r1, r2, r3);
    }

    public static /* synthetic */ GoPayPlusImageQualityExifData getExifData$default(String r02, boolean r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r1 = false;
    L6:
        if ((r3 & 4) == 0) goto L9;
        r2 = "";
    L9:
        return getExifData(r02, r1, r2);
    }
}
