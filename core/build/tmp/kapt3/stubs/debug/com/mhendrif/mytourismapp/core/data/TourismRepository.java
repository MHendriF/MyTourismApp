package com.mhendrif.mytourismapp.core.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\nH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/mhendrif/mytourismapp/core/data/TourismRepository;", "Lcom/mhendrif/mytourismapp/core/domain/repository/ITourismRepository;", "remoteDataSource", "Lcom/mhendrif/mytourismapp/core/data/source/remote/RemoteDataSource;", "localDataSource", "Lcom/mhendrif/mytourismapp/core/data/source/local/LocalDataSource;", "appExecutors", "Lcom/mhendrif/mytourismapp/core/utils/AppExecutors;", "(Lcom/mhendrif/mytourismapp/core/data/source/remote/RemoteDataSource;Lcom/mhendrif/mytourismapp/core/data/source/local/LocalDataSource;Lcom/mhendrif/mytourismapp/core/utils/AppExecutors;)V", "getAllTourism", "Lkotlinx/coroutines/flow/Flow;", "Lcom/mhendrif/mytourismapp/core/data/Resource;", "", "Lcom/mhendrif/mytourismapp/core/domain/model/Tourism;", "getFavoriteTourism", "setFavoriteTourism", "", "tourism", "state", "", "core_debug"})
public final class TourismRepository implements com.mhendrif.mytourismapp.core.domain.repository.ITourismRepository {
    private final com.mhendrif.mytourismapp.core.data.source.remote.RemoteDataSource remoteDataSource = null;
    private final com.mhendrif.mytourismapp.core.data.source.local.LocalDataSource localDataSource = null;
    private final com.mhendrif.mytourismapp.core.utils.AppExecutors appExecutors = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.mhendrif.mytourismapp.core.data.Resource<java.util.List<com.mhendrif.mytourismapp.core.domain.model.Tourism>>> getAllTourism() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.mhendrif.mytourismapp.core.domain.model.Tourism>> getFavoriteTourism() {
        return null;
    }
    
    @java.lang.Override()
    public void setFavoriteTourism(@org.jetbrains.annotations.NotNull()
    com.mhendrif.mytourismapp.core.domain.model.Tourism tourism, boolean state) {
    }
    
    public TourismRepository(@org.jetbrains.annotations.NotNull()
    com.mhendrif.mytourismapp.core.data.source.remote.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.mhendrif.mytourismapp.core.data.source.local.LocalDataSource localDataSource, @org.jetbrains.annotations.NotNull()
    com.mhendrif.mytourismapp.core.utils.AppExecutors appExecutors) {
        super();
    }
}