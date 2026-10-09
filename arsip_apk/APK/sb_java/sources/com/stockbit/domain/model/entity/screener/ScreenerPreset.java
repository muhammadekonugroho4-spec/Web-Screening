package com.stockbit.domain.model.entity.screener;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006*"}, d2 = {"Lcom/stockbit/domain/model/entity/screener/ScreenerPreset;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "description", "type", "imageUrl", "Lcom/stockbit/domain/model/entity/screener/ScreenerImageUrl;", "presetCategoryName", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/domain/model/entity/screener/ScreenerImageUrl;Ljava/lang/String;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getDescription", "getType", "getImageUrl", "()Lcom/stockbit/domain/model/entity/screener/ScreenerImageUrl;", "getPresetCategoryName", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScreenerPreset implements Parcelable {
    public static final Parcelable.Creator<ScreenerPreset> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final long f82880a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82881b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82882c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final ScreenerImageUrl f82883e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82884f;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ScreenerPreset a(Parcel r10) {
            p.l(r10, "parcel");
            return new ScreenerPreset(r10.readLong(), r10.readString(), r10.readString(), r10.readString(), ScreenerImageUrl.CREATOR.createFromParcel(r10), r10.readString());
        }

        public final ScreenerPreset[] b(int r1) {
            return new ScreenerPreset[r1];
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

    public ScreenerPreset(long r2, String r4, String r5, String r6, ScreenerImageUrl r7, String r8) {
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, "description");
        p.l(r6, "type");
        p.l(r7, "imageUrl");
        p.l(r8, "presetCategoryName");
        this.f82880a = r2;
        this.f82881b = r4;
        this.f82882c = r5;
        this.d = r6;
        this.f82883e = r7;
        this.f82884f = r8;
    }

    public static /* synthetic */ ScreenerPreset b(ScreenerPreset r8, long r9, String r11, String r12, String r13, ScreenerImageUrl r14, String r15, int r16, Object r17) {
        if ((r16 & 1) == 0) goto L5;
        r9 = r8.f82880a;
    L5:
        long r1 = r9;
        if ((r16 & 2) == 0) goto L8;
        r11 = r8.f82881b;
    L8:
        String r3 = r11;
        if ((r16 & 4) == 0) goto L11;
        r12 = r8.f82882c;
    L11:
        String r4 = r12;
        if ((r16 & 8) == 0) goto L14;
        r13 = r8.d;
    L14:
        String r5 = r13;
        if ((r16 & 16) == 0) goto L17;
        r14 = r8.f82883e;
    L17:
        ScreenerImageUrl r6 = r14;
        if ((r16 & 32) == 0) goto L21;
        r15 = r8.f82884f;
    L21:
        return r8.a(r1, r3, r4, r5, r6, r15);
    }

    public final ScreenerPreset a(long r10, String r12, String r13, String r14, ScreenerImageUrl r15, String r16) {
        p.l(r12, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r13, "description");
        p.l(r14, "type");
        p.l(r15, "imageUrl");
        p.l(r16, "presetCategoryName");
        return new ScreenerPreset(r10, r12, r13, r14, r15, r16);
    }

    public final String c() {
        return this.f82882c;
    }

    public final long d() {
        return this.f82880a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ScreenerImageUrl e() {
        return this.f82883e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ScreenerPreset) == true) goto L8;
        return false;
    L8:
        ScreenerPreset r82 = (ScreenerPreset) r8;
        if (this.f82880a == r82.f82880a) goto L12;
        return false;
    L12:
        if (p.g(this.f82881b, r82.f82881b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82882c, r82.f82882c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82883e, r82.f82883e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82884f, r82.f82884f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f82881b;
    }

    public final String g() {
        return this.f82884f;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.f82880a) * 31) + this.f82881b.hashCode()) * 31) + this.f82882c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82883e.hashCode()) * 31) + this.f82884f.hashCode();
    }

    public String toString() {
        return "ScreenerPreset(id=" + this.f82880a + ", name=" + this.f82881b + ", description=" + this.f82882c + ", type=" + this.d + ", imageUrl=" + this.f82883e + ", presetCategoryName=" + this.f82884f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeLong(this.f82880a);
        r3.writeString(this.f82881b);
        r3.writeString(this.f82882c);
        r3.writeString(this.d);
        this.f82883e.writeToParcel(r3, r4);
        r3.writeString(this.f82884f);
    }

    public /* synthetic */ ScreenerPreset(long r9, String r11, String r12, String r13, ScreenerImageUrl r14, String r15, int r16, i r17) {
        if ((r16 & 1) == 0) goto L5;
        r9 = 0;
    L5:
        long r1 = r9;
        if ((r16 & 2) == 0) goto L8;
        String r3 = "";
    L10:
        if ((r16 & 4) == 0) goto L12;
        String r4 = "";
    L14:
        if ((r16 & 8) == 0) goto L16;
        String r5 = "";
    L18:
        if ((r16 & 16) == 0) goto L20;
        r14 = new ScreenerImageUrl(null, null, 3, null);
    L20:
        ScreenerImageUrl r6 = r14;
        if ((r16 & 32) == 0) goto L24;
        String r7 = "";
    L25:
        this(r1, r3, r4, r5, r6, r7);
        return;
    L24:
        r7 = r15;
        goto L25
    L16:
        r5 = r13;
        goto L18
    L12:
        r4 = r12;
        goto L14
    L8:
        r3 = r11;
        goto L10
    }
}
