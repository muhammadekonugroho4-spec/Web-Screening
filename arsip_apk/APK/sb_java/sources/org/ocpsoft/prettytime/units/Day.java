package org.ocpsoft.prettytime.units;

import com.clevertap.android.sdk.Constants;
import org.ocpsoft.prettytime.e;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* loaded from: classes3.dex */
public class Day extends ResourcesTimeUnit implements e {
    public Day() {
        f(Constants.ONE_DAY_IN_MILLIS);
    }

    @Override // org.ocpsoft.prettytime.impl.ResourcesTimeUnit
    public String d() {
        return "Day";
    }
}
