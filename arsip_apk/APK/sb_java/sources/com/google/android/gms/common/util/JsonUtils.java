package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@KeepForSdk
/* loaded from: classes5.dex */
public final class JsonUtils {
    private static final Pattern zza = null;
    private static final Pattern zzb = null;

    static {
        zza = Pattern.compile("\\\\.");
        zzb = Pattern.compile("[\\\\\"/\b\f\n\r\t]");
    }

    private JsonUtils() {
    }

    @KeepForSdk
    public static boolean areJsonValuesEquivalent(Object r5, Object r6) {
        if (r5 != null) goto L8;
        if (r6 != null) goto L8;
        return true;
    L8:
        if (r5 == null) goto L44;
        if (r6 == null) goto L44;
        if ((r5 instanceof JSONObject) == false) goto L28;
        if ((r6 instanceof JSONObject) == false) goto L28;
        JSONObject r52 = (JSONObject) r5;
        JSONObject r62 = (JSONObject) r6;
        if (r52.length() == r62.length()) goto L18;
        return false;
    L18:
        Iterator<String> r2 = r52.keys();
    L20:
        if (r2.hasNext() == false) goto L26;
        String r3 = r2.next();
        if (r62.has(r3) == false) goto L25;
        Preconditions.checkNotNull(r3);     // Catch: JSONException -> L45
        if (areJsonValuesEquivalent(r52.get(r3), r62.get(r3)) == true) goto L20;
    L25:
        return false;
    L26:
        return true;
    L28:
        if ((r5 instanceof JSONArray) == false) goto L43;
        if ((r6 instanceof JSONArray) == false) goto L43;
        JSONArray r53 = (JSONArray) r5;
        JSONArray r63 = (JSONArray) r6;
        if (r53.length() != r63.length()) goto L41;
        int r22 = 0;
    L35:
        if (r22 >= r53.length()) goto L40;
        if (areJsonValuesEquivalent(r53.get(r22), r63.get(r22)) == false) goto L39;
        r22 = r22 + 1;
    L39:
        return false;
    L40:
        return true;
    L41:
        return false;
    L43:
        return r5.equals(r6);
    L44:
        return false;
    }

    @KeepForSdk
    public static String escapeString(String r4) {
        if (TextUtils.isEmpty(r4) == true) goto L57;
        Matcher r02 = zzb.matcher(r4);
        StringBuffer r1 = null;
    L6:
        if (r02.find() == false) goto L29;
        if (r1 != null) goto L9;
        r1 = new StringBuffer();
    L9:
        char r2 = r02.group().charAt(0);
        if (r2 != '\f') goto L12;
        r02.appendReplacement(r1, "\\\\f");
        goto L6
    L12:
        if (r2 != '\r') goto L14;
        r02.appendReplacement(r1, "\\\\r");
        goto L6
    L14:
        if (r2 != '\"') goto L16;
        r02.appendReplacement(r1, "\\\\\\\"");
        goto L6
    L16:
        if (r2 != '/') goto L18;
        r02.appendReplacement(r1, "\\\\/");
        goto L6
    L18:
        if (r2 != '\\') goto L19;
        r02.appendReplacement(r1, "\\\\\\\\");
        goto L6
    L19:
        switch(r2) {
            case 8: goto L23;
            case 9: goto L22;
            case 10: goto L21;
            default: goto L6;
        };
    L21:
        r02.appendReplacement(r1, "\\\\n");
        goto L6
    L22:
        r02.appendReplacement(r1, "\\\\t");
        goto L6
    L23:
        r02.appendReplacement(r1, "\\\\b");
        goto L6
    L29:
        if (r1 == null) goto L58;
        r02.appendTail(r1);
        return r1.toString();
    L58:
        return r4;
    L57:
        return r4;
    }

    @KeepForSdk
    public static String unescapeString(String r4) {
        if (TextUtils.isEmpty(r4) == true) goto L64;
        String r42 = zze.zza(r4);
        Matcher r02 = zza.matcher(r42);
        StringBuffer r1 = null;
    L6:
        if (r02.find() == false) goto L35;
        if (r1 != null) goto L9;
        r1 = new StringBuffer();
    L9:
        char r2 = r02.group().charAt(1);
        if (r2 != '\"') goto L12;
        r02.appendReplacement(r1, "\"");
        goto L6
    L12:
        if (r2 != '/') goto L14;
        r02.appendReplacement(r1, RemoteSettings.FORWARD_SLASH_STRING);
        goto L6
    L14:
        if (r2 != '\\') goto L16;
        r02.appendReplacement(r1, "\\\\");
        goto L6
    L16:
        if (r2 != 'b') goto L18;
        r02.appendReplacement(r1, "\b");
        goto L6
    L18:
        if (r2 != 'f') goto L20;
        r02.appendReplacement(r1, "\f");
        goto L6
    L20:
        if (r2 != 'n') goto L22;
        r02.appendReplacement(r1, "\n");
        goto L6
    L22:
        if (r2 != 'r') goto L24;
        r02.appendReplacement(r1, "\r");
        goto L6
    L24:
        if (r2 != 't') goto L27;
        r02.appendReplacement(r1, "\t");
        goto L6
    L27:
        throw new IllegalStateException("Found an escaped character that should never be.");
    L35:
        if (r1 != null) goto L37;
        return r42;
    L37:
        r02.appendTail(r1);
        return r1.toString();
    L64:
        return r4;
    }
}
