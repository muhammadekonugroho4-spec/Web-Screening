package com.stockbit.domain.model.entity.securities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\t\u00102\u001a\u00020\u0011HÆ\u0003J\u008b\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0006\u00104\u001a\u000205J\u0014\u00106\u001a\u00020\u000f2\b\u00107\u001a\u0004\u0018\u000108HÖ\u0083\u0004J\n\u00109\u001a\u000205HÖ\u0081\u0004J\n\u0010:\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000205R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010 \"\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b%\u0010 ¨\u0006@"}, d2 = {"Lcom/stockbit/domain/model/entity/securities/SmartOrderParentInfo;", "Landroid/os/Parcelable;", "orderId", "", Constants.ScionAnalytics.PARAM_LABEL, "triggerPrice", "amount", NotificationCompat.CATEGORY_STATUS, "expiryType", "orderType", "parentId", "parentPrice", "symbol", com.clevertap.android.sdk.Constants.KEY_ACTION, "isWithdrawSelected", "", "bulkCancelState", "Lcom/stockbit/domain/model/entity/securities/BulkCancelUIState;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stockbit/domain/model/entity/securities/BulkCancelUIState;)V", "getOrderId", "()Ljava/lang/String;", "getLabel", "getTriggerPrice", "getAmount", "getStatus", "getExpiryType", "getOrderType", "getParentId", "getParentPrice", "getSymbol", "getAction", "()Z", "setWithdrawSelected", "(Z)V", "getBulkCancelState", "()Lcom/stockbit/domain/model/entity/securities/BulkCancelUIState;", "isBulkCancellable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", com.clevertap.android.sdk.Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SmartOrderParentInfo implements Parcelable {
    public static final Parcelable.Creator<SmartOrderParentInfo> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f83162a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83163b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83164c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f83165e;

    /* renamed from: f, reason: collision with root package name */
    public final String f83166f;

    /* renamed from: g, reason: collision with root package name */
    public final String f83167g;

    /* renamed from: h, reason: collision with root package name */
    public final String f83168h;

    /* renamed from: i, reason: collision with root package name */
    public final String f83169i;

    /* renamed from: j, reason: collision with root package name */
    public final String f83170j;

    /* renamed from: k, reason: collision with root package name */
    public final String f83171k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f83172l;

    /* renamed from: m, reason: collision with root package name */
    public final BulkCancelUIState f83173m;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final SmartOrderParentInfo a(Parcel r16) {
            kotlin.jvm.internal.p.l(r16, "parcel");
            String r2 = r16.readString();
            String r3 = r16.readString();
            String r4 = r16.readString();
            String r5 = r16.readString();
            String r6 = r16.readString();
            String r7 = r16.readString();
            String r8 = r16.readString();
            String r9 = r16.readString();
            String r10 = r16.readString();
            String r11 = r16.readString();
            String r12 = r16.readString();
            if (r16.readInt() == 0) goto L6;
            boolean r02 = true;
        L5:
            boolean r13 = r02;
            return new SmartOrderParentInfo(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, BulkCancelUIState.valueOf(r16.readString()));
        L6:
            r02 = false;
            goto L5
        }

        public final SmartOrderParentInfo[] b(int r1) {
            return new SmartOrderParentInfo[r1];
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

    public SmartOrderParentInfo(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, boolean r13, BulkCancelUIState r14) {
        kotlin.jvm.internal.p.l(r2, "orderId");
        kotlin.jvm.internal.p.l(r3, Constants.ScionAnalytics.PARAM_LABEL);
        kotlin.jvm.internal.p.l(r4, "triggerPrice");
        kotlin.jvm.internal.p.l(r5, "amount");
        kotlin.jvm.internal.p.l(r6, NotificationCompat.CATEGORY_STATUS);
        kotlin.jvm.internal.p.l(r7, "expiryType");
        kotlin.jvm.internal.p.l(r8, "orderType");
        kotlin.jvm.internal.p.l(r9, "parentId");
        kotlin.jvm.internal.p.l(r10, "parentPrice");
        kotlin.jvm.internal.p.l(r11, "symbol");
        kotlin.jvm.internal.p.l(r12, com.clevertap.android.sdk.Constants.KEY_ACTION);
        kotlin.jvm.internal.p.l(r14, "bulkCancelState");
        this.f83162a = r2;
        this.f83163b = r3;
        this.f83164c = r4;
        this.d = r5;
        this.f83165e = r6;
        this.f83166f = r7;
        this.f83167g = r8;
        this.f83168h = r9;
        this.f83169i = r10;
        this.f83170j = r11;
        this.f83171k = r12;
        this.f83172l = r13;
        this.f83173m = r14;
    }

    public final String a() {
        return this.f83171k;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f83166f;
    }

    public final String d() {
        return this.f83165e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f83170j;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SmartOrderParentInfo) == true) goto L8;
        return false;
    L8:
        SmartOrderParentInfo r52 = (SmartOrderParentInfo) r5;
        if (kotlin.jvm.internal.p.g(this.f83162a, r52.f83162a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83163b, r52.f83163b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83164c, r52.f83164c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f83165e, r52.f83165e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f83166f, r52.f83166f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f83167g, r52.f83167g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f83168h, r52.f83168h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f83169i, r52.f83169i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f83170j, r52.f83170j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f83171k, r52.f83171k) == true) goto L42;
        return false;
    L42:
        if (this.f83172l == r52.f83172l) goto L45;
        return false;
    L45:
        if (this.f83173m == r52.f83173m) goto L47;
        return false;
    L47:
        return true;
    }

    public final String f() {
        return this.f83164c;
    }

    public final boolean g() {
        if (this.f83173m != BulkCancelUIState.SHOW_ITEM_SELECTABLE) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean h() {
        return this.f83172l;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f83162a.hashCode() * 31) + this.f83163b.hashCode()) * 31) + this.f83164c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f83165e.hashCode()) * 31) + this.f83166f.hashCode()) * 31) + this.f83167g.hashCode()) * 31) + this.f83168h.hashCode()) * 31) + this.f83169i.hashCode()) * 31) + this.f83170j.hashCode()) * 31) + this.f83171k.hashCode()) * 31) + Boolean.hashCode(this.f83172l)) * 31) + this.f83173m.hashCode();
    }

    public final void i(boolean r1) {
        this.f83172l = r1;
    }

    public String toString() {
        return "SmartOrderParentInfo(orderId=" + this.f83162a + ", label=" + this.f83163b + ", triggerPrice=" + this.f83164c + ", amount=" + this.d + ", status=" + this.f83165e + ", expiryType=" + this.f83166f + ", orderType=" + this.f83167g + ", parentId=" + this.f83168h + ", parentPrice=" + this.f83169i + ", symbol=" + this.f83170j + ", action=" + this.f83171k + ", isWithdrawSelected=" + this.f83172l + ", bulkCancelState=" + this.f83173m + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        kotlin.jvm.internal.p.l(r1, "dest");
        r1.writeString(this.f83162a);
        r1.writeString(this.f83163b);
        r1.writeString(this.f83164c);
        r1.writeString(this.d);
        r1.writeString(this.f83165e);
        r1.writeString(this.f83166f);
        r1.writeString(this.f83167g);
        r1.writeString(this.f83168h);
        r1.writeString(this.f83169i);
        r1.writeString(this.f83170j);
        r1.writeString(this.f83171k);
        r1.writeInt(this.f83172l ? 1 : 0);
        r1.writeString(this.f83173m.name());
    }

    public /* synthetic */ SmartOrderParentInfo(String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, boolean r28, BulkCancelUIState r29, int r30, kotlin.jvm.internal.i r31) {
        if ((r30 & 2048) == 0) goto L5;
        boolean r14 = false;
    L7:
        if ((r30 & 4096) == 0) goto L10;
        BulkCancelUIState r15 = BulkCancelUIState.UNSPECIFIED;
    L11:
        this(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r14, r15);
        return;
    L10:
        r15 = r29;
        goto L11
    L5:
        r14 = r28;
        goto L7
    }
}
