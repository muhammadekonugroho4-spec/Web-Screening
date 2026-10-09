package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes5.dex */
public class ViewUtils {
    private ViewUtils() {
    }

    @KeepForSdk
    public static String getXmlAttributeString(String r2, String r3, Context r4, AttributeSet r5, boolean r6, boolean r7, String r8) {
        if (r5 != null) goto L4;
        String r22 = null;
    L5:
        if (r22 != null) goto L7;
    L17:
        if (r7 == false) goto L20;
        if (r22 != null) goto L20;
        Log.w(r8, "Required XML attribute \"" + r3 + "\" missing");
    L20:
        return r22;
    L7:
        if (r22.startsWith("@string/") == false) goto L17;
        if (r6 == false) goto L17;
        String r52 = r22.substring(8);
        String r62 = r4.getPackageName();
        TypedValue r02 = new TypedValue();
        r4.getResources().getValue(r62 + ":string/" + r52, r02, true);     // Catch: Resources.NotFoundException -> L12
    L13:
        CharSequence r42 = r02.string;
        if (r42 == null) goto L16;
        r22 = r42.toString();
        goto L17
    L16:
        Log.w(r8, "Resource " + r3 + " was not a string: " + r02.toString());
    L12:
        Log.w(r8, "Could not find resource for " + r3 + ": " + r22);
        goto L13
    L4:
        r22 = r5.getAttributeValue(r2, r3);
        goto L5
    }
}
