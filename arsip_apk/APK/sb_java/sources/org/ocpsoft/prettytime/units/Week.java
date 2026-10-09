package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.e;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* loaded from: classes3.dex */
public class Week extends ResourcesTimeUnit implements e {
    public Week() {
        f(604800000);
    }

    @Override // org.ocpsoft.prettytime.impl.ResourcesTimeUnit
    public String d() {
        return "Week";
    }
}
