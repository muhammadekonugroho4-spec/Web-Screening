package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.iab.digitalidentity.sdk.core.model.KycHomeConfigsKt;
import java.util.Calendar;

/* loaded from: classes.dex */
public class v {
    public static v d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2568a;

    /* renamed from: b, reason: collision with root package name */
    public final LocationManager f2569b;

    /* renamed from: c, reason: collision with root package name */
    public final a f2570c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2571a;

        /* renamed from: b, reason: collision with root package name */
        public long f2572b;

        public a() {
        }
    }

    public v(Context r2, LocationManager r3) {
        this.f2570c = new a();
        this.f2568a = r2;
        this.f2569b = r3;
    }

    public static v a(Context r2) {
        if (d != null) goto L6;
        Context r22 = r2.getApplicationContext();
        d = new v(r22, (LocationManager) r22.getSystemService(FirebaseAnalytics.Param.LOCATION));
    L6:
        return d;
    }

    public final Location b() {
        Location r1 = null;
        if (androidx.core.content.f.b(this.f2568a, "android.permission.ACCESS_COARSE_LOCATION") != 0) goto L5;
        Location r02 = c("network");
    L7:
        if (androidx.core.content.f.b(this.f2568a, "android.permission.ACCESS_FINE_LOCATION") != 0) goto L9;
        r1 = c(KycHomeConfigsKt.ENTRY_POINT_GPS);
    L9:
        if (r1 == null) goto L15;
        if (r02 == null) goto L15;
        if (r1.getTime() <= r02.getTime()) goto L14;
        return r1;
    L14:
        return r02;
    L15:
        if (r1 == null) goto L17;
        return r1;
    L17:
        return r02;
    L5:
        r02 = null;
        goto L7
    }

    public final Location c(String r3) {
    L6:
        e = move-exception;
        Log.d("TwilightManager", "Failed to get last known location", e);
        return null;
    L3:
        if (this.f2569b.isProviderEnabled(r3) == false) goto L12;
        return this.f2569b.getLastKnownLocation(r3);
    L12:
        return null;
    }

    public boolean d() {
        a r02 = this.f2570c;
        if (e() == true) goto L5;
        Location r1 = b();
        if (r1 == null) goto L10;
        f(r1);
        return r02.f2571a;
    L10:
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int r03 = Calendar.getInstance().get(11);
        if (r03 >= 6) goto L13;
        return true;
    L13:
        if (r03 >= 22) goto L19;
        return false;
    L19:
        return true;
    L5:
        return r02.f2571a;
    }

    public final boolean e() {
        if (this.f2570c.f2572b <= System.currentTimeMillis()) goto L6;
        return true;
    L6:
        return false;
    }

    public final void f(Location r19) {
        a r1 = this.f2570c;
        long r3 = System.currentTimeMillis();
        u r5 = u.b();
        r5.a(r3 - Constants.ONE_DAY_IN_MILLIS, r19.getLatitude(), r19.getLongitude());
        r5.a(r3, r19.getLatitude(), r19.getLongitude());
        boolean r6 = true;
        if (r5.f2567c != 1) goto L5;
    L4:
        boolean r2 = r6;
        long r14 = r5.f2566b;
        long r62 = r5.f2565a;
        r5.a(r3 + Constants.ONE_DAY_IN_MILLIS, r19.getLatitude(), r19.getLongitude());
        long r52 = r5.f2566b;
        if (r14 != (-1)) goto L9;
    L18:
        long r142 = r3 + 43200000;
    L19:
        r1.f2571a = r2;
        r1.f2572b = r142;
        return;
    L9:
        if (r62 == (-1)) goto L18;
        if (r3 <= r62) goto L15;
        r14 = r52;
    L17:
        r142 = r14 + Constants.ONE_MIN_IN_MILLIS;
        goto L19
    L15:
        if (r3 <= r14) goto L17;
        r14 = r62;
        goto L17
    L5:
        r6 = false;
        goto L4
    }
}
