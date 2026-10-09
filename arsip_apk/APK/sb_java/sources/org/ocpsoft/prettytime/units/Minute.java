package org.ocpsoft.prettytime.units;

import com.clevertap.android.sdk.Constants;
import org.ocpsoft.prettytime.e;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* loaded from: classes3.dex */
public class Minute extends ResourcesTimeUnit implements e {
    public Minute() {
        f(Constants.ONE_MIN_IN_MILLIS);
    }

    @Override // org.ocpsoft.prettytime.impl.ResourcesTimeUnit
    public String d() {
        return "Minute";
    }
}
