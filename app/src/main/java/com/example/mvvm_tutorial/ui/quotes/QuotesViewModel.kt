package com.example.mvvm_tutorial.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.mvvm_tutorial.data.Quote
import com.example.mvvm_tutorial.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

}