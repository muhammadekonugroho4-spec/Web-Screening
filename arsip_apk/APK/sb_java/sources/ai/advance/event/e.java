package ai.advance.event;

import ai.advance.event.GuardianEvents;
import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class e extends GuardianEvents {

    /* renamed from: g, reason: collision with root package name */
    public JSONObject f1790g;

    public e(Context r2, GuardianEvents.BizType r3, String r4, String r5) {
        super(r2, r3, r4, "exception");
        JSONObject r22 = new JSONObject();
        this.f1790g = r22;
        r22.put("message", r5);     // Catch: Exception -> L5
        return;
    }

    @Override // ai.advance.event.GuardianEvents
    public JSONObject e(JSONObject r1) {
        return super.e(r1);
    }

    public JSONObject i() {
        return e(this.f1790g);
    }
}
