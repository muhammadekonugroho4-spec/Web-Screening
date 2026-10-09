package com.stockbit.model.entity.stream;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0003J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006#"}, d2 = {"Lcom/stockbit/model/entity/stream/PollingOptionResponseData;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "value", "", "countVoters", "<init>", "(ILjava/lang/String;I)V", "getId", "()I", "setId", "(I)V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "getCountVoters", "setCountVoters", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PollingOptionResponseData implements Parcelable {
    public static final Parcelable.Creator<PollingOptionResponseData> CREATOR = null;

    @SerializedName("count_voters")
    private int countVoters;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private int f122098id;

    @SerializedName("value")
    private String value;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final PollingOptionResponseData a(Parcel r4) {
            p.l(r4, "parcel");
            return new PollingOptionResponseData(r4.readInt(), r4.readString(), r4.readInt());
        }

        public final PollingOptionResponseData[] b(int r1) {
            return new PollingOptionResponseData[r1];
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

    public PollingOptionResponseData() {
        int r1 = 0;
        String r2 = null;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public final int a() {
        return this.countVoters;
    }

    public final int b() {
        return this.f122098id;
    }

    public final String c() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PollingOptionResponseData) == true) goto L8;
        return false;
    L8:
        PollingOptionResponseData r52 = (PollingOptionResponseData) r5;
        if (this.f122098id == r52.f122098id) goto L12;
        return false;
    L12:
        if (p.g(this.value, r52.value) == true) goto L15;
        return false;
    L15:
        if (this.countVoters == r52.countVoters) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f122098id) * 31;
        String r1 = this.value;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + Integer.hashCode(this.countVoters);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "PollingOptionResponseData(id=" + this.f122098id + ", value=" + this.value + ", countVoters=" + this.countVoters + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.f122098id);
        r1.writeString(this.value);
        r1.writeInt(this.countVoters);
    }

    public PollingOptionResponseData(int r1, String r2, int r3) {
        this.f122098id = r1;
        this.value = r2;
        this.countVoters = r3;
    }

    public /* synthetic */ PollingOptionResponseData(int r2, String r3, int r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
