package androidx.navigation;

import android.content.Intent;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class T {
    public static final C4073k0 a(Intent r3) {
        kotlin.jvm.internal.p.l(r3, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        return new C4073k0(r3.getData(), r3.getAction(), r3.getType());
    }
}
