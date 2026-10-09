package com.stockbit.datasource.param.login;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/datasource/param/login/LoginUserNamePasswordDataParam;", "", "username", "", "password", "playerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUsername", "()Ljava/lang/String;", "getPassword", "getPlayerId", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LoginUserNamePasswordDataParam {

    @SerializedName("password")
    private final String password;

    @SerializedName("player_id")
    private final String playerId;

    @SerializedName("user")
    private final String username;

    public LoginUserNamePasswordDataParam(String r2, String r3, String r4) {
        p.l(r2, "username");
        p.l(r3, "password");
        this.username = r2;
        this.password = r3;
        this.playerId = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof LoginUserNamePasswordDataParam) == true) goto L8;
        return false;
    L8:
        LoginUserNamePasswordDataParam r52 = (LoginUserNamePasswordDataParam) r5;
        if (p.g(this.username, r52.username) == true) goto L12;
        return false;
    L12:
        if (p.g(this.password, r52.password) == true) goto L15;
        return false;
    L15:
        if (p.g(this.playerId, r52.playerId) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.username.hashCode() * 31) + this.password.hashCode()) * 31;
        String r1 = this.playerId;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "LoginUserNamePasswordDataParam(username=" + this.username + ", password=" + this.password + ", playerId=" + this.playerId + ")";
    }
}
