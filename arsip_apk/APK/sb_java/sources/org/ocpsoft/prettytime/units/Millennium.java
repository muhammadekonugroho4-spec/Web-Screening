package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.e;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* loaded from: classes3.dex */
public class Millennium extends ResourcesTimeUnit implements e {
    public Millennium() {
        f(31556926000000L);
    }

    @Override // org.ocpsoft.prettytime.impl.ResourcesTimeUnit
    public String d() {
        return "Millennium";
    }
}
