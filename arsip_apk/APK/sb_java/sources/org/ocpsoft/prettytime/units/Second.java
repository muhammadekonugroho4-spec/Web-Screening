package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.e;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* loaded from: classes3.dex */
public class Second extends ResourcesTimeUnit implements e {
    public Second() {
        f(1000);
    }

    @Override // org.ocpsoft.prettytime.impl.ResourcesTimeUnit
    public String d() {
        return "Second";
    }
}
