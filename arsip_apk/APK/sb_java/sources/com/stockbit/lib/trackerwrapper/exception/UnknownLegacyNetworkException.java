package com.stockbit.lib.trackerwrapper.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stockbit/lib/trackerwrapper/exception/UnknownLegacyNetworkException;", "Lcom/stockbit/lib/trackerwrapper/exception/StockbitException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "trackerwrapper_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UnknownLegacyNetworkException extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public UnknownLegacyNetworkException() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public UnknownLegacyNetworkException(String r1, Throwable r2) {
        super(r1, r2);
    }

    public /* synthetic */ UnknownLegacyNetworkException(String r2, Throwable r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
