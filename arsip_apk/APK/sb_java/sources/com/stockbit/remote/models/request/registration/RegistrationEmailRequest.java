package com.stockbit.remote.models.request.registration;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/stockbit/remote/models/request/registration/RegistrationEmailRequest;", "", Constants.KEY_KEY, "", "socialId", "socialToken", "email", "type", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getKey", "()Ljava/lang/String;", "getSocialId", "getSocialToken", "getEmail", "getType", "()I", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RegistrationEmailRequest {

    @SerializedName("email")
    private final String email;

    @SerializedName(Constants.KEY_KEY)
    private final String key;

    @SerializedName("social_id")
    private final String socialId;

    @SerializedName("social_token")
    private final String socialToken;

    @SerializedName("type")
    private final int type;

    public RegistrationEmailRequest(String r2, String r3, String r4, String r5, int r6) {
        p.l(r5, "email");
        this.key = r2;
        this.socialId = r3;
        this.socialToken = r4;
        this.email = r5;
        this.type = r6;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RegistrationEmailRequest) == true) goto L8;
        return false;
    L8:
        RegistrationEmailRequest r52 = (RegistrationEmailRequest) r5;
        if (p.g(this.key, r52.key) == true) goto L12;
        return false;
    L12:
        if (p.g(this.socialId, r52.socialId) == true) goto L15;
        return false;
    L15:
        if (p.g(this.socialToken, r52.socialToken) == true) goto L18;
        return false;
    L18:
        if (p.g(this.email, r52.email) == true) goto L21;
        return false;
    L21:
        if (this.type == r52.type) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        String r02 = this.key;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.socialId;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.socialToken;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return ((((r05 + r1) * 31) + this.email.hashCode()) * 31) + Integer.hashCode(this.type);
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "RegistrationEmailRequest(key=" + this.key + ", socialId=" + this.socialId + ", socialToken=" + this.socialToken + ", email=" + this.email + ", type=" + this.type + ')';
    }

    public /* synthetic */ RegistrationEmailRequest(String r2, String r3, String r4, String r5, int r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r7 & 4) == 0) goto L12;
        int r72 = r6;
        String r62 = r5;
        String r52 = null;
    L13:
        this(r2, r3, r52, r62, r72);
        return;
    L12:
        r72 = r6;
        r62 = r5;
        r52 = r4;
        goto L13
    }
}
