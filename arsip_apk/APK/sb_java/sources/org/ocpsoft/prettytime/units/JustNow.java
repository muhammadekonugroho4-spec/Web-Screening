package org.ocpsoft.prettytime.units;

import com.clevertap.android.sdk.Constants;
import org.ocpsoft.prettytime.e;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* loaded from: classes3.dex */
public class JustNow extends ResourcesTimeUnit implements e {
    public JustNow() {
        e(Constants.ONE_MIN_IN_MILLIS);
    }

    @Override // org.ocpsoft.prettytime.impl.ResourcesTimeUnit
    public String d() {
        return "JustNow";
    }
}
