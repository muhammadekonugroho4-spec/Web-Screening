package com.stockbit.model.entity;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/model/entity/InAppUpdateResponseDataItem;", "", "detail", "Lcom/stockbit/model/entity/InAppUpdateResponseDataItem$Detail;", "featureKey", "", "<init>", "(Lcom/stockbit/model/entity/InAppUpdateResponseDataItem$Detail;Ljava/lang/String;)V", "getDetail", "()Lcom/stockbit/model/entity/InAppUpdateResponseDataItem$Detail;", "getFeatureKey", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Detail", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InAppUpdateResponseDataItem {

    @SerializedName("detail")
    private final Detail detail;

    @SerializedName("feature_key")
    private final String featureKey;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lcom/stockbit/model/entity/InAppUpdateResponseDataItem$Detail;", "", "dayFrequency", "", "dayFrequencyLevel", "minimumVersion", "modalType", "updateMessageDescription", "updateMessageTitle", "updateType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDayFrequency", "()Ljava/lang/String;", "getDayFrequencyLevel", "getMinimumVersion", "getModalType", "getUpdateMessageDescription", "getUpdateMessageTitle", "getUpdateType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Detail {

        @SerializedName("day_frequency")
        private final String dayFrequency;

        @SerializedName("day_frequency_level")
        private final String dayFrequencyLevel;

        @SerializedName("minimum_version")
        private final String minimumVersion;

        @SerializedName("modal_type")
        private final String modalType;

        @SerializedName("update_message_description")
        private final String updateMessageDescription;

        @SerializedName("update_message_title")
        private final String updateMessageTitle;

        @SerializedName(HiAnalyticsConstant.BI_KEY_UPDATE_TYPE)
        private final String updateType;

        public Detail(String r1, String r2, String r3, String r4, String r5, String r6, String r7) {
            this.dayFrequency = r1;
            this.dayFrequencyLevel = r2;
            this.minimumVersion = r3;
            this.modalType = r4;
            this.updateMessageDescription = r5;
            this.updateMessageTitle = r6;
            this.updateType = r7;
        }

        public final String a() {
            return this.minimumVersion;
        }

        public final String b() {
            return this.modalType;
        }

        public final String c() {
            return this.updateMessageDescription;
        }

        public final String d() {
            return this.updateMessageTitle;
        }

        public final String e() {
            return this.updateType;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Detail) == true) goto L8;
            return false;
        L8:
            Detail r52 = (Detail) r5;
            if (p.g(this.dayFrequency, r52.dayFrequency) == true) goto L12;
            return false;
        L12:
            if (p.g(this.dayFrequencyLevel, r52.dayFrequencyLevel) == true) goto L15;
            return false;
        L15:
            if (p.g(this.minimumVersion, r52.minimumVersion) == true) goto L18;
            return false;
        L18:
            if (p.g(this.modalType, r52.modalType) == true) goto L21;
            return false;
        L21:
            if (p.g(this.updateMessageDescription, r52.updateMessageDescription) == true) goto L24;
            return false;
        L24:
            if (p.g(this.updateMessageTitle, r52.updateMessageTitle) == true) goto L27;
            return false;
        L27:
            if (p.g(this.updateType, r52.updateType) == true) goto L29;
            return false;
        L29:
            return true;
        }

        public int hashCode() {
            String r02 = this.dayFrequency;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.dayFrequencyLevel;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.minimumVersion;
            if (r23 != null) goto L13;
            int r24 = 0;
        L14:
            int r06 = (r05 + r24) * 31;
            String r25 = this.modalType;
            if (r25 != null) goto L17;
            int r26 = 0;
        L18:
            int r07 = (r06 + r26) * 31;
            String r27 = this.updateMessageDescription;
            if (r27 != null) goto L21;
            int r28 = 0;
        L22:
            int r08 = (r07 + r28) * 31;
            String r29 = this.updateMessageTitle;
            if (r29 != null) goto L25;
            int r210 = 0;
        L26:
            int r09 = (r08 + r210) * 31;
            String r211 = this.updateType;
            if (r211 == null) goto L31;
            r1 = r211.hashCode();
        L31:
            return r09 + r1;
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

        public String toString() {
            return "Detail(dayFrequency=" + this.dayFrequency + ", dayFrequencyLevel=" + this.dayFrequencyLevel + ", minimumVersion=" + this.minimumVersion + ", modalType=" + this.modalType + ", updateMessageDescription=" + this.updateMessageDescription + ", updateMessageTitle=" + this.updateMessageTitle + ", updateType=" + this.updateType + ')';
        }
    }

    public InAppUpdateResponseDataItem(Detail r1, String r2) {
        this.detail = r1;
        this.featureKey = r2;
    }

    public final Detail a() {
        return this.detail;
    }

    public final String b() {
        return this.featureKey;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof InAppUpdateResponseDataItem) == true) goto L8;
        return false;
    L8:
        InAppUpdateResponseDataItem r52 = (InAppUpdateResponseDataItem) r5;
        if (p.g(this.detail, r52.detail) == true) goto L12;
        return false;
    L12:
        if (p.g(this.featureKey, r52.featureKey) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Detail r02 = this.detail;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.featureKey;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "InAppUpdateResponseDataItem(detail=" + this.detail + ", featureKey=" + this.featureKey + ')';
    }
}
