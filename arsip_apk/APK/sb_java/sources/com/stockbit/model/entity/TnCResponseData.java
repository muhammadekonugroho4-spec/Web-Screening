package com.stockbit.model.entity;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/model/entity/TnCResponseData;", "", "acceptanceLetters", "", "Lcom/stockbit/model/entity/TnCResponseData$AcceptanceLetter;", "<init>", "(Ljava/util/List;)V", "getAcceptanceLetters", "()Ljava/util/List;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "AcceptanceLetter", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TnCResponseData {

    @SerializedName("acceptance_letters")
    private final List<AcceptanceLetter> acceptanceLetters;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\b\u0010\u0013¨\u0006 "}, d2 = {"Lcom/stockbit/model/entity/TnCResponseData$AcceptanceLetter;", "", "version", "", "language", "", "url", "featureId", "isAccepted", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLanguage", "()Ljava/lang/String;", "getUrl", "getFeatureId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/stockbit/model/entity/TnCResponseData$AcceptanceLetter;", "equals", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AcceptanceLetter {

        @SerializedName("feature_id")
        private final String featureId;

        @SerializedName("is_accepted")
        private final Boolean isAccepted;

        @SerializedName("language")
        private final String language;

        @SerializedName("url")
        private final String url;

        @SerializedName("version")
        private final Integer version;

        public AcceptanceLetter() {
            Integer r1 = null;
            String r2 = null;
            String r3 = null;
            String r4 = null;
            Boolean r5 = null;
            this(r1, r2, r3, r4, r5, 31, null);
        }

        public static /* synthetic */ AcceptanceLetter b(AcceptanceLetter r02, Integer r1, String r2, String r3, String r4, Boolean r5, int r6, Object r7) {
            if ((r6 & 1) == 0) goto L6;
            r1 = r02.version;
        L6:
            if ((r6 & 2) == 0) goto L9;
            r2 = r02.language;
        L9:
            if ((r6 & 4) == 0) goto L12;
            r3 = r02.url;
        L12:
            if ((r6 & 8) == 0) goto L15;
            r4 = r02.featureId;
        L15:
            if ((r6 & 16) == 0) goto L17;
            r5 = r02.isAccepted;
        L17:
            String r62 = r4;
            Boolean r72 = r5;
            String r52 = r3;
            Integer r32 = r1;
            return r02.a(r32, r2, r52, r62, r72);
        }

        public final AcceptanceLetter a(Integer r7, String r8, String r9, String r10, Boolean r11) {
            return new AcceptanceLetter(r7, r8, r9, r10, r11);
        }

        public final String c() {
            return this.featureId;
        }

        public final String d() {
            return this.url;
        }

        public final Integer e() {
            return this.version;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof AcceptanceLetter) == true) goto L8;
            return false;
        L8:
            AcceptanceLetter r52 = (AcceptanceLetter) r5;
            if (p.g(this.version, r52.version) == true) goto L12;
            return false;
        L12:
            if (p.g(this.language, r52.language) == true) goto L15;
            return false;
        L15:
            if (p.g(this.url, r52.url) == true) goto L18;
            return false;
        L18:
            if (p.g(this.featureId, r52.featureId) == true) goto L21;
            return false;
        L21:
            if (p.g(this.isAccepted, r52.isAccepted) == true) goto L23;
            return false;
        L23:
            return true;
        }

        public final Boolean f() {
            return this.isAccepted;
        }

        public int hashCode() {
            Integer r02 = this.version;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.language;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.url;
            if (r23 != null) goto L13;
            int r24 = 0;
        L14:
            int r06 = (r05 + r24) * 31;
            String r25 = this.featureId;
            if (r25 != null) goto L17;
            int r26 = 0;
        L18:
            int r07 = (r06 + r26) * 31;
            Boolean r27 = this.isAccepted;
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
            return "AcceptanceLetter(version=" + this.version + ", language=" + this.language + ", url=" + this.url + ", featureId=" + this.featureId + ", isAccepted=" + this.isAccepted + ')';
        }

        public AcceptanceLetter(Integer r1, String r2, String r3, String r4, Boolean r5) {
            this.version = r1;
            this.language = r2;
            this.url = r3;
            this.featureId = r4;
            this.isAccepted = r5;
        }

        public /* synthetic */ AcceptanceLetter(Integer r2, String r3, String r4, String r5, Boolean r6, int r7, i r8) {
            if ((r7 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r7 & 2) == 0) goto L9;
            r3 = null;
        L9:
            if ((r7 & 4) == 0) goto L12;
            r4 = null;
        L12:
            if ((r7 & 8) == 0) goto L15;
            r5 = null;
        L15:
            if ((r7 & 16) == 0) goto L18;
            Boolean r72 = null;
        L17:
            String r62 = r5;
            String r52 = r4;
            this(r2, r3, r52, r62, r72);
            return;
        L18:
            r72 = r6;
            goto L17
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TnCResponseData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List a() {
        return this.acceptanceLetters;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof TnCResponseData) == true) goto L9;
        return false;
    L9:
        if (p.g(this.acceptanceLetters, ((TnCResponseData) r4).acceptanceLetters) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        List<AcceptanceLetter> r02 = this.acceptanceLetters;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "TnCResponseData(acceptanceLetters=" + this.acceptanceLetters + ')';
    }

    public TnCResponseData(List<AcceptanceLetter> r1) {
        this.acceptanceLetters = r1;
    }

    public /* synthetic */ TnCResponseData(List r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }
}
