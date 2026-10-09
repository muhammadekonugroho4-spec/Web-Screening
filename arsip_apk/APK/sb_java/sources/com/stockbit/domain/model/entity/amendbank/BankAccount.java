package com.stockbit.domain.model.entity.amendbank;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.stockbit.domain.model.type.amendbank.BankStatusType;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u008c\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u00109J\u0006\u0010:\u001a\u00020;J\u0014\u0010<\u001a\u00020\u00072\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0083\u0004J\n\u0010?\u001a\u00020;HÖ\u0081\u0004J\n\u0010@\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020;R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0013¨\u0006F"}, d2 = {"Lcom/stockbit/domain/model/entity/amendbank/BankAccount;", "Landroid/os/Parcelable;", "bank_name", "", "account_number", "account_name", "default", "", NotificationCompat.CATEGORY_STATUS, "Lcom/stockbit/domain/model/type/amendbank/BankStatusType;", Constants.KEY_COLOR, "bank_alias", Constants.KEY_ID, "logo", "inWaitingPeriod", "tooltip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stockbit/domain/model/type/amendbank/BankStatusType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getBank_name", "()Ljava/lang/String;", "setBank_name", "(Ljava/lang/String;)V", "getAccount_number", "setAccount_number", "getAccount_name", "setAccount_name", "getDefault", "()Ljava/lang/Boolean;", "setDefault", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getStatus", "()Lcom/stockbit/domain/model/type/amendbank/BankStatusType;", "setStatus", "(Lcom/stockbit/domain/model/type/amendbank/BankStatusType;)V", "getColor", "setColor", "getBank_alias", "setBank_alias", "getId", "setId", "getLogo", "getInWaitingPeriod", "()Z", "getTooltip", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stockbit/domain/model/type/amendbank/BankStatusType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/stockbit/domain/model/entity/amendbank/BankAccount;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BankAccount implements Parcelable {
    public static final Parcelable.Creator<BankAccount> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public String f82495a;

    /* renamed from: b, reason: collision with root package name */
    public String f82496b;

    /* renamed from: c, reason: collision with root package name */
    public String f82497c;
    public Boolean d;

    /* renamed from: e, reason: collision with root package name */
    public BankStatusType f82498e;

    /* renamed from: f, reason: collision with root package name */
    public String f82499f;

    /* renamed from: g, reason: collision with root package name */
    public String f82500g;

    /* renamed from: h, reason: collision with root package name */
    public String f82501h;

    /* renamed from: i, reason: collision with root package name */
    public final String f82502i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f82503j;

    /* renamed from: k, reason: collision with root package name */
    public final String f82504k;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final BankAccount a(Parcel r14) {
            p.l(r14, "parcel");
            String r2 = r14.readString();
            String r3 = r14.readString();
            String r4 = r14.readString();
            BankStatusType r7 = null;
            if (r14.readInt() != 0) goto L6;
            Boolean r02 = null;
        L11:
            if (r14.readInt() == 0) goto L14;
            r7 = BankStatusType.valueOf(r14.readString());
        L14:
            String r8 = r14.readString();
            BankStatusType r6 = r7;
            String r82 = r14.readString();
            String r9 = r14.readString();
            boolean r11 = true;
            String r10 = r14.readString();
            if (r14.readInt() != 0) goto L19;
            r11 = false;
        L19:
            return new BankAccount(r2, r3, r4, r02, r6, r8, r82, r9, r10, r11, r14.readString());
        L6:
            if (r14.readInt() == 0) goto L8;
            boolean r03 = true;
        L9:
            r02 = Boolean.valueOf(r03);
            goto L11
        L8:
            r03 = false;
            goto L9
        }

        public final BankAccount[] b(int r1) {
            return new BankAccount[r1];
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

    public BankAccount(String r2, String r3, String r4, Boolean r5, BankStatusType r6, String r7, String r8, String r9, String r10, boolean r11, String r12) {
        p.l(r10, "logo");
        p.l(r12, "tooltip");
        this.f82495a = r2;
        this.f82496b = r3;
        this.f82497c = r4;
        this.d = r5;
        this.f82498e = r6;
        this.f82499f = r7;
        this.f82500g = r8;
        this.f82501h = r9;
        this.f82502i = r10;
        this.f82503j = r11;
        this.f82504k = r12;
    }

    public final String a() {
        return this.f82497c;
    }

    public final String b() {
        return this.f82496b;
    }

    public final String c() {
        return this.f82500g;
    }

    public final Boolean d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f82501h;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BankAccount) == true) goto L8;
        return false;
    L8:
        BankAccount r52 = (BankAccount) r5;
        if (p.g(this.f82495a, r52.f82495a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82496b, r52.f82496b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82497c, r52.f82497c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f82498e == r52.f82498e) goto L24;
        return false;
    L24:
        if (p.g(this.f82499f, r52.f82499f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f82500g, r52.f82500g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f82501h, r52.f82501h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f82502i, r52.f82502i) == true) goto L36;
        return false;
    L36:
        if (this.f82503j == r52.f82503j) goto L39;
        return false;
    L39:
        if (p.g(this.f82504k, r52.f82504k) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.f82502i;
    }

    public final BankStatusType g() {
        return this.f82498e;
    }

    public final String h() {
        return this.f82504k;
    }

    public int hashCode() {
        String r02 = this.f82495a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f82496b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f82497c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Boolean r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        BankStatusType r27 = this.f82498e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f82499f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f82500g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f82501h;
        if (r213 == null) goto L35;
        r1 = r213.hashCode();
    L35:
        return ((((((r010 + r1) * 31) + this.f82502i.hashCode()) * 31) + Boolean.hashCode(this.f82503j)) * 31) + this.f82504k.hashCode();
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
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
        return "BankAccount(bank_name=" + this.f82495a + ", account_number=" + this.f82496b + ", account_name=" + this.f82497c + ", default=" + this.d + ", status=" + this.f82498e + ", color=" + this.f82499f + ", bank_alias=" + this.f82500g + ", id=" + this.f82501h + ", logo=" + this.f82502i + ", inWaitingPeriod=" + this.f82503j + ", tooltip=" + this.f82504k + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.f82495a);
        r3.writeString(this.f82496b);
        r3.writeString(this.f82497c);
        Boolean r42 = this.d;
        if (r42 != null) goto L5;
        r3.writeInt(0);
    L6:
        BankStatusType r43 = this.f82498e;
        if (r43 != null) goto L9;
        r3.writeInt(0);
    L10:
        r3.writeString(this.f82499f);
        r3.writeString(this.f82500g);
        r3.writeString(this.f82501h);
        r3.writeString(this.f82502i);
        r3.writeInt(this.f82503j ? 1 : 0);
        r3.writeString(this.f82504k);
        return;
    L9:
        r3.writeInt(1);
        r3.writeString(r43.name());
        goto L10
    L5:
        r3.writeInt(1);
        r3.writeInt(r42.booleanValue() ? 1 : 0);
        goto L6
    }
}
