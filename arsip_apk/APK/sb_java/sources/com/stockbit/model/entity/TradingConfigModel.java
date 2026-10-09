package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes10.dex */
public class TradingConfigModel implements Parcelable {
    public static final Parcelable.Creator<TradingConfigModel> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public int f122041a;

    @SerializedName(Constants.KEY_ICON)
    @Expose
    private String icon;

    @SerializedName("image")
    @Expose
    private String image;

    @SerializedName(Constants.KEY_KEY)
    @Expose
    private String key;

    @SerializedName("link")
    @Expose
    private String link;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @Expose
    private String name;

    @SerializedName("requirements")
    @Expose
    private List<Object> requirements;

    public class a implements Parcelable.Creator {
        public a() {
        }

        public TradingConfigModel a(Parcel r2) {
            return new TradingConfigModel(r2);
        }

        public TradingConfigModel[] b(int r1) {
            return new TradingConfigModel[r1];
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

    public TradingConfigModel(int r1, String r2, String r3, String r4, String r5, String r6) {
        this.f122041a = r1;
        this.name = r2;
        this.icon = r3;
        this.image = r4;
        this.key = r5;
        this.link = r6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "TradingConfigDataModel{brokerId=" + this.f122041a + ", name='" + this.name + "', icon='" + this.icon + "', image='" + this.image + "', key='" + this.key + "', link='" + this.link + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.f122041a);
        r1.writeString(this.name);
        r1.writeString(this.icon);
        r1.writeString(this.image);
        r1.writeString(this.key);
        r1.writeString(this.link);
    }

    public TradingConfigModel(Parcel r2) {
        this.f122041a = r2.readInt();
        this.name = r2.readString();
        this.icon = r2.readString();
        this.image = r2.readString();
        this.key = r2.readString();
        this.link = r2.readString();
    }
}
