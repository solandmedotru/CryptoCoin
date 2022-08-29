package ru.soland.cryptocoins.data.repository

import ru.soland.cryptocoins.data.remote.CoinPaprikaApi
import ru.soland.cryptocoins.data.remote.dto.CoinDetailDto
import ru.soland.cryptocoins.data.remote.dto.CoinDto
import ru.soland.cryptocoins.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}