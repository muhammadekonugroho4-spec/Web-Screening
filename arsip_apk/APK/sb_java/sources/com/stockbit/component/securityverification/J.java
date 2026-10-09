package com.stockbit.component.securityverification;

import android.webkit.JavascriptInterface;
import com.google.firebase.messaging.Constants;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class J {

    /* renamed from: b, reason: collision with root package name */
    public static final a f76819b = null;

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.functions.r f76820a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f76819b = new a(null);
    }

    public J(kotlin.jvm.functions.r r2) {
        kotlin.jvm.internal.p.l(r2, "onCaptchaFailed");
        this.f76820a = r2;
    }

    @JavascriptInterface
    public final void sendFromWeb(String r8) {
        kotlin.jvm.internal.p.l(r8, "json");
        JSONObject r1 = new JSONObject(r8);     // Catch: Exception -> L8
        JSONObject r82 = r1.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);     // Catch: Exception -> L8
        if (kotlin.jvm.internal.p.g(r1.optString("fn"), "clearance_attempt_failed") == false) goto L33;
        kotlin.jvm.functions.r r12 = this.f76820a;     // Catch: Exception -> L8
        if (r82 == null) goto L10;
        int r2 = r82.optInt("attempt");     // Catch: Exception -> L8
    L11:
        Integer r22 = Integer.valueOf(r2);     // Catch: Exception -> L8
        int r3 = 3;
        if (r82 == null) goto L14;
        r3 = r82.optInt(com.clevertap.android.sdk.Constants.PRIORITY_MAX, 3);     // Catch: Exception -> L8
    L14:
        Integer r32 = Integer.valueOf(r3);     // Catch: Exception -> L8
        String r4 = null;
        if (r82 == null) goto L18;
        String r5 = r82.optString("reason");     // Catch: Exception -> L8
    L19:
        String r6 = "";
        if (r5 != null) goto L22;
        r5 = "";
    L22:
        if (r82 == null) goto L24;
        r4 = r82.optString("rayid");     // Catch: Exception -> L8
    L24:
        if (r4 == null) goto L27;
        r6 = r4;
    L27:
        r12.invoke(r22, r32, r5, r6);     // Catch: Exception -> L8
        return;
    L18:
        r5 = null;
        goto L19
    L10:
        r2 = 0;
        goto L11
    L33:
        return;
    L8:
        e = move-exception;
        timber.log.a.f184289a.d(e, "Malformed message from the challenge page", new Object[0]);
    }
}
