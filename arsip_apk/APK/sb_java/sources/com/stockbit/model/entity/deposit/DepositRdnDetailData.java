package com.stockbit.model.entity.deposit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/stockbit/model/entity/deposit/DepositRdnDetailData;", "Landroid/os/Parcelable;", "bankCode", "", "bankName", "bankLogo", "accountName", "accountNo", "foreignAccount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getBankCode", "()Ljava/lang/String;", "getBankName", "getBankLogo", "getAccountName", "getAccountNo", "getForeignAccount", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DepositRdnDetailData implements Parcelable {
    public static final Parcelable.Creator<DepositRdnDetailData> CREATOR = null;

    @SerializedName("account_name")
    private final String accountName;

    @SerializedName("account_no")
    private final String accountNo;

    @SerializedName("bank_code")
    private final String bankCode;

    @SerializedName("bank_logo")
    private final String bankLogo;

    @SerializedName("bank_name")
    private final String bankName;

    @SerializedName("foreign_account")
    private final boolean foreignAccount;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final DepositRdnDetailData a(Parcel r9) {
            p.l(r9, "parcel");
            String r2 = r9.readString();
            String r3 = r9.readString();
            String r4 = r9.readString();
            String r5 = r9.readString();
            String r6 = r9.readString();
            if (r9.readInt() == 0) goto L6;
            boolean r92 = true;
        L8:
            return new DepositRdnDetailData(r2, r3, r4, r5, r6, r92);
        L6:
            r92 = false;
            goto L8
        }

        public final DepositRdnDetailData[] b(int r1) {
            return new DepositRdnDetailData[r1];
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

    public DepositRdnDetailData(String r2, String r3, String r4, String r5, String r6, boolean r7) {
        p.l(r2, "bankCode");
        p.l(r3, "bankName");
        p.l(r4, "bankLogo");
        p.l(r5, "accountName");
        p.l(r6, "accountNo");
        this.bankCode = r2;
        this.bankName = r3;
        this.bankLogo = r4;
        this.accountName = r5;
        this.accountNo = r6;
        this.foreignAccount = r7;
    }

    public final String a() {
        return this.accountName;
    }

    public final String b() {
        return this.accountNo;
    }

    public final String c() {
        return this.bankCode;
    }

    public final String d() {
        return this.bankLogo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.bankName;
    }

    public final boolean f() {
        return this.foreignAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.bankCode);
        r1.writeString(this.bankName);
        r1.writeString(this.bankLogo);
        r1.writeString(this.accountName);
        r1.writeString(this.accountNo);
        r1.writeInt(this.foreignAccount ? 1 : 0);
    }
}
