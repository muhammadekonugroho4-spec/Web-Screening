package com.stockbit.domain.model.type.otp;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.stockbit.domain.model.type.securities.ChangePhoneNumberSourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/type/otp/SmsOTPType;", "Landroid/os/Parcelable;", "<init>", "()V", "ChangePin", "Register", "ChangeNumber", "AddNumber", "Lcom/stockbit/domain/model/type/otp/SmsOTPType$AddNumber;", "Lcom/stockbit/domain/model/type/otp/SmsOTPType$ChangeNumber;", "Lcom/stockbit/domain/model/type/otp/SmsOTPType$ChangePin;", "Lcom/stockbit/domain/model/type/otp/SmsOTPType$Register;", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class SmsOTPType implements Parcelable {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/stockbit/domain/model/type/otp/SmsOTPType$AddNumber;", "Lcom/stockbit/domain/model/type/otp/SmsOTPType;", "number", "", "phoneCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "getPhoneCode", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AddNumber extends SmsOTPType {
        public static final Parcelable.Creator<AddNumber> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public final String f86372a;

        /* renamed from: b, reason: collision with root package name */
        public final String f86373b;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final AddNumber a(Parcel r3) {
                p.l(r3, "parcel");
                return new AddNumber(r3.readString(), r3.readString());
            }

            public final AddNumber[] b(int r1) {
                return new AddNumber[r1];
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

        public AddNumber(String r2, String r3) {
            p.l(r2, "number");
            p.l(r3, "phoneCode");
            super(null);
            this.f86372a = r2;
            this.f86373b = r3;
        }

        public final String a() {
            return this.f86372a;
        }

        public final String b() {
            return this.f86373b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof AddNumber) == true) goto L8;
            return false;
        L8:
            AddNumber r52 = (AddNumber) r5;
            if (p.g(this.f86372a, r52.f86372a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f86373b, r52.f86373b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f86372a.hashCode() * 31) + this.f86373b.hashCode();
        }

        public String toString() {
            return "AddNumber(number=" + this.f86372a + ", phoneCode=" + this.f86373b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r1, int r2) {
            p.l(r1, "dest");
            r1.writeString(this.f86372a);
            r1.writeString(this.f86373b);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\""}, d2 = {"Lcom/stockbit/domain/model/type/otp/SmsOTPType$ChangeNumber;", "Lcom/stockbit/domain/model/type/otp/SmsOTPType;", "numberSource", "Lcom/stockbit/domain/model/type/securities/ChangePhoneNumberSourceType;", "newNumber", "", "code", "changeToken", "<init>", "(Lcom/stockbit/domain/model/type/securities/ChangePhoneNumberSourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNumberSource", "()Lcom/stockbit/domain/model/type/securities/ChangePhoneNumberSourceType;", "getNewNumber", "()Ljava/lang/String;", "getCode", "getChangeToken", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ChangeNumber extends SmsOTPType {
        public static final Parcelable.Creator<ChangeNumber> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public final ChangePhoneNumberSourceType f86374a;

        /* renamed from: b, reason: collision with root package name */
        public final String f86375b;

        /* renamed from: c, reason: collision with root package name */
        public final String f86376c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final ChangeNumber a(Parcel r5) {
                p.l(r5, "parcel");
                return new ChangeNumber(ChangePhoneNumberSourceType.valueOf(r5.readString()), r5.readString(), r5.readString(), r5.readString());
            }

            public final ChangeNumber[] b(int r1) {
                return new ChangeNumber[r1];
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

        public ChangeNumber(ChangePhoneNumberSourceType r2, String r3, String r4, String r5) {
            p.l(r2, "numberSource");
            p.l(r3, "newNumber");
            p.l(r4, "code");
            p.l(r5, "changeToken");
            super(null);
            this.f86374a = r2;
            this.f86375b = r3;
            this.f86376c = r4;
            this.d = r5;
        }

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.f86376c;
        }

        public final String c() {
            return this.f86375b;
        }

        public final ChangePhoneNumberSourceType d() {
            return this.f86374a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof ChangeNumber) == true) goto L8;
            return false;
        L8:
            ChangeNumber r52 = (ChangeNumber) r5;
            if (this.f86374a == r52.f86374a) goto L12;
            return false;
        L12:
            if (p.g(this.f86375b, r52.f86375b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f86376c, r52.f86376c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((this.f86374a.hashCode() * 31) + this.f86375b.hashCode()) * 31) + this.f86376c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "ChangeNumber(numberSource=" + this.f86374a + ", newNumber=" + this.f86375b + ", code=" + this.f86376c + ", changeToken=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r1, int r2) {
            p.l(r1, "dest");
            r1.writeString(this.f86374a.name());
            r1.writeString(this.f86375b);
            r1.writeString(this.f86376c);
            r1.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/stockbit/domain/model/type/otp/SmsOTPType$ChangePin;", "Lcom/stockbit/domain/model/type/otp/SmsOTPType;", "identityNumber", "", "phoneNumber", "pinToken", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdentityNumber", "()Ljava/lang/String;", "getPhoneNumber", "getPinToken", "getCountryCode", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ChangePin extends SmsOTPType {
        public static final Parcelable.Creator<ChangePin> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public final String f86377a;

        /* renamed from: b, reason: collision with root package name */
        public final String f86378b;

        /* renamed from: c, reason: collision with root package name */
        public final String f86379c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final ChangePin a(Parcel r5) {
                p.l(r5, "parcel");
                return new ChangePin(r5.readString(), r5.readString(), r5.readString(), r5.readString());
            }

            public final ChangePin[] b(int r1) {
                return new ChangePin[r1];
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

        public ChangePin(String r2, String r3, String r4, String r5) {
            p.l(r2, "identityNumber");
            p.l(r3, "phoneNumber");
            p.l(r4, "pinToken");
            p.l(r5, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
            super(null);
            this.f86377a = r2;
            this.f86378b = r3;
            this.f86379c = r4;
            this.d = r5;
        }

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.f86377a;
        }

        public final String c() {
            return this.f86378b;
        }

        public final String d() {
            return this.f86379c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof ChangePin) == true) goto L8;
            return false;
        L8:
            ChangePin r52 = (ChangePin) r5;
            if (p.g(this.f86377a, r52.f86377a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f86378b, r52.f86378b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f86379c, r52.f86379c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((this.f86377a.hashCode() * 31) + this.f86378b.hashCode()) * 31) + this.f86379c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "ChangePin(identityNumber=" + this.f86377a + ", phoneNumber=" + this.f86378b + ", pinToken=" + this.f86379c + ", countryCode=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r1, int r2) {
            p.l(r1, "dest");
            r1.writeString(this.f86377a);
            r1.writeString(this.f86378b);
            r1.writeString(this.f86379c);
            r1.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0014\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006&"}, d2 = {"Lcom/stockbit/domain/model/type/otp/SmsOTPType$Register;", "Lcom/stockbit/domain/model/type/otp/SmsOTPType;", "phoneNumber", "", "phoneCode", "firebaseInstallationId", "fcmPushToken", "registerMethod", "isFromWhatsAppAuth", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getPhoneNumber", "()Ljava/lang/String;", "getPhoneCode", "getFirebaseInstallationId", "getFcmPushToken", "getRegisterMethod", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Register extends SmsOTPType {
        public static final Parcelable.Creator<Register> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public final String f86380a;

        /* renamed from: b, reason: collision with root package name */
        public final String f86381b;

        /* renamed from: c, reason: collision with root package name */
        public final String f86382c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f86383e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f86384f;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final Register a(Parcel r9) {
                p.l(r9, "parcel");
                String r2 = r9.readString();
                String r3 = r9.readString();
                String r4 = r9.readString();
                String r5 = r9.readString();
                String r6 = r9.readString();
                if (r9.readInt() == 0) goto L6;
                boolean r92 = true;
            L8:
                return new Register(r2, r3, r4, r5, r6, r92);
            L6:
                r92 = false;
                goto L8
            }

            public final Register[] b(int r1) {
                return new Register[r1];
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

        public Register(String r2, String r3, String r4, String r5, String r6, boolean r7) {
            p.l(r2, "phoneNumber");
            p.l(r3, "phoneCode");
            p.l(r4, "firebaseInstallationId");
            p.l(r5, "fcmPushToken");
            p.l(r6, "registerMethod");
            super(null);
            this.f86380a = r2;
            this.f86381b = r3;
            this.f86382c = r4;
            this.d = r5;
            this.f86383e = r6;
            this.f86384f = r7;
        }

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.f86382c;
        }

        public final String c() {
            return this.f86381b;
        }

        public final String d() {
            return this.f86380a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f86383e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Register) == true) goto L8;
            return false;
        L8:
            Register r52 = (Register) r5;
            if (p.g(this.f86380a, r52.f86380a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f86381b, r52.f86381b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f86382c, r52.f86382c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f86383e, r52.f86383e) == true) goto L24;
            return false;
        L24:
            if (this.f86384f == r52.f86384f) goto L26;
            return false;
        L26:
            return true;
        }

        public final boolean f() {
            return this.f86384f;
        }

        public int hashCode() {
            return (((((((((this.f86380a.hashCode() * 31) + this.f86381b.hashCode()) * 31) + this.f86382c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f86383e.hashCode()) * 31) + Boolean.hashCode(this.f86384f);
        }

        public String toString() {
            return "Register(phoneNumber=" + this.f86380a + ", phoneCode=" + this.f86381b + ", firebaseInstallationId=" + this.f86382c + ", fcmPushToken=" + this.d + ", registerMethod=" + this.f86383e + ", isFromWhatsAppAuth=" + this.f86384f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r1, int r2) {
            p.l(r1, "dest");
            r1.writeString(this.f86380a);
            r1.writeString(this.f86381b);
            r1.writeString(this.f86382c);
            r1.writeString(this.d);
            r1.writeString(this.f86383e);
            r1.writeInt(this.f86384f ? 1 : 0);
        }

        public /* synthetic */ Register(String r8, String r9, String r10, String r11, String r12, boolean r13, int r14, i r15) {
            if ((r14 & 32) == 0) goto L5;
            r13 = false;
        L5:
            this(r8, r9, r10, r11, r12, r13);
        }
    }

    public /* synthetic */ SmsOTPType(i r1) {
        this();
    }

    public SmsOTPType() {
    }
}
