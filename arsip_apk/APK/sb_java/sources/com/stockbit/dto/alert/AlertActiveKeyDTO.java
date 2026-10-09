package com.stockbit.dto.alert;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/stockbit/dto/alert/AlertActiveKeyDTO;", "", "symbol", "", "prevKey", "", "nextKey", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getSymbol", "()Ljava/lang/String;", "getPrevKey", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNextKey", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stockbit/dto/alert/AlertActiveKeyDTO;", "equals", "", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AlertActiveKeyDTO {

    /* renamed from: a, reason: collision with root package name */
    public final String f88590a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f88591b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f88592c;

    public final Integer a() {
        return this.f88592c;
    }

    public final Integer b() {
        return this.f88591b;
    }

    public final String c() {
        return this.f88590a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AlertActiveKeyDTO) == true) goto L8;
        return false;
    L8:
        AlertActiveKeyDTO r52 = (AlertActiveKeyDTO) r5;
        if (p.g(this.f88590a, r52.f88590a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88591b, r52.f88591b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f88592c, r52.f88592c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = this.f88590a.hashCode() * 31;
        Integer r1 = this.f88591b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        Integer r13 = this.f88592c;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "AlertActiveKeyDTO(symbol=" + this.f88590a + ", prevKey=" + this.f88591b + ", nextKey=" + this.f88592c + ")";
    }
}
