package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.flexbox.FlexItem;
import com.google.firebase.perf.util.Constants;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f22752a = null;

    static {
        f22752a = new ThreadLocal();
    }

    public static ColorStateList a(Resources r4, XmlPullParser r5, Resources.Theme r6) {
        AttributeSet r02 = Xml.asAttributeSet(r5);
    L3:
        int r1 = r5.next();
        if (r1 == 2) goto L8;
        if (r1 != 1) goto L3;
    L8:
        if (r1 != 2) goto L12;
        return b(r4, r5, r02, r6);
    L12:
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources r2, XmlPullParser r3, AttributeSet r4, Resources.Theme r5) {
        String r02 = r3.getName();
        if (r02.equals("selector") == false) goto L7;
        return e(r2, r3, r4, r5);
    L7:
        throw new XmlPullParserException(r3.getPositionDescription() + ": invalid color state list tag " + r02);
    }

    public static TypedValue c() {
        ThreadLocal r02 = f22752a;
        TypedValue r1 = (TypedValue) r02.get();
        if (r1 != null) goto L6;
        TypedValue r12 = new TypedValue();
        r02.set(r12);
        return r12;
    L6:
        return r1;
    }

    public static ColorStateList d(Resources r02, int r1, Resources.Theme r2) {
        return a(r02, r02.getXml(r1), r2);
    L4:
        e = move-exception;
        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
        return null;
    }

    public static ColorStateList e(Resources r17, XmlPullParser r18, AttributeSet r19, Resources.Theme r20) {
        Resources r02 = r17;
        int r4 = 1;
        int r3 = r18.getDepth() + 1;
        int[][] r6 = new int[20][];
        int[] r5 = new int[20];
        int r8 = 0;
    L3:
        int r9 = r18.next();
        if (r9 == r4) goto L53;
        int r10 = r18.getDepth();
        if (r10 >= r3) goto L10;
        if (r9 == 3) goto L53;
    L10:
        if (r9 != 2) goto L52;
        if (r10 > r3) goto L52;
        if (r18.getName().equals("item") == false) goto L52;
        TypedArray r92 = h(r02, r20, r19, androidx.core.i.f22933b);
        int r102 = r92.getResourceId(androidx.core.i.f22934c, -1);
        if (r102 != (-1)) goto L18;
    L22:
        int r103 = r92.getColor(androidx.core.i.f22934c, -65281);
    L23:
        float r12 = 1.0f;
        if (r92.hasValue(androidx.core.i.d) == false) goto L27;
        r12 = r92.getFloat(androidx.core.i.d, 1.0f);
    L30:
        if (Build.VERSION.SDK_INT >= 31) goto L32;
    L34:
        float r11 = r92.getFloat(androidx.core.i.f22937g, -1.0f);
    L35:
        r92.recycle();
        int r93 = r19.getAttributeCount();
        int[] r13 = new int[r93];
        int r14 = 0;
        int r15 = 0;
    L36:
        if (r14 >= r93) goto L51;
        int r42 = r19.getAttributeNameResource(r14);
        if (r42 == 16843173) goto L50;
        if (r42 == 16843551) goto L50;
        if (r42 == androidx.core.a.f22588a) goto L50;
        if (r42 == androidx.core.a.f22589b) goto L50;
        int r7 = r15 + 1;
        if (r19.getAttributeBooleanValue(r14, false) == true) goto L49;
        r42 = -r42;
    L49:
        r13[r15] = r42;
        r15 = r7;
    L50:
        r14 = r14 + 1;
        goto L36
    L51:
        int[] r03 = StateSet.trimStateSet(r13, r15);
        r5 = g.a(r5, r8, g(r103, r12, r11));
        r6 = (int[][]) g.b(r6, r8, r03);
        r8 = r8 + 1;
        goto L52
    L32:
        if (r92.hasValue(androidx.core.i.f22935e) == false) goto L34;
        r11 = r92.getFloat(androidx.core.i.f22935e, -1.0f);
        goto L35
    L27:
        if (r92.hasValue(androidx.core.i.f22936f) == false) goto L30;
        r12 = r92.getFloat(androidx.core.i.f22936f, 1.0f);
        goto L30
    L18:
        if (f(r02, r102) == true) goto L22;
        r103 = a(r02, r02.getXml(r102), r20).getDefaultColor();     // Catch: Exception -> L21
    L21:
        r103 = r92.getColor(androidx.core.i.f22934c, -65281);
    L52:
        r4 = 1;
        r02 = r17;
    L53:
        int[] r04 = new int[r8];
        int[][] r1 = new int[r8][];
        System.arraycopy(r5, 0, r04, 0, r8);
        System.arraycopy(r6, 0, r1, 0, r8);
        return new ColorStateList(r1, r04);
    }

    public static boolean f(Resources r2, int r3) {
        TypedValue r02 = c();
        r2.getValue(r3, r02, true);
        int r22 = r02.type;
        if (r22 >= 28) goto L5;
        return false;
    L5:
        if (r22 > 31) goto L9;
        return true;
    L9:
        return false;
    }

    public static int g(int r3, float r4, float r5) {
        if (r5 >= 0.0f) goto L5;
    L7:
        boolean r02 = false;
    L9:
        if (r4 != 1.0f) goto L12;
        if (r02 == true) goto L12;
        return r3;
    L12:
        int r42 = androidx.core.math.a.b((int) ((Color.alpha(r3) * r4) + 0.5f), 0, Constants.MAX_HOST_LENGTH);
        if (r02 == false) goto L16;
        a r32 = a.c(r3);
        r3 = a.m(r32.j(), r32.i(), r5);
    L16:
        return (r3 & FlexItem.MAX_SIZE) | (r42 << 24);
    L5:
        if (r5 > 100.0f) goto L7;
        r02 = true;
        goto L9
    }

    public static TypedArray h(Resources r02, Resources.Theme r1, AttributeSet r2, int[] r3) {
        if (r1 != null) goto L6;
        return r02.obtainAttributes(r2, r3);
    L6:
        return r1.obtainStyledAttributes(r2, r3, 0, 0);
    }
}
