package com.stockbit.model.entity.screener;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes10.dex */
public class ScreenerUniverseParamModel implements Parcelable {
    public static final Parcelable.Creator<ScreenerUniverseParamModel> CREATOR = null;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @Expose
    private String name;

    @SerializedName("scope")
    @Expose
    private String scope;

    @SerializedName("scopeID")
    @Expose
    private String scopeID;

    public class a implements Parcelable.Creator {
        public a() {
        }

        public ScreenerUniverseParamModel a(Parcel r2) {
            return new ScreenerUniverseParamModel(r2);
        }

        public ScreenerUniverseParamModel[] b(int r1) {
            return new ScreenerUniverseParamModel[r1];
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

    public ScreenerUniverseParamModel() {
    }

    public String a() {
        return this.name;
    }

    public String b() {
        return this.scope;
    }

    public String c() {
        return this.scopeID;
    }

    public void d(String r1) {
        this.name = r1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(String r1) {
        this.scope = r1;
    }

    public void f(String r1) {
        this.scopeID = r1;
    }

    public String toString() {
        return "{\"scope\":\"" + this.scope + "\",\"scopeID\":\"" + this.scopeID + "\",\"name\":\"" + this.name + "\"}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.scope);
        r1.writeString(this.scopeID);
        r1.writeString(this.name);
    }

    public ScreenerUniverseParamModel(Parcel r2) {
        this.scope = r2.readString();
        this.scopeID = r2.readString();
        this.name = r2.readString();
    }
}
