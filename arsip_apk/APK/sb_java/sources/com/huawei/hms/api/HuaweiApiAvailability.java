package com.huawei.hms.api;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.huawei.hmf.tasks.b;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.api.HuaweiApiCallable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class HuaweiApiAvailability {
    public static final String ACTIVITY_NAME = "com.huawei.hms.core.activity.JumpActivity";
    private static final Map<String, Integer> API_MAP = null;
    public static final String APPID_HMS = "C10132067";
    public static final String APPID_HMS_TV = "C100636709";
    public static final String HMS_API_NAME_GAME = "HuaweiGame.API";
    public static final String HMS_API_NAME_IAP = "HuaweiIap.API";
    public static final String HMS_API_NAME_ID = "HuaweiID.API";
    public static final String HMS_API_NAME_OD = "HuaweiOpenDevice.API";
    public static final String HMS_API_NAME_PAY = "HuaweiPay.API";
    public static final String HMS_API_NAME_PPS = "HuaweiPPSkit.API";
    public static final String HMS_API_NAME_PUSH = "HuaweiPush.API";
    public static final String HMS_API_NAME_SNS = "HuaweiSns.API";
    public static final int HMS_JSON_VERSION_MIN = 30000000;
    public static final int HMS_SDK_VERSION_CODE = 60700300;
    public static final String HMS_SDK_VERSION_NAME = "6.7.0.300";
    public static final int HMS_VERSION_CODE_GAME = 20503000;
    public static final int HMS_VERSION_CODE_IAP = 20700300;
    public static final int HMS_VERSION_CODE_ID = 30000000;
    public static final int HMS_VERSION_CODE_KIT_UPDATE = 40000000;
    public static final int HMS_VERSION_CODE_MIN = 20503000;
    public static final int HMS_VERSION_CODE_OD = 20601000;
    public static final int HMS_VERSION_CODE_PAY = 20503000;
    public static final int HMS_VERSION_CODE_PPS = 20700300;
    public static final int HMS_VERSION_CODE_PUSH = 20503000;
    public static final int HMS_VERSION_CODE_SNS = 20503000;
    public static final int HMS_VERSION_MAX = 20600000;
    public static final int HMS_VERSION_MIN = 20503000;
    public static final int NOTICE_VERSION_CODE = 20600000;
    public static final String SERVICES_ACTION = "com.huawei.hms.core.aidlservice";

    @Deprecated
    public static final String SERVICES_PACKAGE = "com.huawei.hwid";

    @Deprecated
    public static final String SERVICES_PACKAGE_TV = "com.huawei.hwid.tv";

    @Deprecated
    public static final String SERVICES_SIGNATURE = "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05";

    @Deprecated
    public static final String SERVICES_SIGNATURE_CAR = "3517262215D8D3008CBF888750B6418EDC4D562AC33ED6874E0D73ABA667BC3C";

    @Deprecated
    public static final String SERVICES_SIGNATURE_TV = "3517262215D8D3008CBF888750B6418EDC4D562AC33ED6874E0D73ABA667BC3C";
    public static int SERVICES_VERSION_CODE = 30000100;

    static {
        HashMap r02 = new HashMap();
        API_MAP = r02;
        r02.put(HMS_API_NAME_ID, 30000000);
        r02.put(HMS_API_NAME_SNS, 20503000);
        r02.put(HMS_API_NAME_PAY, 20503000);
        r02.put(HMS_API_NAME_PUSH, 20503000);
        r02.put(HMS_API_NAME_GAME, 20503000);
        r02.put(HMS_API_NAME_OD, Integer.valueOf(HMS_VERSION_CODE_OD));
        r02.put(HMS_API_NAME_IAP, 20700300);
        r02.put(HMS_API_NAME_PPS, 20700300);
    }

    public HuaweiApiAvailability() {
    }

    public static Map<String, Integer> getApiMap() {
        return API_MAP;
    }

    public static HuaweiApiAvailability getInstance() {
        return HuaweiApiAvailabilityImpl.getInstance();
    }

    public static int getServicesVersionCode() {
        return SERVICES_VERSION_CODE;
    }

    public static void setServicesVersionCode(int r02) {
        SERVICES_VERSION_CODE = r02;
    }

    public abstract b checkApiAccessible(HuaweiApi<?> r1, HuaweiApi<?>... r2);

    public abstract b checkApiAccessible(HuaweiApiCallable r1, HuaweiApiCallable... r2);

    public abstract PendingIntent getErrPendingIntent(Context r1, int r2, int r3);

    public abstract PendingIntent getErrPendingIntent(Context r1, ConnectionResult r2);

    public abstract Dialog getErrorDialog(Activity r1, int r2, int r3);

    public abstract Dialog getErrorDialog(Activity r1, int r2, int r3, DialogInterface.OnCancelListener r4);

    public abstract String getErrorString(int r1);

    public abstract b getHuaweiServicesReady(Activity r1);

    public abstract Intent getResolveErrorIntent(Activity r1, int r2);

    public abstract PendingIntent getResolveErrorPendingIntent(Activity r1, int r2);

    public abstract int isHuaweiMobileNoticeAvailable(Context r1);

    public abstract int isHuaweiMobileServicesAvailable(Context r1);

    public abstract int isHuaweiMobileServicesAvailable(Context r1, int r2);

    public abstract boolean isUserResolvableError(int r1);

    public abstract boolean isUserResolvableError(int r1, PendingIntent r2);

    public abstract void popupErrNotification(Context r1, ConnectionResult r2);

    public abstract void resolveError(Activity r1, int r2, int r3);

    public abstract void resolveError(Activity r1, int r2, int r3, PendingIntent r4);

    public abstract boolean showErrorDialogFragment(Activity r1, int r2, int r3);

    public abstract boolean showErrorDialogFragment(Activity r1, int r2, int r3, DialogInterface.OnCancelListener r4);

    public abstract boolean showErrorDialogFragment(Activity r1, int r2, Fragment r3, int r4, DialogInterface.OnCancelListener r5);

    public abstract void showErrorNotification(Context r1, int r2);
}
