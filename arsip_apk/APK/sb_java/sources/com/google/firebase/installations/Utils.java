package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.time.Clock;
import com.google.firebase.installations.time.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class Utils {
    private static final Pattern API_KEY_FORMAT = null;
    private static final String APP_ID_IDENTIFICATION_SUBSTRING = ":";
    public static final long AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS = 0;
    private static Utils singleton;
    private final Clock clock;

    static {
        AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS = TimeUnit.HOURS.toSeconds(1);
        API_KEY_FORMAT = Pattern.compile("\\AA[\\w-]{38}\\z");
    }

    private Utils(Clock r1) {
        this.clock = r1;
    }

    public static Utils getInstance() {
        return getInstance(SystemClock.getInstance());
    }

    public static boolean isValidApiKeyFormat(String r1) {
        return API_KEY_FORMAT.matcher(r1).matches();
    }

    public static boolean isValidAppIdFormat(String r1) {
        return r1.contains(APP_ID_IDENTIFICATION_SUBSTRING);
    }

    public long currentTimeInMillis() {
        return this.clock.currentTimeMillis();
    }

    public long currentTimeInSecs() {
        return TimeUnit.MILLISECONDS.toSeconds(currentTimeInMillis());
    }

    public long getRandomDelayForSyncPrevention() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean isAuthTokenExpired(PersistedInstallationEntry r9) {
        if (TextUtils.isEmpty(r9.getAuthToken()) == false) goto L6;
        return true;
    L6:
        if ((r9.getTokenCreationEpochInSecs() + r9.getExpiresInSecs()) >= (currentTimeInSecs() + AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS)) goto L8;
        return true;
    L8:
        return false;
    }

    public static Utils getInstance(Clock r1) {
        if (singleton != null) goto L6;
        singleton = new Utils(r1);
    L6:
        return singleton;
    }
}
