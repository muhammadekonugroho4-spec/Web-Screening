package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class j extends i {

    /* renamed from: g, reason: collision with root package name */
    public final Class f22893g;

    /* renamed from: h, reason: collision with root package name */
    public final Constructor f22894h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f22895i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f22896j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f22897k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f22898l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f22899m;

    public j() {
        Class r02 = u();     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Constructor r1 = v(r02);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r2 = r(r02);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r3 = s(r02);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r4 = w(r02);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r5 = q(r02);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r6 = t(r02);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
    L9:
        this.f22893g = r02;
        this.f22894h = r1;
        this.f22895i = r2;
        this.f22896j = r3;
        this.f22897k = r4;
        this.f22898l = r5;
        this.f22899m = r6;
        return;
    L7:
        e = move-exception;
        Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
        r02 = null;
        r1 = null;
        r2 = null;
        r3 = null;
        r4 = null;
        r5 = null;
        r6 = null;
        goto L9
    }

    @Override // androidx.core.graphics.i, androidx.core.graphics.m
    public Typeface a(Context r10, e.c r11, Resources r12, int r13) {
        if (p() == false) goto L5;
        Object r2 = k();
        if (r2 != null) goto L9;
        return null;
    L9:
        e.d[] r112 = r11.a();
        int r132 = r112.length;
        int r8 = 0;
    L10:
        if (r8 >= r132) goto L17;
        e.d r02 = r112[r8];
        String r3 = r02.a();
        int r4 = r02.c();
        int r5 = r02.e();
        boolean r6 = r02.f();
        Context r1 = r10;
        if (m(r1, r2, r3, r4, r5, r6 ? 1 : 0, FontVariationAxis.fromFontVariationSettings(r02.d())) == false) goto L13;
        r8 = r8 + 1;
        r10 = r1;
        goto L10
    L13:
        l(r2);
        return null;
    L17:
        if (o(r2) == true) goto L20;
        return null;
    L20:
        return i(r2);
    L5:
        return super.a(r10, r11, r12, r13);
    }

    @Override // androidx.core.graphics.m
    public Typeface b(Context r10, CancellationSignal r11, g.b[] r12, int r13) {
        if (r12.length >= 1) goto L6;
        return null;
    L6:
        if (p() == true) goto L25;
        g.b r122 = g(r12, r13);
        ParcelFileDescriptor r102 = r10.getContentResolver().openFileDescriptor(r122.d(), "r", r11);     // Catch: IOException -> L24
        if (r102 != null) goto L52;
        if (r102 == null) goto L12;
        r102.close();     // Catch: IOException -> L24
    L12:
        return null;
    L52:
        Typeface r112 = new Typeface.Builder(r102.getFileDescriptor()).setWeight(r122.e()).setItalic(r122.f()).build();     // Catch: Throwable -> L16
        r102.close();     // Catch: IOException -> L24
        return r112;
    L16:
        th = move-exception;
        r102.close();     // Catch: Throwable -> L20
    L60:
        throw th;     // Catch: IOException -> L24
    L20:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L24
        throw th;     // Catch: IOException -> L24
    L24:
        return null;
    L25:
        Map r103 = n.f(r10, r12, r11);
        Object r4 = k();
        if (r4 != null) goto L28;
        return null;
    L28:
        int r113 = r12.length;
        int r02 = 0;
        boolean r3 = false;
    L29:
        if (r02 >= r113) goto L39;
        g.b r5 = r12[r02];
        ByteBuffer r6 = (ByteBuffer) r103.get(r5.d());
        if (r6 != null) goto L33;
        Object r62 = r4;
    L38:
        r02 = r02 + 1;
        r4 = r62;
        r3 = r3;
        goto L29
    L33:
        boolean r52 = n(r4, r6, r5.c(), r5.e(), r5.f() ? 1 : 0);
        r62 = r4;
        if (r52 == false) goto L35;
        r3 = true;
        goto L38
    L35:
        l(r62);
        return null;
    L39:
        Object r63 = r4;
        if (r3 == true) goto L44;
        l(r63);
        return null;
    L44:
        if (o(r63) == true) goto L46;
        return null;
    L46:
        Typeface r104 = i(r63);
        if (r104 != null) goto L50;
        return null;
    L50:
        return Typeface.create(r104, r13);
    }

    @Override // androidx.core.graphics.m
    public /* bridge */ /* synthetic */ Typeface c(Context r1, CancellationSignal r2, List r3, int r4) {
        return super.c(r1, r2, r3, r4);
    }

    @Override // androidx.core.graphics.m
    public Typeface d(Context r10, Resources r11, int r12, String r13, int r14) {
        if (p() == false) goto L5;
        Object r3 = k();
        if (r3 != null) goto L10;
        return null;
    L10:
        if (m(r10, r3, r13, 0, -1, -1, null) == true) goto L14;
        l(r3);
        return null;
    L14:
        if (o(r3) == true) goto L17;
        return null;
    L17:
        return i(r3);
    L5:
        return super.d(r10, r11, r12, r13, r14);
    }

    public Typeface i(Object r5) {
        Object r1 = Array.newInstance(this.f22893g, 1);     // Catch: Throwable -> L5
        Array.set(r1, 0, r5);     // Catch: Throwable -> L5
        return (Typeface) this.f22899m.invoke(null, new Object[]{r1, -1, -1});
    L5:
        return null;
    }

    public final Object k() {
        return this.f22894h.newInstance(null);
    L8:
        return null;
    }

    public final void l(Object r3) {
        this.f22898l.invoke(r3, null);     // Catch: Throwable -> L4
        return;
    }

    public final boolean m(Context r11, Object r12, String r13, int r14, int r15, int r16, FontVariationAxis[] r17) {
        return ((Boolean) this.f22895i.invoke(r12, new Object[]{r11.getAssets(), r13, 0, Boolean.FALSE, Integer.valueOf(r14), Integer.valueOf(r15), Integer.valueOf(r16), r17})).booleanValue();
    L5:
        return false;
    }

    public final boolean n(Object r3, ByteBuffer r4, int r5, int r6, int r7) {
        return ((Boolean) this.f22896j.invoke(r3, new Object[]{r4, Integer.valueOf(r5), null, Integer.valueOf(r6), Integer.valueOf(r7)})).booleanValue();
    L4:
        return false;
    }

    public final boolean o(Object r3) {
        return ((Boolean) this.f22897k.invoke(r3, null)).booleanValue();
    L4:
        return false;
    }

    public final boolean p() {
        if (this.f22895i != null) goto L6;
        Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
    L6:
        if (this.f22895i == null) goto L9;
        return true;
    L9:
        return false;
    }

    public Method q(Class r3) {
        return r3.getMethod("abortCreation", null);
    }

    public Method r(Class r9) {
        Class r3 = Boolean.TYPE;
        Class r2 = Integer.TYPE;
        return r9.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, r2, r3, r2, r2, r2, FontVariationAxis[].class});
    }

    public Method s(Class r4) {
        Class r02 = Integer.TYPE;
        return r4.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, r02, FontVariationAxis[].class, r02, r02});
    }

    public Method t(Class r4) {
        Class<?> r42 = Array.newInstance(r4, 1).getClass();
        Class r1 = Integer.TYPE;
        Method r43 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{r42, r1, r1});
        r43.setAccessible(true);
        return r43;
    }

    public Class u() {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor v(Class r2) {
        return r2.getConstructor(null);
    }

    public Method w(Class r3) {
        return r3.getMethod("freeze", null);
    }
}
