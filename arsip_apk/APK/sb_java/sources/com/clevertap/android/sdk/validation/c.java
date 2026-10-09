package com.clevertap.android.sdk.validation;

/* loaded from: classes4.dex */
public abstract class c {
    public static b a(int r2) {
        return b(r2, -1, new String[0]);
    }

    public static b b(int r9, int r10, String... r11) {
        b r02 = new b();
        r02.d(r9);
        String r2 = "";
        if (r9 != 531) goto L68;
        r2 = "Profile Identifiers mismatch with the previously saved ones";
    L64:
        r02.e(r2);
        return r02;
    L68:
        switch(r9) {
            case 510: goto L57;
            case 511: goto L50;
            case 512: goto L35;
            case 513: goto L28;
            case 514: goto L21;
            default: goto L6;
        };
    L6:
        switch(r9) {
            case 520: goto L57;
            case 521: goto L16;
            case 522: goto L15;
            case 523: goto L9;
            default: goto L64;
        };
    L15:
        r2 = "Charged event contained more than 50 items.";
        goto L64
    L16:
        switch(r10) {
            case 11: goto L20;
            case 12: goto L19;
            case 13: goto L18;
            default: goto L67;
        };     // Catch: Exception -> L66
    L18:
        r2 = "Invalid user profile property array count - " + r11[0] + " max is - " + r11[1];     // Catch: Exception -> L66
        goto L67
    L19:
        r2 = "Multi value property for key " + r11[0] + " exceeds the limit of " + r11[1] + " items. Trimmed";     // Catch: Exception -> L66
        goto L67
    L20:
        r2 = r11[0] + "... exceeds the limit of " + r11[1] + " characters. Trimmed";     // Catch: Exception -> L66
    L67:
        goto L64
    L9:
        if (r10 != 23) goto L11;
        r2 = "Invalid multi-value property key " + r11[0];     // Catch: Exception -> L66
        goto L67
    L11:
        if (r10 != 24) goto L64;
        r2 = r11[0] + "... is a restricted key for multi-value properties. Operation aborted.";     // Catch: Exception -> L66
        goto L67
    L21:
        switch(r10) {
            case 18: goto L26;
            case 19: goto L25;
            case 20: goto L24;
            case 21: goto L23;
            default: goto L67;
        };     // Catch: Exception -> L66
    L23:
        r2 = "Attempted to set invalid custom CleverTap ID - " + r11[0] + ", falling back to default error CleverTap ID - " + r11[1];     // Catch: Exception -> L66
        goto L67
    L24:
        r2 = "CleverTap ID - " + r11[0] + " already exists. Unable to set custom CleverTap ID - " + r11[1];     // Catch: Exception -> L66
        goto L67
    L25:
        r2 = "CLEVERTAP_USE_CUSTOM_ID has not been specified in the AndroidManifest.xml. Custom CleverTap ID passed will not be used.";
        goto L67
    L26:
        r2 = "CLEVERTAP_USE_CUSTOM_ID has been specified in the AndroidManifest.xml/Instance Configuration. CleverTap SDK will create a fallback device ID";
        goto L67
    L28:
        if (r10 != 16) goto L30;
        r2 = r11[0] + " is a restricted event name. Last event aborted.";     // Catch: Exception -> L66
        goto L67
    L30:
        if (r10 != 17) goto L64;
        r2 = r11[0] + " is a discarded event name. Last event aborted.";     // Catch: Exception -> L66
        goto L67
    L35:
        if (r10 == 25) goto L48;
        switch(r10) {
            case 1: goto L47;
            case 2: goto L46;
            case 3: goto L45;
            case 4: goto L44;
            case 5: goto L43;
            case 6: goto L42;
            case 7: goto L41;
            case 8: goto L40;
            case 9: goto L39;
            case 10: goto L38;
            default: goto L67;
        };     // Catch: Exception -> L66
    L38:
        r2 = "Recording of Notification Viewed is disabled in the CleverTap Dashboard for notification payload: " + r11[0];     // Catch: Exception -> L66
        goto L67
    L39:
        r2 = "Unable to render notification on channelId: " + r11[0] + " as it is not registered by the app. Falling to default channel: ";     // Catch: Exception -> L66
        goto L67
    L40:
        r2 = "ChannelId is required for API 26+ but not provided in the notification payload. Falling to default channel: " + r11[0];     // Catch: Exception -> L66
        goto L67
    L41:
        r2 = "For event \"" + r11[0] + "\": Property value for property " + r11[1] + " wasn't a primitive (" + r11[2] + ")";     // Catch: Exception -> L66
        goto L67
    L42:
        r2 = "Key is empty, profile removeValueForKey aborted.";
        goto L67
    L43:
        r2 = "Invalid phone number";
        goto L67
    L44:
        r2 = "Device country code not available and profile phone: " + r11[0] + " does not appear to start with country code";     // Catch: Exception -> L66
        goto L67
    L45:
        r2 = "Object value wasn't a primitive (" + r11[0] + ") for profile field " + r11[1];     // Catch: Exception -> L66
        goto L67
    L46:
        r2 = "Profile push key is empty";
        goto L67
    L47:
        r2 = "Invalid multi value for key " + r11[0] + ", profile multi value operation aborted.";     // Catch: Exception -> L66
        goto L67
    L48:
        r2 = "Increment/Decrement value for profile key " + r11[0] + ", cannot be zero or negative";     // Catch: Exception -> L66
        goto L67
    L50:
        if (r10 != 7) goto L52;
        r2 = "For event " + r11[0] + ": Property value for property " + r11[1] + " wasn't a primitive (" + r11[2] + ")";     // Catch: Exception -> L66
        goto L67
    L52:
        if (r10 != 15) goto L64;
        r2 = "An item's object value for key " + r11[0] + " wasn't a primitive (" + r11[1] + ")";     // Catch: Exception -> L66
    L57:
        if (r10 != 11) goto L59;
        r2 = r11[0] + "... exceeds the limit of " + r11[1] + " characters. Trimmed";     // Catch: Exception -> L66
        goto L67
    L59:
        if (r10 != 14) goto L64;
        r2 = "Event Name is null";
        goto L64
    }
}
