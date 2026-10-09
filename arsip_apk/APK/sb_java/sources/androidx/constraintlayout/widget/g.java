package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public int f22533a;

    /* renamed from: b, reason: collision with root package name */
    public int f22534b;

    /* renamed from: c, reason: collision with root package name */
    public int f22535c;
    public SparseArray d;

    /* renamed from: e, reason: collision with root package name */
    public SparseArray f22536e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f22537a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f22538b;

        /* renamed from: c, reason: collision with root package name */
        public int f22539c;
        public boolean d;

        public a(Context r6, XmlPullParser r7) {
            this.f22538b = new ArrayList();
            this.f22539c = -1;
            int r02 = 0;
            this.d = false;
            TypedArray r72 = r6.obtainStyledAttributes(Xml.asAttributeSet(r7), e.W9);
            int r1 = r72.getIndexCount();
        L3:
            if (r02 >= r1) goto L13;
            int r2 = r72.getIndex(r02);
            if (r2 != e.X9) goto L8;
            this.f22537a = r72.getResourceId(r2, this.f22537a);
        L12:
            r02 = r02 + 1;
            goto L3
        L8:
            if (r2 != e.Y9) goto L12;
            this.f22539c = r72.getResourceId(r2, this.f22539c);
            String r22 = r6.getResources().getResourceTypeName(this.f22539c);
            r6.getResources().getResourceName(this.f22539c);
            if ("layout".equals(r22) == false) goto L12;
            this.d = true;
            goto L12
        L13:
            r72.recycle();
        }

        public void a(b r2) {
            this.f22538b.add(r2);
        }

        public int b(float r3, float r4) {
            int r02 = 0;
        L4:
            if (r02 >= this.f22538b.size()) goto L9;
            if (((b) this.f22538b.get(r02)).a(r3, r4) == true) goto L7;
            r02 = r02 + 1;
            goto L4
        L7:
            return r02;
        L9:
            return -1;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public float f22540a;

        /* renamed from: b, reason: collision with root package name */
        public float f22541b;

        /* renamed from: c, reason: collision with root package name */
        public float f22542c;
        public float d;

        /* renamed from: e, reason: collision with root package name */
        public int f22543e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f22544f;

        public b(Context r6, XmlPullParser r7) {
            this.f22540a = Float.NaN;
            this.f22541b = Float.NaN;
            this.f22542c = Float.NaN;
            this.d = Float.NaN;
            this.f22543e = -1;
            int r02 = 0;
            this.f22544f = false;
            TypedArray r72 = r6.obtainStyledAttributes(Xml.asAttributeSet(r7), e.Ga);
            int r1 = r72.getIndexCount();
        L3:
            if (r02 >= r1) goto L23;
            int r2 = r72.getIndex(r02);
            if (r2 != e.Ha) goto L10;
            this.f22543e = r72.getResourceId(r2, this.f22543e);
            String r22 = r6.getResources().getResourceTypeName(this.f22543e);
            r6.getResources().getResourceName(this.f22543e);
            if ("layout".equals(r22) == false) goto L22;
            this.f22544f = true;
        L22:
            r02 = r02 + 1;
            goto L3
        L10:
            if (r2 != e.Ia) goto L13;
            this.d = r72.getDimension(r2, this.d);
            goto L22
        L13:
            if (r2 != e.Ja) goto L16;
            this.f22541b = r72.getDimension(r2, this.f22541b);
            goto L22
        L16:
            if (r2 != e.Ka) goto L19;
            this.f22542c = r72.getDimension(r2, this.f22542c);
            goto L22
        L19:
            if (r2 != e.La) goto L21;
            this.f22540a = r72.getDimension(r2, this.f22540a);
            goto L22
        L21:
            Log.v("ConstraintLayoutStates", "Unknown tag");
            goto L22
        L23:
            r72.recycle();
        }

        public boolean a(float r3, float r4) {
            if (Float.isNaN(this.f22540a) == true) goto L8;
            if (r3 >= this.f22540a) goto L8;
            return false;
        L8:
            if (Float.isNaN(this.f22541b) == true) goto L13;
            if (r4 >= this.f22541b) goto L13;
            return false;
        L13:
            if (Float.isNaN(this.f22542c) == true) goto L18;
            if (r3 <= this.f22542c) goto L18;
            return false;
        L18:
            if (Float.isNaN(this.d) == false) goto L20;
            return true;
        L20:
            if (r4 <= this.d) goto L24;
            return false;
        L24:
            return true;
        }
    }

    public g(Context r2, XmlPullParser r3) {
        this.f22533a = -1;
        this.f22534b = -1;
        this.f22535c = -1;
        this.d = new SparseArray();
        this.f22536e = new SparseArray();
        b(r2, r3);
    }

    public int a(int r5, int r6, float r7, float r8) {
        a r02 = (a) this.d.get(r6);
        if (r02 != null) goto L6;
        return r6;
    L6:
        if (r7 == (-1.0f)) goto L25;
        if (r8 == (-1.0f)) goto L25;
        Iterator r62 = r02.f22538b.iterator();
        b r1 = null;
    L12:
        if (r62.hasNext() == false) goto L19;
        b r2 = (b) r62.next();
        if (r2.a(r7, r8) == false) goto L12;
        if (r5 == r2.f22543e) goto L32;
        r1 = r2;
    L32:
        return r5;
    L19:
        if (r1 == null) goto L23;
        return r1.f22543e;
    L23:
        return r02.f22539c;
    L25:
        if (r02.f22539c == r5) goto L32;
        Iterator r63 = r02.f22538b.iterator();
    L29:
        if (r63.hasNext() == false) goto L34;
        if (r5 != ((b) r63.next()).f22543e) goto L29;
    L34:
        return r02.f22539c;
    }

    public final void b(Context r9, XmlPullParser r10) {
        TypedArray r02 = r9.obtainStyledAttributes(Xml.asAttributeSet(r10), e.ba);
        int r1 = r02.getIndexCount();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        int r4 = r02.getIndex(r3);
        if (r4 != e.ca) goto L7;
        this.f22533a = r02.getResourceId(r4, this.f22533a);
    L7:
        r3 = r3 + 1;
        goto L3
    L8:
        r02.recycle();
        int r03 = r10.getEventType();     // Catch: IOException -> L21 XmlPullParserException -> L23
        a r12 = null;
    L11:
        char r32 = 1;
        if (r03 == 1) goto L70;
        if (r03 != 0) goto L15;
        r10.getName();     // Catch: IOException -> L21 XmlPullParserException -> L23
    L49:
        r03 = r10.next();     // Catch: IOException -> L21 XmlPullParserException -> L23
        goto L11
    L15:
        if (r03 == 2) goto L25;
        if (r03 != 3) goto L49;
        if ("StateSet".equals(r10.getName()) == false) goto L49;
        return;
    L25:
        String r04 = r10.getName();     // Catch: IOException -> L21 XmlPullParserException -> L23
        switch(r04.hashCode()) {
            case 80204913: goto L38;
            case 1301459538: goto L35;
            case 1382829617: goto L32;
            case 1901439077: goto L29;
            default: goto L40;
        };     // Catch: IOException -> L21 XmlPullParserException -> L23
    L40:
        r32 = 65535;
    L41:
        if (r32 == 2) goto L47;
        if (r32 != 3) goto L49;
        b r05 = new b(r9, r10);     // Catch: IOException -> L21 XmlPullParserException -> L23
        if (r12 == null) goto L49;
        r12.a(r05);     // Catch: IOException -> L21 XmlPullParserException -> L23
        goto L49
    L47:
        r12 = new a(r9, r10);     // Catch: IOException -> L21 XmlPullParserException -> L23
        this.d.put(r12.f22537a, r12);     // Catch: IOException -> L21 XmlPullParserException -> L23
        goto L49
    L29:
        if (r04.equals(Constants.CLTAP_PROP_VARIANT) == false) goto L40;
        r32 = 3;
        goto L41
    L32:
        if (r04.equals("StateSet") == false) goto L40;
    L35:
        if (r04.equals("LayoutDescription") == false) goto L40;
        r32 = 0;
        goto L41
    L38:
        if (r04.equals("State") == false) goto L40;
        r32 = 2;
        goto L41
    L70:
        return;
    L21:
        e = move-exception;
        e.printStackTrace();
        return;
    L23:
        e = move-exception;
        e.printStackTrace();
    }

    public int c(int r2, int r3, int r4) {
        return d(-1, r2, r3, r4);
    }

    public int d(int r3, int r4, float r5, float r6) {
        if (r3 != r4) goto L22;
        if (r4 != (-1)) goto L6;
        a r42 = (a) this.d.valueAt(0);
    L7:
        if (r42 != null) goto L10;
        return -1;
    L10:
        if (this.f22535c != (-1)) goto L12;
    L14:
        int r52 = r42.b(r5, r6);
        if (r3 != r52) goto L17;
    L16:
        return r3;
    L17:
        if (r52 != (-1)) goto L21;
        return r42.f22539c;
    L21:
        return ((b) r42.f22538b.get(r52)).f22543e;
    L12:
        if (((b) r42.f22538b.get(r3)).a(r5, r6) == false) goto L14;
    L6:
        r42 = (a) this.d.get(this.f22534b);
        goto L7
    L22:
        a r32 = (a) this.d.get(r4);
        if (r32 != null) goto L25;
        return -1;
    L25:
        int r43 = r32.b(r5, r6);
        if (r43 != (-1)) goto L30;
        return r32.f22539c;
    L30:
        return ((b) r32.f22538b.get(r43)).f22543e;
    }
}
