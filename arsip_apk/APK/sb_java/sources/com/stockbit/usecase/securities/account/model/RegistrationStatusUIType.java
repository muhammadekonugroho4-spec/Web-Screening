package com.stockbit.usecase.securities.account.model;

import androidx.core.app.NotificationCompat;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/stockbit/usecase/securities/account/model/RegistrationStatusUIType;", "", NotificationCompat.CATEGORY_STATUS, "", "<init>", "(Ljava/lang/String;II)V", "getStatus", "()I", "UNREGISTERED", "INCOMPLETE", "CS_PROGRESS", "KSEI_PROGRESS", "RDN_PROGRESS", "DOCUMENT_PROGRESS", "REJECTED", "COMPLETED", "Companion", "usecase-securities-account"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum RegistrationStatusUIType extends Enum<RegistrationStatusUIType> {
    public static final RegistrationStatusUIType COMPLETED = null;
    public static final RegistrationStatusUIType CS_PROGRESS = null;
    public static final a Companion = null;
    public static final RegistrationStatusUIType DOCUMENT_PROGRESS = null;
    public static final RegistrationStatusUIType INCOMPLETE = null;
    public static final RegistrationStatusUIType KSEI_PROGRESS = null;
    public static final RegistrationStatusUIType RDN_PROGRESS = null;
    public static final RegistrationStatusUIType REJECTED = null;
    public static final RegistrationStatusUIType UNREGISTERED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RegistrationStatusUIType[] f160183a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f160184b = null;
    private final int status;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final RegistrationStatusUIType a(int r4) {
            Iterator<E> r02 = RegistrationStatusUIType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (((RegistrationStatusUIType) r1).getStatus() != r4) goto L4;
        L9:
            RegistrationStatusUIType r12 = (RegistrationStatusUIType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return RegistrationStatusUIType.UNREGISTERED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        UNREGISTERED = new RegistrationStatusUIType("UNREGISTERED", 0, 0);
        INCOMPLETE = new RegistrationStatusUIType("INCOMPLETE", 1, 1);
        CS_PROGRESS = new RegistrationStatusUIType("CS_PROGRESS", 2, 2);
        KSEI_PROGRESS = new RegistrationStatusUIType("KSEI_PROGRESS", 3, 3);
        RDN_PROGRESS = new RegistrationStatusUIType("RDN_PROGRESS", 4, 4);
        DOCUMENT_PROGRESS = new RegistrationStatusUIType("DOCUMENT_PROGRESS", 5, 5);
        REJECTED = new RegistrationStatusUIType("REJECTED", 6, 99);
        COMPLETED = new RegistrationStatusUIType("COMPLETED", 7, 100);
        RegistrationStatusUIType[] r02 = a();
        f160183a = r02;
        f160184b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    RegistrationStatusUIType(String r1, int r2, int r3) {
        this.status = r3;
    }

    public static final /* synthetic */ RegistrationStatusUIType[] a() {
        return new RegistrationStatusUIType[]{UNREGISTERED, INCOMPLETE, CS_PROGRESS, KSEI_PROGRESS, RDN_PROGRESS, DOCUMENT_PROGRESS, REJECTED, COMPLETED};
    }

    public static kotlin.enums.a getEntries() {
        return f160184b;
    }

    public static RegistrationStatusUIType valueOf(String r1) {
        return (RegistrationStatusUIType) Enum.valueOf(RegistrationStatusUIType.class, r1);
    }

    public static RegistrationStatusUIType[] values() {
        return (RegistrationStatusUIType[]) f160183a.clone();
    }

    public final int getStatus() {
        return this.status;
    }
}
