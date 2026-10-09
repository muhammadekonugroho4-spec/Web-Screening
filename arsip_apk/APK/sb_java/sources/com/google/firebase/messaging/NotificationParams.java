package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes6.dex */
public class NotificationParams {
    private static final int COLOR_TRANSPARENT_IN_HEX = -16777216;
    private static final int EMPTY_JSON_ARRAY_LENGTH = 1;
    private static final String TAG = "NotificationParams";
    private static final int VISIBILITY_MAX = 1;
    private static final int VISIBILITY_MIN = -1;
    private final Bundle data;

    public NotificationParams(Bundle r2) {
        if (r2 == null) goto L7;
        this.data = new Bundle(r2);
        return;
    L7:
        throw new NullPointerException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
    }

    private static int getLightColor(String r1) {
        int r12 = Color.parseColor(r1);
        if (r12 == COLOR_TRANSPARENT_IN_HEX) goto L6;
        return r12;
    L6:
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    private static boolean isAnalyticsKey(String r1) {
        if (r1.startsWith(Constants.AnalyticsKeys.PREFIX) == false) goto L5;
        return true;
    L5:
        if (r1.equals(Constants.MessagePayloadKeys.FROM) == true) goto L11;
        return false;
    L11:
        return true;
    }

    private static boolean isReservedKey(String r1) {
        if (r1.startsWith(Constants.MessagePayloadKeys.RESERVED_CLIENT_LIB_PREFIX) == false) goto L5;
        return true;
    L5:
        if (r1.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX) == false) goto L7;
        return true;
    L7:
        if (r1.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX_OLD) == true) goto L14;
        return false;
    L14:
        return true;
    }

    private static String keyWithOldPrefix(String r2) {
        if (r2.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX) == true) goto L6;
        return r2;
    L6:
        return r2.replace(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX, Constants.MessageNotificationKeys.NOTIFICATION_PREFIX_OLD);
    }

    private String normalizePrefix(String r3) {
        if (this.data.containsKey(r3) == false) goto L5;
    L9:
        return r3;
    L5:
        if (r3.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX) == false) goto L9;
        String r02 = keyWithOldPrefix(r3);
        if (this.data.containsKey(r02) == false) goto L9;
        return r02;
    }

    private static String userFriendlyKey(String r1) {
        if (r1.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX) == true) goto L5;
        return r1;
    L5:
        return r1.substring(6);
    }

    public boolean getBoolean(String r2) {
        String r22 = getString(r2);
        if (GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A.equals(r22) == false) goto L5;
        return true;
    L5:
        if (Boolean.parseBoolean(r22) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public Integer getInteger(String r4) {
        String r02 = getString(r4);
        if (TextUtils.isEmpty(r02) == true) goto L11;
        return Integer.valueOf(Integer.parseInt(r02));
    L6:
        Log.w(TAG, "Couldn't parse value of " + userFriendlyKey(r4) + "(" + r02 + ") into an int");
        return null;
    L11:
        return null;
    }

    public JSONArray getJSONArray(String r4) {
        String r02 = getString(r4);
        if (TextUtils.isEmpty(r02) == true) goto L11;
        return new JSONArray(r02);
    L6:
        Log.w(TAG, "Malformed JSON for key " + userFriendlyKey(r4) + ": " + r02 + ", falling back to default");
        return null;
    L11:
        return null;
    }

    public int[] getLightSettings() {
        JSONArray r3 = getJSONArray(Constants.MessageNotificationKeys.LIGHT_SETTINGS);
        if (r3 != null) goto L5;
        return null;
    L5:
        int[] r6 = new int[3];
    L10:
        e = move-exception;
        Log.w(TAG, "LightSettings is invalid: " + r3 + ". " + e.getMessage() + ". Skipping setting LightSettings");
    L16:
        return null;
    L15:
        Log.w(TAG, "LightSettings is invalid: " + r3 + ". Skipping setting LightSettings");
        goto L16
    L7:
        if (r3.length() != 3) goto L13;
        r6[0] = getLightColor(r3.optString(0));     // Catch: IllegalArgumentException -> L10 JSONException -> L15
        r6[1] = r3.optInt(1);     // Catch: IllegalArgumentException -> L10 JSONException -> L15
        r6[2] = r3.optInt(2);     // Catch: IllegalArgumentException -> L10 JSONException -> L15
        return r6;
    L13:
        throw new JSONException("lightSettings don't have all three fields");     // Catch: IllegalArgumentException -> L10 JSONException -> L15
    }

    public Uri getLink() {
        String r02 = getString(Constants.MessageNotificationKeys.LINK_ANDROID);
        if (TextUtils.isEmpty(r02) == false) goto L6;
        r02 = getString(Constants.MessageNotificationKeys.LINK);
    L6:
        if (TextUtils.isEmpty(r02) == false) goto L8;
        return null;
    L8:
        return Uri.parse(r02);
    }

    public Object[] getLocalizationArgsForKey(String r5) {
        JSONArray r52 = getJSONArray(r5 + Constants.MessageNotificationKeys.TEXT_ARGS_SUFFIX);
        if (r52 != null) goto L6;
        return null;
    L6:
        int r02 = r52.length();
        String[] r1 = new String[r02];
        int r2 = 0;
    L7:
        if (r2 >= r02) goto L9;
        r1[r2] = r52.optString(r2);
        r2 = r2 + 1;
        goto L7
    L9:
        return r1;
    }

    public String getLocalizationResourceForKey(String r2) {
        return getString(r2 + Constants.MessageNotificationKeys.TEXT_RESOURCE_SUFFIX);
    }

    public String getLocalizedString(Resources r6, String r7, String r8) {
        String r02 = getLocalizationResourceForKey(r8);
        if (TextUtils.isEmpty(r02) == false) goto L5;
        return null;
    L5:
        int r72 = r6.getIdentifier(r02, "string", r7);
        if (r72 != 0) goto L9;
        Log.w(TAG, userFriendlyKey(r8 + Constants.MessageNotificationKeys.TEXT_RESOURCE_SUFFIX) + " resource not found: " + r8 + " Default value will be used.");
        return null;
    L9:
        Object[] r3 = getLocalizationArgsForKey(r8);
        if (r3 == null) goto L12;
        return r6.getString(r72, r3);
    L15:
        e = move-exception;
        Log.w(TAG, "Missing format argument for " + userFriendlyKey(r8) + ": " + Arrays.toString(r3) + " Default value will be used.", e);
        return null;
    L12:
        return r6.getString(r72);
    }

    public Long getLong(String r4) {
        String r02 = getString(r4);
        if (TextUtils.isEmpty(r02) == true) goto L11;
        return Long.valueOf(Long.parseLong(r02));
    L6:
        Log.w(TAG, "Couldn't parse value of " + userFriendlyKey(r4) + "(" + r02 + ") into a long");
        return null;
    L11:
        return null;
    }

    public String getNotificationChannelId() {
        return getString(Constants.MessageNotificationKeys.CHANNEL);
    }

    public Integer getNotificationCount() {
        Integer r02 = getInteger(Constants.MessageNotificationKeys.NOTIFICATION_COUNT);
        if (r02 != null) goto L6;
        return null;
    L6:
        if (r02.intValue() >= 0) goto L9;
        Log.w(Constants.TAG, "notificationCount is invalid: " + r02 + ". Skipping setting notificationCount.");
        return null;
    L9:
        return r02;
    }

    public Integer getNotificationPriority() {
        Integer r02 = getInteger(Constants.MessageNotificationKeys.NOTIFICATION_PRIORITY);
        if (r02 != null) goto L6;
        return null;
    L6:
        if (r02.intValue() >= (-2)) goto L8;
    L11:
        Log.w(Constants.TAG, "notificationPriority is invalid " + r02 + ". Skipping setting notificationPriority.");
        return null;
    L8:
        if (r02.intValue() > 2) goto L11;
        return r02;
    }

    public String getPossiblyLocalizedString(Resources r3, String r4, String r5) {
        String r02 = getString(r5);
        if (TextUtils.isEmpty(r02) == true) goto L6;
        return r02;
    L6:
        return getLocalizedString(r3, r4, r5);
    }

    public String getSoundResourceName() {
        String r02 = getString(Constants.MessageNotificationKeys.SOUND_2);
        if (TextUtils.isEmpty(r02) == true) goto L5;
        return r02;
    L5:
        return getString(Constants.MessageNotificationKeys.SOUND);
    }

    public String getString(String r2) {
        return this.data.getString(normalizePrefix(r2));
    }

    public long[] getVibrateTimings() {
        JSONArray r02 = getJSONArray(Constants.MessageNotificationKeys.VIBRATE_TIMINGS);
        if (r02 != null) goto L15;
        return null;
    L15:
    L13:
        Log.w(TAG, "User defined vibrateTimings is invalid: " + r02 + ". Skipping setting vibrateTimings.");
        return null;
    L6:
        if (r02.length() <= 1) goto L12;
        int r2 = r02.length();     // Catch: Throwable -> L13
        long[] r3 = new long[r2];     // Catch: Throwable -> L13
        int r4 = 0;
    L8:
        if (r4 >= r2) goto L10;
        r3[r4] = r02.optLong(r4);     // Catch: Throwable -> L13
        r4 = r4 + 1;     // Catch: Throwable -> L13
        goto L8
    L10:
        return r3;
    L12:
        throw new JSONException("vibrateTimings have invalid length");     // Catch: Throwable -> L13
    }

    public Integer getVisibility() {
        Integer r02 = getInteger(Constants.MessageNotificationKeys.VISIBILITY);
        if (r02 != null) goto L6;
        return null;
    L6:
        if (r02.intValue() >= (-1)) goto L8;
    L11:
        Log.w(TAG, "visibility is invalid: " + r02 + ". Skipping setting visibility.");
        return null;
    L8:
        if (r02.intValue() > 1) goto L11;
        return r02;
    }

    public boolean hasImage() {
        return !TextUtils.isEmpty(getString(Constants.MessageNotificationKeys.IMAGE_URL));
    }

    public boolean isNotification() {
        return getBoolean(Constants.MessageNotificationKeys.ENABLE_NOTIFICATION);
    }

    public Bundle paramsForAnalyticsIntent() {
        Bundle r02 = new Bundle(this.data);
        Iterator<String> r1 = this.data.keySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        String r2 = r1.next();
        if (isAnalyticsKey(r2) == true) goto L4;
        r02.remove(r2);
        goto L4
    L8:
        return r02;
    }

    public Bundle paramsWithReservedKeysRemoved() {
        Bundle r02 = new Bundle(this.data);
        Iterator<String> r1 = this.data.keySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        String r2 = r1.next();
        if (isReservedKey(r2) == false) goto L4;
        r02.remove(r2);
        goto L4
    L8:
        return r02;
    }

    public static boolean isNotification(Bundle r3) {
        if (GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A.equals(r3.getString(Constants.MessageNotificationKeys.ENABLE_NOTIFICATION)) == false) goto L5;
        return true;
    L5:
        if (GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A.equals(r3.getString(keyWithOldPrefix(Constants.MessageNotificationKeys.ENABLE_NOTIFICATION))) == true) goto L11;
        return false;
    L11:
        return true;
    }
}
