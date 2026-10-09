package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.res.e;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f22768a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f22769b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f22770c = null;

    public static class a {
        public static Drawable a(Resources r02, int r1, Resources.Theme r2) {
            return r02.getDrawable(r1, r2);
        }

        public static Drawable b(Resources r02, int r1, int r2, Resources.Theme r3) {
            return r02.getDrawableForDensity(r1, r2, r3);
        }
    }

    public static class b {
        public static int a(Resources r02, int r1, Resources.Theme r2) {
            return r02.getColor(r1, r2);
        }

        public static ColorStateList b(Resources r02, int r1, Resources.Theme r2) {
            return r02.getColorStateList(r1, r2);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final ColorStateList f22771a;

        /* renamed from: b, reason: collision with root package name */
        public final Configuration f22772b;

        /* renamed from: c, reason: collision with root package name */
        public final int f22773c;

        public c(ColorStateList r1, Configuration r2, Resources.Theme r3) {
            this.f22771a = r1;
            this.f22772b = r2;
            if (r3 != null) goto L5;
            int r12 = 0;
        L6:
            this.f22773c = r12;
            return;
        L5:
            r12 = r3.hashCode();
            goto L6
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f22774a;

        /* renamed from: b, reason: collision with root package name */
        public final Resources.Theme f22775b;

        public d(Resources r1, Resources.Theme r2) {
            this.f22774a = r1;
            this.f22775b = r2;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if (r5 != null) goto L8;
        L15:
            return false;
        L8:
            if (d.class != r5.getClass()) goto L15;
            d r52 = (d) r5;
            if (this.f22774a.equals(r52.f22774a) == false) goto L15;
            if (androidx.core.util.c.a(this.f22775b, r52.f22775b) == false) goto L15;
            return true;
        }

        public int hashCode() {
            return androidx.core.util.c.b(new Object[]{this.f22774a, this.f22775b});
        }
    }

    public static abstract class e {
        public e() {
        }

        public static /* synthetic */ void a(e r02, Typeface r1) {
            r02.onFontRetrieved(r1);
        }

        public static /* synthetic */ void b(e r02, int r1) {
            r02.onFontRetrievalFailed(r1);
        }

        public static Handler getHandler(Handler r1) {
            if (r1 == null) goto L4;
            return r1;
        L4:
            return new Handler(Looper.getMainLooper());
        }

        public final void callbackFailAsync(final int r2, Handler r3) {
            getHandler(r3).post(new j(this, r2));
        }

        public final void callbackSuccessAsync(final Typeface r2, Handler r3) {
            getHandler(r3).post(new i(this, r2));
        }

        public abstract void onFontRetrievalFailed(int r1);

        public abstract void onFontRetrieved(Typeface r1);
    }

    public static final class f {

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final Object f22776a = null;

            /* renamed from: b, reason: collision with root package name */
            public static Method f22777b;

            /* renamed from: c, reason: collision with root package name */
            public static boolean f22778c;

            static {
                f22776a = new Object();
            }

            public static void a(Resources.Theme r6) {
                Object r02 = f22776a;
                monitor-enter(r02);
            L10:
                th = move-exception;
                throw th;
            L6:
                if (f22778c == false) goto L27;
            L15:
                Method r1 = f22777b;     // Catch: Throwable -> L10
                if (r1 != null) goto L31;
            L23:
                monitor-exit(r02);     // Catch: Throwable -> L10
                return;
            L31:
                r1.invoke(r6, null);     // Catch: Throwable -> L10 Throwable -> L19 IllegalAccessException -> L21
            L19:
                e = move-exception;
                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e);     // Catch: Throwable -> L10
                f22777b = null;     // Catch: Throwable -> L10
                goto L23
            L27:
                Method r3 = Resources.Theme.class.getDeclaredMethod("rebase", null);     // Catch: Throwable -> L10 NoSuchMethodException -> L12
                f22777b = r3;     // Catch: Throwable -> L10 NoSuchMethodException -> L12
                r3.setAccessible(true);     // Catch: Throwable -> L10 NoSuchMethodException -> L12
            L14:
                f22778c = true;     // Catch: Throwable -> L10
                goto L15
            L12:
                e = move-exception;
                Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);     // Catch: Throwable -> L10
                goto L14
            }
        }

        public static class b {
            public static void a(Resources.Theme r02) {
                r02.rebase();
            }
        }

        public static void a(Resources.Theme r2) {
            if (Build.VERSION.SDK_INT < 29) goto L6;
            b.a(r2);
            return;
        L6:
            a.a(r2);
        }
    }

    static {
        f22768a = new ThreadLocal();
        f22769b = new WeakHashMap(0);
        f22770c = new Object();
    }

    public static void a(d r3, int r4, ColorStateList r5, Resources.Theme r6) {
        Object r02 = f22770c;
        monitor-enter(r02);
        WeakHashMap r1 = f22769b;     // Catch: Throwable -> L7
        SparseArray r2 = (SparseArray) r1.get(r3);     // Catch: Throwable -> L7
        if (r2 != null) goto L9;
        r2 = new SparseArray();     // Catch: Throwable -> L7
        r1.put(r3, r2);     // Catch: Throwable -> L7
    L9:
        r2.append(r4, new c(r5, r3.f22774a.getConfiguration(), r6));     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public static ColorStateList b(d r5, int r6) {
        Object r02 = f22770c;
        monitor-enter(r02);
        SparseArray r1 = (SparseArray) f22769b.get(r5);     // Catch: Throwable -> L17
        if (r1 != null) goto L7;
    L26:
        monitor-exit(r02);     // Catch: Throwable -> L17
        return null;
    L7:
        if (r1.size() <= 0) goto L26;
        c r2 = (c) r1.get(r6);     // Catch: Throwable -> L17
        if (r2 == null) goto L26;
        if (r2.f22772b.equals(r5.f22774a.getConfiguration()) == false) goto L25;
        Resources.Theme r52 = r5.f22775b;     // Catch: Throwable -> L17
        if (r52 == null) goto L15;
    L19:
        if (r52 == null) goto L25;
        if (r2.f22773c != r52.hashCode()) goto L25;
    L22:
        ColorStateList r53 = r2.f22771a;     // Catch: Throwable -> L17
        monitor-exit(r02);     // Catch: Throwable -> L17
        return r53;
    L15:
        if (r2.f22773c == 0) goto L22;
    L25:
        r1.remove(r6);     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        throw th;
    }

    public static Typeface c(Context r8, int r9) {
        if (r8.isRestricted() == false) goto L7;
        return null;
    L7:
        return n(r8, r9, new TypedValue(), 0, null, null, false, true);
    }

    public static int d(Resources r02, int r1, Resources.Theme r2) {
        return b.a(r02, r1, r2);
    }

    public static ColorStateList e(Resources r2, int r3, Resources.Theme r4) {
        d r02 = new d(r2, r4);
        ColorStateList r1 = b(r02, r3);
        if (r1 == null) goto L5;
        return r1;
    L5:
        ColorStateList r12 = l(r2, r3, r4);
        if (r12 == null) goto L10;
        a(r02, r3, r12, r4);
        return r12;
    L10:
        return b.b(r2, r3, r4);
    }

    public static Drawable f(Resources r02, int r1, Resources.Theme r2) {
        return a.a(r02, r1, r2);
    }

    public static Drawable g(Resources r02, int r1, int r2, Resources.Theme r3) {
        return a.b(r02, r1, r2, r3);
    }

    public static Typeface h(Context r8, int r9) {
        if (r8.isRestricted() == false) goto L7;
        return null;
    L7:
        return n(r8, r9, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface i(Context r8, int r9, TypedValue r10, int r11, e r12) {
        if (r8.isRestricted() == false) goto L7;
        return null;
    L7:
        return n(r8, r9, r10, r11, r12, null, true, false);
    }

    public static void j(Context r8, int r9, e r10, Handler r11) {
        androidx.core.util.h.g(r10);
        if (r8.isRestricted() == false) goto L6;
        r10.callbackFailAsync(-4, r11);
        return;
    L6:
        n(r8, r9, new TypedValue(), 0, r10, r11, false, false);
    }

    public static TypedValue k() {
        ThreadLocal r02 = f22768a;
        TypedValue r1 = (TypedValue) r02.get();
        if (r1 != null) goto L6;
        TypedValue r12 = new TypedValue();
        r02.set(r12);
        return r12;
    L6:
        return r1;
    }

    public static ColorStateList l(Resources r2, int r3, Resources.Theme r4) {
        if (m(r2, r3) == false) goto L11;
        return null;
    L11:
        return androidx.core.content.res.c.a(r2, r2.getXml(r3), r4);
    L8:
        e = move-exception;
        Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
        return null;
    }

    public static boolean m(Resources r2, int r3) {
        TypedValue r02 = k();
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

    public static Typeface n(Context r9, int r10, TypedValue r11, int r12, e r13, Handler r14, boolean r15, boolean r16) {
        Resources r1 = r9.getResources();
        r1.getValue(r10, r11, true);
        Typeface r92 = o(r9, r1, r11, r10, r12, r13, r14, r15, r16);
        if (r92 != null) goto L9;
        if (r13 != null) goto L9;
        if (r16 == true) goto L9;
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(r10) + " could not be retrieved.");
    L9:
        return r92;
    }

    public static Typeface o(Context r13, Resources r14, TypedValue r15, int r16, int r17, e r18, Handler r19, boolean r20, boolean r21) {
        CharSequence r02 = r15.string;
        if (r02 == null) goto L49;
        String r3 = r02.toString();
        if (r3.startsWith("res/") == true) goto L9;
        if (r18 == null) goto L8;
        r18.callbackFailAsync(-3, r19);
    L8:
        return null;
    L9:
        Typeface r03 = androidx.core.graphics.h.g(r14, r16, r3, r15.assetCookie, r17);
        if (r03 == null) goto L14;
        if (r18 == null) goto L13;
        r18.callbackSuccessAsync(r03, r19);
    L13:
        return r03;
    L14:
        if (r21 == false) goto L52;
        return null;
    L52:
    L23:
        e = e;
    L43:
        Log.e("ResourcesCompat", "Failed to read xml resource " + r3, e);
    L45:
        if (r18 == null) goto L47;
        r18.callbackFailAsync(-3, r19);
    L47:
        return null;
    L25:
        e = e;
    L44:
        Log.e("ResourcesCompat", "Failed to parse xml resource " + r3, e);
        goto L45
    L17:
        if (r3.toLowerCase().endsWith(".xml") == false) goto L36;
        e.b r1 = androidx.core.content.res.e.b(r14.getXml(r16), r14);     // Catch: IOException -> L23 XmlPullParserException -> L25
        if (r1 != null) goto L50;
        Log.e("ResourcesCompat", "Failed to find font-family tag");     // Catch: IOException -> L23 XmlPullParserException -> L25
        if (r18 == null) goto L27;
        r18.callbackFailAsync(-3, r19);     // Catch: IOException -> L23 XmlPullParserException -> L25
    L27:
        return null;
    L50:
        return androidx.core.graphics.h.d(r13, r1, r14, r16, r3, r15.assetCookie, r17, r18, r19, r20);
    L32:
        e = e;
        r3 = r3;
    L34:
        e = e;
        r3 = r3;
        goto L44
    L36:
        Typeface r132 = androidx.core.graphics.h.e(r13, r14, r16, r3, r15.assetCookie, r17);     // Catch: IOException -> L23 XmlPullParserException -> L25
        if (r18 == null) goto L42;
        if (r132 == null) goto L41;
        r18.callbackSuccessAsync(r132, r19);     // Catch: IOException -> L23 XmlPullParserException -> L25
        return r132;
    L41:
        r18.callbackFailAsync(-3, r19);     // Catch: IOException -> L23 XmlPullParserException -> L25
    L42:
        return r132;
    L49:
        throw new Resources.NotFoundException("Resource \"" + r14.getResourceName(r16) + "\" (" + Integer.toHexString(r16) + ") is not a Font: " + r15);
    }
}
