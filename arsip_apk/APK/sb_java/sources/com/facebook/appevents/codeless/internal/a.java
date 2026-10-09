package com.facebook.appevents.codeless.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0368a f35871e = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f35872a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35873b;

    /* renamed from: c, reason: collision with root package name */
    public final List f35874c;
    public final String d;

    /* renamed from: com.facebook.appevents.codeless.internal.a$a, reason: collision with other inner class name */
    public static final class C0368a {
        public /* synthetic */ C0368a(i r1) {
            this();
        }

        public C0368a() {
        }
    }

    static {
        f35871e = new C0368a(null);
    }

    public a(JSONObject r7) {
        p.l(r7, "component");
        String r02 = r7.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.k(r02, "component.getString(PARAMETER_NAME_KEY)");
        this.f35872a = r02;
        String r03 = r7.optString("value");
        p.k(r03, "component.optString(PARAMETER_VALUE_KEY)");
        this.f35873b = r03;
        String r04 = r7.optString("path_type", "absolute");
        p.k(r04, "component.optString(Cons…tants.PATH_TYPE_ABSOLUTE)");
        this.d = r04;
        ArrayList r05 = new ArrayList();
        JSONArray r72 = r7.optJSONArray("path");
        if (r72 == null) goto L7;
        int r1 = r72.length();
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L7;
        JSONObject r4 = r72.getJSONObject(r2);
        p.k(r4, "jsonPathArray.getJSONObject(i)");
        r05.add(new PathComponent(r4));
        r2 = r2 + 1;
    L7:
        this.f35874c = r05;
    }

    public final String a() {
        return this.f35872a;
    }

    public final List b() {
        return this.f35874c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f35873b;
    }
}
