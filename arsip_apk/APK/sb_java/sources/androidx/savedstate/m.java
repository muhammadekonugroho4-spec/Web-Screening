package androidx.savedstate;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class m {
    public static final ArrayList a(Collection r1) {
        p.l(r1, "<this>");
        if ((r1 instanceof ArrayList) == false) goto L7;
        return (ArrayList) r1;
    L7:
        return new ArrayList(r1);
    }
}
