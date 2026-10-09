package com.stockbit.screener.args;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\u0016\u001a\u00020\u0003H\u0096\u0080\u0004J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0006\u0010 \u001a\u00020!J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0083\u0004J\n\u0010&\u001a\u00020!HÖ\u0081\u0004J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006,"}, d2 = {"Lcom/stockbit/screener/args/ScreenerRuleArgs;", "Landroid/os/Parcelable;", "type", "", "operator", "multiplier", "item1", "item1name", "item2", "item2name", "ruleName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getOperator", "getMultiplier", "getItem1", "getItem1name", "getItem2", "getItem2name", "getRuleName", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "screener_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScreenerRuleArgs implements Parcelable {
    public static final Parcelable.Creator<ScreenerRuleArgs> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f131641a;

    /* renamed from: b, reason: collision with root package name */
    public final String f131642b;

    /* renamed from: c, reason: collision with root package name */
    public final String f131643c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f131644e;

    /* renamed from: f, reason: collision with root package name */
    public final String f131645f;

    /* renamed from: g, reason: collision with root package name */
    public final String f131646g;

    /* renamed from: h, reason: collision with root package name */
    public final String f131647h;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ScreenerRuleArgs a(Parcel r11) {
            p.l(r11, "parcel");
            return new ScreenerRuleArgs(r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString());
        }

        public final ScreenerRuleArgs[] b(int r1) {
            return new ScreenerRuleArgs[r1];
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

    public ScreenerRuleArgs(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        p.l(r2, "type");
        p.l(r3, "operator");
        p.l(r4, "multiplier");
        p.l(r5, "item1");
        p.l(r6, "item1name");
        p.l(r7, "item2");
        p.l(r8, "item2name");
        p.l(r9, "ruleName");
        this.f131641a = r2;
        this.f131642b = r3;
        this.f131643c = r4;
        this.d = r5;
        this.f131644e = r6;
        this.f131645f = r7;
        this.f131646g = r8;
        this.f131647h = r9;
    }

    public static /* synthetic */ ScreenerRuleArgs b(ScreenerRuleArgs r02, String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r02.f131641a;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r02.f131642b;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r02.f131643c;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r02.f131644e;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r02.f131645f;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r02.f131646g;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r02.f131647h;
    L26:
        String r92 = r7;
        String r102 = r8;
        String r72 = r5;
        String r82 = r6;
        String r52 = r3;
        String r62 = r4;
        return r02.a(r1, r2, r52, r62, r72, r82, r92, r102);
    }

    public final ScreenerRuleArgs a(String r11, String r12, String r13, String r14, String r15, String r16, String r17, String r18) {
        p.l(r11, "type");
        p.l(r12, "operator");
        p.l(r13, "multiplier");
        p.l(r14, "item1");
        p.l(r15, "item1name");
        p.l(r16, "item2");
        p.l(r17, "item2name");
        p.l(r18, "ruleName");
        return new ScreenerRuleArgs(r11, r12, r13, r14, r15, r16, r17, r18);
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f131644e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f131645f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ScreenerRuleArgs) == true) goto L8;
        return false;
    L8:
        ScreenerRuleArgs r52 = (ScreenerRuleArgs) r5;
        if (p.g(this.f131641a, r52.f131641a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f131642b, r52.f131642b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f131643c, r52.f131643c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f131644e, r52.f131644e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f131645f, r52.f131645f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f131646g, r52.f131646g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f131647h, r52.f131647h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f131646g;
    }

    public final String g() {
        return this.f131643c;
    }

    public final String h() {
        return this.f131642b;
    }

    public int hashCode() {
        return (((((((((((((this.f131641a.hashCode() * 31) + this.f131642b.hashCode()) * 31) + this.f131643c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f131644e.hashCode()) * 31) + this.f131645f.hashCode()) * 31) + this.f131646g.hashCode()) * 31) + this.f131647h.hashCode();
    }

    public final String i() {
        return this.f131647h;
    }

    public final String j() {
        return this.f131641a;
    }

    public String toString() {
        return "{\"type\":\"" + this.f131641a + "\",\"operator\":\"" + this.f131642b + "\",\"multiplier\":\"" + this.f131643c + "\",\"item1name\":\"" + this.f131644e + "\",\"item2name\":\"" + this.f131646g + "\",\"item1\":\"" + this.d + "\",\"item2\":\"" + this.f131645f + "\"}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f131641a);
        r1.writeString(this.f131642b);
        r1.writeString(this.f131643c);
        r1.writeString(this.d);
        r1.writeString(this.f131644e);
        r1.writeString(this.f131645f);
        r1.writeString(this.f131646g);
        r1.writeString(this.f131647h);
    }

    public /* synthetic */ ScreenerRuleArgs(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, int r10, i r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r10 & 128) == 0) goto L27;
        String r102 = "";
    L26:
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92, r102);
        return;
    L27:
        r102 = r9;
        goto L26
    }
}
