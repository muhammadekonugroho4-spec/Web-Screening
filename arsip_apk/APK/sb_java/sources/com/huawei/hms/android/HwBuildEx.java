package com.huawei.hms.android;

import android.util.Log;

/* loaded from: classes6.dex */
public class HwBuildEx {

    public static class VERSION {
        public static final int EMUI_SDK_INT = 0;

        static {
            EMUI_SDK_INT = HwBuildEx.getSystemPropertiesInt("ro.build.hw_emui_api_level", 0);
        }

        public VERSION() {
        }
    }

    public static class VersionCodes {
        public static final int CUR_DEVELOPMENT = 10000;
        public static final int EMUI_10_0 = 21;
        public static final int EMUI_1_0 = 1;
        public static final int EMUI_1_5 = 2;
        public static final int EMUI_1_6 = 3;
        public static final int EMUI_2_0_JB = 4;
        public static final int EMUI_2_0_KK = 5;
        public static final int EMUI_2_3 = 6;
        public static final int EMUI_3_0 = 7;
        public static final int EMUI_3_0_5 = 8;
        public static final int EMUI_3_1 = 8;
        public static final int EMUI_4_0 = 9;
        public static final int EMUI_4_1 = 10;
        public static final int EMUI_5_0 = 11;
        public static final int EMUI_5_1 = 12;
        public static final int EMUI_5_1_b10x = 13;
        public static final int EMUI_5_1_b200 = 13;
        public static final int EMUI_6_0 = 14;
        public static final int EMUI_9_0 = 17;
        public static final int UNKNOWN_EMUI = 0;

        public VersionCodes() {
        }
    }

    public HwBuildEx() {
    }

    public static int getSystemPropertiesInt(String r4, int r5) {
        Class<?> r02 = Class.forName("android.os.SystemProperties");     // Catch: Throwable -> L7
        return ((Integer) r02.getDeclaredMethod("getInt", new Class[]{String.class, Integer.TYPE}).invoke(r02, new Object[]{r4, Integer.valueOf(r5)})).intValue();
    L7:
        Log.e("HwBuildEx", "An exception occurred while reading: EMUI_SDK_INT");
        return r5;
    }
}
