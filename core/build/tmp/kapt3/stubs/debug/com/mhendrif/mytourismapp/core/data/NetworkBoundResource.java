package com.mhendrif.mytourismapp.core.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bJ\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\bH\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\bH$J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0019\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u0001H\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H$\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/mhendrif/mytourismapp/core/data/NetworkBoundResource;", "ResultType", "RequestType", "", "mExecutors", "Lcom/mhendrif/mytourismapp/core/utils/AppExecutors;", "(Lcom/mhendrif/mytourismapp/core/utils/AppExecutors;)V", "result", "Lkotlinx/coroutines/flow/Flow;", "Lcom/mhendrif/mytourismapp/core/data/Resource;", "asFlow", "createCall", "Lcom/mhendrif/mytourismapp/core/data/source/remote/network/ApiResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFromDB", "onFetchFailed", "", "saveCallResult", "data", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldFetch", "", "(Ljava/lang/Object;)Z", "core_debug"})
public abstract class NetworkBoundResource<ResultType extends java.lang.Object, RequestType extends java.lang.Object> {
    private kotlinx.coroutines.flow.Flow<? extends com.mhendrif.mytourismapp.core.data.Resource<ResultType>> result;
    private final com.mhendrif.mytourismapp.core.utils.AppExecutors mExecutors = null;
    
    protected void onFetchFailed() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract kotlinx.coroutines.flow.Flow<ResultType> loadFromDB();
    
    protected abstract boolean shouldFetch(@org.jetbrains.annotations.Nullable()
    ResultType data);
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object createCall(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.mhendrif.mytourismapp.core.data.source.remote.network.ApiResponse<? extends RequestType>>> p0);
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object saveCallResult(RequestType data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.mhendrif.mytourismapp.core.data.Resource<ResultType>> asFlow() {
        return null;
    }
    
    public NetworkBoundResource(@org.jetbrains.annotations.NotNull()
    com.mhendrif.mytourismapp.core.utils.AppExecutors mExecutors) {
        super();
    }
}