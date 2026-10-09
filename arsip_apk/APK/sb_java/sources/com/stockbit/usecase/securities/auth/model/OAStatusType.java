package com.stockbit.usecase.securities.auth.model;

import androidx.core.app.NotificationCompat;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/stockbit/usecase/securities/auth/model/OAStatusType;", "", NotificationCompat.CATEGORY_STATUS, "", "<init>", "(Ljava/lang/String;II)V", "getStatus", "()I", "UNREGISTERED", "INCOMPLETE", "CS_PROGRESS", "KSEI_PROGRESS", "RDN_PROGRESS", "DOCUMENT_PROGRESS", "REJECTED", "COMPLETED", "Companion", "usecase-securities-auth"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum OAStatusType extends Enum<OAStatusType> {
    public static final OAStatusType COMPLETED = null;
    public static final OAStatusType CS_PROGRESS = null;
    public static final a Companion = null;
    public static final OAStatusType DOCUMENT_PROGRESS = null;
    public static final OAStatusType INCOMPLETE = null;
    public static final OAStatusType KSEI_PROGRESS = null;
    public static final OAStatusType RDN_PROGRESS = null;
    public static final OAStatusType REJECTED = null;
    public static final OAStatusType UNREGISTERED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OAStatusType[] f160212a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f160213b = null;
    private final int status;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final OAStatusType a(Integer r5) {
            Iterator<E> r02 = OAStatusType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L11;
            Object r1 = r02.next();
            int r2 = ((OAStatusType) r1).getStatus();
            if (r5 == null) goto L4;
            if (r2 != r5.intValue()) goto L4;
        L12:
            OAStatusType r12 = (OAStatusType) r1;
            if (r12 == null) goto L15;
            return r12;
        L15:
            return OAStatusType.UNREGISTERED;
        L11:
            r1 = null;
            goto L12
        }

        public a() {
        }
    }

    static {
        UNREGISTERED = new OAStatusType("UNREGISTERED", 0, 0);
        INCOMPLETE = new OAStatusType("INCOMPLETE", 1, 1);
        CS_PROGRESS = new OAStatusType("CS_PROGRESS", 2, 2);
        KSEI_PROGRESS = new OAStatusType("KSEI_PROGRESS", 3, 3);
        RDN_PROGRESS = new OAStatusType("RDN_PROGRESS", 4, 4);
        DOCUMENT_PROGRESS = new OAStatusType("DOCUMENT_PROGRESS", 5, 5);
        REJECTED = new OAStatusType("REJECTED", 6, 99);
        COMPLETED = new OAStatusType("COMPLETED", 7, 100);
        OAStatusType[] r02 = a();
        f160212a = r02;
        f160213b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    OAStatusType(String r1, int r2, int r3) {
        this.status = r3;
    }

    public static final /* synthetic */ OAStatusType[] a() {
        return new OAStatusType[]{UNREGISTERED, INCOMPLETE, CS_PROGRESS, KSEI_PROGRESS, RDN_PROGRESS, DOCUMENT_PROGRESS, REJECTED, COMPLETED};
    }

    public static kotlin.enums.a getEntries() {
        return f160213b;
    }

    public static OAStatusType valueOf(String r1) {
        return (OAStatusType) Enum.valueOf(OAStatusType.class, r1);
    }

    public static OAStatusType[] values() {
        return (OAStatusType[]) f160212a.clone();
    }

    public final int getStatus() {
        return this.status;
    }
}
