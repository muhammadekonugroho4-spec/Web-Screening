package com.stockbit.domain.model.valueobject.securities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003JT\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020*J\u0014\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0083\u0004J\n\u0010.\u001a\u00020*HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0006HÖ\u0081\u0004J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010 \u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b \u0010\u001b¨\u00065"}, d2 = {"Lcom/stockbit/domain/model/valueobject/securities/ValidationData;", "Landroid/os/Parcelable;", NotificationCompat.CATEGORY_STATUS, "", "password", "email", "", "phone", "phoneCode", "isEmailVerified", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getStatus", "()Ljava/lang/Boolean;", "setStatus", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPassword", "setPassword", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getPhone", "setPhone", "getPhoneCode", "setPhoneCode", "()Z", "setEmailVerified", "(Z)V", "isValidated", "isHavePassword", "isHavePhone", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/stockbit/domain/model/valueobject/securities/ValidationData;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ValidationData implements Parcelable {
    public static final Parcelable.Creator<ValidationData> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public Boolean f86987a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f86988b;

    /* renamed from: c, reason: collision with root package name */
    public String f86989c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f86990e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f86991f;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ValidationData a(Parcel r9) {
            p.l(r9, "parcel");
            Boolean r2 = null;
            if (r9.readInt() != 0) goto L6;
            Boolean r02 = null;
        L11:
            if (r9.readInt() != 0) goto L14;
        L18:
            String r4 = r9.readString();
            String r5 = r9.readString();
            boolean r7 = true;
            String r6 = r9.readString();
            if (r9.readInt() != 0) goto L23;
            r7 = false;
        L23:
            return new ValidationData(r02, r2, r4, r5, r6, r7);
        L14:
            if (r9.readInt() == 0) goto L16;
            boolean r22 = true;
        L17:
            r2 = Boolean.valueOf(r22);
            goto L18
        L16:
            r22 = false;
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

        public final ValidationData[] b(int r1) {
            return new ValidationData[r1];
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

    public ValidationData(Boolean r1, Boolean r2, String r3, String r4, String r5, boolean r6) {
        this.f86987a = r1;
        this.f86988b = r2;
        this.f86989c = r3;
        this.d = r4;
        this.f86990e = r5;
        this.f86991f = r6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ValidationData) == true) goto L8;
        return false;
    L8:
        ValidationData r52 = (ValidationData) r5;
        if (p.g(this.f86987a, r52.f86987a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86988b, r52.f86988b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86989c, r52.f86989c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f86990e, r52.f86990e) == true) goto L24;
        return false;
    L24:
        if (this.f86991f == r52.f86991f) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.f86987a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.f86988b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f86989c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f86990e;
        if (r27 == null) goto L23;
        r1 = r27.hashCode();
    L23:
        return ((r07 + r1) * 31) + Boolean.hashCode(this.f86991f);
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
        return "ValidationData(status=" + this.f86987a + ", password=" + this.f86988b + ", email=" + this.f86989c + ", phone=" + this.d + ", phoneCode=" + this.f86990e + ", isEmailVerified=" + this.f86991f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        Boolean r42 = this.f86987a;
        if (r42 != null) goto L5;
        r3.writeInt(0);
    L6:
        Boolean r43 = this.f86988b;
        if (r43 != null) goto L9;
        r3.writeInt(0);
    L10:
        r3.writeString(this.f86989c);
        r3.writeString(this.d);
        r3.writeString(this.f86990e);
        r3.writeInt(this.f86991f ? 1 : 0);
        return;
    L9:
        r3.writeInt(1);
        r3.writeInt(r43.booleanValue() ? 1 : 0);
        goto L10
    L5:
        r3.writeInt(1);
        r3.writeInt(r42.booleanValue() ? 1 : 0);
        goto L6
    }

    public /* synthetic */ ValidationData(Boolean r2, Boolean r3, String r4, String r5, String r6, boolean r7, int r8, i r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = false;
    L20:
        boolean r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82);
    }
}
