package com.stockbit.model.entity.referral;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0004HÖ\u0081\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e¨\u0006\""}, d2 = {"Lcom/stockbit/model/entity/referral/UpdateReferralCodeResponseData;", "Landroid/os/Parcelable;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "message", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getError", "setError", "component1", "component2", "component3", com.clevertap.android.sdk.Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UpdateReferralCodeResponseData implements Parcelable {
    public static final Parcelable.Creator<UpdateReferralCodeResponseData> CREATOR = null;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    @Expose
    private final List<String> data;

    @SerializedName(Constants.IPC_BUNDLE_KEY_SEND_ERROR)
    @Expose
    private String error;

    @SerializedName("message")
    @Expose
    private String message;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final UpdateReferralCodeResponseData a(Parcel r4) {
            p.l(r4, "parcel");
            return new UpdateReferralCodeResponseData(r4.createStringArrayList(), r4.readString(), r4.readString());
        }

        public final UpdateReferralCodeResponseData[] b(int r1) {
            return new UpdateReferralCodeResponseData[r1];
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

    public UpdateReferralCodeResponseData() {
        List r1 = null;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final List a() {
        return this.data;
    }

    public final String b() {
        return this.message;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UpdateReferralCodeResponseData) == true) goto L8;
        return false;
    L8:
        UpdateReferralCodeResponseData r52 = (UpdateReferralCodeResponseData) r5;
        if (p.g(this.data, r52.data) == true) goto L12;
        return false;
    L12:
        if (p.g(this.message, r52.message) == true) goto L15;
        return false;
    L15:
        if (p.g(this.error, r52.error) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        List<String> r02 = this.data;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.message;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.error;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "UpdateReferralCodeResponseData(data=" + this.data + ", message=" + this.message + ", error=" + this.error + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeStringList(this.data);
        r1.writeString(this.message);
        r1.writeString(this.error);
    }

    public UpdateReferralCodeResponseData(List<String> r1, String r2, String r3) {
        this.data = r1;
        this.message = r2;
        this.error = r3;
    }

    public /* synthetic */ UpdateReferralCodeResponseData(List r2, String r3, String r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }
}
