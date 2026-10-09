package com.stockbit.domain.model.entity.search;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.stockbit.company.CompanyEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b9\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\n\u0010*\u001a\u00020\u0003H\u0096\u0080\u0004J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J³\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001J\u0006\u0010=\u001a\u00020\u0005J\u0014\u0010>\u001a\u00020?2\b\u0010\u000e\u001a\u0004\u0018\u00010@HÖ\u0083\u0004J\n\u0010A\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018¨\u0006G"}, d2 = {"Lcom/stockbit/domain/model/entity/search/SearchItemCompany;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "tradeable", "", "followed", "official", AppMeasurementSdk.ConditionalUserProperty.NAME, "symbol2", "symbol3", CompanyEntryPoint.EXTRA_DESC, "img", "type", "other", "country", "exchange", NotificationCompat.CATEGORY_STATUS, "url", "totalFollowers", "iconUrl", "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTradeable", "()I", "getFollowed", "getOfficial", "getName", "getSymbol2", "getSymbol3", "getDesc", "getImg", "getType", "getOther", "getCountry", "getExchange", "getStatus", "getUrl", "getTotalFollowers", "getIconUrl", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", Constants.COPY_TYPE, "describeContents", "equals", "", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.e
/* loaded from: classes8.dex */
public final class SearchItemCompany implements Parcelable {
    public static final Parcelable.Creator<SearchItemCompany> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f82927a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82928b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82929c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82930e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82931f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82932g;

    /* renamed from: h, reason: collision with root package name */
    public final String f82933h;

    /* renamed from: i, reason: collision with root package name */
    public final String f82934i;

    /* renamed from: j, reason: collision with root package name */
    public final String f82935j;

    /* renamed from: k, reason: collision with root package name */
    public final String f82936k;

    /* renamed from: l, reason: collision with root package name */
    public final String f82937l;

    /* renamed from: m, reason: collision with root package name */
    public final String f82938m;

    /* renamed from: n, reason: collision with root package name */
    public final String f82939n;

    /* renamed from: o, reason: collision with root package name */
    public final String f82940o;

    /* renamed from: p, reason: collision with root package name */
    public final String f82941p;

    /* renamed from: q, reason: collision with root package name */
    public final String f82942q;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final SearchItemCompany a(Parcel r20) {
            p.l(r20, "parcel");
            return new SearchItemCompany(r20.readString(), r20.readInt(), r20.readInt(), r20.readInt(), r20.readString(), r20.readString(), r20.readString(), r20.readString(), r20.readString(), r20.readString(), r20.readString(), r20.readString(), r20.readString(), r20.readString(), r20.readString(), r20.readString(), r20.readString());
        }

