package androidx.camera.core.processing;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class U {
    public static String a(int r2) {
        ArrayList r02 = new ArrayList();
        if ((r2 & 4) == 0) goto L6;
        r02.add("IMAGE_CAPTURE");
    L6:
        if ((r2 & 1) == 0) goto L9;
        r02.add("PREVIEW");
    L9:
        if ((r2 & 2) == 0) goto L12;
        r02.add("VIDEO_CAPTURE");
    L12:
        return String.join("|", r02);
    }

    public static boolean b(int r02, int r1) {
        if ((r02 & r1) != r1) goto L6;
        return true;
    L6:
        return false;
    }
}
