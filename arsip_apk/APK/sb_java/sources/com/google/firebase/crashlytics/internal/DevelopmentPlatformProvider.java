package com.google.firebase.crashlytics.internal;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class DevelopmentPlatformProvider {
    private static final String FLUTTER_ASSET_FILE = "flutter_assets/NOTICES.Z";
    private static final String FLUTTER_PLATFORM = "Flutter";
    private static final String UNITY_PLATFORM = "Unity";
    private static final String UNITY_VERSION_FIELD = "com.google.firebase.crashlytics.unity_version";
    private final Context context;
    private DevelopmentPlatform developmentPlatform;

    /* renamed from: com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public class DevelopmentPlatform {
        private final String developmentPlatform;
        private final String developmentPlatformVersion;
        final /* synthetic */ DevelopmentPlatformProvider this$0;

        public /* synthetic */ DevelopmentPlatform(DevelopmentPlatformProvider r1, AnonymousClass1 r2) {
            this(r1);
        }

        public static /* synthetic */ String access$000(DevelopmentPlatform r02) {
            return r02.developmentPlatform;
        }

        public static /* synthetic */ String access$100(DevelopmentPlatform r02) {
            return r02.developmentPlatformVersion;
        }

        private DevelopmentPlatform(DevelopmentPlatformProvider r4) {
            this.this$0 = r4;
            int r02 = CommonUtils.getResourcesIdentifier(DevelopmentPlatformProvider.access$300(r4), DevelopmentPlatformProvider.UNITY_VERSION_FIELD, "string");
            if (r02 == 0) goto L7;
            this.developmentPlatform = DevelopmentPlatformProvider.UNITY_PLATFORM;
            String r42 = DevelopmentPlatformProvider.access$300(r4).getResources().getString(r02);
            this.developmentPlatformVersion = r42;
            Logger.getLogger().v("Unity Editor version is: " + r42);
            return;
        L7:
            if (DevelopmentPlatformProvider.access$400(r4, DevelopmentPlatformProvider.FLUTTER_ASSET_FILE) == false) goto L10;
            this.developmentPlatform = DevelopmentPlatformProvider.FLUTTER_PLATFORM;
            this.developmentPlatformVersion = null;
            Logger.getLogger().v("Development platform is: Flutter");
            return;
        L10:
            this.developmentPlatform = null;
            this.developmentPlatformVersion = null;
        }
    }

    public DevelopmentPlatformProvider(Context r1) {
        this.context = r1;
        this.developmentPlatform = null;
    }

    public static /* synthetic */ Context access$300(DevelopmentPlatformProvider r02) {
        return r02.context;
    }

    public static /* synthetic */ boolean access$400(DevelopmentPlatformProvider r02, String r1) {
        return r02.assetFileExists(r1);
    }

    private boolean assetFileExists(String r3) {
        if (this.context.getAssets() != null) goto L10;
        return false;
    L10:
        InputStream r32 = this.context.getAssets().open(r3);     // Catch: IOException -> L9
        if (r32 == null) goto L8;
        r32.close();     // Catch: IOException -> L9
    L8:
        return true;
    L9:
        return false;
    }

    private DevelopmentPlatform initDevelopmentPlatform() {
        if (this.developmentPlatform != null) goto L6;
        this.developmentPlatform = new DevelopmentPlatform(this, null);
    L6:
        return this.developmentPlatform;
    }

    public static boolean isUnity(Context r2) {
        if (CommonUtils.getResourcesIdentifier(r2, UNITY_VERSION_FIELD, "string") == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public String getDevelopmentPlatform() {
        return DevelopmentPlatform.access$000(initDevelopmentPlatform());
    }

    public String getDevelopmentPlatformVersion() {
        return DevelopmentPlatform.access$100(initDevelopmentPlatform());
    }
}
