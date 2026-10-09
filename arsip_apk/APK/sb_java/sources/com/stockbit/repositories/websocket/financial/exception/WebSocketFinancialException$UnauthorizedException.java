package com.stockbit.repositories.websocket.financial.exception;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004R\u0015\u0010\u0004\u001a\u00020\u0005X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/stockbit/repositories/websocket/financial/exception/WebSocketFinancialException$UnauthorizedException;", "Lcom/stockbit/repositories/websocket/financial/exception/WebSocketFinancialException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "websocket-financial"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WebSocketFinancialException$UnauthorizedException extends CancellationException {
    private final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public WebSocketFinancialException$UnauthorizedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof WebSocketFinancialException$UnauthorizedException) == true) goto L9;
        return false;
    L9:
        if (p.g(this.message, ((WebSocketFinancialException$UnauthorizedException) r4).message) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "UnauthorizedException(message=" + this.message + ")";
    }

    public WebSocketFinancialException$UnauthorizedException(String r2) {
        p.l(r2, "message");
        super(r2);
        this.message = r2;
    }

    public /* synthetic */ WebSocketFinancialException$UnauthorizedException(String r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
