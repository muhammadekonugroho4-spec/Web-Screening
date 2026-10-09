package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.common.net.HttpHeaders;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JG\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010 \u001a\u00020!J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0083\u0004J\n\u0010&\u001a\u00020!HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006-"}, d2 = {"Lcom/stockbit/model/entity/AwsTokenLegacyResponseData;", "Landroid/os/Parcelable;", Constants.KEY_KEY, "", "awsAccessKeyId", "successActionRedirect", "policy", "signature", "contentType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getAwsAccessKeyId", "setAwsAccessKeyId", "getSuccessActionRedirect", "setSuccessActionRedirect", "getPolicy", "setPolicy", "getSignature", "setSignature", "getContentType", "setContentType", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AwsTokenLegacyResponseData implements Parcelable {
    public static final Parcelable.Creator<AwsTokenLegacyResponseData> CREATOR = null;

    @SerializedName(alternate = {"aws_access_key_id"}, value = "AWSAccessKeyId")
    @Expose
    private String awsAccessKeyId;

    @SerializedName(alternate = {"content_type"}, value = HttpHeaders.CONTENT_TYPE)
    @Expose
    private String contentType;

    @SerializedName(Constants.KEY_KEY)
    @Expose
    private String key;

    @SerializedName("policy")
    @Expose
    private String policy;

    @SerializedName("signature")
    @Expose
    private String signature;

    @SerializedName("success_action_redirect")
    @Expose
    private String successActionRedirect;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final AwsTokenLegacyResponseData a(Parcel r9) {
            p.l(r9, "parcel");
            return new AwsTokenLegacyResponseData(r9.readString(), r9.readString(), r9.readString(), r9.readString(), r9.readString(), r9.readString());
        }

        public final AwsTokenLegacyResponseData[] b(int r1) {
            return new AwsTokenLegacyResponseData[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return a(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return b(r1);
        }
    }

    static {
        CREATOR = new a();
    }

    public AwsTokenLegacyResponseData(String r2, String r3, String r4, String r5, String r6, String r7) {
        p.l(r3, "awsAccessKeyId");
        p.l(r4, "successActionRedirect");
        p.l(r5, "policy");
        p.l(r6, "signature");
        p.l(r7, "contentType");
        this.key = r2;
        this.awsAccessKeyId = r3;
        this.successActionRedirect = r4;
        this.policy = r5;
        this.signature = r6;
        this.contentType = r7;
    }

    public final String a() {
        return this.awsAccessKeyId;
    }

    public final String b() {
        return this.contentType;
    }

    public final String c() {
        return this.key;
    }

    public final String d() {
        return this.policy;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.signature;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AwsTokenLegacyResponseData) == true) goto L8;
        return false;
    L8:
        AwsTokenLegacyResponseData r52 = (AwsTokenLegacyResponseData) r5;
        if (p.g(this.key, r52.key) == true) goto L12;
        return false;
    L12:
        if (p.g(this.awsAccessKeyId, r52.awsAccessKeyId) == true) goto L15;
        return false;
    L15:
        if (p.g(this.successActionRedirect, r52.successActionRedirect) == true) goto L18;
        return false;
    L18:
        if (p.g(this.policy, r52.policy) == true) goto L21;
        return false;
    L21:
        if (p.g(this.signature, r52.signature) == true) goto L24;
        return false;
    L24:
        if (p.g(this.contentType, r52.contentType) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.successActionRedirect;
    }

    public int hashCode() {
        String r02 = this.key;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (((((((((r03 * 31) + this.awsAccessKeyId.hashCode()) * 31) + this.successActionRedirect.hashCode()) * 31) + this.policy.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.contentType.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "AwsTokenLegacyResponseData(key=" + this.key + ", awsAccessKeyId=" + this.awsAccessKeyId + ", successActionRedirect=" + this.successActionRedirect + ", policy=" + this.policy + ", signature=" + this.signature + ", contentType=" + this.contentType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.key);
        r1.writeString(this.awsAccessKeyId);
        r1.writeString(this.successActionRedirect);
        r1.writeString(this.policy);
        r1.writeString(this.signature);
        r1.writeString(this.contentType);
    }

    public /* synthetic */ AwsTokenLegacyResponseData(String r1, String r2, String r3, String r4, String r5, String r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1, r2, r3, r4, r5, r6);
    }
}
