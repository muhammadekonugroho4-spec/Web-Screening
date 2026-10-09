package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.e;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* loaded from: classes3.dex */
public class Year extends ResourcesTimeUnit implements e {
    public Year() {
        f(31556925960L);
    }

    @Override // org.ocpsoft.prettytime.impl.ResourcesTimeUnit
    public String d() {
        return "Year";
    }
}
