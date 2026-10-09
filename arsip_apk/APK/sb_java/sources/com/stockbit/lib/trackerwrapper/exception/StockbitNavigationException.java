package com.stockbit.lib.trackerwrapper.exception;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stockbit/lib/trackerwrapper/exception/StockbitNavigationException;", "Lcom/stockbit/lib/trackerwrapper/exception/StockbitException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.MessagePayloadKeys.FROM, "", "to", "message", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "trackerwrapper_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StockbitNavigationException extends Exception {
    public StockbitNavigationException(String r3, String r4, String r5, Throwable r6) {
        p.l(r3, Constants.MessagePayloadKeys.FROM);
        p.l(r4, "to");
        super("from: " + r3 + " | to: " + r4 + " | message: " + r5, r6);
    }
}
