package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes6.dex */
public class DefaultsXmlParser {
    private static final String XML_TAG_ENTRY = "entry";
    private static final String XML_TAG_KEY = "key";
    private static final String XML_TAG_VALUE = "value";

    public DefaultsXmlParser() {
    }

    public static Map<String, String> getDefaultsFromXml(Context r8, int r9) {
        HashMap r1 = new HashMap();
        Resources r82 = r8.getResources();     // Catch: IOException -> L7 XmlPullParserException -> L9
        if (r82 != null) goto L11;
        Log.e(FirebaseRemoteConfig.TAG, "Could not find the resources of the current context while trying to set defaults from an XML.");     // Catch: IOException -> L7 XmlPullParserException -> L9
        return r1;
    L11:
        XmlResourceParser r83 = r82.getXml(r9);     // Catch: IOException -> L7 XmlPullParserException -> L9
        int r92 = r83.getEventType();     // Catch: IOException -> L7 XmlPullParserException -> L9
        String r3 = null;
        String r4 = null;
        String r5 = null;
    L13:
        if (r92 == 1) goto L50;
        if (r92 != 2) goto L18;
        r3 = r83.getName();     // Catch: IOException -> L7 XmlPullParserException -> L9
    L47:
        r92 = r83.next();     // Catch: IOException -> L7 XmlPullParserException -> L9
        goto L13
    L18:
        if (r92 != 3) goto L28;
        if (r83.getName().equals(XML_TAG_ENTRY) == false) goto L26;
        if (r4 == null) goto L24;
        if (r5 == null) goto L24;
        r1.put(r4, r5);     // Catch: IOException -> L7 XmlPullParserException -> L9
    L25:
        r4 = null;
        r5 = null;
    L24:
        Log.w(FirebaseRemoteConfig.TAG, "An entry in the defaults XML has an invalid key and/or value tag.");     // Catch: IOException -> L7 XmlPullParserException -> L9
    L26:
        r3 = null;
        goto L47
    L28:
        if (r92 != 4) goto L47;
        if (r3 == null) goto L47;
        int r93 = r3.hashCode();     // Catch: IOException -> L7 XmlPullParserException -> L9
        if (r93 == 106079) goto L39;
        if (r93 == 111972721) goto L36;
    L41:
        char r94 = 65535;
    L42:
        if (r94 == 0) goto L46;
        if (r94 == 1) goto L45;
        Log.w(FirebaseRemoteConfig.TAG, "Encountered an unexpected tag while parsing the defaults XML.");     // Catch: IOException -> L7 XmlPullParserException -> L9
        goto L47
    L45:
        r5 = r83.getText();     // Catch: IOException -> L7 XmlPullParserException -> L9
        goto L47
    L46:
        r4 = r83.getText();     // Catch: IOException -> L7 XmlPullParserException -> L9
        goto L47
    L36:
        if (r3.equals("value") == false) goto L41;
        r94 = 1;
        goto L42
    L39:
        if (r3.equals("key") == false) goto L41;
        r94 = 0;
    L50:
        return r1;
    L7:
        e = e;
    L49:
        Log.e(FirebaseRemoteConfig.TAG, "Encountered an error while parsing the defaults XML file.", e);
    L9:
        e = e;
        goto L49
    }
}
