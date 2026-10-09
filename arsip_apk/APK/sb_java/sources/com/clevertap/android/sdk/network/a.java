package com.clevertap.android.sdk.network;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.p;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final List f34642a;

    public a() {
        this.f34642a = new ArrayList();
    }

    @Override // com.clevertap.android.sdk.network.c
    public void a(JSONArray r5, boolean r6) {
        p.l(r5, "batch");
        int r02 = r5.length();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L10;
        if (p.g(r5.getJSONObject(r1).optString(Constants.KEY_EVT_NAME), Constants.APP_LAUNCHED_EVENT) == false) goto L9;
        if (r6 == false) goto L9;
        c();
        return;
    L9:
        r1 = r1 + 1;
        goto L3
    }

    public final void b(kotlin.jvm.functions.a r2) {
        p.l(r2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f34642a.add(r2);
    }

    public final void c() {
        Iterator r02 = this.f34642a.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((kotlin.jvm.functions.a) r02.next()).invoke();
        goto L4
    }
}
