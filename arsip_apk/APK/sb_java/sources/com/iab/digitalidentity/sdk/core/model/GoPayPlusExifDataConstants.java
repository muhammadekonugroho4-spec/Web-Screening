package com.iab.digitalidentity.sdk.core.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/GoPayPlusExifDataConstants;", "", "()V", "EXIF_VALUE_SEPARATOR", "", "ImageQuality", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GoPayPlusExifDataConstants {
    public static final String EXIF_VALUE_SEPARATOR = "|";
    public static final GoPayPlusExifDataConstants INSTANCE = null;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/GoPayPlusExifDataConstants$ImageQuality;", "", "()V", "KEY_IS_BEST_FRAME", "", "KEY_OVERALL_SIGNAL_CHECK", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ImageQuality {
        public static final ImageQuality INSTANCE = null;
        public static final String KEY_IS_BEST_FRAME = "isBestFrame:";
        public static final String KEY_OVERALL_SIGNAL_CHECK = "DIS:";

        static {
            INSTANCE = new ImageQuality();
        }

        private ImageQuality() {
        }
    }

    static {
        INSTANCE = new GoPayPlusExifDataConstants();
    }

    private GoPayPlusExifDataConstants() {
    }
}
