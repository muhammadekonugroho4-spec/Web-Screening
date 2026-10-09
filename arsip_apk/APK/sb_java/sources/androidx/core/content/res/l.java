package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class l {
    public static boolean a(TypedArray r02, XmlPullParser r1, String r2, int r3, boolean r4) {
        if (j(r1, r2) == true) goto L6;
        return r4;
    L6:
        return r02.getBoolean(r3, r4);
    }

    public static int b(TypedArray r02, XmlPullParser r1, String r2, int r3, int r4) {
        if (j(r1, r2) == true) goto L6;
        return r4;
    L6:
        return r02.getColor(r3, r4);
    }

    public static ColorStateList c(TypedArray r1, XmlPullParser r2, Resources.Theme r3, String r4, int r5) {
        if (j(r2, r4) == false) goto L16;
        TypedValue r22 = new TypedValue();
        r1.getValue(r5, r22);
        int r42 = r22.type;
        if (r42 == 2) goto L15;
        if (r42 < 28) goto L13;
        if (r42 > 31) goto L13;
        return d(r22);
    L13:
        return c.d(r1.getResources(), r1.getResourceId(r5, 0), r3);
    L15:
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + r5 + ": " + r22);
    L16:
        return null;
    }

    public static ColorStateList d(TypedValue r02) {
        return ColorStateList.valueOf(r02.data);
    }

    public static d e(TypedArray r1, XmlPullParser r2, Resources.Theme r3, String r4, int r5, int r6) {
        if (j(r2, r4) == false) goto L14;
        TypedValue r22 = new TypedValue();
        r1.getValue(r5, r22);
        int r42 = r22.type;
        if (r42 >= 28) goto L7;
    L10:
        d r12 = d.g(r1.getResources(), r1.getResourceId(r5, 0), r3);
        if (r12 == null) goto L14;
        return r12;
    L7:
        if (r42 > 31) goto L10;
        return d.b(r22.data);
    L14:
        return d.b(r6);
    }

    public static float f(TypedArray r02, XmlPullParser r1, String r2, int r3, float r4) {
        if (j(r1, r2) == true) goto L6;
        return r4;
    L6:
        return r02.getFloat(r3, r4);
    }

    public static int g(TypedArray r02, XmlPullParser r1, String r2, int r3, int r4) {
        if (j(r1, r2) == true) goto L6;
        return r4;
    L6:
        return r02.getInt(r3, r4);
    }

    public static int h(TypedArray r02, XmlPullParser r1, String r2, int r3, int r4) {
        if (j(r1, r2) == true) goto L6;
        return r4;
    L6:
        return r02.getResourceId(r3, r4);
    }

    public static String i(TypedArray r02, XmlPullParser r1, String r2, int r3) {
        if (j(r1, r2) == true) goto L7;
        return null;
    L7:
        return r02.getString(r3);
    }

    public static boolean j(XmlPullParser r1, String r2) {
        if (r1.getAttributeValue("http://schemas.android.com/apk/res/android", r2) == null) goto L6;
        return true;
    L6:
        return false;
    }

    public static TypedArray k(Resources r02, Resources.Theme r1, AttributeSet r2, int[] r3) {
        if (r1 != null) goto L6;
        return r02.obtainAttributes(r2, r3);
    L6:
        return r1.obtainStyledAttributes(r2, r3, 0, 0);
    }
}
