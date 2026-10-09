package ai.advance.common.camera;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class b {
    public static int a(MediaCodecInfo r3, int r4, String r5) {
        MediaCodecInfo.CodecCapabilities r32 = r3.getCapabilitiesForType(r5);
        int r02 = 0;
    L3:
        int[] r1 = r32.colorFormats;
        if (r02 >= r1.length) goto L13;
        int r12 = r1[r02];
        if (r4 == 0) goto L10;
        if (r12 != r4) goto L10;
    L11:
        return r12;
    L10:
        if (r12 == 21) goto L11;
        r02 = r02 + 1;
        goto L3
    L13:
        int r42 = 0;
    L14:
        int[] r03 = r32.colorFormats;
        if (r42 >= r03.length) goto L20;
        int r04 = r03[r42];
        if (d(r04) == true) goto L18;
        r42 = r42 + 1;
        goto L14
    L18:
        return r04;
    L20:
        return 0;
    }

    public static MediaCodecInfo b(String r8) {
        int r02 = MediaCodecList.getCodecCount();
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L14;
        MediaCodecInfo r3 = MediaCodecList.getCodecInfoAt(r2);
        if (r3.isEncoder() == false) goto L13;
        String[] r4 = r3.getSupportedTypes();
        int r5 = r4.length;
        int r6 = 0;
    L8:
        if (r6 >= r5) goto L13;
        if (r4[r6].equalsIgnoreCase(r8) == true) goto L11;
        r6 = r6 + 1;
        goto L8
    L11:
        return r3;
    L13:
        r2 = r2 + 1;
        goto L3
    L14:
        return null;
    }

    public static JSONArray c(MediaCodecInfo r3, String r4) {
        JSONArray r02 = new JSONArray();
        MediaCodecInfo.CodecCapabilities r32 = r3.getCapabilitiesForType(r4);
        int r42 = 0;
    L3:
        int[] r1 = r32.colorFormats;
        if (r42 >= r1.length) goto L6;
        r02.put(r1[r42]);
        r42 = r42 + 1;
        goto L3
    L6:
        return r02;
    }

    public static boolean d(int r02) {
        switch(r02) {
            case 19: goto L5;
            case 20: goto L5;
            case 21: goto L5;
            default: goto L3;
        };
    L3:
        return false;
    L5:
        return true;
    }
}
