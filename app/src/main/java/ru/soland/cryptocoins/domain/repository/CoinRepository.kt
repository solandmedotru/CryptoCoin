package ru.soland.cryptocoins.domain.repository

import ru.soland.cryptocoins.data.remote.dto.CoinDetailDto
import ru.soland.cryptocoins.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String):CoinDetailDto
}