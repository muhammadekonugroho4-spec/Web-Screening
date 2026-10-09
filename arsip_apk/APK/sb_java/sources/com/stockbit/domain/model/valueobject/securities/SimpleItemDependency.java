package com.stockbit.domain.model.valueobject.securities;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.stockbit.domain.model.type.openingaccount.FieldDependencyStrategy;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B4\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\r\b\u0002\u0010\u0007\u001a\u00070\b¢\u0006\u0002\b\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000e\u0010\u0016\u001a\u00070\b¢\u0006\u0002\b\tHÆ\u0003J6\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\r\b\u0002\u0010\u0007\u001a\u00070\b¢\u0006\u0002\b\tHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\bHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001b\u0010\u0007\u001a\u00070\b¢\u0006\u0002\b\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Lcom/stockbit/domain/model/valueobject/securities/SimpleItemDependency;", "Landroid/os/Parcelable;", "dependencyStrategy", "Lcom/stockbit/domain/model/type/openingaccount/FieldDependencyStrategy;", "requiredFieldKey", "", "targetFieldKey", "trigger", "", "Lkotlinx/parcelize/RawValue;", "<init>", "(Lcom/stockbit/domain/model/type/openingaccount/FieldDependencyStrategy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getDependencyStrategy", "()Lcom/stockbit/domain/model/type/openingaccount/FieldDependencyStrategy;", "getRequiredFieldKey", "()Ljava/lang/String;", "getTargetFieldKey", "getTrigger", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SimpleItemDependency implements Parcelable {
    public static final Parcelable.Creator<SimpleItemDependency> CREATOR = null;

    @SerializedName("dependency_strategy")
    private final FieldDependencyStrategy dependencyStrategy;

    @SerializedName("required_field_key")
    private final String requiredFieldKey;

    @SerializedName("target_field_key")
    private final String targetFieldKey;

    @SerializedName("trigger")
    private final Object trigger;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final SimpleItemDependency a(Parcel r6) {
            p.l(r6, "parcel");
            return new SimpleItemDependency(FieldDependencyStrategy.valueOf(r6.readString()), r6.readString(), r6.readString(), r6.readValue(SimpleItemDependency.class.getClassLoader()));
        }

        public final SimpleItemDependency[] b(int r1) {
            return new SimpleItemDependency[r1];
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

    public SimpleItemDependency() {
        FieldDependencyStrategy r1 = null;
        String r2 = null;
        String r3 = null;
        Object r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public final FieldDependencyStrategy a() {
        return this.dependencyStrategy;
    }

    public final String b() {
        return this.requiredFieldKey;
    }

    public final String c() {
        return this.targetFieldKey;
    }

    public final Object d() {
        return this.trigger;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SimpleItemDependency) == true) goto L8;
        return false;
    L8:
        SimpleItemDependency r52 = (SimpleItemDependency) r5;
        if (this.dependencyStrategy == r52.dependencyStrategy) goto L12;
        return false;
    L12:
        if (p.g(this.requiredFieldKey, r52.requiredFieldKey) == true) goto L15;
        return false;
    L15:
        if (p.g(this.targetFieldKey, r52.targetFieldKey) == true) goto L18;
        return false;
    L18:
        if (p.g(this.trigger, r52.trigger) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.dependencyStrategy.hashCode() * 31) + this.requiredFieldKey.hashCode()) * 31) + this.targetFieldKey.hashCode()) * 31) + this.trigger.hashCode();
    }

    public String toString() {
        return "SimpleItemDependency(dependencyStrategy=" + this.dependencyStrategy + ", requiredFieldKey=" + this.requiredFieldKey + ", targetFieldKey=" + this.targetFieldKey + ", trigger=" + this.trigger + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.dependencyStrategy.name());
        r1.writeString(this.requiredFieldKey);
        r1.writeString(this.targetFieldKey);
        r1.writeValue(this.trigger);
    }

    public SimpleItemDependency(FieldDependencyStrategy r2, String r3, String r4, Object r5) {
        p.l(r2, "dependencyStrategy");
        p.l(r3, "requiredFieldKey");
        p.l(r4, "targetFieldKey");
        p.l(r5, "trigger");
        this.dependencyStrategy = r2;
        this.requiredFieldKey = r3;
        this.targetFieldKey = r4;
        this.trigger = r5;
    }

    public /* synthetic */ SimpleItemDependency(FieldDependencyStrategy r2, String r3, String r4, Object r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = FieldDependencyStrategy.GET_VALUE_FOR_VALUE;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}
