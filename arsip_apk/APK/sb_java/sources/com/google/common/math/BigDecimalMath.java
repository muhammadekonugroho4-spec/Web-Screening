package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import java.math.BigDecimal;
import java.math.RoundingMode;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes5.dex */
public class BigDecimalMath {

    public static class BigDecimalToDoubleRounder extends ToDoubleRounder<BigDecimal> {
        static final BigDecimalToDoubleRounder INSTANCE = null;

        static {
            INSTANCE = new BigDecimalToDoubleRounder();
        }

        private BigDecimalToDoubleRounder() {
        }

        @Override // com.google.common.math.ToDoubleRounder
        public /* bridge */ /* synthetic */ Number minus(Number r1, Number r2) {
            return minus((BigDecimal) r1, (BigDecimal) r2);
        }

        @Override // com.google.common.math.ToDoubleRounder
        public /* bridge */ /* synthetic */ double roundToDoubleArbitrarily(Number r3) {
            return roundToDoubleArbitrarily((BigDecimal) r3);
        }

        @Override // com.google.common.math.ToDoubleRounder
        public /* bridge */ /* synthetic */ int sign(Number r1) {
            return sign((BigDecimal) r1);
        }

        @Override // com.google.common.math.ToDoubleRounder
        public /* bridge */ /* synthetic */ Number toX(double r1, RoundingMode r3) {
            return toX(r1, r3);
        }

        public BigDecimal minus(BigDecimal r1, BigDecimal r2) {
            return r1.subtract(r2);
        }

        public double roundToDoubleArbitrarily(BigDecimal r3) {
            return r3.doubleValue();
        }

        public int sign(BigDecimal r1) {
            return r1.signum();
        }

        @Override // com.google.common.math.ToDoubleRounder
        public BigDecimal toX(double r1, RoundingMode r3) {
            return new BigDecimal(r1);
        }
    }

    private BigDecimalMath() {
    }

    public static double roundToDouble(BigDecimal r1, RoundingMode r2) {
        return BigDecimalToDoubleRounder.INSTANCE.roundToDouble(r1, r2);
    }
}
