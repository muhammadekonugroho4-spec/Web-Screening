package com.stockbit.model.entity.screener.old;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes10.dex */
public class ScreenerFilterParamModel implements Parcelable {
    public static final Parcelable.Creator<ScreenerFilterParamModel> CREATOR = null;

    @SerializedName("item1")
    @Expose
    private String item1;

    @SerializedName("item1name")
    @Expose
    private String item1name;

    @SerializedName("item2")
    @Expose
    private String item2;

    @SerializedName("item2name")
    @Expose
    private String item2name;

    @SerializedName("multiplier")
    @Expose
    private String multiplier;

    @SerializedName("operator")
    @Expose
    private String operator;

    @SerializedName("type")
    @Expose
    private String type;

    public class a implements Parcelable.Creator {
        public a() {
        }

        public ScreenerFilterParamModel a(Parcel r2) {
            return new ScreenerFilterParamModel(r2);
        }

        public ScreenerFilterParamModel[] b(int r1) {
            return new ScreenerFilterParamModel[r1];
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

    public ScreenerFilterParamModel() {
    }

    public void a(String r1) {
        this.item1 = r1;
    }

    public void b(String r1) {
        this.item1name = r1;
    }

    public void c(String r1) {
        this.item2 = r1;
    }

    public void d(String r1) {
        this.item2name = r1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(String r1) {
        this.multiplier = r1;
    }

    public void f(String r1) {
        this.operator = r1;
    }

    public void g(String r1) {
        this.type = r1;
    }

    public String toString() {
        return "{\"type\":\"" + this.type + "\",\"item1\":\"" + this.item1 + "\",\"item1name\":\"" + this.item1name + "\",\"item2\":\"" + this.item2 + "\",\"item2name\":\"" + this.item2name + "\",\"operator\":\"" + this.operator + "\",\"multiplier\":\"" + this.multiplier + "\"}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.type);
        r1.writeString(this.item1);
        r1.writeString(this.item1name);
        r1.writeString(this.item2);
        r1.writeString(this.item2name);
        r1.writeString(this.operator);
        r1.writeString(this.multiplier);
    }

    public ScreenerFilterParamModel(Parcel r2) {
        this.type = r2.readString();
        this.item1 = r2.readString();
        this.item1name = r2.readString();
        this.item2 = r2.readString();
        this.item2name = r2.readString();
        this.operator = r2.readString();
        this.multiplier = r2.readString();
    }
}
