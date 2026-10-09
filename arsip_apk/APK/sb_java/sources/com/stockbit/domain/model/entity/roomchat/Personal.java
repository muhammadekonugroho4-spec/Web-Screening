package com.stockbit.domain.model.entity.roomchat;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.e;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013JJ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\bJ\u0014\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0083\u0004J\n\u0010\"\u001a\u00020\bHÖ\u0081\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\bR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0002\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0004\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0005\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0006\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006*"}, d2 = {"Lcom/stockbit/domain/model/entity/roomchat/Personal;", "Landroid/os/Parcelable;", "isAdmin", "", "isBlocked", "isDeactivated", "isVerified", "userId", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "()Ljava/lang/Boolean;", "setAdmin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setBlocked", "setDeactivated", "setVerified", "getUserId", "()Ljava/lang/Integer;", "setUserId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/stockbit/domain/model/entity/roomchat/Personal;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@e
/* loaded from: classes8.dex */
public final class Personal implements Parcelable {
    public static final Parcelable.Creator<Personal> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public Boolean f82836a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f82837b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f82838c;
    public Boolean d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f82839e;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final Personal a(Parcel r9) {
            p.l(r9, "parcel");
            boolean r2 = false;
            Integer r4 = null;
            if (r9.readInt() != 0) goto L6;
            Boolean r02 = null;
        L11:
            if (r9.readInt() != 0) goto L14;
            Boolean r5 = null;
        L19:
            if (r9.readInt() != 0) goto L22;
            Boolean r6 = null;
        L27:
            if (r9.readInt() != 0) goto L30;
            Boolean r22 = null;
        L34:
            if (r9.readInt() == 0) goto L38;
            r4 = Integer.valueOf(r9.readInt());
        L38:
            return new Personal(r02, r5, r6, r22, r4);
        L30:
            if (r9.readInt() == 0) goto L32;
            r2 = true;
        L32:
            r22 = Boolean.valueOf(r2);
            goto L34
        L22:
            if (r9.readInt() == 0) goto L24;
            boolean r62 = true;
        L25:
            r6 = Boolean.valueOf(r62);
            goto L27
        L24:
            r62 = false;
            goto L25
        L14:
            if (r9.readInt() == 0) goto L16;
            boolean r52 = true;
        L17:
            r5 = Boolean.valueOf(r52);
            goto L19
        L16:
            r52 = false;
            goto L17
        L6:
            if (r9.readInt() == 0) goto L8;
            boolean r03 = true;
        L9:
            r02 = Boolean.valueOf(r03);
            goto L11
        L8:
            r03 = false;
            goto L9
        }

        public final Personal[] b(int r1) {
            return new Personal[r1];
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

    public Personal(Boolean r1, Boolean r2, Boolean r3, Boolean r4, Integer r5) {
        this.f82836a = r1;
        this.f82837b = r2;
        this.f82838c = r3;
        this.d = r4;
        this.f82839e = r5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Personal) == true) goto L8;
        return false;
    L8:
        Personal r52 = (Personal) r5;
        if (p.g(this.f82836a, r52.f82836a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82837b, r52.f82837b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82838c, r52.f82838c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82839e, r52.f82839e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.f82836a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.f82837b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Boolean r23 = this.f82838c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Boolean r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Integer r27 = this.f82839e;
        if (r27 == null) goto L23;
        r1 = r27.hashCode();
    L23:
        return r07 + r1;
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
        return "Personal(isAdmin=" + this.f82836a + ", isBlocked=" + this.f82837b + ", isDeactivated=" + this.f82838c + ", isVerified=" + this.d + ", userId=" + this.f82839e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        Boolean r42 = this.f82836a;
        if (r42 != null) goto L5;
        r3.writeInt(0);
    L6:
        Boolean r43 = this.f82837b;
        if (r43 != null) goto L9;
        r3.writeInt(0);
    L10:
        Boolean r44 = this.f82838c;
        if (r44 != null) goto L13;
        r3.writeInt(0);
    L14:
        Boolean r45 = this.d;
        if (r45 != null) goto L17;
        r3.writeInt(0);
    L18:
        Integer r46 = this.f82839e;
        if (r46 != null) goto L22;
        r3.writeInt(0);
        return;
    L22:
        r3.writeInt(1);
        r3.writeInt(r46.intValue());
        return;
    L17:
        r3.writeInt(1);
        r3.writeInt(r45.booleanValue() ? 1 : 0);
        goto L18
    L13:
        r3.writeInt(1);
        r3.writeInt(r44.booleanValue() ? 1 : 0);
        goto L14
    L9:
        r3.writeInt(1);
        r3.writeInt(r43.booleanValue() ? 1 : 0);
        goto L10
    L5:
        r3.writeInt(1);
        r3.writeInt(r42.booleanValue() ? 1 : 0);
        goto L6
    }
}
