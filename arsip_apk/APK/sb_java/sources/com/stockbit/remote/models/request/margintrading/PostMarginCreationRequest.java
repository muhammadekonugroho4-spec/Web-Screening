package com.stockbit.remote.models.request.margintrading;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/stockbit/remote/models/request/margintrading/PostMarginCreationRequest;", "", "agreements", "", "Lcom/stockbit/remote/models/request/margintrading/PostMarginCreationRequest$AgreementCreationInfoRequest;", "document", "Lcom/stockbit/remote/models/request/margintrading/PostMarginCreationRequest$DocumentCreationInfoRequest;", "<init>", "(Ljava/util/List;Lcom/stockbit/remote/models/request/margintrading/PostMarginCreationRequest$DocumentCreationInfoRequest;)V", "getAgreements", "()Ljava/util/List;", "getDocument", "()Lcom/stockbit/remote/models/request/margintrading/PostMarginCreationRequest$DocumentCreationInfoRequest;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "AgreementCreationInfoRequest", "DocumentCreationInfoRequest", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PostMarginCreationRequest {

    @SerializedName("agreements")
    private final List<AgreementCreationInfoRequest> agreements;

    @SerializedName("document")
    private final DocumentCreationInfoRequest document;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/stockbit/remote/models/request/margintrading/PostMarginCreationRequest$AgreementCreationInfoRequest;", "", "type", "", "isAgree", "", "<init>", "(Ljava/lang/String;Z)V", "getType", "()Ljava/lang/String;", "()Z", "component1", "component2", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AgreementCreationInfoRequest {

        @SerializedName("is_agree")
        private final boolean isAgree;

        @SerializedName("type")
        private final String type;

        public AgreementCreationInfoRequest(String r2, boolean r3) {
            p.l(r2, "type");
            this.type = r2;
            this.isAgree = r3;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof AgreementCreationInfoRequest) == true) goto L8;
            return false;
        L8:
            AgreementCreationInfoRequest r52 = (AgreementCreationInfoRequest) r5;
            if (p.g(this.type, r52.type) == true) goto L12;
            return false;
        L12:
            if (this.isAgree == r52.isAgree) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + Boolean.hashCode(this.isAgree);
        }

        public String toString() {
            return "AgreementCreationInfoRequest(type=" + this.type + ", isAgree=" + this.isAgree + ')';
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/remote/models/request/margintrading/PostMarginCreationRequest$DocumentCreationInfoRequest;", "", "signatureUrl", "", "<init>", "(Ljava/lang/String;)V", "getSignatureUrl", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DocumentCreationInfoRequest {

        @SerializedName("signature_url")
        private final String signatureUrl;

        public DocumentCreationInfoRequest(String r2) {
            p.l(r2, "signatureUrl");
            this.signatureUrl = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof DocumentCreationInfoRequest) == true) goto L9;
            return false;
        L9:
            if (p.g(this.signatureUrl, ((DocumentCreationInfoRequest) r4).signatureUrl) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.signatureUrl.hashCode();
        }

        public String toString() {
            return "DocumentCreationInfoRequest(signatureUrl=" + this.signatureUrl + ')';
        }
    }

    public PostMarginCreationRequest(List<AgreementCreationInfoRequest> r2, DocumentCreationInfoRequest r3) {
        p.l(r2, "agreements");
        p.l(r3, "document");
        this.agreements = r2;
        this.document = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PostMarginCreationRequest) == true) goto L8;
        return false;
    L8:
        PostMarginCreationRequest r52 = (PostMarginCreationRequest) r5;
        if (p.g(this.agreements, r52.agreements) == true) goto L12;
        return false;
    L12:
        if (p.g(this.document, r52.document) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.agreements.hashCode() * 31) + this.document.hashCode();
    }

    public String toString() {
        return "PostMarginCreationRequest(agreements=" + this.agreements + ", document=" + this.document + ')';
    }
}
