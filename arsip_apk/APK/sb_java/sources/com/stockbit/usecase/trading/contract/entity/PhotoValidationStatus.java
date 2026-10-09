package com.stockbit.usecase.trading.contract.entity;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/stockbit/usecase/trading/contract/entity/PhotoValidationStatus;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UNSPECIFIED", "PASSED", "WARNING", "FAILED", "NOT_EVALUATED", "Companion", "usecase-trading-contract"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum PhotoValidationStatus extends Enum<PhotoValidationStatus> {
    public static final a Companion = null;
    public static final PhotoValidationStatus FAILED = null;
    public static final PhotoValidationStatus NOT_EVALUATED = null;
    public static final PhotoValidationStatus PASSED = null;
    public static final PhotoValidationStatus UNSPECIFIED = null;
    public static final PhotoValidationStatus WARNING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PhotoValidationStatus[] f163322a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163323b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final PhotoValidationStatus a(String r4) {
            Iterator<E> r02 = PhotoValidationStatus.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(((PhotoValidationStatus) r1).getValue(), r4) == false) goto L4;
        L9:
            PhotoValidationStatus r12 = (PhotoValidationStatus) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return PhotoValidationStatus.UNSPECIFIED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        UNSPECIFIED = new PhotoValidationStatus("UNSPECIFIED", 0, "VALIDATION_STATUS_UNSPECIFIED");
        PASSED = new PhotoValidationStatus("PASSED", 1, "VALIDATION_STATUS_PASSED");
        WARNING = new PhotoValidationStatus("WARNING", 2, "VALIDATION_STATUS_WARNING");
        FAILED = new PhotoValidationStatus("FAILED", 3, "VALIDATION_STATUS_FAILED");
        NOT_EVALUATED = new PhotoValidationStatus("NOT_EVALUATED", 4, "VALIDATION_STATUS_NOT_EVALUATED");
        PhotoValidationStatus[] r02 = a();
        f163322a = r02;
        f163323b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    PhotoValidationStatus(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ PhotoValidationStatus[] a() {
        return new PhotoValidationStatus[]{UNSPECIFIED, PASSED, WARNING, FAILED, NOT_EVALUATED};
    }

    public static kotlin.enums.a getEntries() {
        return f163323b;
    }

    public static PhotoValidationStatus valueOf(String r1) {
        return (PhotoValidationStatus) Enum.valueOf(PhotoValidationStatus.class, r1);
    }

    public static PhotoValidationStatus[] values() {
        return (PhotoValidationStatus[]) f163322a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
