package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002'(B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0083\u0004J\n\u0010 \u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, d2 = {"Lcom/stockbit/model/entity/TradingStockbitAuthTokenResponseData;", "Landroid/os/Parcelable;", "accessToken", "", "refreshToken", "account", "Lcom/stockbit/model/entity/TradingStockbitAuthTokenResponseData$AuthTokenAccountResponseData;", "mainAccount", "Lcom/stockbit/model/entity/TradingStockbitAuthTokenResponseData$MainAuthTokenAccountResponseData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/model/entity/TradingStockbitAuthTokenResponseData$AuthTokenAccountResponseData;Lcom/stockbit/model/entity/TradingStockbitAuthTokenResponseData$MainAuthTokenAccountResponseData;)V", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "getRefreshToken", "setRefreshToken", "getAccount", "()Lcom/stockbit/model/entity/TradingStockbitAuthTokenResponseData$AuthTokenAccountResponseData;", "getMainAccount", "()Lcom/stockbit/model/entity/TradingStockbitAuthTokenResponseData$MainAuthTokenAccountResponseData;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AuthTokenAccountResponseData", "MainAuthTokenAccountResponseData", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TradingStockbitAuthTokenResponseData implements Parcelable {
    public static final Parcelable.Creator<TradingStockbitAuthTokenResponseData> CREATOR = null;

    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("account")
    private final AuthTokenAccountResponseData account;

    @SerializedName("main_account")
    private final MainAuthTokenAccountResponseData mainAccount;

    @SerializedName("refresh_token")
    private String refreshToken;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/stockbit/model/entity/TradingStockbitAuthTokenResponseData$AuthTokenAccountResponseData;", "Landroid/os/Parcelable;", "type", "", "number", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getNumber", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AuthTokenAccountResponseData implements Parcelable {
        public static final Parcelable.Creator<AuthTokenAccountResponseData> CREATOR = null;

        @SerializedName("number")
        private final String number;

        @SerializedName("type")
        private final String type;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final AuthTokenAccountResponseData a(Parcel r3) {
                p.l(r3, "parcel");
                return new AuthTokenAccountResponseData(r3.readString(), r3.readString());
            }

            public final AuthTokenAccountResponseData[] b(int r1) {
                return new AuthTokenAccountResponseData[r1];
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

        public AuthTokenAccountResponseData(String r2, String r3) {
            p.l(r2, "type");
            p.l(r3, "number");
            this.type = r2;
            this.number = r3;
        }

        public final String a() {
            return this.number;
        }

        public final String b() {
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
            if ((r5 instanceof AuthTokenAccountResponseData) == true) goto L8;
            return false;
        L8:
            AuthTokenAccountResponseData r52 = (AuthTokenAccountResponseData) r5;
            if (p.g(this.type, r52.type) == true) goto L12;
            return false;
        L12:
            if (p.g(this.number, r52.number) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.number.hashCode();
        }

        public String toString() {
            return "AuthTokenAccountResponseData(type=" + this.type + ", number=" + this.number + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r1, int r2) {
            p.l(r1, "dest");
            r1.writeString(this.type);
            r1.writeString(this.number);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/stockbit/model/entity/TradingStockbitAuthTokenResponseData$MainAuthTokenAccountResponseData;", "Landroid/os/Parcelable;", "number", "", "<init>", "(Ljava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MainAuthTokenAccountResponseData implements Parcelable {
        public static final Parcelable.Creator<MainAuthTokenAccountResponseData> CREATOR = null;

        @SerializedName("number")
        private final String number;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final MainAuthTokenAccountResponseData a(Parcel r2) {
                p.l(r2, "parcel");
                return new MainAuthTokenAccountResponseData(r2.readString());
            }

            public final MainAuthTokenAccountResponseData[] b(int r1) {
                return new MainAuthTokenAccountResponseData[r1];
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

        public MainAuthTokenAccountResponseData(String r2) {
            p.l(r2, "number");
            this.number = r2;
        }

        public final String a() {
            return this.number;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof MainAuthTokenAccountResponseData) == true) goto L9;
            return false;
        L9:
            if (p.g(this.number, ((MainAuthTokenAccountResponseData) r4).number) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.number.hashCode();
        }

        public String toString() {
            return "MainAuthTokenAccountResponseData(number=" + this.number + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r1, int r2) {
            p.l(r1, "dest");
            r1.writeString(this.number);
        }
    }

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TradingStockbitAuthTokenResponseData a(Parcel r7) {
            p.l(r7, "parcel");
            String r1 = r7.readString();
            String r2 = r7.readString();
            MainAuthTokenAccountResponseData r4 = null;
            if (r7.readInt() != 0) goto L5;
            AuthTokenAccountResponseData r3 = null;
        L6:
            AuthTokenAccountResponseData r32 = r3;
            if (r7.readInt() == 0) goto L11;
            r4 = MainAuthTokenAccountResponseData.CREATOR.createFromParcel(r7);
        L11:
            return new TradingStockbitAuthTokenResponseData(r1, r2, r32, r4);
        L5:
            r3 = AuthTokenAccountResponseData.CREATOR.createFromParcel(r7);
            goto L6
        }

        public final TradingStockbitAuthTokenResponseData[] b(int r1) {
            return new TradingStockbitAuthTokenResponseData[r1];
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

    public TradingStockbitAuthTokenResponseData() {
        String r1 = null;
        String r2 = null;
        AuthTokenAccountResponseData r3 = null;
        MainAuthTokenAccountResponseData r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public final String a() {
        return this.accessToken;
    }

    public final AuthTokenAccountResponseData b() {
        return this.account;
    }

    public final MainAuthTokenAccountResponseData c() {
        return this.mainAccount;
    }

    public final String d() {
        return this.refreshToken;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TradingStockbitAuthTokenResponseData) == true) goto L8;
        return false;
    L8:
        TradingStockbitAuthTokenResponseData r52 = (TradingStockbitAuthTokenResponseData) r5;
        if (p.g(this.accessToken, r52.accessToken) == true) goto L12;
        return false;
    L12:
        if (p.g(this.refreshToken, r52.refreshToken) == true) goto L15;
        return false;
    L15:
        if (p.g(this.account, r52.account) == true) goto L18;
        return false;
    L18:
        if (p.g(this.mainAccount, r52.mainAccount) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        String r02 = this.accessToken;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.refreshToken;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        AuthTokenAccountResponseData r23 = this.account;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        MainAuthTokenAccountResponseData r25 = this.mainAccount;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "TradingStockbitAuthTokenResponseData(accessToken=" + this.accessToken + ", refreshToken=" + this.refreshToken + ", account=" + this.account + ", mainAccount=" + this.mainAccount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        p.l(r4, "dest");
        r4.writeString(this.accessToken);
        r4.writeString(this.refreshToken);
        AuthTokenAccountResponseData r02 = this.account;
        if (r02 != null) goto L5;
        r4.writeInt(0);
    L6:
        MainAuthTokenAccountResponseData r03 = this.mainAccount;
        if (r03 != null) goto L10;
        r4.writeInt(0);
        return;
    L10:
        r4.writeInt(1);
        r03.writeToParcel(r4, r5);
        return;
    L5:
        r4.writeInt(1);
        r02.writeToParcel(r4, r5);
        goto L6
    }

    public TradingStockbitAuthTokenResponseData(String r1, String r2, AuthTokenAccountResponseData r3, MainAuthTokenAccountResponseData r4) {
        this.accessToken = r1;
        this.refreshToken = r2;
        this.account = r3;
        this.mainAccount = r4;
    }

    public /* synthetic */ TradingStockbitAuthTokenResponseData(String r2, String r3, AuthTokenAccountResponseData r4, MainAuthTokenAccountResponseData r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
