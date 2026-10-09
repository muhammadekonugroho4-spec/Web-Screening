package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Shader f22753a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f22754b;

    /* renamed from: c, reason: collision with root package name */
    public int f22755c;

    public d(Shader r1, ColorStateList r2, int r3) {
        this.f22753a = r1;
        this.f22754b = r2;
        this.f22755c = r3;
    }

    public static d a(Resources r4, int r5, Resources.Theme r6) {
        XmlResourceParser r52 = r4.getXml(r5);
        AttributeSet r02 = Xml.asAttributeSet(r52);
    L3:
        int r1 = r52.next();
        if (r1 == 2) goto L8;
        if (r1 != 1) goto L3;
    L8:
        if (r1 != 2) goto L20;
        String r12 = r52.getName();
        r12.getClass();
        if (r12.equals("gradient") == true) goto L18;
        if (r12.equals("selector") == false) goto L16;
        return c(c.b(r4, r52, r02, r6));
    L16:
        throw new XmlPullParserException(r52.getPositionDescription() + ": unsupported complex color tag " + r12);
    L18:
        return d(f.b(r4, r52, r02, r6));
    L20:
        throw new XmlPullParserException("No start tag found");
    }

    public static d b(int r2) {
        return new d(null, null, r2);
    }

    public static d c(ColorStateList r3) {
        return new d(null, r3, r3.getDefaultColor());
    }

    public static d d(Shader r3) {
        return new d(r3, null, 0);
    }

    public static d g(Resources r02, int r1, Resources.Theme r2) {
        return a(r02, r1, r2);
    L4:
        e = move-exception;
        Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
        return null;
    }

    public int e() {
        return this.f22755c;
    }

    public Shader f() {
        return this.f22753a;
    }

    public boolean h() {
        if (this.f22753a == null) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean i() {
        if (this.f22753a != null) goto L10;
        ColorStateList r02 = this.f22754b;
        if (r02 != null) goto L7;
        return false;
    L7:
        if (r02.isStateful() == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public boolean j(int[] r3) {
        if (i() == false) goto L8;
        ColorStateList r02 = this.f22754b;
        int r32 = r02.getColorForState(r3, r02.getDefaultColor());
        if (r32 == this.f22755c) goto L10;
        this.f22755c = r32;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public void k(int r1) {
        this.f22755c = r1;
    }

    public boolean l() {
        if (h() == false) goto L5;
        return true;
    L5:
        if (this.f22755c != 0) goto L11;
        return false;
    L11:
        return true;
    }
}
