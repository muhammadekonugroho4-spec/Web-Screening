package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.Arrays;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public final class Objects extends ExtraObjectsMethodsForWeb {
    private Objects() {
    }

    public static boolean equal(Object r02, Object r1) {
        if (r02 == r1) goto L9;
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r02.equals(r1) == true) goto L12;
        return false;
    L12:
        return true;
    L9:
        return true;
    }

    public static int hashCode(Object... r02) {
        return Arrays.hashCode(r02);
    }
}
