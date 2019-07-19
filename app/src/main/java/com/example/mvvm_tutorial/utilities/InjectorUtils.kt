package com.example.mvvm_tutorial.utilities

import com.example.mvvm_tutorial.data.FakeDatabase
import com.example.mvvm_tutorial.data.QuoteRepository
import com.example.mvvm_tutorial.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}