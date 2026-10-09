package com.stockbit.model.entity.securitiesOA;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0014\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006%"}, d2 = {"Lcom/stockbit/model/entity/securitiesOA/NextFormResponseData;", "Landroid/os/Parcelable;", NotificationCompat.CATEGORY_STATUS, "", Constants.KEY_KEY, "", "url", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/Boolean;", "setStatus", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getUrl", "setUrl", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/model/entity/securitiesOA/NextFormResponseData;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NextFormResponseData implements Parcelable {
    public static final Parcelable.Creator<NextFormResponseData> CREATOR = null;

    @SerializedName(Constants.KEY_KEY)
    private String key;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private Boolean status;

    @SerializedName("url")
    private String url;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final NextFormResponseData a(Parcel r4) {
            p.l(r4, "parcel");
            if (r4.readInt() != 0) goto L6;
            Boolean r1 = null;
        L11:
            return new NextFormResponseData(r1, r4.readString(), r4.readString());
        L6:
            if (r4.readInt() == 0) goto L8;
            boolean r12 = true;
        L9:
            r1 = Boolean.valueOf(r12);
            goto L11
        L8:
            r12 = false;
            goto L9
        }

        public final NextFormResponseData[] b(int r1) {
            return new NextFormResponseData[r1];
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

    public NextFormResponseData() {
        Boolean r1 = null;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final String a() {
        return this.key;
    }

    public final Boolean b() {
        return this.status;
    }

    public final String c() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof NextFormResponseData) == true) goto L8;
        return false;
    L8:
        NextFormResponseData r52 = (NextFormResponseData) r5;
        if (p.g(this.status, r52.status) == true) goto L12;
        return false;
    L12:
        if (p.g(this.key, r52.key) == true) goto L15;
        return false;
    L15:
        if (p.g(this.url, r52.url) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.status;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.key;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.url;
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
        return "NextFormResponseData(status=" + this.status + ", key=" + this.key + ", url=" + this.url + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        p.l(r2, "dest");
        Boolean r32 = this.status;
        if (r32 != null) goto L6;
        int r33 = 0;
    L5:
        r2.writeInt(r33);
        r2.writeString(this.key);
        r2.writeString(this.url);
        return;
    L6:
        r2.writeInt(1);
        r33 = r32.booleanValue();
        goto L5
    }

    public NextFormResponseData(Boolean r1, String r2, String r3) {
        this.status = r1;
        this.key = r2;
        this.url = r3;
    }

    public /* synthetic */ NextFormResponseData(Boolean r2, String r3, String r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }
}
