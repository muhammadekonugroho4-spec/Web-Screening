package com.iab.digitalidentity.sdk.core.network.model;

import a.AbstractC2049c;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/network/model/Document;", "", "", "documentId", "documentType", "documentName", "documentContentType", "", "documentSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "Ljava/lang/String;", "getDocumentId", "()Ljava/lang/String;", "getDocumentType", "getDocumentName", "getDocumentContentType", "J", "getDocumentSize", "()J", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Document {

    @SerializedName("document_content_type")
    private final String documentContentType;

    @SerializedName("document_id")
    private final String documentId;

    @SerializedName("document_name")
    private final String documentName;

    @SerializedName("document_size")
    private final long documentSize;

    @SerializedName("document_type")
    private final String documentType;

    public Document(String r2, String r3, String r4, String r5, long r6) {
        p.l(r2, "documentId");
        p.l(r3, "documentType");
        p.l(r4, "documentName");
        p.l(r5, "documentContentType");
        this.documentId = r2;
        this.documentType = r3;
        this.documentName = r4;
        this.documentContentType = r5;
        this.documentSize = r6;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof Document) == true) goto L8;
        return false;
    L8:
        Document r82 = (Document) r8;
        if (p.g(this.documentId, r82.documentId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.documentType, r82.documentType) == true) goto L15;
        return false;
    L15:
        if (p.g(this.documentName, r82.documentName) == true) goto L18;
        return false;
    L18:
        if (p.g(this.documentContentType, r82.documentContentType) == true) goto L21;
        return false;
    L21:
        if (this.documentSize == r82.documentSize) goto L23;
        return false;
    L23:
        return true;
    }

    public final int hashCode() {
        int r02 = this.documentId.hashCode() * 31;
        int r03 = AbstractC2049c.a(this.documentType, r02, 31);
        int r04 = AbstractC2049c.a(this.documentName, r03, 31);
        int r05 = AbstractC2049c.a(this.documentContentType, r04, 31);
        return Long.hashCode(this.documentSize) + r05;
    }

    public final String toString() {
        return "Document(documentId=" + this.documentId + ", documentType=" + this.documentType + ", documentName=" + this.documentName + ", documentContentType=" + this.documentContentType + ", documentSize=" + this.documentSize + ")";
    }
}