        public final SearchItemCompany[] b(int r1) {
            return new SearchItemCompany[r1];
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

    public SearchItemCompany(String r17, int r18, int r19, int r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33) {
        p.l(r17, Constants.KEY_ID);
        p.l(r21, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r22, "symbol2");
        p.l(r23, "symbol3");
        p.l(r24, CompanyEntryPoint.EXTRA_DESC);
        p.l(r25, "img");
        p.l(r26, "type");
        p.l(r27, "other");
        p.l(r28, "country");
        p.l(r29, "exchange");
        p.l(r30, NotificationCompat.CATEGORY_STATUS);
        p.l(r31, "url");
        p.l(r32, "totalFollowers");
        p.l(r33, "iconUrl");
        this.f82927a = r17;
        this.f82928b = r18;
        this.f82929c = r19;
        this.d = r20;
        this.f82930e = r21;
        this.f82931f = r22;
        this.f82932g = r23;
        this.f82933h = r24;
        this.f82934i = r25;
        this.f82935j = r26;
        this.f82936k = r27;
        this.f82937l = r28;
        this.f82938m = r29;
        this.f82939n = r30;
        this.f82940o = r31;
        this.f82941p = r32;
        this.f82942q = r33;
    }

    public final String a() {
        return this.f82933h;
    }

    public final String b() {
        return this.f82927a;
    }

    public final String c() {
        return this.f82930e;
    }

    public final String d() {
        return this.f82931f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SearchItemCompany) == true) goto L8;
        return false;
    L8:
        SearchItemCompany r52 = (SearchItemCompany) r5;
        if (p.g(this.f82927a, r52.f82927a) == true) goto L12;
        return false;
    L12:
        if (this.f82928b == r52.f82928b) goto L15;
        return false;
    L15:
        if (this.f82929c == r52.f82929c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f82930e, r52.f82930e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82931f, r52.f82931f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f82932g, r52.f82932g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f82933h, r52.f82933h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f82934i, r52.f82934i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f82935j, r52.f82935j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f82936k, r52.f82936k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f82937l, r52.f82937l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f82938m, r52.f82938m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f82939n, r52.f82939n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f82940o, r52.f82940o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f82941p, r52.f82941p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f82942q, r52.f82942q) == true) goto L59;
        return false;
    L59:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.f82927a.hashCode() * 31) + Integer.hashCode(this.f82928b)) * 31) + Integer.hashCode(this.f82929c)) * 31) + Integer.hashCode(this.d)) * 31) + this.f82930e.hashCode()) * 31) + this.f82931f.hashCode()) * 31) + this.f82932g.hashCode()) * 31) + this.f82933h.hashCode()) * 31) + this.f82934i.hashCode()) * 31) + this.f82935j.hashCode()) * 31) + this.f82936k.hashCode()) * 31) + this.f82937l.hashCode()) * 31) + this.f82938m.hashCode()) * 31) + this.f82939n.hashCode()) * 31) + this.f82940o.hashCode()) * 31) + this.f82941p.hashCode()) * 31) + this.f82942q.hashCode();
    }

    public String toString() {
        return this.f82930e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f82927a);
        r1.writeInt(this.f82928b);
        r1.writeInt(this.f82929c);
        r1.writeInt(this.d);
        r1.writeString(this.f82930e);
        r1.writeString(this.f82931f);
        r1.writeString(this.f82932g);
        r1.writeString(this.f82933h);
        r1.writeString(this.f82934i);
        r1.writeString(this.f82935j);
        r1.writeString(this.f82936k);
        r1.writeString(this.f82937l);
        r1.writeString(this.f82938m);
        r1.writeString(this.f82939n);
        r1.writeString(this.f82940o);
        r1.writeString(this.f82941p);
        r1.writeString(this.f82942q);
    }

    public /* synthetic */ SearchItemCompany(String r19, int r20, int r21, int r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, int r36, kotlin.jvm.internal.i r37) {
        if ((r36 & 1) == 0) goto L5;
        String r1 = "";
    L6:
        int r4 = 0;
        if ((r36 & 2) == 0) goto L9;
        int r3 = 0;
    L11:
        if ((r36 & 4) == 0) goto L13;
        int r5 = 0;
    L15:
        if ((r36 & 8) != 0) goto L19;
        r4 = r22;
    L19:
        if ((r36 & 16) == 0) goto L21;
        String r6 = "";
    L23:
        if ((r36 & 32) == 0) goto L25;
        String r7 = "";
    L27:
        if ((r36 & 64) == 0) goto L29;
        String r8 = "";
    L31:
        if ((r36 & 128) == 0) goto L33;
        String r9 = "";
    L35:
        if ((r36 & 256) == 0) goto L37;
        String r10 = "";
    L39:
        if ((r36 & 512) == 0) goto L41;
        String r11 = "";
    L43:
        if ((r36 & 1024) == 0) goto L45;
        String r12 = "";
    L47:
        if ((r36 & 2048) == 0) goto L49;
        String r13 = "";
    L51:
        if ((r36 & 4096) == 0) goto L53;
        String r14 = "";
    L55:
        if ((r36 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = "";
    L58:
        String r192 = r1;
        if ((r36 & 16384) == 0) goto L61;
        String r16 = "";
    L63:
        if ((r36 & 32768) == 0) goto L65;
        String r162 = "";
    L67:
        if ((r36 & 65536) == 0) goto L70;
        String r362 = "";
    L71:
        this(r192, r3, r5, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r162, r362);
        return;
    L70:
        r362 = r35;
        goto L71
    L65:
        r162 = r34;
        goto L67
    L61:
        r16 = r33;
        goto L63
    L57:
        r15 = r32;
        goto L58
    L53:
        r14 = r31;
        goto L55
    L49:
        r13 = r30;
        goto L51
    L45:
        r12 = r29;
        goto L47
    L41:
        r11 = r28;
        goto L43
    L37:
        r10 = r27;
        goto L39
    L33:
        r9 = r26;
        goto L35
    L29:
        r8 = r25;
        goto L31
    L25:
        r7 = r24;
        goto L27
    L21:
        r6 = r23;
        goto L23
    L13:
        r5 = r21;
        goto L15
    L9:
        r3 = r20;
        goto L11
    L5:
        r1 = r19;
        goto L6
    }
}
