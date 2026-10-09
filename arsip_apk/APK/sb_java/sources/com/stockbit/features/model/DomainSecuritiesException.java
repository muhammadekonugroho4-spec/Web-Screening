package com.stockbit.features.model;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J5\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0083\u0004J\n\u0010$\u001a\u00020\bHÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0006HÖ\u0081\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lcom/stockbit/features/model/DomainSecuritiesException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorType", "Lcom/stockbit/features/model/DomainSecuritiesError;", "message", "", "errorCode", "", "raw", "Lcom/stockbit/features/model/RawError;", "<init>", "(Lcom/stockbit/features/model/DomainSecuritiesError;Ljava/lang/String;ILcom/stockbit/features/model/RawError;)V", "getErrorType", "()Lcom/stockbit/features/model/DomainSecuritiesError;", "setErrorType", "(Lcom/stockbit/features/model/DomainSecuritiesError;)V", "getMessage", "()Ljava/lang/String;", "getErrorCode", "()I", "setErrorCode", "(I)V", "getRaw", "()Lcom/stockbit/features/model/RawError;", "setRaw", "(Lcom/stockbit/features/model/RawError;)V", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "toString", "model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DomainSecuritiesException extends Exception {
    private int errorCode;
    private DomainSecuritiesError errorType;
    private final String message;
    private c raw;

    public DomainSecuritiesException(DomainSecuritiesError r2, String r3, int r4, c r5) {
        p.l(r2, "errorType");
        this.errorType = r2;
        this.message = r3;
        this.errorCode = r4;
        this.raw = r5;
    }

    public static /* synthetic */ DomainSecuritiesException b(DomainSecuritiesException r02, DomainSecuritiesError r1, String r2, int r3, c r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.errorType;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.message;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.errorCode;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.raw;
    L15:
        return r02.a(r1, r2, r3, r4);
    }

    public final DomainSecuritiesException a(DomainSecuritiesError r2, String r3, int r4, c r5) {
        p.l(r2, "errorType");
        return new DomainSecuritiesException(r2, r3, r4, r5);
    }

    public final int c() {
        return this.errorCode;
    }

    public final DomainSecuritiesError d() {
        return this.errorType;
    }

    public final c e() {
        return this.raw;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DomainSecuritiesException) == true) goto L8;
        return false;
    L8:
        DomainSecuritiesException r52 = (DomainSecuritiesException) r5;
        if (this.errorType == r52.errorType) goto L12;
        return false;
    L12:
        if (p.g(this.message, r52.message) == true) goto L15;
        return false;
    L15:
        if (this.errorCode == r52.errorCode) goto L18;
        return false;
    L18:
        if (p.g(this.raw, r52.raw) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int r02 = this.errorType.hashCode() * 31;
        String r1 = this.message;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (((r02 + r12) * 31) + Integer.hashCode(this.errorCode)) * 31;
        c r13 = this.raw;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "DomainSecuritiesException(errorType=" + this.errorType + ", message=" + this.message + ", errorCode=" + this.errorCode + ", raw=" + this.raw + ")";
    }

    public /* synthetic */ DomainSecuritiesException(DomainSecuritiesError r1, String r2, int r3, c r4, int r5, i r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = 500;
    L6:
        if ((r5 & 8) == 0) goto L8;
        r4 = null;
    L8:
        this(r1, r2, r3, r4);
    }
}
