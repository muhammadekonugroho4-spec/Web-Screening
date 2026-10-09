package a.a.a.a.d;

import android.content.Context;
import com.midtrans.sdk.corekit.core.Constants;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.PaymentException;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.j;
import com.midtrans.sdk.uikit.models.f;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import retrofit2.HttpException;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static String f1451a = "b";

    static {
    }

    public static f a(Context r4, TransactionResponse r5) {
        return b(new PaymentException(r5.getStatusCode(), r5.getStatusMessage(), new Throwable(r5.getStatusMessage())), r4);
    }

    public static f b(Throwable r2, Context r3) {
        String r02 = r3.getString(j.f42634i0);
    L7:
        e = move-exception;
        Logger.e(f1451a, e.getMessage());
    L18:
        return new f(r3.getString(j.f42583C0), r02);
    L4:
        if ((r2 instanceof HttpException) == false) goto L10;
        int r1 = ((HttpException) r2).a();     // Catch: RuntimeException -> L7
        String r22 = ((HttpException) r2).c();     // Catch: RuntimeException -> L7
        String r23 = d(String.valueOf(r1), r22, r3);     // Catch: RuntimeException -> L7
    L6:
        r02 = r23;
        goto L18
    L10:
        if ((r2 instanceof PaymentException) == false) goto L13;
        r23 = d(((PaymentException) r2).statusCode, r2.getMessage(), r3);     // Catch: RuntimeException -> L7
        goto L6
    L13:
        if ((r2 instanceof TimeoutException) == false) goto L18;
        r23 = r3.getString(j.g4);     // Catch: RuntimeException -> L7
        goto L6
    }

    public static String c(Context r2, ArrayList r3) {
        String r02 = r2.getString(j.f42636j0);
        if (r3 != null) goto L5;
    L33:
        return r02;
    L5:
        if (r3.isEmpty() == true) goto L33;
        if (r3.contains("has been paid") == true) goto L32;
        if (r3.contains("transaction has been processed") == true) goto L32;
        if (r3.contains("is not equal to the sum") == false) goto L16;
        return r2.getString(j.f42624d0);
    L16:
        if (r3.contains("amount is required") == false) goto L20;
        return r2.getString(j.f42626e0);
    L20:
        if (r3.contains("order_id is required") == false) goto L24;
        return r2.getString(j.f42646o0);
    L24:
        if (e((String) r3.get(0)) == false) goto L28;
        return r2.getString(j.g4);
    L28:
        if (r3.contains("Currency is not included") == false) goto L33;
        return r2.getString(j.f42611T);
    L32:
        return r2.getString(j.f42638k0);
    }

    public static String d(String r2, String r3, Context r4) {
        String r22 = String.valueOf(r2);
        char r02 = 65535;
        switch(r22.hashCode()) {
            case 51508: goto L26;
            case 51514: goto L22;
            case 51515: goto L18;
            case 51540: goto L14;
            case 52469: goto L10;
            case 52471: goto L6;
            default: goto L29;
        };
    L29:
        switch(r02) {
            case 0: goto L47;
            case 1: goto L45;
            case 2: goto L43;
            case 3: goto L37;
            case 4: goto L35;
            case 5: goto L33;
            default: goto L31;
        };
    L31:
        return r4.getString(j.f42634i0);
    L33:
        return r4.getString(j.f42644n0);
    L35:
        return r4.getString(j.f42642m0);
    L37:
        if (e(r3) == false) goto L41;
        return r4.getString(j.g4);
    L41:
        return r4.getString(j.f42613V);
    L43:
        return r4.getString(j.f42640l0);
    L45:
        return r4.getString(j.f42638k0);
    L47:
        return r4.getString(j.f42636j0);
    L6:
        if (r22.equals("502") == false) goto L29;
        r02 = 5;
        goto L29
    L10:
        if (r22.equals("500") == false) goto L29;
        r02 = 4;
        goto L29
    L14:
        if (r22.equals("411") == false) goto L29;
        r02 = 3;
        goto L29
    L18:
        if (r22.equals("407") == false) goto L29;
        r02 = 2;
        goto L29
    L22:
        if (r22.equals("406") == false) goto L29;
        r02 = 1;
        goto L29
    L26:
        if (r22.equals(Constants.STATUS_CODE_400) == false) goto L29;
        r02 = 0;
        goto L29
    }

    public static boolean e(String r2) {
        if (r2.contains("timed out") == false) goto L5;
        return true;
    L5:
        if (r2.contains("timeout") == false) goto L7;
        return true;
    L7:
        if (r2.equals("timeout") == true) goto L14;
        return false;
    L14:
        return true;
    }
}
