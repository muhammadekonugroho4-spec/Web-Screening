package com.stockbit.domain.model.entity;

import kotlin.Metadata;

/* loaded from: classes8.dex */
public abstract class CompanyOrderbookV2 {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/entity/CompanyOrderbookV2$Color;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Red", "Green", "Default", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum Color extends Enum<Color> {
        public static final a Companion = null;
        public static final Color Default = null;
        public static final Color Green = null;
        public static final Color Red = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Color[] f82400a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f82401b = null;
        private final String value;

        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.i r1) {
                this();
            }

            public a() {
            }
        }

        static {
            Red = new Color("Red", 0, "Red");
            Green = new Color("Green", 1, "Green");
            Default = new Color("Default", 2, "Default");
            Color[] r02 = a();
            f82400a = r02;
            f82401b = kotlin.enums.b.a(r02);
            Companion = new a(null);
        }

        Color(String r1, int r2, String r3) {
            this.value = r3;
        }

        public static final /* synthetic */ Color[] a() {
            return new Color[]{Red, Green, Default};
        }

        public static kotlin.enums.a getEntries() {
            return f82401b;
        }

        public static Color valueOf(String r1) {
            return (Color) Enum.valueOf(Color.class, r1);
        }

        public static Color[] values() {
            return (Color[]) f82400a.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }
}
