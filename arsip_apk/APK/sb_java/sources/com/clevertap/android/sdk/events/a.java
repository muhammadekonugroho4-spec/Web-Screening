package com.clevertap.android.sdk.events;

import android.content.Context;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a {
    public a() {
    }

    public abstract void b(Context r1, EventGroup r2, String r3);

    public abstract void c(Context r1, EventGroup r2, String r3, boolean r4);

    public abstract void d(JSONObject r1, boolean r2);

    public abstract void e();

    public abstract Future f(Context r1, JSONObject r2, int r3);
}
