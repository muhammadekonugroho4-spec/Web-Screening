package com.stockbit.usecase.chat.model.document;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/stockbit/usecase/chat/model/document/DocumentConfirmationArgs;", "Ljava/io/Serializable;", "documentName", "", "receiverName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDocumentName", "()Ljava/lang/String;", "getReceiverName", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DocumentConfirmationArgs implements Serializable {
    private final String documentName;
    private final String receiverName;

    public DocumentConfirmationArgs(String r1, String r2) {
        this.documentName = r1;
        this.receiverName = r2;
    }

    public static /* synthetic */ DocumentConfirmationArgs b(DocumentConfirmationArgs r02, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.documentName;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.receiverName;
    L9:
        return r02.a(r1, r2);
    }

    public final DocumentConfirmationArgs a(String r2, String r3) {
        return new DocumentConfirmationArgs(r2, r3);
    }

    public final String c() {
        return this.documentName;
    }

    public final String d() {
        return this.receiverName;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DocumentConfirmationArgs) == true) goto L8;
        return false;
    L8:
        DocumentConfirmationArgs r52 = (DocumentConfirmationArgs) r5;
        if (p.g(this.documentName, r52.documentName) == true) goto L12;
        return false;
    L12:
        if (p.g(this.receiverName, r52.receiverName) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.documentName;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.receiverName;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "DocumentConfirmationArgs(documentName=" + this.documentName + ", receiverName=" + this.receiverName + ")";
    }
}
