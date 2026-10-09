package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class c {
    public static final /* synthetic */ String a(File r02, File r1, String r2) {
        return b(r02, r1, r2);
    }

    public static final String b(File r2, File r3, String r4) {
        StringBuilder r02 = new StringBuilder(r2.toString());
        if (r3 == null) goto L5;
        r02.append(" -> " + r3);
    L5:
        if (r4 == null) goto L7;
        r02.append(": " + r4);
    L7:
        String r22 = r02.toString();
        p.k(r22, "toString(...)");
        return r22;
    }
}
