package com.stockbit.dto.auth;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/stockbit/dto/auth/TokenDTO;", "", "token", "", "expiredAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getExpiredAt", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TokenDTO {

    @SerializedName("expired_at")
    @Expose
    private final String expiredAt;

    @SerializedName("token")
    @Expose
    private final String token;

    /* JADX WARN: Multi-variable type inference failed */
    public TokenDTO() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.expiredAt;
    }

    public final String b() {
        return this.token;
    }

    public TokenDTO(String r1, String r2) {
        this.token = r1;
        this.expiredAt = r2;
    }

    public /* synthetic */ TokenDTO(String r2, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
