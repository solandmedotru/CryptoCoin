package ru.soland.cryptocoins.presentation.coin_detail

import ru.soland.cryptocoins.domain.model.Coin
import ru.soland.cryptocoins.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
