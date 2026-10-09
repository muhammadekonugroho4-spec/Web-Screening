package com.github.mikephil.charting.compose.state;

import com.github.mikephil.charting.compose.data.CandleData;
import com.github.mikephil.charting.compose.data.CandleEntry;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0017H&¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000e\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/github/mikephil/charting/compose/state/CandleChartState;", "", "", "dataSetIndex", "Lcom/github/mikephil/charting/compose/data/CandleEntry;", "entry", "Lkotlin/w;", "append", "(ILcom/github/mikephil/charting/compose/data/CandleEntry;)V", "", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "appendAll", "(ILjava/util/List;)V", "Lcom/github/mikephil/charting/compose/data/CandleData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "replaceData", "(Lcom/github/mikephil/charting/compose/data/CandleData;)V", "clear", "()V", "", "animated", "scrollToEnd", "(Z)V", "", "x", "scrollTo", "(FZ)V", "range", "setVisibleXRange", "(F)V", "getData", "()Lcom/github/mikephil/charting/compose/data/CandleData;", "MPChartCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CandleChartState {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void scrollTo$default(CandleChartState r02, float r1, boolean r2, int r3, Object r4) {
            if (r4 != null) goto L9;
            if ((r3 & 2) == 0) goto L6;
            r2 = true;
        L6:
            r02.scrollTo(r1, r2);
            return;
        L9:
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollTo");
        }

        public static /* synthetic */ void scrollToEnd$default(CandleChartState r02, boolean r1, int r2, Object r3) {
            if (r3 != null) goto L9;
            if ((r2 & 1) == 0) goto L6;
            r1 = true;
        L6:
            r02.scrollToEnd(r1);
            return;
        L9:
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToEnd");
        }
    }

    void append(int r1, CandleEntry r2);

    void appendAll(int r1, List<CandleEntry> r2);

    void clear();

    CandleData getData();

    void replaceData(CandleData r1);

    void scrollTo(float r1, boolean r2);

    void scrollToEnd(boolean r1);

    void setVisibleXRange(float r1);
}
