package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class BreadcrumbAnalyticsEventReceiver implements AnalyticsEventReceiver, BreadcrumbSource {
    private static final String BREADCRUMB_NAME_KEY = "name";
    private static final String BREADCRUMB_PARAMS_KEY = "parameters";
    private static final String BREADCRUMB_PREFIX = "$A$:";
    private BreadcrumbHandler breadcrumbHandler;

    public BreadcrumbAnalyticsEventReceiver() {
    }

    private static String serializeEvent(String r5, Bundle r6) throws JSONException {
        JSONObject r02 = new JSONObject();
        JSONObject r1 = new JSONObject();
        Iterator<String> r2 = r6.keySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        String r3 = r2.next();
        r1.put(r3, r6.get(r3));
        goto L4
    L6:
        r02.put("name", r5);
        r02.put(BREADCRUMB_PARAMS_KEY, r1);
        return r02.toString();
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public void onEvent(String r4, Bundle r5) {
        BreadcrumbHandler r02 = this.breadcrumbHandler;
        if (r02 == null) goto L10;
        r02.handleBreadcrumb(BREADCRUMB_PREFIX + serializeEvent(r4, r5));     // Catch: JSONException -> L6
        return;
    L6:
        Logger.getLogger().w("Unable to serialize Firebase Analytics event to breadcrumb.");
        return;
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void registerBreadcrumbHandler(BreadcrumbHandler r2) {
        this.breadcrumbHandler = r2;
        Logger.getLogger().d("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
