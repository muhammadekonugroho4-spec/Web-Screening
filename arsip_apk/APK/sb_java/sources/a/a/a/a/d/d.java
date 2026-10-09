package a.a.a.a.d;

import android.content.Context;
import com.midtrans.sdk.uikit.j;

/* loaded from: classes.dex */
public abstract class d {
    public static String a(Context r5, long r6) {
        String r02 = "";
        if (r5 == null) goto L15;
        long r62 = r6 / 1000;
        int r3 = (int) (r62 % 60);
        int r63 = (int) (r62 / 60);
        if (r63 <= 1) goto L7;
        r02 = r63 + " " + r5.getString(j.r1);
    L9:
        if (r3 > 1) goto L11;
        if (r3 <= 0) goto L15;
        return r02 + " " + r3 + " " + r5.getString(j.G3);
    L11:
        return r02 + " " + r3 + " " + r5.getString(j.H3);
    L7:
        if (r63 <= 0) goto L9;
        r02 = r63 + " " + r5.getString(j.q1);
    L15:
        return r02;
    }
}
