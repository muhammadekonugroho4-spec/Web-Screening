package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0083\u0004J\n\u0010\"\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006)"}, d2 = {"Lcom/stockbit/model/entity/BankAmendResponseData;", "Landroid/os/Parcelable;", "changeToken", "", "accountName", "accountNumber", "bankName", "bankId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChangeToken", "()Ljava/lang/String;", "setChangeToken", "(Ljava/lang/String;)V", "getAccountName", "setAccountName", "getAccountNumber", "setAccountNumber", "getBankName", "setBankName", "getBankId", "setBankId", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BankAmendResponseData implements Parcelable {
    public static final Parcelable.Creator<BankAmendResponseData> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public String f121988a;

    /* renamed from: b, reason: collision with root package name */
    public String f121989b;

    /* renamed from: c, reason: collision with root package name */
    public String f121990c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f121991e;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final BankAmendResponseData a(Parcel r8) {
            p.l(r8, "parcel");
            return new BankAmendResponseData(r8.readString(), r8.readString(), r8.readString(), r8.readString(), r8.readString());
        }

        public final BankAmendResponseData[] b(int r1) {
            return new BankAmendResponseData[r1];
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

    public BankAmendResponseData(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, "changeToken");
        p.l(r3, "accountName");
        p.l(r4, "accountNumber");
        p.l(r5, "bankName");
        p.l(r6, "bankId");
        this.f121988a = r2;
        this.f121989b = r3;
        this.f121990c = r4;
        this.d = r5;
        this.f121991e = r6;
    }

    public final String a() {
        return this.f121989b;
    }

    public final String b() {
        return this.f121990c;
    }

    public final String c() {
        return this.f121991e;
    }

    public final String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f121988a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BankAmendResponseData) == true) goto L8;
        return false;
    L8:
        BankAmendResponseData r52 = (BankAmendResponseData) r5;
        if (p.g(this.f121988a, r52.f121988a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f121989b, r52.f121989b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f121990c, r52.f121990c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f121991e, r52.f121991e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f121988a.hashCode() * 31) + this.f121989b.hashCode()) * 31) + this.f121990c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f121991e.hashCode();
    }

    public String toString() {
        return "BankAmendResponseData(changeToken=" + this.f121988a + ", accountName=" + this.f121989b + ", accountNumber=" + this.f121990c + ", bankName=" + this.d + ", bankId=" + this.f121991e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f121988a);
        r1.writeString(this.f121989b);
        r1.writeString(this.f121990c);
        r1.writeString(this.d);
        r1.writeString(this.f121991e);
    }
}
