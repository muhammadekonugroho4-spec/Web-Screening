package a2d20250321;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public abstract class r extends g {
    public static void q(w r02) {
    }

    public static File r(Context r3) {
        if (g.f1527g == null) goto L9;
        if (r3 == null) goto L9;
        File r02 = new File(r3.getFilesDir() + File.separator + g.f1527g);
        if (r02.exists() == false) goto L9;
        return r02;
    L9:
        return null;
    }
}
