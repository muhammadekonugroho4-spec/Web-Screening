package C;

import android.content.Context;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public abstract class d {
    public static final String a(Context r1) {
        p.l(r1, "context");
        return r1.getFilesDir().getPath() + "/KYCModels/";
    }

    public static final String b(Context r1) {
        p.l(r1, "context");
        return r1.getFilesDir().getPath() + "/KYCModels/release/ojo-sdk-models";
    }

    public static final String c(Context r1) {
        p.l(r1, "context");
        return r1.getFilesDir().getPath() + "/KYCAurora/kyc_aurora/";
    }

    public static final String d(Context r1) {
        p.l(r1, "context");
        return r1.getFilesDir().getPath() + "/KYCImages/";
    }

    public static final String e(Context r1) {
        p.l(r1, "context");
        return r1.getFilesDir().getPath() + "/KYCFrames/kyc_frames/";
    }

    public static final String f(Context r1) {
        p.l(r1, "context");
        return r1.getFilesDir().getPath() + "/KYCLogs/kyc_logs/";
    }
}
