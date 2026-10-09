package com.stockbit.model.entity.screener;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.stockbit.search.SearchEntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\u000b\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u001d\u0010/\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\u000bHÆ\u0003J\u001d\u00100\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\u000bHÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\u0090\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\u000b2\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u00103J\u0006\u00104\u001a\u00020\u0007J\u0014\u00105\u001a\u00020\u000e2\b\u00106\u001a\u0004\u0018\u000107HÖ\u0083\u0004J\n\u00108\u001a\u00020\u0007HÖ\u0081\u0004J\n\u00109\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0007R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR2\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R2\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006?"}, d2 = {"Lcom/stockbit/model/entity/screener/ScreenerDetailUniverseResponseData;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "scope", "type", "", FirebaseAnalytics.Param.LEVEL, SearchEntryPoint.KEY_SUB_SECTOR, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "list", "checked", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;Z)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getName", "setName", "getScope", "setScope", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLevel", "setLevel", "getSubsector", "()Ljava/util/ArrayList;", "setSubsector", "(Ljava/util/ArrayList;)V", "getList", "setList", "getChecked", "()Z", "setChecked", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;Z)Lcom/stockbit/model/entity/screener/ScreenerDetailUniverseResponseData;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScreenerDetailUniverseResponseData implements Parcelable {
    public static final Parcelable.Creator<ScreenerDetailUniverseResponseData> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public boolean f122063a;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    @Expose
    private String f122064id;

    @SerializedName(FirebaseAnalytics.Param.LEVEL)
    @Expose
    private Integer level;

    @SerializedName("list")
    @Expose
    private ArrayList<ScreenerDetailUniverseResponseData> list;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @Expose
    private String name;

    @SerializedName("scope")
    @Expose
    private String scope;

    @SerializedName(SearchEntryPoint.KEY_SUB_SECTOR)
    @Expose
    private ArrayList<ScreenerDetailUniverseResponseData> subsector;

    @SerializedName("type")
    @Expose
    private Integer type;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ScreenerDetailUniverseResponseData a(Parcel r12) {
            p.l(r12, "parcel");
            String r2 = r12.readString();
            String r3 = r12.readString();
            String r4 = r12.readString();
            ArrayList r1 = null;
            if (r12.readInt() != 0) goto L5;
            Integer r5 = null;
        L7:
            if (r12.readInt() != 0) goto L9;
            Integer r6 = null;
        L10:
            boolean r7 = false;
            if (r12.readInt() != 0) goto L13;
            ArrayList r8 = null;
        L17:
            if (r12.readInt() == 0) goto L23;
            int r02 = r12.readInt();
            r1 = new ArrayList(r02);
            int r9 = 0;
        L20:
            if (r9 == r02) goto L23;
            r1.add(ScreenerDetailUniverseResponseData.CREATOR.createFromParcel(r12));
            r9 = r9 + 1;
        L23:
            if (r12.readInt() == 0) goto L26;
            r7 = true;
        L26:
            return new ScreenerDetailUniverseResponseData(r2, r3, r4, r5, r6, r8, r1, r7);
        L13:
            int r03 = r12.readInt();
            r8 = new ArrayList(r03);
            int r92 = 0;
        L14:
            if (r92 == r03) goto L17;
            r8.add(ScreenerDetailUniverseResponseData.CREATOR.createFromParcel(r12));
            r92 = r92 + 1;
            goto L14
        L9:
            r6 = Integer.valueOf(r12.readInt());
            goto L10
        L5:
            r5 = Integer.valueOf(r12.readInt());
            goto L7
        }

        public final ScreenerDetailUniverseResponseData[] b(int r1) {
            return new ScreenerDetailUniverseResponseData[r1];
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

    public ScreenerDetailUniverseResponseData(String r1, String r2, String r3, Integer r4, Integer r5, ArrayList<ScreenerDetailUniverseResponseData> r6, ArrayList<ScreenerDetailUniverseResponseData> r7, boolean r8) {
        this.f122064id = r1;
        this.name = r2;
        this.scope = r3;
        this.type = r4;
        this.level = r5;
        this.subsector = r6;
        this.list = r7;
        this.f122063a = r8;
    }

    public final String a() {
        return this.f122064id;
    }

    public final Integer b() {
        return this.level;
    }

    public final ArrayList c() {
        return this.list;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.scope;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ScreenerDetailUniverseResponseData) == true) goto L8;
        return false;
    L8:
        ScreenerDetailUniverseResponseData r52 = (ScreenerDetailUniverseResponseData) r5;
        if (p.g(this.f122064id, r52.f122064id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.name, r52.name) == true) goto L15;
        return false;
    L15:
        if (p.g(this.scope, r52.scope) == true) goto L18;
        return false;
    L18:
        if (p.g(this.type, r52.type) == true) goto L21;
        return false;
    L21:
        if (p.g(this.level, r52.level) == true) goto L24;
        return false;
    L24:
        if (p.g(this.subsector, r52.subsector) == true) goto L27;
        return false;
    L27:
        if (p.g(this.list, r52.list) == true) goto L30;
        return false;
    L30:
        if (this.f122063a == r52.f122063a) goto L32;
        return false;
    L32:
        return true;
    }

    public final ArrayList f() {
        return this.subsector;
    }

    public final Integer g() {
        return this.type;
    }

    public final void h(Integer r1) {
        this.level = r1;
    }

    public int hashCode() {
        String r02 = this.f122064id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.name;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.scope;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Integer r25 = this.type;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Integer r27 = this.level;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        ArrayList<ScreenerDetailUniverseResponseData> r29 = this.subsector;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        ArrayList<ScreenerDetailUniverseResponseData> r211 = this.list;
        if (r211 == null) goto L31;
        r1 = r211.hashCode();
    L31:
        return ((r09 + r1) * 31) + Boolean.hashCode(this.f122063a);
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

    public final void i(Integer r1) {
        this.type = r1;
    }

    public String toString() {
        return "ScreenerDetailUniverseResponseData(id=" + this.f122064id + ", name=" + this.name + ", scope=" + this.scope + ", type=" + this.type + ", level=" + this.level + ", subsector=" + this.subsector + ", list=" + this.list + ", checked=" + this.f122063a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        p.l(r5, "dest");
        r5.writeString(this.f122064id);
        r5.writeString(this.name);
        r5.writeString(this.scope);
        Integer r02 = this.type;
        if (r02 != null) goto L5;
        r5.writeInt(0);
    L6:
        Integer r03 = this.level;
        if (r03 != null) goto L9;
        r5.writeInt(0);
    L10:
        ArrayList<ScreenerDetailUniverseResponseData> r04 = this.subsector;
        if (r04 != null) goto L13;
        r5.writeInt(0);
    L17:
        ArrayList<ScreenerDetailUniverseResponseData> r05 = this.list;
        if (r05 != null) goto L20;
        r5.writeInt(0);
    L24:
        r5.writeInt(this.f122063a ? 1 : 0);
        return;
    L20:
        r5.writeInt(1);
        r5.writeInt(r05.size());
        Iterator<ScreenerDetailUniverseResponseData> r06 = r05.iterator();
    L22:
        if (r06.hasNext() == false) goto L24;
        r06.next().writeToParcel(r5, r6);
        goto L22
    L13:
        r5.writeInt(1);
        r5.writeInt(r04.size());
        Iterator<ScreenerDetailUniverseResponseData> r07 = r04.iterator();
    L15:
        if (r07.hasNext() == false) goto L17;
        r07.next().writeToParcel(r5, r6);
        goto L15
    L9:
        r5.writeInt(1);
        r5.writeInt(r03.intValue());
        goto L10
    L5:
        r5.writeInt(1);
        r5.writeInt(r02.intValue());
        goto L6
    }

    public /* synthetic */ ScreenerDetailUniverseResponseData(String r11, String r12, String r13, Integer r14, Integer r15, ArrayList r16, ArrayList r17, boolean r18, int r19, i r20) {
        if ((r19 & 128) == 0) goto L6;
        boolean r9 = false;
    L7:
        this(r11, r12, r13, r14, r15, r16, r17, r9);
        return;
    L6:
        r9 = r18;
        goto L7
    }
}
