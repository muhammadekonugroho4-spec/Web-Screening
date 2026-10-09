package com.stockbit.domain.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.stockbit.domain.model.type.EmailVerificationType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/domain/model/entity/EmailVerificationArg;", "Landroid/os/Parcelable;", "<init>", "()V", "EmailVerificationData", "Lcom/stockbit/domain/model/entity/EmailVerificationArg$EmailVerificationData;", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class EmailVerificationArg implements Parcelable {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006$"}, d2 = {"Lcom/stockbit/domain/model/entity/EmailVerificationArg$EmailVerificationData;", "Lcom/stockbit/domain/model/entity/EmailVerificationArg;", "type", "Lcom/stockbit/domain/model/type/EmailVerificationType;", "email", "", "token", "<init>", "(Lcom/stockbit/domain/model/type/EmailVerificationType;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lcom/stockbit/domain/model/type/EmailVerificationType;", "setType", "(Lcom/stockbit/domain/model/type/EmailVerificationType;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getToken", "setToken", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EmailVerificationData extends EmailVerificationArg {
        public static final Parcelable.Creator<EmailVerificationData> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public EmailVerificationType f82456a;

        /* renamed from: b, reason: collision with root package name */
        public String f82457b;

        /* renamed from: c, reason: collision with root package name */
        public String f82458c;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final EmailVerificationData a(Parcel r4) {
                kotlin.jvm.internal.p.l(r4, "parcel");
                if (r4.readInt() != 0) goto L5;
                EmailVerificationType r1 = null;
            L7:
                return new EmailVerificationData(r1, r4.readString(), r4.readString());
            L5:
                r1 = EmailVerificationType.valueOf(r4.readString());
                goto L7
            }

            public final EmailVerificationData[] b(int r1) {
                return new EmailVerificationData[r1];
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

        public EmailVerificationData(EmailVerificationType r2, String r3, String r4) {
            kotlin.jvm.internal.p.l(r3, "email");
            kotlin.jvm.internal.p.l(r4, "token");
            super(null);
            this.f82456a = r2;
            this.f82457b = r3;
            this.f82458c = r4;
        }

        public final String a() {
            return this.f82457b;
        }

        public final String b() {
            return this.f82458c;
        }

        public final EmailVerificationType c() {
            return this.f82456a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof EmailVerificationData) == true) goto L8;
            return false;
        L8:
            EmailVerificationData r52 = (EmailVerificationData) r5;
            if (this.f82456a == r52.f82456a) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f82457b, r52.f82457b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f82458c, r52.f82458c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            EmailVerificationType r02 = this.f82456a;
            if (r02 != null) goto L5;
            int r03 = 0;
        L7:
            return (((r03 * 31) + this.f82457b.hashCode()) * 31) + this.f82458c.hashCode();
        L5:
            r03 = r02.hashCode();
            goto L7
        }

        public String toString() {
            return "EmailVerificationData(type=" + this.f82456a + ", email=" + this.f82457b + ", token=" + this.f82458c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r2, int r3) {
            kotlin.jvm.internal.p.l(r2, "dest");
            EmailVerificationType r32 = this.f82456a;
            if (r32 != null) goto L5;
            r2.writeInt(0);
        L6:
            r2.writeString(this.f82457b);
            r2.writeString(this.f82458c);
            return;
        L5:
            r2.writeInt(1);
            r2.writeString(r32.name());
            goto L6
        }

        public /* synthetic */ EmailVerificationData(EmailVerificationType r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
            if ((r5 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r3 = "";
        L9:
            if ((r5 & 4) == 0) goto L11;
            r4 = "";
        L11:
            this(r2, r3, r4);
        }
    }

    public /* synthetic */ EmailVerificationArg(kotlin.jvm.internal.i r1) {
        this();
    }

    public EmailVerificationArg() {
    }
}
