package org.ocpsoft.prettytime.units;

import java.io.Serializable;
import java.util.Comparator;
import org.ocpsoft.prettytime.e;

/* loaded from: classes3.dex */
public class TimeUnitComparator implements Comparator<e>, Serializable {
    private static final long serialVersionUID = 1;

    public TimeUnitComparator() {
    }

    public int a(e r5, e r6) {
        if (r5.a() >= r6.a()) goto L7;
        return -1;
    L7:
        if (r5.a() <= r6.a()) goto L10;
        return 1;
    L10:
        return 0;
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(e r1, e r2) {
        return a(r1, r2);
    }
}
