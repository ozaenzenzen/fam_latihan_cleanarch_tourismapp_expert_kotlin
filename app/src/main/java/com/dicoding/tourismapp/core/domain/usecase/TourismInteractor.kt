package com.dicoding.tourismapp.core.domain.usecase

import androidx.lifecycle.LiveData
import com.dicoding.tourismapp.core.data.Resource
import com.dicoding.tourismapp.core.domain.model.Tourism
import com.dicoding.tourismapp.core.domain.repository.ITourismRepository

class TourismInteractor(private val tourismRepository: ITourismRepository) : TourismUseCase {
    override fun getAllTourism(): LiveData<Resource<List<Tourism>>> {
        TODO("Not yet implemented")
    }

    override fun getFavoriteTourism(): LiveData<List<Tourism>> {
        TODO("Not yet implemented")
    }

    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) {
        TODO("Not yet implemented")
    }

}