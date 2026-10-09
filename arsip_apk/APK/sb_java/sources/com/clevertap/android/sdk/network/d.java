package com.clevertap.android.sdk.network;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.p;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final List f34679a;

    public d() {
        this.f34679a = new ArrayList();
    }

    @Override // com.clevertap.android.sdk.network.c
    public void a(JSONArray r3, boolean r4) {
        p.l(r3, "batch");
        Iterator r02 = this.f34679a.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((c) r02.next()).a(r3, r4);
        goto L4
    }

    public final void b(c r2) {
        p.l(r2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f34679a.add(r2);
    }
}
