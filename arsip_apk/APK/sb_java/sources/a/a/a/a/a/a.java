package a.a.a.a.a;

import com.midtrans.sdk.corekit.callback.HttpRequestCallback;
import com.midtrans.sdk.corekit.callback.SaveCardCallback;
import com.midtrans.sdk.corekit.core.Constants;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.models.SaveCardResponse;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static String f1347a = "a";

    static {
    }

    public a() {
    }

    public void a() {
    }

    public void b(HttpRequestCallback r3) {
        r3.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
    }

    public void c(Throwable r4, HttpRequestCallback r5) {
        a();
        Logger.e(f1347a, "Error > cause:" + r4.getCause() + "| message:" + r4.getMessage());     // Catch: Exception -> L7
        if ((r5 instanceof SaveCardCallback) == false) goto L9;
        SaveCardResponse r02 = new SaveCardResponse();     // Catch: Exception -> L7
        r02.setCode(200);     // Catch: Exception -> L7
        r02.setMessage(r4.getMessage());     // Catch: Exception -> L7
        ((SaveCardCallback) r5).onSuccess(r02);     // Catch: Exception -> L7
        return;
    L9:
        r5.onError(r4);     // Catch: Exception -> L7
        return;
    L7:
        e = move-exception;
        r5.onError(new Throwable(e.getMessage(), e.getCause()));
    }

    public void d(HttpRequestCallback r3) {
        a();
        r3.onError(new Throwable(Constants.MESSAGE_ERROR_INVALID_DATA_SUPPLIED));
    }
}
