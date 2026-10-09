package com.stockbit.repository.brokeractivity;

import java.util.List;
import kotlin.coroutines.e;

/* loaded from: classes10.dex */
public interface a {
    Object a(String r1, String r2, String r3, String r4, String r5, String r6, boolean r7, boolean r8, e r9);

    Object b(List r1, String r2, String r3, String r4, String r5, String r6, String r7, int r8, int r9, e r10);

    Object getBrokerActivityChart(List r1, List r2, String r3, String r4, String r5, String r6, String r7, e r8);

    Object getBrokerActivityDaily(String r1, String r2, String r3, String r4, String r5, List r6, List r7, String r8, String r9, String r10, Integer r11, Integer r12, e r13);
}
