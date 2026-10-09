package com.stockbit.model.entity.register;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/stockbit/model/entity/register/RegistrationCommonResponseData;", "", Constants.KEY_KEY, "", "valid", "", RemoteConfigConstants.ResponseFieldKey.STATE, "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValid", "()Z", "getState", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RegistrationCommonResponseData {

    @SerializedName(Constants.KEY_KEY)
    private final String key;

    @SerializedName(RemoteConfigConstants.ResponseFieldKey.STATE)
    private final String state;

    @SerializedName("valid")
    private final boolean valid;

    public RegistrationCommonResponseData() {
        String r1 = null;
        boolean r2 = false;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final String a() {
        return this.key;
    }

    public final String b() {
        return this.state;
    }

    public final boolean c() {
        return this.valid;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RegistrationCommonResponseData) == true) goto L8;
        return false;
    L8:
        RegistrationCommonResponseData r52 = (RegistrationCommonResponseData) r5;
        if (p.g(this.key, r52.key) == true) goto L12;
        return false;
    L12:
        if (this.valid == r52.valid) goto L15;
        return false;
    L15:
        if (p.g(this.state, r52.state) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.key;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = ((r03 * 31) + Boolean.hashCode(this.valid)) * 31;
        String r2 = this.state;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "RegistrationCommonResponseData(key=" + this.key + ", valid=" + this.valid + ", state=" + this.state + ')';
    }

    public RegistrationCommonResponseData(String r1, boolean r2, String r3) {
        this.key = r1;
        this.valid = r2;
        this.state = r3;
    }

    public /* synthetic */ RegistrationCommonResponseData(String r2, boolean r3, String r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }
}
