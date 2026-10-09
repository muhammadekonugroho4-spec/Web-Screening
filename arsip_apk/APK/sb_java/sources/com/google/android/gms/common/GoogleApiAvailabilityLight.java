package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.t;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public class GoogleApiAvailabilityLight {

    @KeepForSdk
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @KeepForSdk
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0;

    @KeepForSdk
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    @KeepForSdk
    static final String TRACKING_SOURCE_DIALOG = "d";

    @KeepForSdk
    static final String TRACKING_SOURCE_NOTIFICATION = "n";
    private static final GoogleApiAvailabilityLight zza = null;

    static {
        GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        zza = new GoogleApiAvailabilityLight();
    }

    @KeepForSdk
    public GoogleApiAvailabilityLight() {
    }

    @ShowFirstParty
    @KeepForSdk
    public static GoogleApiAvailabilityLight getInstance() {
        return zza;
    }

    @KeepForSdk
    public void cancelAvailabilityErrorNotifications(Context r1) {
        GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(r1);
    }

    @ShowFirstParty
    @KeepForSdk
    public int getApkVersion(Context r1) {
        return GooglePlayServicesUtilLight.getApkVersion(r1);
    }

    @ShowFirstParty
    @KeepForSdk
    public int getClientVersion(Context r1) {
        return GooglePlayServicesUtilLight.getClientVersion(r1);
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public Intent getErrorResolutionIntent(int r2) {
        return getErrorResolutionIntent(null, r2, null);
    }

    @KeepForSdk
    public PendingIntent getErrorResolutionPendingIntent(Context r2, int r3, int r4) {
        return getErrorResolutionPendingIntent(r2, r3, r4, null);
    }

    @KeepForSdk
    public String getErrorString(int r1) {
        return GooglePlayServicesUtilLight.getErrorString(r1);
    }

    @HideFirstParty
    @KeepForSdk
    public int isGooglePlayServicesAvailable(Context r2) {
        return isGooglePlayServicesAvailable(r2, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPlayServicesPossiblyUpdating(Context r1, int r2) {
        return GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(r1, r2);
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPlayStorePossiblyUpdating(Context r1, int r2) {
        return GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(r1, r2);
    }

    @KeepForSdk
    public boolean isUninstalledAppPossiblyUpdating(Context r1, String r2) {
        return GooglePlayServicesUtilLight.zza(r1, r2);
    }

    @KeepForSdk
    public boolean isUserResolvableError(int r1) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(r1);
    }

    @KeepForSdk
    public void verifyGooglePlayServicesIsAvailable(Context r1, int r2) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        GooglePlayServicesUtilLight.ensurePlayServicesAvailable(r1, r2);
    }

    @ShowFirstParty
    @KeepForSdk
    public Intent getErrorResolutionIntent(Context r4, int r5, String r6) {
        if (r5 != 1) goto L5;
    L11:
        if (r4 != null) goto L13;
    L17:
        StringBuilder r52 = new StringBuilder();
        r52.append("gcore_");
        r52.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        r52.append("-");
        if (TextUtils.isEmpty(r6) == true) goto L20;
        r52.append(r6);
    L20:
        r52.append("-");
        if (r4 == null) goto L23;
        r52.append(r4.getPackageName());
    L23:
        r52.append("-");
        if (r4 != null) goto L32;
    L26:
        String r42 = r52.toString();
        int r53 = com.google.android.gms.common.internal.zzu.zza;
        Intent r54 = new Intent("android.intent.action.VIEW");
        Uri.Builder r62 = Uri.parse("market://details").buildUpon().appendQueryParameter(Constants.KEY_ID, "com.google.android.gms");
        if (TextUtils.isEmpty(r42) == true) goto L29;
        r62.appendQueryParameter("pcampaignid", r42);
    L29:
        r54.setData(r62.build());
        r54.setPackage("com.android.vending");
        r54.addFlags(524288);
        return r54;
    L32:
        r52.append(Wrappers.packageManager(r4).getPackageInfo(r4.getPackageName(), 0).versionCode);     // Catch: PackageManager.NameNotFoundException -> L31
        goto L26
    L13:
        if (DeviceProperties.isWearableWithoutPlayStore(r4) == false) goto L17;
        int r43 = com.google.android.gms.common.internal.zzu.zza;
        Intent r44 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        r44.setPackage("com.google.android.wearable.app");
        return r44;
    L5:
        if (r5 == 2) goto L11;
        if (r5 == 3) goto L9;
        return null;
    L9:
        int r45 = com.google.android.gms.common.internal.zzu.zza;
        Uri r46 = Uri.fromParts("package", "com.google.android.gms", null);
        Intent r55 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        r55.setData(r46);
        return r55;
    }

    @ShowFirstParty
    @KeepForSdk
    public PendingIntent getErrorResolutionPendingIntent(Context r2, int r3, int r4, String r5) {
        Intent r32 = getErrorResolutionIntent(r2, r3, r5);
        if (r32 != null) goto L7;
        return null;
    L7:
        return t.b(r2, r4, r32, 134217728, false);
    }

    @KeepForSdk
    public int isGooglePlayServicesAvailable(Context r1, int r2) {
        int r22 = GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(r1, r2);
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(r1, r22) == false) goto L6;
        return 18;
    L6:
        return r22;
    }
}
