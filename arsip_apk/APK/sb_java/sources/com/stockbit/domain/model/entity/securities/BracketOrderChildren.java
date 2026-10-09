package com.stockbit.domain.model.entity.securities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u009f\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001J\u0006\u00104\u001a\u000205J\u0014\u00106\u001a\u00020\u000b2\b\u00107\u001a\u0004\u0018\u000108HÖ\u0083\u0004J\n\u00109\u001a\u000205HÖ\u0081\u0004J\n\u0010:\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000205R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017¨\u0006@"}, d2 = {"Lcom/stockbit/domain/model/entity/securities/BracketOrderChildren;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "symbol", "symbolFormatter", FirebaseAnalytics.Param.PRICE, "percentage", "", "amount", "isGtc", "", NotificationCompat.CATEGORY_STATUS, Constants.ScionAnalytics.PARAM_LABEL, "proceedFee", "isEnable", "isWithdrawSelected", "isVisible", "lotOrdered", "platformOrderType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getSymbol", "getSymbolFormatter", "getPrice", "getPercentage", "()D", "getAmount", "()Z", "getStatus", "getLabel", "getProceedFee", "getLotOrdered", "getPlatformOrderType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", com.clevertap.android.sdk.Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BracketOrderChildren implements Parcelable {
    public static final Parcelable.Creator<BracketOrderChildren> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f83026a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83027b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83028c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final double f83029e;

    /* renamed from: f, reason: collision with root package name */
    public final String f83030f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f83031g;

    /* renamed from: h, reason: collision with root package name */
    public final String f83032h;

    /* renamed from: i, reason: collision with root package name */
    public final String f83033i;

    /* renamed from: j, reason: collision with root package name */
    public final String f83034j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f83035k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f83036l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f83037m;

    /* renamed from: n, reason: collision with root package name */
    public final String f83038n;

    /* renamed from: o, reason: collision with root package name */
    public final String f83039o;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final BracketOrderChildren a(Parcel r19) {
            kotlin.jvm.internal.p.l(r19, "parcel");
            String r2 = r19.readString();
            String r3 = r19.readString();
            String r4 = r19.readString();
            String r5 = r19.readString();
            double r6 = r19.readDouble();
            String r8 = r19.readString();
            boolean r9 = false;
            if (r19.readInt() == 0) goto L5;
            boolean r02 = false;
            r9 = true;
            boolean r11 = true;
        L6:
            String r10 = r19.readString();
            boolean r12 = r11;
            String r112 = r19.readString();
            boolean r13 = r12;
            String r122 = r19.readString();
            if (r19.readInt() == 0) goto L9;
            boolean r14 = r13;
        L11:
            if (r19.readInt() == 0) goto L13;
            boolean r15 = r14;
        L15:
            if (r19.readInt() != 0) goto L19;
            r15 = r02;
        L19:
            return new BracketOrderChildren(r2, r3, r4, r5, r6, r8, r9, r10, r112, r122, r13, r14, r15, r19.readString(), r19.readString());
        L13:
            r15 = r14;
            r14 = r02;
            goto L15
        L9:
            r14 = r13;
            r13 = r02;
            goto L11
        L5:
            r02 = false;
            r11 = true;
            goto L6
        }

        public final BracketOrderChildren[] b(int r1) {
            return new BracketOrderChildren[r1];
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

    public BracketOrderChildren(String r7, String r8, String r9, String r10, double r11, String r13, boolean r14, String r15, String r16, String r17, boolean r18, boolean r19, boolean r20, String r21, String r22) {
        kotlin.jvm.internal.p.l(r7, com.clevertap.android.sdk.Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r8, "symbol");
        kotlin.jvm.internal.p.l(r9, "symbolFormatter");
        kotlin.jvm.internal.p.l(r10, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r13, "amount");
        kotlin.jvm.internal.p.l(r15, NotificationCompat.CATEGORY_STATUS);
        kotlin.jvm.internal.p.l(r16, Constants.ScionAnalytics.PARAM_LABEL);
        kotlin.jvm.internal.p.l(r17, "proceedFee");
        kotlin.jvm.internal.p.l(r21, "lotOrdered");
        kotlin.jvm.internal.p.l(r22, "platformOrderType");
        this.f83026a = r7;
        this.f83027b = r8;
        this.f83028c = r9;
        this.d = r10;
        this.f83029e = r11;
        this.f83030f = r13;
        this.f83031g = r14;
        this.f83032h = r15;
        this.f83033i = r16;
        this.f83034j = r17;
        this.f83035k = r18;
        this.f83036l = r19;
        this.f83037m = r20;
        this.f83038n = r21;
        this.f83039o = r22;
    }

    public final String a() {
        return this.f83026a;
    }

    public final String b() {
        return this.f83033i;
    }

    public final String c() {
        return this.f83038n;
    }

    public final String d() {
        return this.f83039o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BracketOrderChildren) == true) goto L8;
        return false;
    L8:
        BracketOrderChildren r82 = (BracketOrderChildren) r8;
        if (kotlin.jvm.internal.p.g(this.f83026a, r82.f83026a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83027b, r82.f83027b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83028c, r82.f83028c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f83029e, r82.f83029e) == 0) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f83030f, r82.f83030f) == true) goto L27;
        return false;
    L27:
        if (this.f83031g == r82.f83031g) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f83032h, r82.f83032h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f83033i, r82.f83033i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f83034j, r82.f83034j) == true) goto L39;
        return false;
    L39:
        if (this.f83035k == r82.f83035k) goto L42;
        return false;
    L42:
        if (this.f83036l == r82.f83036l) goto L45;
        return false;
    L45:
        if (this.f83037m == r82.f83037m) goto L48;
        return false;
    L48:
        if (kotlin.jvm.internal.p.g(this.f83038n, r82.f83038n) == true) goto L51;
        return false;
    L51:
        if (kotlin.jvm.internal.p.g(this.f83039o, r82.f83039o) == true) goto L53;
        return false;
    L53:
        return true;
    }

    public final String f() {
        return this.f83034j;
    }

    public final String g() {
        return this.f83032h;
    }

    public final String h() {
        return this.f83028c;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f83026a.hashCode() * 31) + this.f83027b.hashCode()) * 31) + this.f83028c.hashCode()) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f83029e)) * 31) + this.f83030f.hashCode()) * 31) + Boolean.hashCode(this.f83031g)) * 31) + this.f83032h.hashCode()) * 31) + this.f83033i.hashCode()) * 31) + this.f83034j.hashCode()) * 31) + Boolean.hashCode(this.f83035k)) * 31) + Boolean.hashCode(this.f83036l)) * 31) + Boolean.hashCode(this.f83037m)) * 31) + this.f83038n.hashCode()) * 31) + this.f83039o.hashCode();
    }

    public final boolean i() {
        return this.f83031g;
    }

    public String toString() {
        return "BracketOrderChildren(id=" + this.f83026a + ", symbol=" + this.f83027b + ", symbolFormatter=" + this.f83028c + ", price=" + this.d + ", percentage=" + this.f83029e + ", amount=" + this.f83030f + ", isGtc=" + this.f83031g + ", status=" + this.f83032h + ", label=" + this.f83033i + ", proceedFee=" + this.f83034j + ", isEnable=" + this.f83035k + ", isWithdrawSelected=" + this.f83036l + ", isVisible=" + this.f83037m + ", lotOrdered=" + this.f83038n + ", platformOrderType=" + this.f83039o + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        kotlin.jvm.internal.p.l(r3, "dest");
        r3.writeString(this.f83026a);
        r3.writeString(this.f83027b);
        r3.writeString(this.f83028c);
        r3.writeString(this.d);
        r3.writeDouble(this.f83029e);
        r3.writeString(this.f83030f);
        r3.writeInt(this.f83031g ? 1 : 0);
        r3.writeString(this.f83032h);
        r3.writeString(this.f83033i);
        r3.writeString(this.f83034j);
        r3.writeInt(this.f83035k ? 1 : 0);
        r3.writeInt(this.f83036l ? 1 : 0);
        r3.writeInt(this.f83037m ? 1 : 0);
        r3.writeString(this.f83038n);
        r3.writeString(this.f83039o);
    }
}
