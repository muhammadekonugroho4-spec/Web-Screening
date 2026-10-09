package com.stockbit.lib.trackerwrapper.exception;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J!\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u008e\b¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u008e\b¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/stockbit/lib/trackerwrapper/exception/WebViewErrorException;", "Lcom/stockbit/lib/trackerwrapper/exception/StockbitException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getCause", "()Ljava/lang/Throwable;", "setCause", "(Ljava/lang/Throwable;)V", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "trackerwrapper_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WebViewErrorException extends Exception {
    private Throwable cause;
    private String message;

    /* JADX WARN: Multi-variable type inference failed */
    public WebViewErrorException() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WebViewErrorException) == true) goto L8;
        return false;
    L8:
        WebViewErrorException r52 = (WebViewErrorException) r5;
        if (p.g(this.message, r52.message) == true) goto L12;
        return false;
    L12:
        if (p.g(this.cause, r52.cause) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String r02 = this.message;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Throwable r2 = this.cause;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "WebViewErrorException(message=" + this.message + ", cause=" + this.cause + ')';
    }

    public WebViewErrorException(String r1, Throwable r2) {
        super(r1, r2);
        this.message = r1;
        this.cause = r2;
    }

    public /* synthetic */ WebViewErrorException(String r2, Throwable r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
