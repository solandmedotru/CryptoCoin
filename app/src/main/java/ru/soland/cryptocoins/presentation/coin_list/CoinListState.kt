package ru.soland.cryptocoins.presentation.coin_list

import ru.soland.cryptocoins.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
