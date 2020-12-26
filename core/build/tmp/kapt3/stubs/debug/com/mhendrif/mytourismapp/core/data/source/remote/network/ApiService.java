package com.mhendrif.mytourismapp.core.data.source.remote.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0005"}, d2 = {"Lcom/mhendrif/mytourismapp/core/data/source/remote/network/ApiService;", "", "getList", "Lcom/mhendrif/mytourismapp/core/data/source/remote/response/ListTourismResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "list")
    public abstract java.lang.Object getList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mhendrif.mytourismapp.core.data.source.remote.response.ListTourismResponse> p0);
}