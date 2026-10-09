package com.stockbit.model.entity.deposit;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0006J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, d2 = {"Lcom/stockbit/model/entity/deposit/DepositGuideData;", "Landroid/os/Parcelable;", "type", "", "image", "copyBtnIndex", "", "instructions", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getType", "()Ljava/lang/String;", "getImage", "getCopyBtnIndex", "()I", "getInstructions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DepositGuideData implements Parcelable {
    public static final Parcelable.Creator<DepositGuideData> CREATOR = null;

    @SerializedName("copy_btn_index")
    private final int copyBtnIndex;

    @SerializedName("image")
    private final String image;

    @SerializedName("instructions")
    private final List<String> instructions;

    @SerializedName("type")
    private final String type;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final DepositGuideData a(Parcel r5) {
            p.l(r5, "parcel");
            return new DepositGuideData(r5.readString(), r5.readString(), r5.readInt(), r5.createStringArrayList());
        }

        public final DepositGuideData[] b(int r1) {
            return new DepositGuideData[r1];
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

    public DepositGuideData(String r2, String r3, int r4, List<String> r5) {
        p.l(r2, "type");
        p.l(r3, "image");
        p.l(r5, "instructions");
        this.type = r2;
        this.image = r3;
        this.copyBtnIndex = r4;
        this.instructions = r5;
    }

    public final int a() {
        return this.copyBtnIndex;
    }

    public final String b() {
        return this.image;
    }

    public final List c() {
        return this.instructions;
    }

    public final String d() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DepositGuideData) == true) goto L8;
        return false;
    L8:
        DepositGuideData r52 = (DepositGuideData) r5;
        if (p.g(this.type, r52.type) == true) goto L12;
        return false;
    L12:
        if (p.g(this.image, r52.image) == true) goto L15;
        return false;
    L15:
        if (this.copyBtnIndex == r52.copyBtnIndex) goto L18;
        return false;
    L18:
        if (p.g(this.instructions, r52.instructions) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.image.hashCode()) * 31) + Integer.hashCode(this.copyBtnIndex)) * 31) + this.instructions.hashCode();
    }

    public String toString() {
        return "DepositGuideData(type=" + this.type + ", image=" + this.image + ", copyBtnIndex=" + this.copyBtnIndex + ", instructions=" + this.instructions + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.type);
        r1.writeString(this.image);
        r1.writeInt(this.copyBtnIndex);
        r1.writeStringList(this.instructions);
    }
}
