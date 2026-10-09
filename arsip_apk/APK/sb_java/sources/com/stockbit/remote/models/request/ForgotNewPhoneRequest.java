package com.stockbit.remote.models.request;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/stockbit/remote/models/request/ForgotNewPhoneRequest;", "", "token", "", "phone", "Lcom/stockbit/remote/models/request/PhoneParam;", "<init>", "(Ljava/lang/String;Lcom/stockbit/remote/models/request/PhoneParam;)V", "getToken", "()Ljava/lang/String;", "getPhone", "()Lcom/stockbit/remote/models/request/PhoneParam;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ForgotNewPhoneRequest {

    @SerializedName("new_phone")
    private final PhoneParam phone;

    @SerializedName("token")
    private final String token;

    public ForgotNewPhoneRequest(String r2, PhoneParam r3) {
        p.l(r2, "token");
        p.l(r3, "phone");
        this.token = r2;
        this.phone = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ForgotNewPhoneRequest) == true) goto L8;
        return false;
    L8:
        ForgotNewPhoneRequest r52 = (ForgotNewPhoneRequest) r5;
        if (p.g(this.token, r52.token) == true) goto L12;
        return false;
    L12:
        if (p.g(this.phone, r52.phone) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.token.hashCode() * 31) + this.phone.hashCode();
    }

    public String toString() {
        return "ForgotNewPhoneRequest(token=" + this.token + ", phone=" + this.phone + ')';
    }
}
