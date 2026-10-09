package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.e;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* loaded from: classes3.dex */
public class Hour extends ResourcesTimeUnit implements e {
    public Hour() {
        f(3600000);
    }

    @Override // org.ocpsoft.prettytime.impl.ResourcesTimeUnit
    public String d() {
        return "Hour";
    }
}
