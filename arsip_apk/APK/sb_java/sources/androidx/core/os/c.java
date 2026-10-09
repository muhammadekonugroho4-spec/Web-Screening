package androidx.core.os;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class c {

    public static class a {
        public static Object a(Bundle r02, String r1, Class r2) {
            return r02.getParcelable(r1, r2);
        }

        public static ArrayList b(Bundle r02, String r1, Class r2) {
            return r02.getParcelableArrayList(r1, r2);
        }
    }

    public static Object a(Bundle r2, String r3, Class r4) {
        if (Build.VERSION.SDK_INT >= 34) goto L5;
        Parcelable r22 = r2.getParcelable(r3);
        if (r4.isInstance(r22) == false) goto L9;
        return r22;
    L9:
        return null;
    L5:
        return a.a(r2, r3, r4);
    }

    public static ArrayList b(Bundle r2, String r3, Class r4) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return a.b(r2, r3, r4);
    L7:
        return r2.getParcelableArrayList(r3);
    }
}
