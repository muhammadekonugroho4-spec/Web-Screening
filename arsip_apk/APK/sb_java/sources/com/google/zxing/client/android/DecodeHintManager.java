package com.google.zxing.client.android;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.google.zxing.DecodeHintType;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class DecodeHintManager {
    private static final Pattern COMMA = null;
    private static final String TAG = "DecodeHintManager";

    static {
        COMMA = Pattern.compile(Constants.SEPARATOR_COMMA);
    }

    private DecodeHintManager() {
    }

    public static Map<DecodeHintType, ?> parseDecodeHints(Uri r12) {
        String r122 = r12.getEncodedQuery();
        if (r122 != null) goto L5;
    L61:
        return null;
    L5:
        if (r122.isEmpty() == true) goto L61;
        Map<String, String> r123 = splitQuery(r122);
        EnumMap r1 = new EnumMap(DecodeHintType.class);
        DecodeHintType[] r2 = DecodeHintType.values();
        int r3 = r2.length;
        int r5 = 0;
    L8:
        if (r5 >= r3) goto L59;
        DecodeHintType r6 = r2[r5];
        if (r6 == DecodeHintType.CHARACTER_SET) goto L58;
        if (r6 == DecodeHintType.NEED_RESULT_POINT_CALLBACK) goto L58;
        if (r6 == DecodeHintType.POSSIBLE_FORMATS) goto L58;
        String r7 = r123.get(r6.name());
        if (r7 == null) goto L58;
        if (r6.getValueType().equals(Object.class) == false) goto L23;
        r1.put(r6, r7);
        goto L58
    L23:
        if (r6.getValueType().equals(Void.class) == false) goto L26;
        r1.put(r6, Boolean.TRUE);
        goto L58
    L26:
        if (r6.getValueType().equals(String.class) == false) goto L29;
        r1.put(r6, r7);
        goto L58
    L29:
        if (r6.getValueType().equals(Boolean.class) == false) goto L43;
        if (r7.isEmpty() == false) goto L34;
        r1.put(r6, Boolean.TRUE);
        goto L58
    L34:
        if ("0".equals(r7) == false) goto L36;
    L41:
        r1.put(r6, Boolean.FALSE);
        goto L58
    L36:
        if ("false".equalsIgnoreCase(r7) == true) goto L41;
        if ("no".equalsIgnoreCase(r7) == true) goto L41;
        r1.put(r6, Boolean.TRUE);
        goto L58
    L43:
        if (r6.getValueType().equals(int[].class) == true) goto L45;
        Log.w(TAG, "Unsupported hint type '" + r6 + "' of type " + r6.getValueType());
        goto L58
    L45:
        if (r7.isEmpty() == false) goto L47;
    L49:
        String[] r72 = COMMA.split(r7);
        int[] r8 = new int[r72.length];
        int r9 = 0;
    L51:
        if (r9 >= r72.length) goto L55;
        r8[r9] = Integer.parseInt(r72[r9]);     // Catch: NumberFormatException -> L54
        r9 = r9 + 1;
    L54:
        Log.w(TAG, "Skipping array of integers hint " + r6 + " due to invalid numeric value: '" + r72[r9] + '\'');
        r8 = null;
    L55:
        if (r8 == null) goto L58;
        r1.put(r6, r8);
        goto L58
    L47:
        if (r7.charAt(r7.length() - 1) != ',') goto L49;
        r7 = r7.substring(0, r7.length() - 1);
    L58:
        r5 = r5 + 1;
        goto L8
    L59:
        Log.i(TAG, "Hints from the URI: " + r1);
        return r1;
    }

    private static Map<String, String> splitQuery(String r7) {
        HashMap r02 = new HashMap();
        int r1 = 0;
    L4:
        if (r1 >= r7.length()) goto L27;
        if (r7.charAt(r1) == '&') goto L7;
        int r2 = r7.indexOf(38, r1);
        int r3 = r7.indexOf(61, r1);
        String r4 = "";
        if (r2 < 0) goto L10;
        if (r3 < 0) goto L24;
        if (r3 > r2) goto L24;
        String r12 = Uri.decode(r7.substring(r1, r3).replace('+', ' '));
        String r32 = Uri.decode(r7.substring(r3 + 1, r2).replace('+', ' '));
        if (r02.containsKey(r12) == true) goto L23;
        r02.put(r12, r32);
    L23:
        r1 = r2 + 1;
    L24:
        String r13 = Uri.decode(r7.substring(r1, r2).replace('+', ' '));
        if (r02.containsKey(r13) == true) goto L23;
        r02.put(r13, "");
        goto L23
    L10:
        if (r3 >= 0) goto L12;
        String r72 = Uri.decode(r7.substring(r1).replace('+', ' '));
    L14:
        if (r02.containsKey(r72) == true) goto L27;
        r02.put(r72, r4);
        return r02;
    L12:
        String r14 = Uri.decode(r7.substring(r1, r3).replace('+', ' '));
        r4 = Uri.decode(r7.substring(r3 + 1).replace('+', ' '));
        r72 = r14;
        goto L14
    L7:
        r1 = r1 + 1;
    L27:
        return r02;
    }

    public static Map<DecodeHintType, Object> parseDecodeHints(Intent r9) {
        Bundle r92 = r9.getExtras();
        if (r92 != null) goto L5;
        return null;
    L5:
        if (r92.isEmpty() == true) goto L38;
        EnumMap r02 = new EnumMap(DecodeHintType.class);
        DecodeHintType[] r1 = DecodeHintType.values();
        int r2 = r1.length;
        int r3 = 0;
    L8:
        if (r3 >= r2) goto L26;
        DecodeHintType r4 = r1[r3];
        if (r4 == DecodeHintType.CHARACTER_SET) goto L25;
        if (r4 == DecodeHintType.NEED_RESULT_POINT_CALLBACK) goto L25;
        if (r4 == DecodeHintType.POSSIBLE_FORMATS) goto L25;
        String r5 = r4.name();
        if (r92.containsKey(r5) == false) goto L25;
        if (r4.getValueType().equals(Void.class) == false) goto L21;
        r02.put(r4, Boolean.TRUE);
        goto L25
    L21:
        Object r52 = r92.get(r5);
        if (r4.getValueType().isInstance(r52) == false) goto L24;
        r02.put(r4, r52);
        goto L25
    L24:
        Log.w(TAG, "Ignoring hint " + r4 + " because it is not assignable from " + r52);
    L25:
        r3 = r3 + 1;
        goto L8
    L26:
        Log.i(TAG, "Hints from the Intent: " + r02);
        return r02;
    L38:
        return null;
    }
}
