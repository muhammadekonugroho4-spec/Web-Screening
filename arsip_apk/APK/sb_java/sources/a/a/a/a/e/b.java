package a.a.a.a.e;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import com.midtrans.sdk.corekit.BuildConfig;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Map f1454a;

    static {
        f1454a = new HashMap();
    }

    public static int a(Context r02, float r1) {
        return Math.round(r1 / r02.getResources().getDisplayMetrics().scaledDensity);
    }

    public static Typeface b(Context r5, String r6, String r7) {
        if (r6 == null) goto L4;
        String r02 = new File(r6).getName();
        if (TextUtils.isEmpty(r7) == true) goto L8;
        String r1 = new File(r7).getName();
    L10:
        if (f1454a.containsKey(r02) == true) goto L12;
        AssetManager r3 = r5.getResources().getAssets();     // Catch: Exception -> L37
        if (Arrays.asList(r3.list("")).contains(r6) == false) goto L18;
        Typeface r52 = Typeface.createFromAsset(r5.getAssets(), r02);     // Catch: Exception -> L37
        f1454a.put(r02, r52);     // Catch: Exception -> L37
        return r52;
    L18:
        if (Arrays.asList(r3.list("fonts")).contains(r02) == false) goto L24;
        AssetManager r53 = r5.getAssets();     // Catch: Exception -> L37
        Typeface r54 = Typeface.createFromAsset(r53, String.format("fonts/%s", new Object[]{r02}));     // Catch: Exception -> L37
        f1454a.put(r02, r54);     // Catch: Exception -> L37
        return r54;
    L24:
        if (Arrays.asList(r3.list("iconfonts")).contains(r02) == false) goto L30;
        AssetManager r55 = r5.getAssets();     // Catch: Exception -> L37
        Typeface r56 = Typeface.createFromAsset(r55, String.format("iconfonts/%s", new Object[]{r02}));     // Catch: Exception -> L37
        f1454a.put(r02, r56);     // Catch: Exception -> L37
        return r56;
    L30:
        if (TextUtils.isEmpty(r7) == true) goto L36;
        if (Arrays.asList(r3.list("")).contains(r7) == false) goto L36;
        Typeface r57 = Typeface.createFromAsset(r5.getAssets(), r7);     // Catch: Exception -> L37
        f1454a.put(r1, r57);     // Catch: Exception -> L37
        return r57;
    L36:
        throw new Exception("Font not Found");     // Catch: Exception -> L37
    L37:
        Logger.e(FancyButton.f43388I, String.format("Unable to find %s font. Using Typeface.DEFAULT instead.", new Object[]{r02}));
        Map r58 = f1454a;
        Typeface r62 = Typeface.DEFAULT;
        r58.put(r02, r62);
        return r62;
    L12:
        return (Typeface) f1454a.get(r02);
    L8:
        r1 = "";
        goto L10
    L4:
        return Typeface.DEFAULT;
    }

    public static boolean c(Context r1, String r2) {
        r1.getPackageManager().getApplicationInfo(r2, 0);     // Catch: PackageManager.NameNotFoundException -> L6
        return true;
    L6:
        return false;
    }

    public static int d(Context r02, float r1) {
        return Math.round(r1 * r02.getResources().getDisplayMetrics().scaledDensity);
    }

    public static void e(Context r6, String r7) {
        Intent r02 = new Intent("android.intent.action.VIEW", Uri.parse(BuildConfig.MARKET_URL + r7));
        Iterator<ResolveInfo> r1 = r6.getPackageManager().queryIntentActivities(r02, 0).iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        ResolveInfo r3 = r1.next();
        if (r3.activityInfo.applicationInfo.packageName.equals("com.android.vending") == false) goto L4;
        ActivityInfo r72 = r3.activityInfo;
        ComponentName r12 = new ComponentName(r72.applicationInfo.packageName, r72.name);
        r02.addFlags(268435456);
        r02.addFlags(2097152);
        r02.addFlags(67108864);
        r02.setComponent(r12);
        r6.startActivity(r02);
        return;
    L9:
        r6.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(BuildConfig.PLAY_STORE_URL + r7)));
    }
}
