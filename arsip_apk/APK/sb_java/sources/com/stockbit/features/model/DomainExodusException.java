package com.stockbit.features.model;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J+\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0006HÖ\u0081\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u008e\b¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/stockbit/features/model/DomainExodusException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorType", "Lcom/stockbit/features/model/DomainExodusError;", "message", "", "raw", "Lcom/stockbit/features/model/RawError;", "<init>", "(Lcom/stockbit/features/model/DomainExodusError;Ljava/lang/String;Lcom/stockbit/features/model/RawError;)V", "getErrorType", "()Lcom/stockbit/features/model/DomainExodusError;", "setErrorType", "(Lcom/stockbit/features/model/DomainExodusError;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getRaw", "()Lcom/stockbit/features/model/RawError;", "setRaw", "(Lcom/stockbit/features/model/RawError;)V", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DomainExodusException extends Exception {
    private DomainExodusError errorType;
    private String message;
    private c raw;

    public DomainExodusException(DomainExodusError r2, String r3, c r4) {
        p.l(r2, "errorType");
        this.errorType = r2;
        this.message = r3;
        this.raw = r4;
    }

    public static /* synthetic */ DomainExodusException b(DomainExodusException r02, DomainExodusError r1, String r2, c r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.errorType;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.message;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.raw;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final DomainExodusException a(DomainExodusError r2, String r3, c r4) {
        p.l(r2, "errorType");
        return new DomainExodusException(r2, r3, r4);
    }

    public final DomainExodusError c() {
        return this.errorType;
    }

    public final c d() {
        return this.raw;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DomainExodusException) == true) goto L8;
        return false;
    L8:
        DomainExodusException r52 = (DomainExodusException) r5;
        if (this.errorType == r52.errorType) goto L12;
        return false;
    L12:
        if (p.g(this.message, r52.message) == true) goto L15;
        return false;
    L15:
        if (p.g(this.raw, r52.raw) == true) goto L17;
        return false;
    L17:
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
        int r03 = (r02 + r12) * 31;
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
        return "DomainExodusException(errorType=" + this.errorType + ", message=" + this.message + ", raw=" + this.raw + ")";
    }

    public /* synthetic */ DomainExodusException(DomainExodusError r1, String r2, c r3, int r4, i r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        this(r1, r2, r3);
    }
}
