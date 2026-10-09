package com.data.repositories.chat;

import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.e;

/* loaded from: classes4.dex */
public interface b {
    Object a(Integer r1, Integer r2, String r3, e r4);

    Object b(int r1, e r2);

    Object c(int r1, boolean r2, e r3);

    Object clearChatRoom(String r1, e r2);

    Object d(int r1, String r2, String r3, Integer r4, String r5, String r6, String r7, e r8);

    Object deleteAllMessageRequest(e r1);

    Object e(String r1, List r2, e r3);

    Object f(File r1, String r2, Map r3, e r4);

    Object g(int r1, String r2, String r3, int r4, e r5);

    Object getInvitationPreview(String r1, e r2);

    Object getUnreadChatRoom(e r1);

    Object h(int r1, String r2, String r3, int r4, e r5);

    Object i(String r1, e r2);

    Object j(int r1, String r2, String r3, int r4, e r5);

    Object joinGroup(String r1, e r2);

    Object k(String r1, String r2, e r3);

    Object l(String r1, String r2, e r3);

    Object m(String r1, List r2, e r3);

    Object n(String r1, e r2);

    Object o(List r1, e r2);

    Object p(List r1, List r2, String r3, e r4);

    Object q(com.stockbit.domain.param.chat.b r1, e r2);

    Object r(String r1, e r2);

    Object s(String r1, String r2, String r3, String r4, e r5);

    Object t(String r1, String r2, String r3, e r4);

    Object u(String r1, e r2);
}
