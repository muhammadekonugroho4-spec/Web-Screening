package com.google.android.gms.location;

import com.google.android.gms.common.api.CommonStatusCodes;

/* loaded from: classes5.dex */
public final class GeofenceStatusCodes extends CommonStatusCodes {
    public static final int GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION = 1004;
    public static final int GEOFENCE_NOT_AVAILABLE = 1000;
    public static final int GEOFENCE_REQUEST_TOO_FREQUENT = 1005;
    public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
    public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;

    private GeofenceStatusCodes() {
    }

    public static String getStatusCodeString(int r02) {
        switch(r02) {
            case 1000: goto L11;
            case 1001: goto L9;
            case 1002: goto L7;
            case 1003: goto L4;
            case 1004: goto L5;
            default: goto L4;
        };
    L5:
        return "GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION";
    L7:
        return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
    L9:
        return "GEOFENCE_TOO_MANY_GEOFENCES";
    L11:
        return "GEOFENCE_NOT_AVAILABLE";
    L4:
        return CommonStatusCodes.getStatusCodeString(r02);
    }
}
