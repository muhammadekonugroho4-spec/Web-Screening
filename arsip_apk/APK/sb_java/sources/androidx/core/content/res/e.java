package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import com.stockbit.protobuf.securities.transactional.datafeed.v1.datafeed.ErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class e {

    public static class a {
        public static int a(TypedArray r02, int r1) {
            return r02.getType(r1);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final d[] f22756a;

        public c(d[] r1) {
            this.f22756a = r1;
        }

        public d[] a() {
            return this.f22756a;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f22757a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22758b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f22759c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final int f22760e;

        /* renamed from: f, reason: collision with root package name */
        public final int f22761f;

        public d(String r1, int r2, boolean r3, String r4, int r5, int r6) {
            this.f22757a = r1;
            this.f22758b = r2;
            this.f22759c = r3;
            this.d = r4;
            this.f22760e = r5;
            this.f22761f = r6;
        }

        public String a() {
            return this.f22757a;
        }

        public int b() {
            return this.f22761f;
        }

        public int c() {
            return this.f22760e;
        }

        public String d() {
            return this.d;
        }

        public int e() {
            return this.f22758b;
        }

        public boolean f() {
            return this.f22759c;
        }
    }

    /* renamed from: androidx.core.content.res.e$e, reason: collision with other inner class name */
    public static final class C0162e implements b {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.core.provider.e f22762a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.core.provider.e f22763b;

        /* renamed from: c, reason: collision with root package name */
        public final int f22764c;
        public final int d;

        /* renamed from: e, reason: collision with root package name */
        public final String f22765e;

        public C0162e(androidx.core.provider.e r1, androidx.core.provider.e r2, int r3, int r4, String r5) {
            this.f22762a = r1;
            this.f22763b = r2;
            this.d = r3;
            this.f22764c = r4;
            this.f22765e = r5;
        }

        public androidx.core.provider.e a() {
            return this.f22763b;
        }

        public int b() {
            return this.d;
        }

        public androidx.core.provider.e c() {
            return this.f22762a;
        }

        public String d() {
            return this.f22765e;
        }

        public int e() {
            return this.f22764c;
        }
    }

    public static int a(TypedArray r02, int r1) {
        return a.a(r02, r1);
    }

    public static b b(XmlPullParser r3, Resources r4) {
    L2:
        int r02 = r3.next();
        if (r02 == 2) goto L7;
        if (r02 != 1) goto L2;
    L7:
        if (r02 != 2) goto L11;
        return d(r3, r4);
    L11:
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources r5, int r6) {
        if (r6 == 0) goto L4;
        TypedArray r02 = r5.obtainTypedArray(r6);
    L11:
        th = move-exception;
        r02.recycle();
        throw th;
    L7:
        if (r02.length() != 0) goto L13;
        List r52 = Collections.EMPTY_LIST;     // Catch: Throwable -> L11
        r02.recycle();
        return r52;
    L13:
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L11
        if (a(r02, 0) != 1) goto L22;
        int r62 = 0;
    L17:
        if (r62 >= r02.length()) goto L23;
        int r3 = r02.getResourceId(r62, 0);     // Catch: Throwable -> L11
        if (r3 == 0) goto L21;
        r1.add(h(r5.getStringArray(r3)));     // Catch: Throwable -> L11
    L21:
        r62 = r62 + 1;     // Catch: Throwable -> L11
    L23:
        r02.recycle();
        return r1;
    L22:
        r1.add(h(r5.getStringArray(r6)));     // Catch: Throwable -> L11
        goto L23
    L4:
        return Collections.EMPTY_LIST;
    }

    public static b d(XmlPullParser r3, Resources r4) {
        r3.require(2, null, "font-family");
        if (r3.getName().equals("font-family") == true) goto L5;
        g(r3);
        return null;
    L5:
        return e(r3, r4);
    }

    public static b e(XmlPullParser r16, Resources r17) {
        TypedArray r1 = r17.obtainAttributes(Xml.asAttributeSet(r16), androidx.core.i.f22938h);
        String r2 = r1.getString(androidx.core.i.f22939i);
        String r3 = r1.getString(androidx.core.i.f22944n);
        String r4 = r1.getString(androidx.core.i.f22945o);
        String r5 = r1.getString(androidx.core.i.f22941k);
        int r6 = r1.getResourceId(androidx.core.i.f22940j, 0);
        int r13 = r1.getInteger(androidx.core.i.f22942l, 1);
        int r14 = r1.getInteger(androidx.core.i.f22943m, 500);
        String r15 = r1.getString(androidx.core.i.f22946p);
        r1.recycle();
        androidx.core.provider.e r12 = null;
        if (r2 == null) goto L14;
        if (r3 == null) goto L14;
        if (r4 == null) goto L14;
    L7:
        if (r16.next() == 3) goto L9;
        g(r16);
        goto L7
    L9:
        List r02 = c(r17, r6);
        if (r5 == null) goto L12;
        r12 = new androidx.core.provider.e(r2, r3, r5, r02);
    L12:
        androidx.core.provider.e r11 = new androidx.core.provider.e(r2, r3, r4, r02);
        return new C0162e(r11, r12, r13, r14, r15);
    L14:
        ArrayList r22 = new ArrayList();
    L16:
        if (r16.next() == 3) goto L25;
        if (r16.getEventType() != 2) goto L16;
        if (r16.getName().equals("font") == true) goto L22;
        g(r16);
        goto L16
    L22:
        r22.add(f(r16, r17));
        goto L16
    L25:
        if (r22.isEmpty() == false) goto L28;
        return null;
    L28:
        return new c((d[]) r22.toArray(new d[0]));
    }

    public static d f(XmlPullParser r9, Resources r10) {
        TypedArray r102 = r10.obtainAttributes(Xml.asAttributeSet(r9), androidx.core.i.f22947q);
        if (r102.hasValue(androidx.core.i.f22956z) == false) goto L5;
        int r02 = androidx.core.i.f22956z;
    L6:
        int r4 = r102.getInt(r02, ErrorCode.ERROR_CODE_BAD_REQUEST_VALUE);
        if (r102.hasValue(androidx.core.i.f22954x) == false) goto L9;
        int r03 = androidx.core.i.f22954x;
    L11:
        if (1 != r102.getInt(r03, 0)) goto L13;
        boolean r5 = true;
    L15:
        if (r102.hasValue(androidx.core.i.f22915A) == false) goto L17;
        int r04 = androidx.core.i.f22915A;
    L19:
        if (r102.hasValue(androidx.core.i.f22955y) == false) goto L21;
        int r2 = androidx.core.i.f22955y;
    L22:
        String r6 = r102.getString(r2);
        int r7 = r102.getInt(r04, 0);
        if (r102.hasValue(androidx.core.i.f22953w) == false) goto L25;
        int r05 = androidx.core.i.f22953w;
    L26:
        int r8 = r102.getResourceId(r05, 0);
        String r3 = r102.getString(r05);
        r102.recycle();
    L28:
        if (r9.next() == 3) goto L31;
        g(r9);
        goto L28
    L31:
        return new d(r3, r4, r5, r6, r7, r8);
    L25:
        r05 = androidx.core.i.f22948r;
        goto L26
    L21:
        r2 = androidx.core.i.f22952v;
        goto L22
    L17:
        r04 = androidx.core.i.f22951u;
        goto L19
    L13:
        r5 = false;
        goto L15
    L9:
        r03 = androidx.core.i.f22950t;
        goto L11
    L5:
        r02 = androidx.core.i.f22949s;
        goto L6
    }

    public static void g(XmlPullParser r3) {
        int r02 = 1;
    L3:
        if (r02 <= 0) goto L11;
        int r1 = r3.next();
        if (r1 != 2) goto L7;
        r02 = r02 + 1;
        goto L3
    L7:
        if (r1 != 3) goto L3;
        r02 = r02 - 1;
        goto L3
    }

    public static List h(String[] r5) {
        ArrayList r02 = new ArrayList();
        int r1 = r5.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        r02.add(Base64.decode(r5[r3], 0));
        r3 = r3 + 1;
        goto L3
    L5:
        return r02;
    }
}
