package com.huawei.hms.security;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.api.HuaweiServicesNotAvailableException;
import com.huawei.hms.api.HuaweiServicesRepairableException;

/* loaded from: classes6.dex */
public class SecComponentInstallWizard {
    public static final String PROVIDER_NAME = "HmsCore_OpenSSL";

    public interface SecComponentInstallWizardListener {
        void onFailed(int r1, Intent r2);

        void onSuccess();
    }

    public SecComponentInstallWizard() {
    }

    public static void install(Context r02) throws HuaweiServicesNotAvailableException, HuaweiServicesRepairableException {
    }
}
