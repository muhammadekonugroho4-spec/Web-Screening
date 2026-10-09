package com.stockbit.usecase.chat.model.group;

import com.clevertap.android.sdk.Constants;
import com.gojek.ojosdk.exif.ExifInterface;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u000eB\u001b\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0005J\b\u0010\r\u001a\u00020\u0005H$R\u0018\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000b\u0082\u0001\u0001\u000f¨\u0006\u0010"}, d2 = {"Lcom/stockbit/usecase/chat/model/group/CustomRequirementUIState;", ExifInterface.GpsTrackRef.TRUE_DIRECTION, "Ljava/io/Serializable;", "value", "isActive", "", "<init>", "(Ljava/lang/Object;Z)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "()Z", "isValid", "isValueValid", "MinimumPortfolioEquity", "Lcom/stockbit/usecase/chat/model/group/CustomRequirementUIState$MinimumPortfolioEquity;", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CustomRequirementUIState<T> implements Serializable {
    private final boolean isActive;
    private final T value;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\u0005H\u0014J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/stockbit/usecase/chat/model/group/CustomRequirementUIState$MinimumPortfolioEquity;", "Lcom/stockbit/usecase/chat/model/group/CustomRequirementUIState;", "", "value", "isActive", "", "<init>", "(Ljava/lang/Long;Z)V", "getValue", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Z", "isValueValid", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/Long;Z)Lcom/stockbit/usecase/chat/model/group/CustomRequirementUIState$MinimumPortfolioEquity;", "equals", "other", "", "hashCode", "", "toString", "", "Companion", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MinimumPortfolioEquity extends CustomRequirementUIState<Long> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f155522a = null;
        private final boolean isActive;
        private final Long value;

        public static final class a {
            public /* synthetic */ a(i r1) {
                this();
            }

            public a() {
            }
        }

        static {
            f155522a = new a(null);
        }

        public MinimumPortfolioEquity(Long r2, boolean r3) {
            super(r2, r3, null);
            this.value = r2;
            this.isActive = r3;
        }

        @Override // com.stockbit.usecase.chat.model.group.CustomRequirementUIState
        public boolean a() {
            return this.isActive;
        }

        @Override // com.stockbit.usecase.chat.model.group.CustomRequirementUIState
        public boolean c() {
            if (d() == null) goto L10;
            long r02 = d().longValue();
            if (1 <= r02) goto L7;
            return false;
        L7:
            if (r02 >= 1000000001) goto L13;
            return true;
        L13:
            return false;
        L10:
            return false;
        }

        public Long d() {
            return this.value;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof MinimumPortfolioEquity) == true) goto L8;
            return false;
        L8:
            MinimumPortfolioEquity r52 = (MinimumPortfolioEquity) r5;
            if (p.g(this.value, r52.value) == true) goto L12;
            return false;
        L12:
            if (this.isActive == r52.isActive) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            Long r02 = this.value;
            if (r02 != null) goto L5;
            int r03 = 0;
        L7:
            return (r03 * 31) + Boolean.hashCode(this.isActive);
        L5:
            r03 = r02.hashCode();
            goto L7
        }

        public String toString() {
            return "MinimumPortfolioEquity(value=" + this.value + ", isActive=" + this.isActive + ")";
        }

        public /* synthetic */ MinimumPortfolioEquity(Long r1, boolean r2, int r3, i r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = null;
        L6:
            if ((r3 & 2) == 0) goto L8;
            r2 = false;
        L8:
            this(r1, r2);
        }
    }

    public /* synthetic */ CustomRequirementUIState(Object r1, boolean r2, i r3) {
        this(r1, r2);
    }

    public abstract boolean a();

    public final boolean b() {
        if (a() == true) goto L5;
        return true;
    L5:
        if (c() == true) goto L11;
        return false;
    L11:
        return true;
    }

    public abstract boolean c();

    /* JADX WARN: Multi-variable type inference failed */
    public CustomRequirementUIState(Object r1, boolean r2) {
        this.value = r1;
        this.isActive = r2;
    }
}
