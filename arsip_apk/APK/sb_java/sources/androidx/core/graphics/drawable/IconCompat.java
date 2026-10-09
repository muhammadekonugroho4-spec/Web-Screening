package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.util.h;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f22867k = null;

    /* renamed from: a, reason: collision with root package name */
    public int f22868a;

    /* renamed from: b, reason: collision with root package name */
    public Object f22869b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f22870c;
    public Parcelable d;

    /* renamed from: e, reason: collision with root package name */
    public int f22871e;

    /* renamed from: f, reason: collision with root package name */
    public int f22872f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f22873g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f22874h;

    /* renamed from: i, reason: collision with root package name */
    public String f22875i;

    /* renamed from: j, reason: collision with root package name */
    public String f22876j;

    public static class a {
        public static IconCompat a(Object r2) {
            h.g(r2);
            int r02 = d(r2);
            if (r02 == 2) goto L15;
            if (r02 == 4) goto L13;
            if (r02 == 6) goto L11;
            IconCompat r03 = new IconCompat(-1);
            r03.f22869b = r2;
            return r03;
        L11:
            return IconCompat.f(e(r2));
        L13:
            return IconCompat.i(e(r2));
        L15:
            return IconCompat.l(null, c(r2), b(r2));
        }

        public static int b(Object r6) {
            if (Build.VERSION.SDK_INT < 28) goto L21;
            return c.a(r6);
        L21:
            return ((Integer) r6.getClass().getMethod("getResId", null).invoke(r6, null)).intValue();
        L13:
            e = move-exception;
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        L9:
            e = move-exception;
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        L11:
            e = move-exception;
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        }

        public static String c(Object r5) {
            if (Build.VERSION.SDK_INT < 28) goto L21;
            return c.b(r5);
        L21:
            return (String) r5.getClass().getMethod("getResPackage", null).invoke(r5, null);
        L13:
            e = move-exception;
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        L9:
            e = move-exception;
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        L11:
            e = move-exception;
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        }

        public static int d(Object r6) {
            if (Build.VERSION.SDK_INT < 28) goto L21;
            return c.c(r6);
        L21:
            return ((Integer) r6.getClass().getMethod("getType", null).invoke(r6, null)).intValue();
        L13:
            e = move-exception;
            Log.e("IconCompat", "Unable to get icon type " + r6, e);
            return -1;
        L9:
            e = move-exception;
            Log.e("IconCompat", "Unable to get icon type " + r6, e);
            return -1;
        L11:
            e = move-exception;
            Log.e("IconCompat", "Unable to get icon type " + r6, e);
            return -1;
        }

        public static Uri e(Object r5) {
            if (Build.VERSION.SDK_INT < 28) goto L21;
            return c.d(r5);
        L21:
            return (Uri) r5.getClass().getMethod("getUri", null).invoke(r5, null);
        L13:
            e = move-exception;
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        L9:
            e = move-exception;
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        L11:
            e = move-exception;
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        }

        public static Drawable f(Icon r02, Context r1) {
            return r02.loadDrawable(r1);
        }

        public static Icon g(IconCompat r2, Context r3) {
            switch(r2.f22868a) {
                case -1: goto L30;
                case 0: goto L5;
                case 1: goto L21;
                case 2: goto L20;
                case 3: goto L19;
                case 4: goto L18;
                case 5: goto L17;
                case 6: goto L7;
                default: goto L5;
            };
        L17:
            Icon r32 = b.a((Bitmap) r2.f22869b);
        L22:
            ColorStateList r02 = r2.f22873g;
            if (r02 == null) goto L25;
            r32.setTintList(r02);
        L25:
            PorterDuff.Mode r22 = r2.f22874h;
            if (r22 == IconCompat.f22867k) goto L28;
            r32.setTintMode(r22);
        L28:
            return r32;
        L18:
            r32 = Icon.createWithContentUri((String) r2.f22869b);
            goto L22
        L19:
            r32 = Icon.createWithData((byte[]) r2.f22869b, r2.f22871e, r2.f22872f);
            goto L22
        L20:
            r32 = Icon.createWithResource(r2.o(), r2.f22871e);
            goto L22
        L21:
            r32 = Icon.createWithBitmap((Bitmap) r2.f22869b);
            goto L22
        L5:
            throw new IllegalArgumentException("Unknown type");
        L7:
            if (Build.VERSION.SDK_INT < 30) goto L9;
            r32 = d.a(r2.r());
            goto L22
        L9:
            if (r3 == null) goto L16;
            InputStream r33 = r2.s(r3);
            if (r33 == null) goto L14;
            r32 = b.a(BitmapFactory.decodeStream(r33));
            goto L22
        L14:
            throw new IllegalStateException("Cannot load adaptive icon from uri: " + r2.r());
        L16:
            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + r2.r());
        L30:
            return (Icon) r2.f22869b;
        }
    }

    public static class b {
        public static Icon a(Bitmap r02) {
            return Icon.createWithAdaptiveBitmap(r02);
        }
    }

    public static class c {
        public static int a(Object r02) {
            return ((Icon) r02).getResId();
        }

        public static String b(Object r02) {
            return ((Icon) r02).getResPackage();
        }

        public static int c(Object r02) {
            return ((Icon) r02).getType();
        }

        public static Uri d(Object r02) {
            return ((Icon) r02).getUri();
        }
    }

    public static class d {
        public static Icon a(Uri r02) {
            return Icon.createWithAdaptiveBitmapContentUri(r02);
        }
    }

    static {
        f22867k = PorterDuff.Mode.SRC_IN;
    }

    public IconCompat() {
        this.f22868a = -1;
        this.f22870c = null;
        this.d = null;
        this.f22871e = 0;
        this.f22872f = 0;
        this.f22873g = null;
        this.f22874h = f22867k;
        this.f22875i = null;
    }

    public static IconCompat b(Bundle r4) {
        int r02 = r4.getInt("type");
        IconCompat r1 = new IconCompat(r02);
        r1.f22871e = r4.getInt("int1");
        r1.f22872f = r4.getInt("int2");
        r1.f22876j = r4.getString("string1");
        if (r4.containsKey("tint_list") == false) goto L6;
        r1.f22873g = (ColorStateList) r4.getParcelable("tint_list");
    L6:
        if (r4.containsKey("tint_mode") == false) goto L9;
        r1.f22874h = PorterDuff.Mode.valueOf(r4.getString("tint_mode"));
    L9:
        switch(r02) {
            case -1: goto L16;
            case 0: goto L10;
            case 1: goto L16;
            case 2: goto L14;
            case 3: goto L12;
            case 4: goto L14;
            case 5: goto L16;
            case 6: goto L14;
            default: goto L10;
        };
    L10:
        Log.w("IconCompat", "Unknown type " + r02);
        return null;
    L12:
        r1.f22869b = r4.getByteArray("obj");
        return r1;
    L14:
        r1.f22869b = r4.getString("obj");
        return r1;
    L16:
        r1.f22869b = r4.getParcelable("obj");
        return r1;
    }

    public static IconCompat c(Icon r02) {
        return a.a(r02);
    }

    public static IconCompat d(Icon r2) {
        if (a.d(r2) != 2) goto L9;
        if (a.b(r2) != 0) goto L9;
        return null;
    L9:
        return a.a(r2);
    }

    public static Bitmap e(Bitmap r9, boolean r10) {
        int r02 = (int) (Math.min(r9.getWidth(), r9.getHeight()) * 0.6666667f);
        Bitmap r1 = Bitmap.createBitmap(r02, r02, Bitmap.Config.ARGB_8888);
        Canvas r2 = new Canvas(r1);
        Paint r3 = new Paint(3);
        float r4 = r02;
        float r5 = 0.5f * r4;
        float r6 = 0.9166667f * r5;
        if (r10 == false) goto L5;
        float r102 = 0.010416667f * r4;
        r3.setColor(0);
        r3.setShadowLayer(r102, 0.0f, r4 * 0.020833334f, 1023410176);
        r2.drawCircle(r5, r5, r6, r3);
        r3.setShadowLayer(r102, 0.0f, 0.0f, 503316480);
        r2.drawCircle(r5, r5, r6, r3);
        r3.clearShadowLayer();
    L5:
        r3.setColor(-16777216);
        Shader.TileMode r42 = Shader.TileMode.CLAMP;
        BitmapShader r103 = new BitmapShader(r9, r42, r42);
        Matrix r43 = new Matrix();
        r43.setTranslate((-(r9.getWidth() - r02)) / 2.0f, (-(r9.getHeight() - r02)) / 2.0f);
        r103.setLocalMatrix(r43);
        r3.setShader(r103);
        r2.drawCircle(r5, r5, r6, r3);
        r2.setBitmap(null);
        return r1;
    }

    public static IconCompat f(Uri r02) {
        androidx.core.util.c.c(r02);
        return g(r02.toString());
    }

    public static IconCompat g(String r2) {
        androidx.core.util.c.c(r2);
        IconCompat r02 = new IconCompat(6);
        r02.f22869b = r2;
        return r02;
    }

    public static IconCompat h(Bitmap r2) {
        androidx.core.util.c.c(r2);
        IconCompat r02 = new IconCompat(1);
        r02.f22869b = r2;
        return r02;
    }

    public static IconCompat i(Uri r02) {
        androidx.core.util.c.c(r02);
        return j(r02.toString());
    }

    public static IconCompat j(String r2) {
        androidx.core.util.c.c(r2);
        IconCompat r02 = new IconCompat(4);
        r02.f22869b = r2;
        return r02;
    }

    public static IconCompat k(Context r1, int r2) {
        androidx.core.util.c.c(r1);
        return l(r1.getResources(), r1.getPackageName(), r2);
    }

    public static IconCompat l(Resources r2, String r3, int r4) {
        androidx.core.util.c.c(r3);
        if (r4 == 0) goto L14;
        IconCompat r02 = new IconCompat(2);
        r02.f22871e = r4;
        if (r2 != null) goto L15;
        r02.f22869b = r3;
    L11:
        r02.f22876j = r3;
        return r02;
    L15:
        r02.f22869b = r2.getResourceName(r4);     // Catch: Resources.NotFoundException -> L8
    L9:
        throw new IllegalArgumentException("Icon resource cannot be found");
    L14:
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public static Resources p(Context r2, String r3) {
        if (Constants.KEY_ANDROID.equals(r3) == true) goto L5;
        PackageManager r22 = r2.getPackageManager();
        ApplicationInfo r02 = r22.getApplicationInfo(r3, UserMetadata.MAX_INTERNAL_KEY_SIZE);     // Catch: PackageManager.NameNotFoundException -> L11
        if (r02 == null) goto L13;
        return r22.getResourcesForApplication(r02);
    L13:
        return null;
    L11:
        e = move-exception;
        Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", new Object[]{r3}), e);
        return null;
    L5:
        return Resources.getSystem();
    }

    public static String z(int r02) {
        switch(r02) {
            case 1: goto L15;
            case 2: goto L13;
            case 3: goto L11;
            case 4: goto L9;
            case 5: goto L7;
            case 6: goto L5;
            default: goto L3;
        };
    L3:
        return GrsBaseInfo.CountryCodeSource.UNKNOWN;
    L5:
        return "URI_MASKABLE";
    L7:
        return "BITMAP_MASKABLE";
    L9:
        return "URI";
    L11:
        return "DATA";
    L13:
        return "RESOURCE";
    L15:
        return "BITMAP";
    }

    public void a(Context r9) {
        if (this.f22868a != 2) goto L17;
        Object r02 = this.f22869b;
        if (r02 == null) goto L18;
        String r03 = (String) r02;
        if (r03.contains(":") == false) goto L20;
        String r3 = r03.split(":", -1)[1];
        String r6 = r3.split(RemoteSettings.FORWARD_SLASH_STRING, -1)[0];
        String r32 = r3.split(RemoteSettings.FORWARD_SLASH_STRING, -1)[1];
        String r1 = r03.split(":", -1)[0];
        if ("0_resource_name_obfuscated".equals(r32) == false) goto L13;
        Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
        return;
    L13:
        String r2 = o();
        int r92 = p(r9, r2).getIdentifier(r32, r6, r1);
        if (this.f22871e == r92) goto L19;
        Log.i("IconCompat", "Id has changed for " + r2 + " " + r03);
        this.f22871e = r92;
        return;
    L19:
        return;
    L20:
        return;
    L18:
        return;
    }

    public Bitmap m() {
        int r02 = this.f22868a;
        if (r02 != (-1)) goto L11;
        Object r03 = this.f22869b;
        if ((r03 instanceof Bitmap) == true) goto L7;
        return null;
    L7:
        return (Bitmap) r03;
    L11:
        if (r02 != 1) goto L15;
        return (Bitmap) this.f22869b;
    L15:
        if (r02 != 5) goto L19;
        return e((Bitmap) this.f22869b, true);
    L19:
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int n() {
        int r02 = this.f22868a;
        if (r02 != (-1)) goto L7;
        return a.b(this.f22869b);
    L7:
        if (r02 != 2) goto L11;
        return this.f22871e;
    L11:
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String o() {
        int r02 = this.f22868a;
        if (r02 != (-1)) goto L7;
        return a.c(this.f22869b);
    L7:
        if (r02 != 2) goto L18;
        String r03 = this.f22876j;
        if (r03 == null) goto L16;
        if (TextUtils.isEmpty(r03) == true) goto L16;
        return this.f22876j;
    L16:
        return ((String) this.f22869b).split(":", -1)[0];
    L18:
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int q() {
        int r02 = this.f22868a;
        if (r02 == (-1)) goto L5;
        return r02;
    L5:
        return a.d(this.f22869b);
    }

    public Uri r() {
        int r02 = this.f22868a;
        if (r02 != (-1)) goto L7;
        return a.e(this.f22869b);
    L7:
        if (r02 == 4) goto L14;
        if (r02 == 6) goto L14;
        throw new IllegalStateException("called getUri() on " + this);
    L14:
        return Uri.parse((String) this.f22869b);
    }

    public InputStream s(Context r5) {
        Uri r02 = r();
        String r1 = r02.getScheme();
        if ("content".equals(r1) == false) goto L5;
    L17:
        return r5.getContentResolver().openInputStream(r02);
    L13:
        e = move-exception;
        Log.w("IconCompat", "Unable to load image from URI: " + r02, e);
        return null;
    L5:
        if ("file".equals(r1) == true) goto L17;
        return new FileInputStream(new File((String) this.f22869b));
    L9:
        e = move-exception;
        Log.w("IconCompat", "Unable to load image from path: " + r02, e);
        return null;
    }

    public Drawable t(Context r2) {
        a(r2);
        return a.f(y(r2), r2);
    }

    public String toString() {
        if (this.f22868a == (-1)) goto L5;
        StringBuilder r02 = new StringBuilder("Icon(typ=");
        r02.append(z(this.f22868a));
        switch(this.f22868a) {
            case 1: goto L14;
            case 2: goto L13;
            case 3: goto L10;
            case 4: goto L9;
            case 5: goto L14;
            case 6: goto L9;
            default: goto L16;
        };
    L9:
        r02.append(" uri=");
        r02.append(this.f22869b);
        goto L16
    L10:
        r02.append(" len=");
        r02.append(this.f22871e);
        if (this.f22872f == 0) goto L16;
        r02.append(" off=");
        r02.append(this.f22872f);
        goto L16
    L13:
        r02.append(" pkg=");
        r02.append(this.f22876j);
        r02.append(" id=");
        r02.append(String.format("0x%08x", new Object[]{Integer.valueOf(n())}));
        goto L16
    L14:
        r02.append(" size=");
        r02.append(((Bitmap) this.f22869b).getWidth());
        r02.append("x");
        r02.append(((Bitmap) this.f22869b).getHeight());
    L16:
        if (this.f22873g == null) goto L19;
        r02.append(" tint=");
        r02.append(this.f22873g);
    L19:
        if (this.f22874h == f22867k) goto L21;
        r02.append(" mode=");
        r02.append(this.f22874h);
    L21:
        r02.append(")");
        return r02.toString();
    L5:
        return String.valueOf(this.f22869b);
    }

    public void u() {
        this.f22874h = PorterDuff.Mode.valueOf(this.f22875i);
        switch(this.f22868a) {
            case -1: goto L19;
            case 0: goto L27;
            case 1: goto L13;
            case 2: goto L7;
            case 3: goto L5;
            case 4: goto L7;
            case 5: goto L13;
            case 6: goto L7;
            default: goto L27;
        };
    L5:
        this.f22869b = this.f22870c;
        return;
    L7:
        String r02 = new String(this.f22870c, Charset.forName("UTF-16"));
        this.f22869b = r02;
        if (this.f22868a == 2) goto L10;
        return;
    L10:
        if (this.f22876j != null) goto L26;
        this.f22876j = r02.split(":", -1)[0];
        return;
    L26:
        return;
    L13:
        Parcelable r03 = this.d;
        if (r03 == null) goto L17;
        this.f22869b = r03;
        return;
    L17:
        byte[] r04 = this.f22870c;
        this.f22869b = r04;
        this.f22868a = 3;
        this.f22871e = 0;
        this.f22872f = r04.length;
        return;
    L19:
        Parcelable r05 = this.d;
        if (r05 == null) goto L24;
        this.f22869b = r05;
        return;
    L24:
        throw new IllegalArgumentException("Invalid icon");
    }

    public void v(boolean r4) {
        this.f22875i = this.f22874h.name();
        switch(this.f22868a) {
            case -1: goto L16;
            case 0: goto L4;
            case 1: goto L11;
            case 2: goto L9;
            case 3: goto L7;
            case 4: goto L5;
            case 5: goto L11;
            case 6: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        this.f22870c = this.f22869b.toString().getBytes(Charset.forName("UTF-16"));
        return;
    L7:
        this.f22870c = (byte[]) this.f22869b;
        return;
    L9:
        this.f22870c = ((String) this.f22869b).getBytes(Charset.forName("UTF-16"));
        return;
    L11:
        if (r4 == false) goto L14;
        Bitmap r42 = (Bitmap) this.f22869b;
        ByteArrayOutputStream r02 = new ByteArrayOutputStream();
        r42.compress(Bitmap.CompressFormat.PNG, 90, r02);
        this.f22870c = r02.toByteArray();
        return;
    L14:
        this.d = (Parcelable) this.f22869b;
        return;
    L16:
        if (r4 == true) goto L20;
        this.d = (Parcelable) this.f22869b;
        return;
    L20:
        throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
    }

    public Bundle w() {
        Bundle r02 = new Bundle();
        switch(this.f22868a) {
            case -1: goto L9;
            case 0: goto L5;
            case 1: goto L8;
            case 2: goto L7;
            case 3: goto L6;
            case 4: goto L7;
            case 5: goto L8;
            case 6: goto L7;
            default: goto L5;
        };
    L6:
        r02.putByteArray("obj", (byte[]) this.f22869b);
    L10:
        r02.putInt("type", this.f22868a);
        r02.putInt("int1", this.f22871e);
        r02.putInt("int2", this.f22872f);
        r02.putString("string1", this.f22876j);
        ColorStateList r1 = this.f22873g;
        if (r1 == null) goto L13;
        r02.putParcelable("tint_list", r1);
    L13:
        PorterDuff.Mode r12 = this.f22874h;
        if (r12 == f22867k) goto L16;
        r02.putString("tint_mode", r12.name());
    L16:
        return r02;
    L7:
        r02.putString("obj", (String) this.f22869b);
        goto L10
    L8:
        r02.putParcelable("obj", (Bitmap) this.f22869b);
        goto L10
    L9:
        r02.putParcelable("obj", (Parcelable) this.f22869b);
        goto L10
    L5:
        throw new IllegalArgumentException("Invalid icon");
    }

    public Icon x() {
        return y(null);
    }

    public Icon y(Context r1) {
        return a.g(this, r1);
    }

    public IconCompat(int r3) {
        this.f22870c = null;
        this.d = null;
        this.f22871e = 0;
        this.f22872f = 0;
        this.f22873g = null;
        this.f22874h = f22867k;
        this.f22875i = null;
        this.f22868a = r3;
    }
}
