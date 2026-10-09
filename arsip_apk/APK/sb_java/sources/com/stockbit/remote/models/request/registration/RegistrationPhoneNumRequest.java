package com.stockbit.remote.models.request.registration;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/stockbit/remote/models/request/registration/RegistrationPhoneNumRequest;", "", Constants.KEY_KEY, "", "code", "number", "channel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getCode", "getNumber", "getChannel", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RegistrationPhoneNumRequest {

    @SerializedName("channel")
    private final String channel;

    @SerializedName("code")
    private final String code;

    @SerializedName(Constants.KEY_KEY)
    private final String key;

    @SerializedName("phone")
    private final String number;

    public RegistrationPhoneNumRequest(String r2, String r3, String r4, String r5) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "code");
        p.l(r4, "number");
        p.l(r5, "channel");
        this.key = r2;
        this.code = r3;
        this.number = r4;
        this.channel = r5;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RegistrationPhoneNumRequest) == true) goto L8;
        return false;
    L8:
        RegistrationPhoneNumRequest r52 = (RegistrationPhoneNumRequest) r5;
        if (p.g(this.key, r52.key) == true) goto L12;
        return false;
    L12:
        if (p.g(this.code, r52.code) == true) goto L15;
        return false;
    L15:
        if (p.g(this.number, r52.number) == true) goto L18;
        return false;
    L18:
        if (p.g(this.channel, r52.channel) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.key.hashCode() * 31) + this.code.hashCode()) * 31) + this.number.hashCode()) * 31) + this.channel.hashCode();
    }

    public String toString() {
        return "RegistrationPhoneNumRequest(key=" + this.key + ", code=" + this.code + ", number=" + this.number + ", channel=" + this.channel + ')';
    }
}
