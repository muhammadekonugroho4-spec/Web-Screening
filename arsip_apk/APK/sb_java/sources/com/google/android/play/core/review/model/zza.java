package com.google.android.play.core.review.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zza {
    private static final Map zza = null;
    private static final Map zzb = null;

    static {
        HashMap r02 = new HashMap();
        zza = r02;
        HashMap r1 = new HashMap();
        zzb = r1;
        r02.put(-1, "The Play Store app is either not installed or not the official version.");
        r02.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        r02.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        r1.put(-1, "PLAY_STORE_NOT_FOUND");
        r1.put(-2, "INVALID_REQUEST");
        r1.put(-100, "INTERNAL_ERROR");
    }

    public static String zza(int r2) {
        Map r02 = zza;
        Integer r22 = Integer.valueOf(r2);
        if (r02.containsKey(r22) == true) goto L7;
        return "";
    L7:
        return ((String) r02.get(r22)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) zzb.get(r22)) + ")";
    }
}
