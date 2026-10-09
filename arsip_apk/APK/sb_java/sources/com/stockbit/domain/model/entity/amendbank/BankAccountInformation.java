package com.stockbit.domain.model.entity.amendbank;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003JB\u0010\"\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010#J\u0006\u0010$\u001a\u00020\u0006J\u0014\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0083\u0004J\n\u0010(\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010)\u001a\u00020\bHÖ\u0081\u0004J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0006R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006/"}, d2 = {"Lcom/stockbit/domain/model/entity/amendbank/BankAccountInformation;", "Landroid/os/Parcelable;", "banks", "", "Lcom/stockbit/domain/model/entity/amendbank/BankAccount;", "max_bank_account", "", Constants.KEY_ID, "", "amenable", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Z)V", "getBanks", "()Ljava/util/List;", "setBanks", "(Ljava/util/List;)V", "getMax_bank_account", "()Ljava/lang/Integer;", "setMax_bank_account", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getAmenable", "()Z", "setAmenable", "(Z)V", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Z)Lcom/stockbit/domain/model/entity/amendbank/BankAccountInformation;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BankAccountInformation implements Parcelable {
    public static final Parcelable.Creator<BankAccountInformation> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public List f82505a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f82506b;

    /* renamed from: c, reason: collision with root package name */
    public String f82507c;
    public boolean d;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final BankAccountInformation a(Parcel r7) {
            p.l(r7, "parcel");
            boolean r1 = false;
            Integer r2 = null;
            if (r7.readInt() != 0) goto L5;
            ArrayList r3 = null;
        L9:
            if (r7.readInt() == 0) goto L12;
            r2 = Integer.valueOf(r7.readInt());
        L12:
            String r02 = r7.readString();
            if (r7.readInt() == 0) goto L16;
            r1 = true;
        L16:
            return new BankAccountInformation(r3, r2, r02, r1);
        L5:
            int r03 = r7.readInt();
            r3 = new ArrayList(r03);
            int r4 = 0;
        L6:
            if (r4 == r03) goto L9;
            r3.add(BankAccount.CREATOR.createFromParcel(r7));
            r4 = r4 + 1;
            goto L6
        }

        public final BankAccountInformation[] b(int r1) {
            return new BankAccountInformation[r1];
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

    public BankAccountInformation(List r1, Integer r2, String r3, boolean r4) {
        this.f82505a = r1;
        this.f82506b = r2;
        this.f82507c = r3;
        this.d = r4;
    }

    public final boolean a() {
        return this.d;
    }

    public final List b() {
        return this.f82505a;
    }

    public final String c() {
        return this.f82507c;
    }

    public final Integer d() {
        return this.f82506b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BankAccountInformation) == true) goto L8;
        return false;
    L8:
        BankAccountInformation r52 = (BankAccountInformation) r5;
        if (p.g(this.f82505a, r52.f82505a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82506b, r52.f82506b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82507c, r52.f82507c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        List r02 = this.f82505a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.f82506b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f82507c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return ((r05 + r1) * 31) + Boolean.hashCode(this.d);
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "BankAccountInformation(banks=" + this.f82505a + ", max_bank_account=" + this.f82506b + ", id=" + this.f82507c + ", amenable=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        p.l(r5, "dest");
        List r02 = this.f82505a;
        if (r02 != null) goto L5;
        r5.writeInt(0);
    L9:
        Integer r62 = this.f82506b;
        if (r62 != null) goto L12;
        r5.writeInt(0);
    L13:
        r5.writeString(this.f82507c);
        r5.writeInt(this.d ? 1 : 0);
        return;
    L12:
        r5.writeInt(1);
        r5.writeInt(r62.intValue());
        goto L13
    L5:
        r5.writeInt(1);
        r5.writeInt(r02.size());
        Iterator r03 = r02.iterator();
    L7:
        if (r03.hasNext() == false) goto L9;
        ((BankAccount) r03.next()).writeToParcel(r5, r6);
        goto L7
    }
}
