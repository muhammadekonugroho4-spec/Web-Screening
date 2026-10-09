package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.view.View;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.nio.CharBuffer;

/* loaded from: classes.dex */
public abstract class a {
    public static String a() {
        StackTraceElement r02 = new Throwable().getStackTrace()[1];
        return ".(" + r02.getFileName() + ":" + r02.getLineNumber() + ") " + r02.getMethodName() + "()";
    }

    public static String b() {
        StackTraceElement r02 = new Throwable().getStackTrace()[1];
        return ".(" + r02.getFileName() + ":" + r02.getLineNumber() + ")";
    }

    public static String c(Context r1, int r2) {
        if (r2 != (-1)) goto L10;
        return GrsBaseInfo.CountryCodeSource.UNKNOWN;
    L10:
        return r1.getResources().getResourceEntryName(r2);
    L9:
        return "?" + r2;
    }

    public static String d(View r1) {
        return r1.getContext().getResources().getResourceEntryName(r1.getId());
    L4:
        return GrsBaseInfo.CountryCodeSource.UNKNOWN;
    }

    public static String e(MotionLayout r1, int r2) {
        return f(r1, r2, -1);
    }

    public static String f(MotionLayout r2, int r3, int r4) {
        if (r3 != (-1)) goto L6;
        return "UNDEFINED";
    L6:
        String r22 = r2.getContext().getResources().getResourceEntryName(r3);
        if (r4 != (-1)) goto L9;
        return r22;
    L9:
        if (r22.length() <= r4) goto L12;
        r22 = r22.replaceAll("([^_])[aeiou]+", "$1");
    L12:
        if (r22.length() <= r4) goto L18;
        int r32 = r22.replaceAll("[^_]", "").length();
        if (r32 > 0) goto L16;
        return r22;
    L16:
        return r22.replaceAll(CharBuffer.allocate((r22.length() - r4) / r32).toString().replace(0, '.') + "_", "_");
    L18:
        return r22;
    }
}
