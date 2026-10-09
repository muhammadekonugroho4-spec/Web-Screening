package com.stockbit.domain.model.type.openingaccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/stockbit/domain/model/type/openingaccount/FormDependencySideEffect;", "Landroid/os/Parcelable;", "<init>", "()V", "TooltipInfo", "DynamicOption", "UpdateFormParamByRDN", "UpdateFormFieldByCheckBox", "NoSideEffect", "Lcom/stockbit/domain/model/type/openingaccount/FormDependencySideEffect$DynamicOption;", "Lcom/stockbit/domain/model/type/openingaccount/FormDependencySideEffect$NoSideEffect;", "Lcom/stockbit/domain/model/type/openingaccount/FormDependencySideEffect$TooltipInfo;", "Lcom/stockbit/domain/model/type/openingaccount/FormDependencySideEffect$UpdateFormFieldByCheckBox;", "Lcom/stockbit/domain/model/type/openingaccount/FormDependencySideEffect$UpdateFormParamByRDN;", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class FormDependencySideEffect implements Parcelable {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lcom/stockbit/domain/model/type/openingaccount/FormDependencySideEffect$DynamicOption;", "Lcom/stockbit/domain/model/type/openingaccount/FormDependencySideEffect;", "url", "", "selectedType", "desiredType", "targetFieldKey", "requiredFieldKey", "requiredSelectedValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getSelectedType", "getDesiredType", "getTargetFieldKey", "getRequiredFieldKey", "getRequiredSelectedValue", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DynamicOption extends FormDependencySideEffect {
        public static final Parcelable.Creator<DynamicOption> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public final String f86343a;

        /* renamed from: b, reason: collision with root package name */
        public final String f86344b;

        /* renamed from: c, reason: collision with root package name */
        public final String f86345c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f86346e;

        /* renamed from: f, reason: collision with root package name */
        public final String f86347f;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final DynamicOption a(Parcel r9) {
                p.l(r9, "parcel");
                return new DynamicOption(r9.readString(), r9.readString(), r9.readString(), r9.readString(), r9.readString(), r9.readString());
            }

            public final DynamicOption[] b(int r1) {
                return new DynamicOption[r1];
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

        public DynamicOption(String r2, String r3, String r4, String r5, String r6, String r7) {
            p.l(r2, "url");
            p.l(r3, "selectedType");
            p.l(r4, "desiredType");
            p.l(r5, "targetFieldKey");
            p.l(r6, "requiredFieldKey");
            p.l(r7, "requiredSelectedValue");
            super(null);
            this.f86343a = r2;
            this.f86344b = r3;
            this.f86345c = r4;
            this.d = r5;
            this.f86346e = r6;
            this.f86347f = r7;
        }

        public static /* synthetic */ DynamicOption b(DynamicOption r02, String r1, String r2, String r3, String r4, String r5, String r6, int r7, Object r8) {
            if ((r7 & 1) == 0) goto L6;
            r1 = r02.f86343a;
        L6:
            if ((r7 & 2) == 0) goto L9;
            r2 = r02.f86344b;
        L9:
            if ((r7 & 4) == 0) goto L12;
            r3 = r02.f86345c;
        L12:
            if ((r7 & 8) == 0) goto L15;
            r4 = r02.d;
        L15:
            if ((r7 & 16) == 0) goto L18;
            r5 = r02.f86346e;
        L18:
            if ((r7 & 32) == 0) goto L20;
            r6 = r02.f86347f;
        L20:
            String r72 = r5;
            String r82 = r6;
            String r52 = r3;
            String r62 = r4;
            return r02.a(r1, r2, r52, r62, r72, r82);
        }

        public final DynamicOption a(String r9, String r10, String r11, String r12, String r13, String r14) {
            p.l(r9, "url");
            p.l(r10, "selectedType");
            p.l(r11, "desiredType");
            p.l(r12, "targetFieldKey");
            p.l(r13, "requiredFieldKey");
            p.l(r14, "requiredSelectedValue");
            return new DynamicOption(r9, r10, r11, r12, r13, r14);
        }

        public final String c() {
            return this.f86345c;
        }

        public final String d() {
            return this.f86346e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f86347f;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof DynamicOption) == true) goto L8;
            return false;
        L8:
            DynamicOption r52 = (DynamicOption) r5;
            if (p.g(this.f86343a, r52.f86343a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f86344b, r52.f86344b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f86345c, r52.f86345c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f86346e, r52.f86346e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f86347f, r52.f86347f) == true) goto L26;
            return false;
        L26:
            return true;
        }

        public final String f() {
            return this.f86344b;
        }

        public final String g() {
            return this.d;
        }

        public final String h() {
            return this.f86343a;
        }

        public int hashCode() {
            return (((((((((this.f86343a.hashCode() * 31) + this.f86344b.hashCode()) * 31) + this.f86345c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f86346e.hashCode()) * 31) + this.f86347f.hashCode();
        }

        public String toString() {
            return "DynamicOption(url=" + this.f86343a + ", selectedType=" + this.f86344b + ", desiredType=" + this.f86345c + ", targetFieldKey=" + this.d + ", requiredFieldKey=" + this.f86346e + ", requiredSelectedValue=" + this.f86347f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r1, int r2) {
            p.l(r1, "dest");
            r1.writeString(this.f86343a);
            r1.writeString(this.f86344b);
            r1.writeString(this.f86345c);
            r1.writeString(this.d);
            r1.writeString(this.f86346e);
            r1.writeString(this.f86347f);
        }

        public /* synthetic */ DynamicOption(String r8, String r9, String r10, String r11, String r12, String r13, int r14, i r15) {
            if ((r14 & 32) == 0) goto L5;
            r13 = "";
        L5:
            this(r8, r9, r10, r11, r12, r13);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0014\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0083\u0004J\n\u0010\n\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u000b\u001a\u00020\fHÖ\u0081\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/stockbit/domain/model/type/openingaccount/FormDependencySideEffect$NoSideEffect;", "Lcom/stockbit/domain/model/type/openingaccount/FormDependencySideEffect;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NoSideEffect extends FormDependencySideEffect {
        public static final Parcelable.Creator<NoSideEffect> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public static final NoSideEffect f86348a = null;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final NoSideEffect a(Parcel r2) {
                p.l(r2, "parcel");
                r2.readInt();
                return NoSideEffect.f86348a;
            }

            public final NoSideEffect[] b(int r1) {
                return new NoSideEffect[r1];
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
            f86348a = new NoSideEffect();
            CREATOR = new a();
        }

        public NoSideEffect() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof NoSideEffect) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -827709706;
        }

        public String toString() {
            return "NoSideEffect";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r1, int r2) {
            p.l(r1, "dest");
            r1.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/stockbit/domain/model/type/openingaccount/FormDependencySideEffect$TooltipInfo;", "Lcom/stockbit/domain/model/type/openingaccount/FormDependencySideEffect;", "messageType", "Lcom/stockbit/domain/model/type/openingaccount/FormTooltipMessageType;", "isShowing", "", "<init>", "(Lcom/stockbit/domain/model/type/openingaccount/FormTooltipMessageType;Z)V", "getMessageType", "()Lcom/stockbit/domain/model/type/openingaccount/FormTooltipMessageType;", "()Z", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TooltipInfo extends FormDependencySideEffect {
        public static final Parcelable.Creator<TooltipInfo> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public final FormTooltipMessageType f86349a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f86350b;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final TooltipInfo a(Parcel r3) {
                p.l(r3, "parcel");
                FormTooltipMessageType r1 = FormTooltipMessageType.valueOf(r3.readString());
                if (r3.readInt() == 0) goto L5;
                boolean r32 = true;
            L7:
                return new TooltipInfo(r1, r32);
            L5:
                r32 = false;
                goto L7
            }

            public final TooltipInfo[] b(int r1) {
                return new TooltipInfo[r1];
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

        public TooltipInfo(FormTooltipMessageType r2, boolean r3) {
            p.l(r2, "messageType");
            super(null);
            this.f86349a = r2;
            this.f86350b = r3;
        }

        public static /* synthetic */ TooltipInfo b(TooltipInfo r02, FormTooltipMessageType r1, boolean r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r02.f86349a;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r02.f86350b;
        L9:
            return r02.a(r1, r2);
        }

        public final TooltipInfo a(FormTooltipMessageType r2, boolean r3) {
            p.l(r2, "messageType");
            return new TooltipInfo(r2, r3);
        }

        public final FormTooltipMessageType c() {
            return this.f86349a;
        }

        public final boolean d() {
            return this.f86350b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof TooltipInfo) == true) goto L8;
            return false;
        L8:
            TooltipInfo r52 = (TooltipInfo) r5;
            if (this.f86349a == r52.f86349a) goto L12;
            return false;
        L12:
            if (this.f86350b == r52.f86350b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f86349a.hashCode() * 31) + Boolean.hashCode(this.f86350b);
        }

        public String toString() {
            return "TooltipInfo(messageType=" + this.f86349a + ", isShowing=" + this.f86350b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r1, int r2) {
            p.l(r1, "dest");
            r1.writeString(this.f86349a.name());
            r1.writeInt(this.f86350b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/stockbit/domain/model/type/openingaccount/FormDependencySideEffect$UpdateFormFieldByCheckBox;", "Lcom/stockbit/domain/model/type/openingaccount/FormDependencySideEffect;", "targetFieldKey", "", "requiredFieldKey", "defaultValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTargetFieldKey", "()Ljava/lang/String;", "getRequiredFieldKey", "getDefaultValue", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UpdateFormFieldByCheckBox extends FormDependencySideEffect {
        public static final Parcelable.Creator<UpdateFormFieldByCheckBox> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public final String f86351a;

        /* renamed from: b, reason: collision with root package name */
        public final String f86352b;

        /* renamed from: c, reason: collision with root package name */
        public final String f86353c;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final UpdateFormFieldByCheckBox a(Parcel r4) {
                p.l(r4, "parcel");
                return new UpdateFormFieldByCheckBox(r4.readString(), r4.readString(), r4.readString());
            }

            public final UpdateFormFieldByCheckBox[] b(int r1) {
                return new UpdateFormFieldByCheckBox[r1];
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

        public UpdateFormFieldByCheckBox(String r2, String r3, String r4) {
            p.l(r2, "targetFieldKey");
            p.l(r3, "requiredFieldKey");
            p.l(r4, "defaultValue");
            super(null);
            this.f86351a = r2;
            this.f86352b = r3;
            this.f86353c = r4;
        }

        public final String a() {
            return this.f86352b;
        }

        public final String b() {
            return this.f86351a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof UpdateFormFieldByCheckBox) == true) goto L8;
            return false;
        L8:
            UpdateFormFieldByCheckBox r52 = (UpdateFormFieldByCheckBox) r5;
            if (p.g(this.f86351a, r52.f86351a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f86352b, r52.f86352b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f86353c, r52.f86353c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f86351a.hashCode() * 31) + this.f86352b.hashCode()) * 31) + this.f86353c.hashCode();
        }

        public String toString() {
            return "UpdateFormFieldByCheckBox(targetFieldKey=" + this.f86351a + ", requiredFieldKey=" + this.f86352b + ", defaultValue=" + this.f86353c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r1, int r2) {
            p.l(r1, "dest");
            r1.writeString(this.f86351a);
            r1.writeString(this.f86352b);
            r1.writeString(this.f86353c);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/stockbit/domain/model/type/openingaccount/FormDependencySideEffect$UpdateFormParamByRDN;", "Lcom/stockbit/domain/model/type/openingaccount/FormDependencySideEffect;", "trigger", "", "requiredFieldKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTrigger", "()Ljava/lang/String;", "getRequiredFieldKey", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UpdateFormParamByRDN extends FormDependencySideEffect {
        public static final Parcelable.Creator<UpdateFormParamByRDN> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public final String f86354a;

        /* renamed from: b, reason: collision with root package name */
        public final String f86355b;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final UpdateFormParamByRDN a(Parcel r3) {
                p.l(r3, "parcel");
                return new UpdateFormParamByRDN(r3.readString(), r3.readString());
            }

            public final UpdateFormParamByRDN[] b(int r1) {
                return new UpdateFormParamByRDN[r1];
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

        public UpdateFormParamByRDN(String r2, String r3) {
            p.l(r2, "trigger");
            p.l(r3, "requiredFieldKey");
            super(null);
            this.f86354a = r2;
            this.f86355b = r3;
        }

        public final String a() {
            return this.f86355b;
        }

        public final String b() {
            return this.f86354a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof UpdateFormParamByRDN) == true) goto L8;
            return false;
        L8:
            UpdateFormParamByRDN r52 = (UpdateFormParamByRDN) r5;
            if (p.g(this.f86354a, r52.f86354a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f86355b, r52.f86355b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f86354a.hashCode() * 31) + this.f86355b.hashCode();
        }

        public String toString() {
            return "UpdateFormParamByRDN(trigger=" + this.f86354a + ", requiredFieldKey=" + this.f86355b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r1, int r2) {
            p.l(r1, "dest");
            r1.writeString(this.f86354a);
            r1.writeString(this.f86355b);
        }
    }

    public /* synthetic */ FormDependencySideEffect(i r1) {
        this();
    }

    public FormDependencySideEffect() {
    }
}
